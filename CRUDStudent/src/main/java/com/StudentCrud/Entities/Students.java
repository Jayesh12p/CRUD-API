package com.StudentCrud.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//Here are all Attributes of Database
@Entity
public class Students {
	
	
	@Id
	private int roll;
	private String name;
	private String gender;
	private String stream;
	
	
	public Students(int roll, String name, String gender, String stream) {
		super();
		this.roll = roll;
		this.name = name;
		this.gender = gender;
		this.stream = stream;
	}


	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}
	
	
	
}
