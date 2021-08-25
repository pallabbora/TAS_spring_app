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
import com.mph.entity.Manager;

@Repository
public class ManagerDaoImpl implements ManagerDao{
   
	@Autowired
    private SessionFactory sessionFactory;
    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	@Override
	public List<Manager> getAllManagerId() {
		Query query=getSession().createQuery("from Manager manager");
		List<Manager> managerlist=query.list();
		System.out.println("Manager: "+managerlist);

		return managerlist;
		
	}
    

}
