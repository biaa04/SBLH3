package controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Banda;

public class ControllerBanda {
	public EntityManager getEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		return factory.createEntityManager();
		
	}
	
	/*//EntityManagerFactory emf;
	//EntityManager em;
	
	public ControllerBanda() {
		//emf = Persistence.createEntityManagerFactory("PU");
		//em = emf.createEntityManager();
	}*/
	
	public Banda salvar(Banda banda) {
		EntityManager em = getEM();
		try{em.getTransaction().begin();
		    em.persist(banda);
		    em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();		
		}finally {
			em.close();
		}
		return banda;
		
	}
	
	public void remove(Banda banda) {
		EntityManager em =getEM();
		Banda banda= em.find(Banda.class, idbanda);
		try {
			em.getTransaction().begin();
			em.remove(banda);
			em.getTransaction().commit();
		}finally {
			em.close();
		}
	}
	
	public Banda pesquisarPorId(Long idbanda) {
		EntityManager em = getEM();
		Banda
		return null;
		
	}
	
	/*public void remover(Banda banda) {
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete banda from banda where idbanda ="+banda.getNome());
		em.getTransaction().commit();
		emf.close();
	}*/
	
}


