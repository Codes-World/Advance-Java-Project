package io.amansoni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorCreate {

	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		p.setName("Pikachu");
		p.setPower(100);
		p.setType("Electicial");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

}
