package com.StudentCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCrud.Entities.Students;
import com.StudentCrud.Service.StudentServices;

//As I am using Rest API to I have used RestController
@RestController
public class MyController {
	
	
	@Autowired
	public StudentServices studentserv;
	
	//This is GET method which is use to get the data available in database
	@GetMapping("/CRUD")
	public List<Students> getStudent(){
		
		return this.studentserv.getStudent();
	}
	
	//This is POST method which is use to add data in database
	@PostMapping("/CRUD")
	public Students addData(@RequestBody Students std) {
		
		return this.studentserv.addData(std);
	}
	
	//This is PUT method which is use to Update data in database
	@PutMapping("/CRUD")
	public Students updateData(@RequestBody Students std) {
		
		return this.studentserv.addData(std);
	}
	
	//This is DELETE method which is use to Delete the data from database
	@DeleteMapping("/CRUD/{Sid}")
	public String deleteData(@PathVariable("Sid") int Sid) {
		
		return this.studentserv.deleteData(Sid);
	}
}
