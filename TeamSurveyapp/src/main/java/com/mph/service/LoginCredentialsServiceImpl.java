package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.dao.LoginCredentialsDao;
import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;

@Transactional
@Service
public class LoginCredentialsServiceImpl implements LoginCredentialsService{
	@Autowired
	LoginCredentialsDao loginCredentialsDao;
	LoginCredentials loginCredentials;
	
	public LoginCredentialsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createLoginCredentials(LoginCredentials loginCredentials) {
		
		loginCredentialsDao.createLoginCredentials(loginCredentials);
	}

	@Override
	public LoginCredentials getDetail(String email, String password, String designation) {
		
		return loginCredentialsDao.getDetail(email, password, designation);
	}




	
}
