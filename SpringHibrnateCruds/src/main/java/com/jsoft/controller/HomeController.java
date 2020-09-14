package com.jsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsoft.model.Student;
import com.jsoft.service.HomeService;

@Controller
public class HomeController {

	
	@Autowired private Student student;
	
	@Autowired private HomeService homeService;
	
	@RequestMapping("/insert")
	public void home(@RequestParam("name") String name,@RequestParam("age") String age )
	{
		student.setAge(age);
		student.setName(name);
		
		homeService.save(student);
		
	}
}
