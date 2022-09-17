package service;

import dao.UserDao;
import dao.UserDaoImpl;
import entities.User;

public class UserServiceImpl implements UserService{
	private UserDao dao;
	
	public UserServiceImpl() {
		super();
		dao=new UserDaoImpl();
	}

	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		
		return null;
	}

	@Override
	public boolean logout() {
	
		return false;
	}



}
