package com.mph.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



/**
 * @author Monish
 * @version 11.0.12
 */
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerId;
    private String managerName;
    
 
    
    
    
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param managerId sets the managerId 
	 * @param managerName sets the managerName
	 */

	public Manager(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		
	}



	public int getManagerId() {
		return managerId;
	}



	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}



	public String getManagerName() {
		return managerName;
	}



	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}




	/**
	 *Returns string representation of the object
	 */

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}



	
	
	
}
