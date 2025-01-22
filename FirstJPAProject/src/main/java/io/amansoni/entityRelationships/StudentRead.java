package io.amansoni.entityRelationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("amanSoni");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student s1 = entityManager.find(Student.class, 1);
		System.out.println(s1);
	}

}
