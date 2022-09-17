package dao;

import entities.User;

public interface UserDao {
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
