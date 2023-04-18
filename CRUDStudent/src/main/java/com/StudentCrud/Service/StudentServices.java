package com.StudentCrud.Service;

import java.util.List;

import com.StudentCrud.Entities.Students;

//This is an interface. So it is used to create loose coupling as I am using Spring in the project 
public interface StudentServices {

	
	public List<Students> getStudent();
	
	public Students addData(Students std);
	
	public Students updateData(Students std);
	
	public String deleteData(int Sid);
}
