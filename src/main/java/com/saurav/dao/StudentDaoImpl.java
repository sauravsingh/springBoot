/**
 * 
 */
package com.saurav.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.saurav.entity.Student;

/**
 * @author saurav
 *
 */
@Repository
public class StudentDaoImpl {
	public static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 5185843276892791234L;

			{
				put(1, new Student(1, "Saurav", "Computer Science"));
				put(2, new Student(2, "Amit", "Elecronics"));
				put(3, new Student(3, "Rahul", "Information Technology"));
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}

	/**
	 * @return
	 */
	public Student getStudentById(int id) {
		return students.get(id);
	}

	/**
	 * @param id
	 */
	public void deleteStudentById(int id) {
		students.remove(id);
	}
	
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		students.put(student.getId(), student);
	}

	/**
	 * @param student
	 */
	public void insertStudent(Student student) {
		students.put(student.getId(), student);
	}
}
