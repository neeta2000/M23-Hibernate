package dao;

import javax.persistence.EntityManager;

import entities.College;

public class CollegeDaoImpl implements CollegeDao{
	
	private EntityManager em;

	public CollegeDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college=em.find(College.class,id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) {
		em.remove(id);
		return false;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

}



