package com.jsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsoft.model.Student;
import com.jsoft.repo.HomeRepo;

@Service
public class HomeService {

	@Autowired private HomeRepo homeRepo;
	
	public void save(Student student) {
		
		homeRepo.save(student);
		
	}

}
