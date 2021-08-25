package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
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
import com.mph.entity.LoginCredentials;
import com.mph.service.EmployeeService;
import com.mph.service.LoginCredentialsService;
@CrossOrigin("*")
@RestController
/**
 * @author Pallavi
 * @version 11.0.12
 */
@RequestMapping(value="/login")
public class LoginCredentialsRestController {
	@Autowired
	LoginCredentialsService loginCredentialsService;
	
	
	
	/**this method will create a loginDetails
	 * @param loginCredentials this parameter passed to createLoginDetail method
	 * @return loginCredentials this will return a loginCredentials detail
	 */
	@PostMapping("/createDetail")
	public LoginCredentials createLoginDetail(@RequestBody LoginCredentials loginCredentials)
	{
		System.out.println("inside create rest");

		loginCredentialsService.createLoginCredentials(loginCredentials);
		return loginCredentials;
	}
	
	
	
	/**this method used to getDetail with specific credential values
	 * @param detailToValidate this parameter passed to getDetail method
	 * @return loginCredentials this will return a loginCredentials detail
	 */
	@PostMapping("/validate")
	public ResponseEntity<LoginCredentials> getDetail(@RequestBody LoginCredentials detailToValidate )
	{
		System.out.println("inside rest");

		LoginCredentials loginCredentials=loginCredentialsService.getDetail(detailToValidate.getEmailId(),detailToValidate.getPassword(),detailToValidate.getDesignation());
     	System.out.println("From Rest allemp functionality: "+loginCredentials);
		if(loginCredentials==null)
		{
			return new ResponseEntity<LoginCredentials>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<LoginCredentials>(loginCredentials,HttpStatus.OK);
	}
	
	
	
		

}