package com.cg.dao;


import com.cg.entities.Student;

public interface StudentDao
{
	//user-defined method for CRUD Operation
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}