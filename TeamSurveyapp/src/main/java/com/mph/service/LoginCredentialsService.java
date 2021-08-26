package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;

/**
 * @author Pallavi
 * @version 11.0.12
 */
public interface LoginCredentialsService {

	/**
	 * this method will createLoginCredentials 
	 * @param loginCredentials this is parameter to createLoginCredentials
	 */
	public void createLoginCredentials(LoginCredentials loginCredentials);
	
	
	/**
	 * this method to getDetail
	 * @param email this is parameter to getDetail
	 * @param password this is parameter to getDetail
	 * @param designation this is parameter to getDetail
	 * @return loginCredentials this will return LoginCredentials
	 */
	public LoginCredentials getDetail(String email,String password, String designation);
	
}
