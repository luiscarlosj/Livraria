package main.webapp.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersistidordeLivro {
	
	public static void main(String[] args) 
	{
		    EntityManager em = JPAUtil.getEntityManager();
			
			Livro livro = new Livro();
			
			livro.setIdLivro(1);
			livro.setNome("luis EDII");
			livro.setAutor("luis");
			livro.setAnoPublicacao(2014);
			livro.setPrecoVenda(12);
			livro.setPrecoAluguel(14);
            livro.setQuantVenda(6);			
            livro.setQuantAluguel(4);
			livro.setCategoria(0);			
			livro.setImagem("imagem");
			livro.setRestVenda(6);
			livro.setRestAluguel(4);
			
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(livro);
			tx.commit();
			
			em.close();
			
			JPAUtil.getEntityManager().close();
	}
}
