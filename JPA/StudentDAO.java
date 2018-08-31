package edu.ksr.springboottraining;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	@Autowired
	//@PersistenceContext
	EntityManager entityManager;
	
	public StudentDAO(){
		
	}
	
	public List<Student> getStudents(){
		TypedQuery<Student> typedQuery = entityManager
				.createQuery("select s from Student s", Student.class);
		List<Student> studentList = typedQuery.getResultList();
		System.out.println("The size == "+studentList.size());
		return studentList;
	}

}





