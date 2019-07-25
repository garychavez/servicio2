package com.everis.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

//Create my table
@Data
public class Classes {


	private int class_id;
	private String class_code;
	private String class_name;
	private Date date_from;
	private Date date_to;
	private List<StudentClasses> studentReference;

	
}
