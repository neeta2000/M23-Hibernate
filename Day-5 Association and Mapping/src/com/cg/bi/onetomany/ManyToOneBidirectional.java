package com.cg.bi.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneBidirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory(null);
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(1234);
		d.setDeptName("Finance");
		
		Employee e=new Employee();
		e.setEmpId(1001);
		e.setEname("Samarth");
		e.setSalary(39000f);
		
		Employee e1=new Employee();
		e1.setEmpId(1002);
		e1.setEname("Pari");
		e.setSalary(54000f);
		

		e.setDept(d);
		e1.setDept(d);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Rows is Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
		

	}

}

	

