package com.sms.in.repository;

import java.util.List;

import com.sms.in.model.Student;

public interface IStudent {

	public List<Student> displayAllStudents(List<Student> students);
	public List<Student> displayAllStudentsInDescendingOrderOfStudentNames(List<Student> students);
	public List<Student> displayAllFailedStudents(List<Student> students);
	public Student getStudentById(Integer sid);
	
}
