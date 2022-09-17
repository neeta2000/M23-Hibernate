package dao;

import javax.persistence.EntityManager;

import entities.User;

public class UserDaoImpl implements UserDao{
	private EntityManager em;
	
	public UserDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		em.remove(id);
		return null;
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
