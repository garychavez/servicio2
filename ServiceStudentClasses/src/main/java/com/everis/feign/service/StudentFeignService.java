package com.everis.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.model.Student;
@FeignClient("MicroservicioStudent")
public interface StudentFeignService{
	
	@GetMapping("/Get")	
public List<Student> findAll();

}
