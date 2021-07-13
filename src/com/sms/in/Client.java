package com.sms.in;

import java.util.Arrays;
import java.util.List;

import com.sms.in.model.Student;

public class Client {

	private static List<Student> students;
	static
	{
		Student s1=new Student(1,"Prudhvi","Goa",87.3);
		Student s2=new Student(2,"Raj","Goa",82.1);
		Student s3=new Student(3,"Sudheer","Goa",60.3);
		Student s4=new Student(4,"Kiran","Goa",48.5);
		Student s5=new Student(5,"Ravi","Goa",58.9);
		Student s6=new Student(6,"Rajesh","Goa",90.4);
		Student s7=new Student(7,"Praveen","Goa",55.5);
		students=Arrays.asList(s3,s1,s2,s4,s7,s5,s6);
	}
	
	public static void main(String[] args) {
		
		System.out.println(students);

	}

}
