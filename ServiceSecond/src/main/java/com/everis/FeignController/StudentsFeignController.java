package com.everis.FeignController;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Students;
import com.everis.service.StudentsFeignService;



@RestController
public class StudentsFeignController {

	@Autowired
	private StudentsFeignService studentsservice;
//	@GetMapping("/Get/{id}")
//	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

	
	@GetMapping("/Get")
	public List<Students> findAll(){
		return studentsservice.finAll();
		
		
	}
}
