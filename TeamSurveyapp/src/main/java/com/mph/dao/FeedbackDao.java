package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.Feedback;
import com.mph.entity.LoginCredentials;

public interface FeedbackDao {
	public void createFeedback(Feedback feedback);
	public Feedback getFeedbackByEmployeeId(int employeeId);
	public List<Feedback> getAllFeedback();

	public Feedback getFeedback(Feedback feedback);
	public List<Feedback> updateFeedback(Feedback feedback);
	public List<Feedback> deleteFeedback(int feedbackId);
	
	

}
