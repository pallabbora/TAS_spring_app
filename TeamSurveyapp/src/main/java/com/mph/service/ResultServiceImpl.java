package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.dao.ResultDao;
import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;
import com.mph.entity.Result;

@Transactional
@Service
public class ResultServiceImpl implements ResultService{
	@Autowired
	ResultDao resultDao;
	Result result;
	
	public ResultServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createResult(Result result) {
		resultDao.createResult(result);
		
	}

	@Override
	public List<Result> getAllResult() {
			return resultDao.getAllResult();
	}

	@Override
	public List<Result> updateResult(Result result) {
		return resultDao.updateResult(result);
	}

	@Override
	public List<Result> deleteResult(int resultId) {
		
		return resultDao.deleteResult(resultId);
	}


}
