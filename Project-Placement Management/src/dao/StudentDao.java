package dao;

import entities.Student;

public interface StudentDao {
	public abstract Student addStudent(Student student);
	public abstract Student updateStudent(Student student);
	public abstract Student searchStudentById(int id);
	public abstract Student searchStudentByHallTicket(int hallticketNo);
	public boolean deleteStudent(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
