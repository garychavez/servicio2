package com.everis.feign.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.feign.service.StudentsFeignService;
import com.everis.model.Students;



@RestController
@RequestMapping("/Students")
public class StudentsFeignController {

	@Autowired
	private StudentsFeignService studentsservice;
//	@GetMapping("/Get/{id}")
//	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

	
	@GetMapping("/Get")
	public List<Students> findAll(){
		return studentsservice.findAll();
		
		
	}
}
