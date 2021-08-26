package com.mph.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import com.mph.dao.EmployeeDao;
import com.mph.dao.EmployeeDaoImpl;
import com.mph.entity.Employee;
import com.mph.service.EmployeeService;

//Unit Testing on a functionality from DAO layer(EmployeeDaoImpl)
public class EmployeeTest {
	
	EmployeeDao employeeDao;

	
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
		employeeDao = new EmployeeDaoImpl();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		employeeDao=null;
		System.out.println("@After calling Test method");
	}
	
	@Test
	public void testEmployeeId()
	{
		System.out.println("Testing if the returned Employee Id and the requested Employee Id is same! ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an existing Employee ID");
		int employeeId=scanner.nextInt();
	
		try {
		System.out.println("checking: "+employeeId);
		Employee employeeReturned=employeeDao.getEmployeeById(employeeId);
		System.out.println("checking: "+employeeReturned);
	    assertEquals(employeeReturned.getEmployeeId(), employeeId);

		}
		catch(Exception e)
		{
			System.out.println("Oops!The Employee does not exist!");
		}

		finally {
			System.out.println("Employee verified Successfully!");
		}
		
	
		
     }

	
}
