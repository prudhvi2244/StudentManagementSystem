package com.sms.in.repository;

import java.util.Arrays;
import java.util.List;

import com.sms.in.model.Student;

public class StudentImpl implements IStudent {
		
	
	
	/*
	 * Use Collection List to implement the logic
	 * Use Stream Concept to implement the logic
	 */

	/*
	 * Display All Students In The following Format using Stream API or Iterator
	 * Student ID   : 1
	 * Student Name : Prudhvi
	 * Student City : Goa
	 */
	@Override
	public List<Student> displayAllStudents(List<Student> students) {
		
		return null;
	}

	/*
	 * Display All Students  using Stream API or Iterator in Descending Order of Student Names
	 */
	@Override
	public List<Student> displayAllStudentsInDescendingOrderOfStudentNames(List<Student> students) {
		
		return null;
	}
	
	
	/*
	 * Display All Failed Students  using Stream API or Iterator 
	 * smarks<60 are considered as failed
	 */
	@Override
	public List<Student> displayAllFailedStudents(List<Student> students) {
		
		return null;
	}

	/*
	 * Display Student Details By Providing Student ID as input
	 */
	@Override
	public Student getStudentById(Integer sid) {
	
		return null;
	}

}
