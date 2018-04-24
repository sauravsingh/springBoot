/**
 * 
 */
package com.saurav.dao;

import java.util.Collection;

import com.saurav.entity.Student;

/**
 * @author saurav
 *
 */
public interface StudentDao {

	Collection<Student> getAllStudents();

	/**
	 * @return
	 */
	Student getStudentById(int id);

	/**
	 * @param id
	 */
	void deleteStudentById(int id);

	void updateStudent(Student student);

	/**
	 * @param student
	 */
	void insertStudent(Student student);

}