package com.cg.uni.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory(null);
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Tanuja");
		s.setPercentage(55);
		
		Address a=new Address();
		a.setStreetno(11);
		a.setArea("Pathare");
		a.setCity("Nashik");
		a.setState("Maharastra");
		
		s.setAddress(a);
		
		em.persist(s);
		
		System.out.println("Rows is Inserted");
		
		

	}

}
