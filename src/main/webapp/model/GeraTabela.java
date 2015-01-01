package main.webapp.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabela {

	public static void main (String[] args) {
		
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testelivrariat");
        EntityManager em = factory.createEntityManager(); 
		
        em.close();
		factory.close();

	}

}
