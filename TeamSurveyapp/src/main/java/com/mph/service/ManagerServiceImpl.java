package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.dao.ManagerDao;
import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;
import com.mph.entity.Manager;

@Transactional
@Service
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	ManagerDao managerDao;
	Manager manager;
	
	public ManagerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Manager> getAllManagerId() {
		// TODO Auto-generated method stub
		return managerDao.getAllManagerId();
	}


	
}
