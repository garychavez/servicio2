package com.everis.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.model.Students;


@FeignClient("MicroservicioStudent")
public interface StudentsFeignService{
	
	@GetMapping("/Students/Get")	
public List<Students> findAll();
//public MSStudents finById(Integer id, Date date);

}
