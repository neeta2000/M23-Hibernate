package client;

import entities.Certificate;
import entities.College;
import entities.Student;
import entities.User;
import service.CertificateService;
import service.CertificateServiceImpl;
import service.CollegeService;
import service.CollegeServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		CollegeService collegeService = new CollegeServiceImpl();
		UserService userService = new UserServiceImpl();
		CertificateService certificateService = new CertificateServiceImpl();
		
		College collegeJSPM = new College();
		collegeJSPM.setCollegeName("JSPM");
		collegeJSPM.setLocation("Pune");
		collegeService.addCollege(collegeJSPM);
		
		User user = new User();
		user.setName("Vishal");
		user.setPassword("FTAR565$34");
		user.setType("System User");
		user.setCollege(collegeJSPM);
		userService.addNewUser(user);
		
		
		collegeJSPM.setUser(user);
		collegeService.updateColleget(collegeJSPM);	
		
			
		Student studentAkshay=new Student();
		studentAkshay.setName("Akshay");
		studentAkshay.setRollno(101);
		studentAkshay.setQualification("BE");
		studentAkshay.setCollege(collegeJSPM);
		studentAkshay.setCourses("E&TC");
		studentAkshay.setHallTicketNo(4045);
		studentAkshay.setYear(2022);
		studentService.addStudent(studentAkshay);
	
		
		Certificate certificate = new Certificate();
		certificate.setStudent(studentAkshay);
		certificate.setCollege(collegeJSPM);
		certificate.setYear(2022);
		certificateService.addCertificate(certificate);
		
		studentAkshay.setCertificate(certificate);
		studentService.updateStudent(studentAkshay);
		System.out.println("The Data is added");
	}


}


