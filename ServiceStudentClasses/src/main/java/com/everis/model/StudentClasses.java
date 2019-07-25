package com.everis.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	


	@Column(name = "student_id")
	private int student_id;

	
//	relacion
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentReference")
	@JoinColumn(name = "studentReference")
	private Classes classesReference;



	
}
