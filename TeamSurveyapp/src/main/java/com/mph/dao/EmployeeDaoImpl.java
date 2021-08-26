package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
   
	
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    
	
	@Override
	public void createEmployee(Employee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee added successfully");
		
		
	}

	
	@Override
	public List<Employee> updateEmployee(Employee employee) {
		
		Query query=getSession().createQuery("update Employee emp set firstname=:fname,lastname=:lname,gender=:gender, department=:dept, surveyStatus=:status,phoneNumber=:phn, employeeRating=:rating,email=:email where employeeId=:eno");
		query.setParameter("fname", employee.getFirstName());
		query.setParameter("lname", employee.getLastName());
		query.setParameter("gender", employee.getGender());
		query.setParameter("email", employee.getEmail());
		query.setParameter("status", employee.getSurveyStatus());
		query.setParameter("rating", employee.getEmployeeRating());
		query.setParameter("dept", employee.getDepartment());
		query.setParameter("phn", employee.getPhoneNumber());
		query.setParameter("eno", employee.getEmployeeId());
		
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Updated Rows: "+noofrows);
		}
	
		return getAllEmployee();
	}

	@Override
	public List<Employee> deleteEmployee(int employeeId) {
	
		Query query=getSession().createQuery("delete from Employee emp where employeeId=:eno");
		query.setParameter("eno", employeeId);
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Deleted Rows: "+noofrows);
		}
	
		return getAllEmployee();	
	}

	@Override
	public Employee getEmployeeById(int eid) {
		System.out.println("inside Dao: "+eid);
		
		Criteria c = getSession().createCriteria(Employee.class);
		c.add(Restrictions.eq("employeeId", eid));
		Employee employee = (Employee)c.uniqueResult();
		System.out.println("Employee Found : " + employee);
		return employee;
		
		//return sessionFactory.getCurrentSession().get(Employee.class,employeeId);
	}


	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("inside dao");

		Query query=getSession().createQuery("from Employee emp");
	

		List<Employee> emplist=query.list();
		System.out.println("Employee: "+emplist);

		return emplist;
	}

}
