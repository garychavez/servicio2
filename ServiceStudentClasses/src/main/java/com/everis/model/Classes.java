package com.everis.model;

import java.util.Date;


import lombok.Data;

@Data
public class Classes  {

	private int class_id;
//	private int subject_id;
//	private int teacher_id;
	private String class_code;
	private String class_name;
	private Date date_from;
	private Date date_to;

	
}
