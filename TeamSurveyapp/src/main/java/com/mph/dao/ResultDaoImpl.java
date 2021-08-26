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
import com.mph.entity.Result;

@Repository
public class ResultDaoImpl implements ResultDao{
   
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	@Override
	public void createResult(Result result) {
		getSession().saveOrUpdate(result);
		System.out.println("Result added successfully");
		
	}
	@Override
	public List<Result> getAllResult() {
		System.out.println("inside dao");

		Query query=getSession().createQuery("from Result result");
	

		List<Result> resultList=query.list();
		System.out.println("Result list: "+resultList);

		return resultList;
	}
	@Override
	public List<Result> updateResult(Result result) {
		Query query=getSession().createQuery("update Result result set question1=:q1,question2=:q2,question3=:q3,question4=:q4,question5=:q5,question6=:q6,question7=:q7,question8=:q8,question9=:q9,question10=:q10,employeeRating=:rating,surveyDate=:surveydate where result_Id=:rno");
		query.setParameter("q1", result.getQuestion1());
		query.setParameter("q2", result.getQuestion2());
		query.setParameter("q3", result.getQuestion3());
		query.setParameter("q4", result.getQuestion4());
		query.setParameter("q5", result.getQuestion5());
		query.setParameter("q6", result.getQuestion6());
		query.setParameter("q7", result.getQuestion7());
		query.setParameter("q8", result.getQuestion8());
		query.setParameter("q9", result.getQuestion9());
		query.setParameter("q10", result.getQuestion10());


		query.setParameter("rating", result.getEmployeeRating());
		query.setParameter("surveydate",result.getSurveyDate());
		query.setParameter("rno", result.getResult_id());
		
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Updated Rows: "+noofrows);
		}
	
		return getAllResult();
	}
	@Override
	public List<Result> deleteResult(int resultId) {

		Query query=getSession().createQuery("delete from Result result where result_Id=:rno");
		query.setParameter("rno", resultId);
		int noofrows=query.executeUpdate();
		if(noofrows>0)
		{
			System.out.println("Deleted Rows: "+noofrows);
		}
	
		return getAllResult();
	}



}
