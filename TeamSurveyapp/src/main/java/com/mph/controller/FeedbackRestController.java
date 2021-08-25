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
import com.mph.entity.Feedback;
import com.mph.service.EmployeeService;
import com.mph.service.FeedbackService;
@CrossOrigin("*")
@RestController
@RequestMapping(value="/feedback")
public class FeedbackRestController {
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/showFeedback")
	public ResponseEntity<List<Feedback>> allFeedback()
	{
		System.out.println("inside rest");

		List<Feedback> feedbacklist=feedbackService.getAllFeedback();
		System.out.println("From Rest allfeedback functionality: "+feedbacklist);
		if(feedbacklist.isEmpty())
		{
			return new ResponseEntity<List<Feedback>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Feedback>>(feedbacklist,HttpStatus.OK);
	}
	
	@PostMapping("/createFeedback")
	public Feedback createFeedback(@RequestBody Feedback feedback)
	{
		feedbackService.createFeedback(feedback);
		return feedback;
	}
	
	
	@PutMapping("/updateFeedback")
	public ResponseEntity<List<Feedback>> updateFeedback(@RequestBody Feedback feedback)
	{
		List<Feedback> feedbacklist=feedbackService.updateFeedback(feedback);
		System.out.println("From Rest update functionality: "+feedbacklist);
		if(feedbacklist.isEmpty())
		{
			return new ResponseEntity<List<Feedback>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Feedback>>(feedbacklist,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteFeedback/{id}")
	public ResponseEntity<List<Feedback>> deleteFeedback(@PathVariable("id") int feedbackId)
	{
		List<Feedback> feedbacklist=feedbackService.deleteFeedback(feedbackId);
		System.out.println("From Rest delete functionality: "+feedbacklist);
		if(feedbacklist.isEmpty())
		{
			return new ResponseEntity<List<Feedback>>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Feedback>>(feedbacklist,HttpStatus.OK);
	}
}