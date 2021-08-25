package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	Employee employee;
	
	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.createEmployee(employee);
	}
	


	@Override
	public List<Employee> updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}


	@Override
	public List<Employee> deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeId);
	}


	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId) ;
	}



	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

}
