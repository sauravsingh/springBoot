/**
 * 
 */
package com.saurav.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saurav.entity.Student;
import com.saurav.dao.StudentDao;

/**
 * @author saurav
 *
 */
@RestController
@RequestMapping("/students")
public class StudentConroller {
	@Autowired
	private StudentDao studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return this.studentService.getAllStudents();
	}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id) {
		this.studentService.deleteStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
		this.studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student) {
		this.studentService.insertStudent(student);
	}
}
