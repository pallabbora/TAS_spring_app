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
public class LoginCredentialsDaoImpl implements LoginCredentialsDao{
   
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	@Override
	public void createLoginCredentials(LoginCredentials loginCredentials) {
		getSession().saveOrUpdate(loginCredentials);
		System.out.println("Detail added successfully");
		
		
	}
	@Override
	public LoginCredentials getDetail(String email,String password,String designation) {
		// TODO Auto-generated method stub
		return (LoginCredentials) getSession().createQuery("select lc from LoginCredentials lc where emailId='"+email+"'and password='"+password+"'and designation='"+designation+"'").uniqueResult();
		
	}
    
	
	
}
