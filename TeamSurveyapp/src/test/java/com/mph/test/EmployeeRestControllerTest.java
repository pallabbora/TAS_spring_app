package com.mph.test;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import com.mph.controller.EmployeeRestController;
import com.mph.entity.Employee;

public class EmployeeRestControllerTest {

	EmployeeRestController employeerestcontroller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("Initiating Unit Testing ...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("Terminating Unit Testing ...");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before calling Test method");
		employeerestcontroller = new EmployeeRestController();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		employeerestcontroller=null;
		System.out.println("@After calling Test method");
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testEmployeeId() 
	{
		
		System.out.println("Testing if the returned Employee and the requested employee is same! ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the ID of the Employee you want to Delete?");
		int employeeId=scanner.nextInt();
		try {
		ResponseEntity<List<Employee>> emplist=employeerestcontroller.deleteEmployee(employeeId);
		try{
			System.out.println("inside try");
			assertEquals("redirect:/getAllEmployee",emplist);
			ResponseEntity<Employee> emplist1 = employeerestcontroller.getEmployee(employeeId);
			if( ((List<Employee>) emplist1).isEmpty())
				System.out.println("Employee deleted successfully!");
			}
		catch(Exception exception){
			System.out.println("Oops!The employee could not be deleted!");
		}
		}
		catch(Exception e)
		{
			System.out.println("Oops!The Employee does not exist!");
		}

		finally {
			System.out.println("Employee deletion verified Successfully!");
		}
     }

}
