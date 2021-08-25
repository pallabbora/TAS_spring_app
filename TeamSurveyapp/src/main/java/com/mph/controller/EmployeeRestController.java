package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Employee;
import com.mph.service.EmployeeService;



@CrossOrigin("*")
@RestController

/**
 * @author Pallavi
 * @version 11.0.12
 */
@RequestMapping(value="/employee")
public class EmployeeRestController {
	@Autowired
	EmployeeService employeeService;
	
	
	
	/**this method is to get allEmployee
	 * @return List this will return list of all employees
	 */
	@GetMapping("/showEmployee")
	public ResponseEntity<List<Employee>> allEmployee()
	{
		System.out.println("inside rest");

		List<Employee> emplist=employeeService.getAllEmployee();
		System.out.println("From Rest allemp functionality: "+emplist);
		if(emplist.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
	}
	
	
	
	
	/**this method will create Employee
	 * @param employee this parameter passed to createEmployee method
	 * @return employee this will return a employee
	 */
	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		employeeService.createEmployee(employee);
		return employee;
	}
	
	
	
	/**this method will update a Employee
	 * @param employee this parameter passed to updateEmployee method
	 * @return List this will return a list of updated Employees
	 */
	@PutMapping("/updateEmp")
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee)
	{
		List<Employee> emplist=employeeService.updateEmployee(employee);
		System.out.println("From Rest update functionality: "+emplist);
		if(emplist.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
	}
	
	
	
	
	/**this method will delete a Employee
	 * @param employeeId this parameter passed to deleteEmployee method
	 * @return List this will return a list of Employees
	 */
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") int employeeId)
	{
		List<Employee> emplist=employeeService.deleteEmployee(employeeId);
		System.out.println("From Rest delete functionality: "+emplist);
		if(emplist.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
	}
	
	
	
	/**this method will getEmployee by Id
	 * @param id this parameter passed to getEmployee method
	 * @return employee this will return a employee
	 */
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id)
	{
		System.out.println("inside rest");

		Employee employee=employeeService.getEmployeeById(id);
		System.out.println("From Rest allemp functionality: "+employee);
		if(employee==null)
		{
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
}