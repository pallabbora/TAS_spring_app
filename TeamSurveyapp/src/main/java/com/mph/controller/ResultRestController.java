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

import com.mph.entity.Result;
import com.mph.service.EmployeeService;

import com.mph.service.ResultService;

@RestController
@CrossOrigin("*")
/**
 * @author Tahir
 * @version 11.0.12
 */
@RequestMapping(value="/result")
public class ResultRestController {
	@Autowired
	ResultService resultService;
	
	
	
	/**this method used to get allResult Details
	 * @return List this will return list of result details
	 */
	 private static final Logger logger = Logger.getLogger(ResultRestController.class);
	@GetMapping("/showResult")
	public ResponseEntity<List<Result>> allResult()
	{
		logger.info("GETTING REQUEST FROM CLIENT TO SHOW THE LIST OF RESULT");
        System.out.println(logger.getName()+ "  " + logger.getLevel());
        PropertyConfigurator.configure(ResultRestController.class.getClassLoader().getResource("log4j.properties"));
        System.out.println("Log4 j configuration is SUCCESSFUL");
		System.out.println("inside rest");

		List<Result> resultList=resultService.getAllResult();
		System.out.println("From Rest allResult  functionality: "+resultList);
		if(resultList.isEmpty())
		{
			return new ResponseEntity<List<Result>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Result>>(resultList,HttpStatus.OK);
	}
	
	
	
	/**this method used to create Result Details
	 * @param result this parameter passed to createResult method
	 * @return result this will return a result detail
	 */
	@PostMapping("/createResult")
	public Result createResult(@RequestBody Result result)
	{

		logger.info("GETTING REQUEST FROM CLIENT TO CREATE RESULT");
        System.out.println(logger.getName()+ "  " + logger.getLevel());
        PropertyConfigurator.configure(ResultRestController.class.getClassLoader().getResource("log4j.properties"));
        System.out.println("Log4 j configuration is SUCCESSFUL");
		System.out.println("Result :======="+result);
		resultService.createResult(result);
		return result;
	}
	
	
	
	/**this method used to update Result Detail
	 * @param result this parameter passed to updateResult method
	 * @return List this will return list of result details
	 */
	@PutMapping("/updateResult")
	public ResponseEntity<List<Result>> updateResult(@RequestBody Result result)
	{

		logger.info("GETTING REQUEST FROM CLIENT TO UPDATE RESULT");
        System.out.println(logger.getName()+ "  " + logger.getLevel());
        PropertyConfigurator.configure(ResultRestController.class.getClassLoader().getResource("log4j.properties"));
        System.out.println("Log4 j configuration is SUCCESSFUL");
		List<Result> resultList=resultService.updateResult(result);
		System.out.println("From Rest update functionality: "+resultList);
		if(resultList.isEmpty())
		{
			return new ResponseEntity<List<Result>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Result>>(resultList,HttpStatus.OK);
	}
	
	
	
	/**this method used to delete result detail with id
	 * @param resultId this parameter passed to deleteResult method
	 * @return List this will return list of result details
	 */
	@DeleteMapping("/deleteResult/{id}")
	public ResponseEntity<List<Result>> deleteResult(@PathVariable("id") int resultId)
	{

		logger.info("GETTING REQUEST FROM CLIENT TO DELETE RESULT");
        System.out.println(logger.getName()+ "  " + logger.getLevel());
        PropertyConfigurator.configure(ResultRestController.class.getClassLoader().getResource("log4j.properties"));
        System.out.println("Log4 j configuration is SUCCESSFUL");
		List<Result> resultList=resultService.deleteResult(resultId);
		System.out.println("From Rest delete functionality: "+resultList);
		if(resultList.isEmpty())
		{
			return new ResponseEntity<List<Result>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Result>>(resultList,HttpStatus.OK);
	}
}