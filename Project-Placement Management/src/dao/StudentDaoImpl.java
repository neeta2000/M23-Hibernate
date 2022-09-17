package dao;

import javax.persistence.EntityManager;

import entities.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager em;
	
	public StudentDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public  Student addStudent(Student student) {
		em.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student=em.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallticketNo) {
		Student student=em.find(Student.class, hallticketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(int id) {
		em.remove(id);
		return true;
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
