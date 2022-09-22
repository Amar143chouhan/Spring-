package com.HiberSpring.ORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ORM.Entities.Employee;
import com.SrpingDao.EmployeeDao;

public class TestORM {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;

		while (go) {

			System.out.println("PRESS 1 FOR ADDING NEW STUDENT");
			System.out.println("PRESS 2 FOR DISPLAING ALL STUDENTS");
			System.out.println("PRESS 3 FOR GETTING DETAILS OF SINGLE STUDENT");
			System.out.println("PRESS 4 FOR DELET STUDENT");
			System.out.println("PRESS 5 FOR UPDATING STUDENT");
			System.out.println("PRESS 6 For Exit");

			try {

				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add student
					System.out.println("enter employee id :");
					int eid=Integer.parseInt(br.readLine());
					
					System.out.println("enter employee name :");
					String name=br.readLine();
					
					System.out.println("enter employee city :");
					String city=br.readLine();
					
					Employee e1=new Employee();
					e1.setEid(eid);
					e1.setEname(name);
					e1.setCity(city);
					
					int i = empDao.insert(e1);
					
					System.out.println(i+" : record inserted");
					
					break;
				case 2:
					// get all student
					List<Employee> list = empDao.getAllEmployee();
					
					for(Employee emp :list) {
						
						System.out.println(emp);
						
					}
					
					break;
				case 3:
					// get single student
					System.out.println("enter employee id :");
					int id=Integer.parseInt(br.readLine());
                   Employee emp = empDao.getEmployee(id);					
			
                   System.out.println("Employee id "+emp.getEid() );

                   System.out.println("employee name "+emp.getEname() );

                   System.out.println("Employee city "+emp.getCity() );
                   
                   
					break;
				case 4:
					// delete student
					System.out.println("enter employee id :");
					int emid=Integer.parseInt(br.readLine());
                    empDao.delete(emid);					
					
					break;

				case 5:
					// update student
					System.out.println("enter employee id :");
					int emp2=Integer.parseInt(br.readLine());
                    
					System.out.println("enter employee name :");
					String ename=br.readLine();
					
					System.out.println("enter employee city :");
					String ecity=br.readLine();
					
					Employee e2=new Employee();
					e2.setEid(emp2);
					e2.setEname(ename);
					e2.setCity(ecity);
					
					empDao.update(e2);
					
					System.out.println("Employee updated successfully");
					break;

				case 6:
					// exit
					go = false;
					
					break;

				}

			} catch (Exception e) {

				System.out.println("Invalid input try with another one !! ");

				System.out.println(e.getMessage());

			}
		}	
			  System.out.println("thanks for using my applicatoin ");
			  System.out.println("c u soon");
			 
		

	}	
	
}

