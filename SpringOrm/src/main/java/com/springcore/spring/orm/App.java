package com.springcore.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spring.orm.dao.StudentDao;
import com.springcore.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("OrmConfig.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		/* Scanner sc = new Scanner(System.in); */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice!!");
		/*boolean go = true;*/

		while (true) {
			System.out.println("Press 1 for add the data!!");
			System.out.println("Press 2 for display all the data!!");
			System.out.println("Press 3 for dispaly particular data!!");
			System.out.println("Press 4 for remove the data!!");
			System.out.println("Press 5 for update the data!!");
			System.out.println("Press 6 for Exit!!");

			try {
				int ch = Integer.parseInt(br.readLine());
				/* int ch =Integer.parseInt(sc.next()); */
				switch (ch) {
				case 1:
					// add the data
					System.out.println("Enter the Student id::");
					int stId = Integer.parseInt(br.readLine());

					System.out.println("Enter the Student Name::");
					String stName = br.readLine();

					System.out.println("Enter the Student City::");
					String stCity = br.readLine();

					Student student = new Student();
					student.setStId(stId);
					student.setStName(stName);
					student.setStCity(stCity);

					int result = studentDao.insert(student);
					System.out.println(result + " Record Added Successfully!!");
					System.out.println("***********************************************************");
					System.out.println("");

					break;

				case 2:
					// dispaly all data
					System.out.println("***********************************************************");
					List<Student> allStudent = studentDao.getAllStudent();
					System.out.println("________________________________________________");
					for (Student st : allStudent) {

						System.out.println();
						System.out.println("Id::" + st.getStId());
						System.out.println("Name::" + st.getStName());
						System.out.println("City::" + st.getStCity());
						System.out.println("________________________________________________");
					}
					System.out.println("***********************************************************");
					System.out.println("");

					break;

				case 3:
					// dispaly particular data
					System.out.println("***********************************************************");
					System.out.println("Enter the Student id::");
					int studentId = Integer.parseInt(br.readLine());
					Student student2 = studentDao.getStudent(studentId);
					System.out.println("________________________________________________");
					System.out.println();
					System.out.println("Id::" + student2.getStId());
					System.out.println("Name::" + student2.getStName());
					System.out.println("City::" + student2.getStCity());
					System.out.println("________________________________________________");
					System.out.println("***********************************************************");
					break;

				case 4:
					// remove data
					System.out.println("***********************************************************");
					System.out.println("Enter the Student id::");
					int removeId = Integer.parseInt(br.readLine());
					studentDao.removeStudent(removeId);
					System.out.println("________________________________________________");
					System.out.println();
					System.out.println(removeId + " record deleted successfully!!");
					System.out.println("***********************************************************");
					break;

				case 5:
					// update data

					System.out.println("***********************************************************");
					System.out.println("Enter the Student id for Update the student record::");

					int updateId = Integer.parseInt(br.readLine());

					System.out.println("----------------------------------------------------------");
					System.out.println();

					System.out.println("Enter the Student Name::");
					String upStudentName = br.readLine();

					System.out.println("Enter the Student City::");
					String upStudentCity = br.readLine();

					Student updateStudent = new Student();

					updateStudent.setStId(updateId);
					updateStudent.setStName(upStudentName);
					updateStudent.setStCity(upStudentCity);

				
					studentDao.updateStudent(updateStudent);

					System.out.println("________________________________________________");
					System.out.println();
					System.out.println(updateId + " record updated successfully!!");
					System.out.println("***********************************************************");

					break;

				case 6:
					// exit
					
					System.out.println("Thank you!!");
					System.out.println("See you soon!!");
					
					System.exit(0);
					//go = false;
					
					break;

				default:
					System.out.println("Invalid the choice try another option!!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid the choice try another option!!");
				System.out.println(e.getMessage());
			}

		}
		

	}
}
