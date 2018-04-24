/**
 * 
 */
package com.saurav.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.saurav.dao.StudentDao;
import com.saurav.entity.Student;

/**
 * @author saurav
 *
 */
@Service
public class StudentService implements StudentDao {
	
	@Autowired
	@Qualifier("mysqlData")
	private StudentDao studentDao;
	
	
	@Override
	public Collection<Student> getAllStudents(){
		return this.studentDao.getAllStudents();
	}


	@Override
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	@Override
	public void deleteStudentById(int id) {
		this.studentDao.deleteStudentById(id);
	}
	
	@Override
	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
	}

	@Override
	public void insertStudent(Student student) {
		this.studentDao.insertStudent(student);
	}
}
