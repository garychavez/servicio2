package com.everis.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.feign.service.StudentFeignService;
import com.everis.model.Student;

@RestController
@RequestMapping("/student")
public class StudentFeignController{

	@Autowired
	private StudentFeignService studentFeignService;
//	@GetMapping("/Get/{id}")
//	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

	

	@GetMapping("/Get")
	public List<Student > findAll() throws Exception {
		return studentFeignService.findAll();
		
	}
}
