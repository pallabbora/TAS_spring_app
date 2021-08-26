package com.mph.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
import com.mph.entity.Manager;
import com.mph.service.EmployeeService;
import com.mph.service.ManagerService;

@CrossOrigin("*")
@RestController
/**
 * @author Tahir
 * @version 11.0.12
 */
@RequestMapping(value="/manager")
public class ManagerRestController {
	@Autowired
	ManagerService managerService;
	
	
	/**this method used to get allManagers
	 * @return List this will return list of managers
	 */
	 private static final Logger logger = Logger.getLogger(ManagerRestController.class);
	@GetMapping("/showManager")
	public ResponseEntity<List<Manager>> allManagers()
	{
		logger.info("GETTING REQUEST FROM CLIENT TO SHOW THE LIST OF MANAGERS");
        System.out.println(logger.getName()+ "  " + logger.getLevel());
        PropertyConfigurator.configure(ManagerRestController.class.getClassLoader().getResource("log4j.properties"));
        System.out.println("Log4 j configuration is SUCCESSFUL");
		System.out.println("inside rest");

		List<Manager> managerList=managerService.getAllManagerId();
		System.out.println("From Rest manager functionality: "+managerList);
		if(managerList.isEmpty())
		{
			return new ResponseEntity<List<Manager>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Manager>>(managerList,HttpStatus.OK);
	}
	
	
	
}