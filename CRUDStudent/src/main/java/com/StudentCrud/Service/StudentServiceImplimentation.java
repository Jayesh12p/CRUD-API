package com.StudentCrud.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCrud.Dao.StudentDao;
import com.StudentCrud.Entities.Students;

//This is where all the services are done like SELECT,ADD,UPDATE,DELETE
@Service
public class StudentServiceImplimentation implements StudentServices {

	@Autowired
	private StudentDao studentDao;
	
	
	//Implementation of GET method i.e Adding data 
	@Override
	public List<Students> getStudent() {
		
		return studentDao.findAll();
	}

	//Implementation of POST method i.e Adding data 
	@Override
	public Students addData(Students std) {
		
		studentDao.save(std);
		
		return std;
	}
	
	//Implementation of PUT method i.e Updating data 
	@Override
	public Students updateData(Students std) {
		
		studentDao.save(std);
		
		return std;
	}

	//Implementation of DELETE method i.e deleting data 
	@Override
	public String deleteData(int Sid) {
			
		Students entity=studentDao.getOne(Sid);
		studentDao.delete(entity);
		
		
		return "Data Deleted Successfully";
	}

	

}
