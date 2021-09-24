package com.springcore.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.spring.jdbc.dao.StudentDao;
import com.springcore.spring.jdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Stareted...!!");
		/*Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the data to set into student info 1->id 2->name 3->city!! ");

		int studentId = scObj.nextInt();*/
		/*String studentName = scObj.next();
		String studentCity = scObj.next();*/

		//System.out.println("Student Id->" + studentId + "  Student Name->" + studentName + "  Student City->" + studentCity);

		// Template-> jdbcTemplate

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		  Student student = new Student();
		  
		  student.setId(105);                 //Insert Data inside the table Code
		  student.setName("Sachin");
		  student.setCity("Indapur");        // student.setName(studentName);  //student.setId(studentId); //student.setCity(studentCity);
		 
		 
		 int result = studentDao.insert(student); System.out.println(result +" records inserted successfully...!!");
		 

		/*
		 * student.setId(2); //Update Data inside the table code
		 * //student.setId(studentId); student.setName("Sachin"); //
		 * student.setName(studentName); student.setCity("Solapur");
		 * //student.setCity(studentCity);
		 * 
		 * int result=studentDao.change(student);
		 * System.out.println("Data Changed--> "+result);
		 */

		/*
		 * student.setId(1); //Delete Data from table code
		 * //student.setId(studentId); int result=studentDao.delete(student);
		 * System.out.println(result + " recordes deleted from table!!");
		 */

		/*int result = studentDao.delete(studentId); // other way
		 * System.out.println(result + " recordes deleted from table!!");
          */
		
		/*Student result=studentDao.getStudent(studentId);
		System.out.println("The details of student id "+studentId+ " is ->" +result);
*/
		
		 List<Student>students=studentDao.getAllStudent();
		 for(Student s:students)
		 {
			 System.out.println("The details of all student is -> "+s);
		 }
		 
	}
}
