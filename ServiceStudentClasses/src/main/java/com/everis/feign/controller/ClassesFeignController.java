package com.everis.feign.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.feign.service.ClassesFeignService;
import com.everis.model.Classes;



@RestController
public class ClassesFeignController {

	@Autowired
	private ClassesFeignService classesFeignService;
//	@GetMapping("/Get/{id}")
//	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

	
	@GetMapping("/Get")
	public List<Classes> findAll(){
		return classesFeignService.findAll();
		
		
	}
}
