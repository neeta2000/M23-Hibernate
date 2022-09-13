package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
		s.setRollno(101);
		s.setName("Shiva");
		service.addStudent(s);

	}

}