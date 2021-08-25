package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.dao.FeedbackDao;
import com.mph.entity.Employee;
import com.mph.entity.Feedback;
import com.mph.entity.LoginCredentials;

@Transactional
@Service
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	FeedbackDao feedbackDao;
	Feedback feedback;
	
	public FeedbackServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createFeedback(Feedback feedback) {
		feedbackDao.createFeedback(feedback);
		
	}

	@Override
	public Feedback getFeedbackByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return feedbackDao.getFeedbackByEmployeeId(employeeId);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return feedbackDao.getAllFeedback();
	}

	@Override
	public Feedback getFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackDao.getFeedback(feedback);
	}

	@Override
	public List<Feedback> updateFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackDao.updateFeedback(feedback);
	}

	@Override
	public List<Feedback> deleteFeedback(int feedbackId) {
		// TODO Auto-generated method stub
		return feedbackDao.deleteFeedback(feedbackId);
	}


	

}
