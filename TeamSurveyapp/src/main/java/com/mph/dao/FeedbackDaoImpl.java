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
import com.mph.entity.Feedback;
import com.mph.entity.LoginCredentials;

@Repository
public class FeedbackDaoImpl implements FeedbackDao{
   
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	@Override
	public void createFeedback(Feedback feedback) {
		getSession().saveOrUpdate(feedback);
		System.out.println("feedback added successfully");
		
	}
	@Override
	public Feedback getFeedbackByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Feedback> getAllFeedback() {
		System.out.println("inside dao");

		Query query=getSession().createQuery("from Feedback feedback");
	

		List<Feedback> feedbacklist=query.list();
		System.out.println("feedback list: "+feedbacklist);

		return feedbacklist;
	}
	@Override
	public Feedback getFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Feedback> updateFeedback(Feedback feedback) {
		Query query=getSession().createQuery("update Feedback feedback set employeename=:name,employeerating=:rating,trainingrequired=:trequired where feedback_Id=:fno");
		query.setParameter("name", feedback.getEmployeeName());
		query.setParameter("rating", feedback.getEmployeeRating());
		query.setParameter("trequired",feedback.getTrainingRequired());
		query.setParameter("fno", feedback.getFeedback_Id());
		
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Updated Rows: "+noofrows);
		}
	
		return getAllFeedback();
	}
	@Override
	public List<Feedback> deleteFeedback(int feedbackId) {

		Query query=getSession().createQuery("delete from Feedback feedback where feedback_Id=:fno");
		query.setParameter("fno", feedbackId);
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Deleted Rows: "+noofrows);
		}
	
		return getAllFeedback();
	}
    
	
	

}
