package com.everis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



//Create my table
@Data
@Entity
@Table(name = "StudentClasses")
public class StudentClasses {

// Atributes
	@Column(name = "StudentClasses_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int StudentClasses_id;
	// composite key

	@Column(name = "student_id")
//	@ManyToOne
//	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private int student_id;

	@Column(name = "class_id")
//	@ManyToOne
//	@JoinColumn(name = "class_id", referencedColumnName = "class_id")
	private int class_id;

	@Column(name = "date_from")
	private Date date_from;

	@Column(name = "date_to")
	private Date date_to;


	
}
