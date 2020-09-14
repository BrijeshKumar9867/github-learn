package com.jsoft.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.model.Student;

@Repository
@Transactional
public class HomeRepo {
	
	@Autowired private SessionFactory sessionFactory;
	
	
	public void save(Student student) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(student);
	}

}
