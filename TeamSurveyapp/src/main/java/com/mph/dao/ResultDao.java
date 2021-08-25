package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;
import com.mph.entity.Result;
/**
 * @author Anuja
 * @version 11.0.12
 */
public interface ResultDao {
	
    /**
     * this method will create result
     * @param result this parameter passed to createResult method
     */
    public void createResult(Result result);
    
    
	/**
	 * this method used to getAllResult 
	 * @return List  this will return list of result
	 */
	public List<Result> getAllResult();
	
	
	/** this method used to updateResult
	 * @param result this parameter passed to updateResult method
	 * @return List this will return list of result
	 */
	public List<Result> updateResult(Result result);
	
	
	/**this method used to deleteResult
	 * @param resultId this parameter passed to deleteResult method
	 * @return  List this will return list of result
	 */
	public List<Result> deleteResult(int resultId);

}
