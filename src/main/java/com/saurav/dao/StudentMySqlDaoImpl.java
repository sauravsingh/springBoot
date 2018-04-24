/**
 * 
 */
package com.saurav.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.saurav.entity.Student;

/**
 * @author saurav
 *
 */
@Repository
@Qualifier("mysqlData")
public class StudentMySqlDaoImpl implements StudentDao{
	
	public Collection<Student> getAllStudents(){
		return new ArrayList<Student>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -5977447053817181310L;

			{
				add(new Student(1, "Maria", "Maths"));
			}
		};
	}

	/* (non-Javadoc)
	 * @see com.saurav.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.saurav.dao.StudentDao#deleteStudentById(int)
	 */
	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.saurav.dao.StudentDao#updateStudent(com.saurav.entity.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.saurav.dao.StudentDao#insertStudent(com.saurav.entity.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
}
