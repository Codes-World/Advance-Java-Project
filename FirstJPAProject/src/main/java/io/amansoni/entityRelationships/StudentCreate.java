package io.amansoni.entityRelationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setName("Aman");
		
		Student s2 = new Student();
		s2.setName("Soni");
		
		StudentIdCard c1 = new StudentIdCard();
		c1.setSoftwareVersion("1.0.1");
		
		StudentIdCard c2 = new StudentIdCard();
		c2.setSoftwareVersion("1.1.1");
		
		s1.setCard(c1);
		s2.setCard(c2);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("amanSoni");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityTransaction.commit();
	}

}
