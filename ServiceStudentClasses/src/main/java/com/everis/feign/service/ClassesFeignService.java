package com.everis.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.everis.model.Classes;

@FeignClient("MicroservicioB")
public interface ClassesFeignService{
	
	@GetMapping("/Classes/Get")	
public List<Classes> findAll();

}
