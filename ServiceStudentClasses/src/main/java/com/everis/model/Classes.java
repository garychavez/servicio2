package com.everis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Classes")
public class Classes  {

	@Column(name = "class_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int class_id;
//	private int subject_id;
//	private int teacher_id;
	
	@Column(name = "class_code")
	private String class_code;
	
	@Column(name = "class_name")
	private String class_name;
	
	@Column(name = "date_from")
	private Date date_from;
	
	@Column(name = "date_to")
	private Date date_to;

	
}
