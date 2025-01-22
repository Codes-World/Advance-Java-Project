package io.amansoni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pokemon p = entityManager.find(Pokemon.class, "Pikachus");
		
		if(p!=null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
		}else {
			System.out.println("Entry doesn't exits..");
		}
		
	}

}
