package main.webapp.model;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(servletNames={"Faces Servlet"}) 
public class JPAFilter implements Filter{
	EntityManagerFactory factory;  
	  
    @Override  
    public void destroy() {  
        this.factory.close();  
          
    }  
  
    @Override  
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {  
        EntityManager entityManager = this.factory.createEntityManager();  
        request.setAttribute("EntityManager", entityManager);  
        entityManager.getTransaction().begin();  
          
        chain.doFilter(request, response);  
          
        try {  
            entityManager.getTransaction().commit();  
        } catch (Exception e) {  
            entityManager.getTransaction().rollback();  
        }finally{  
            entityManager.close();  
        }  
          
    }  
  
    @Override  
    public void init(FilterConfig filterConfig) throws ServletException {  
        this.factory = Persistence.createEntityManagerFactory("livrariat");  
          
    } 
}
