package io.amansoni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pokemon p = entityManager.find(Pokemon.class, "Pikachu");
		System.out.println(p);
	}

}
