package service;

import entities.Student;

public interface StudentService {
	public abstract Student addStudent(Student student);
	public abstract Student updateStudent(Student student);
	public abstract Student searchStudentById(int id);
	public abstract Student SearchStudentByHallTicket(int hallticketno);
	public abstract boolean deleteStudent(int id);

}
