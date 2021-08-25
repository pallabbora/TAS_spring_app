package com.mph.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Anuja
 * @version 11.0.12
 *
 */

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String firstName;
	private String lastName;
	private String gender;
	private String department;
    private int employeeRating;

	@OneToOne
	@JoinColumn(name = "Manager_Id_FK",referencedColumnName = "MANAGERID")
	private Manager manager;
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	private String email;
	private long phoneNumber;
	
	private String surveyStatus="Pending";

	/**
	 * Constructor from Superclass 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructor using Fields
	 * @param employeeId ID for each set of data
	 * @param firstName  firstName for each set of data
	 * @param lastName  lastName for each set of data
	 * @param gender  gender for each set of data
	 * @param department department for each set of data
	 * @param manager manager of each employee
	 * @param employeeRating employeeRating of each employee
	 * @param hireDate hireDate for each set of data
	 * @param email email for each set of data
	 * @param phoneNumber   phoneNumber of each employee
	 * @param surveyStatus surveyStatus of each employee 
	 */
	public Employee(int employeeId, String firstName, String lastName, String gender, String department,Manager manager,
		 int employeeRating,Date hireDate, String email, long phoneNumber, String surveyStatus) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.department = department;
		this.manager = manager;
        this.employeeRating=employeeRating;
		this.hireDate = hireDate;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.surveyStatus = surveyStatus;

	}

	/**
	 * @return it returns EmployeeId of the employee
	 */
	public int getEmployeeId() {
		return employeeId;
	}


	/**
	 * @param employeeId set the employeeId for the employees
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName set the firstName for employees
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName get the lastName for employees
	 */
	public String getLastName() {
		return lastName;
	}

	
	/**
	 * @param lastName set the lastName for employees
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender set the gender for the employee
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}


	/**
	 * @param department set the department for employee
	 */
	public void setDepartment(String department) {
		this.department = department;
	}


	/**
	 * @return manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager set the manager to the employee
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * @return hireDate 
	 */
	public Date getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate set to hireDate when new user is created
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email set the email data for employee
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber set the phone number of the employee
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return surveyStatus
	 */
	public String getSurveyStatus() {
		return surveyStatus;
	}


	/**
	 * @param surveyStatus sets the surveyStatus
	 */
	public void setSurveyStatus(String surveyStatus) {
		this.surveyStatus = surveyStatus;
	}

	
	/**
	 * @return employeeRating
	 */
	public int getEmployeeRating() {
		return employeeRating;
	}

	
	/**
	 * @param employeeRating sets the employeeRating
	 */
	public void setEmployeeRating(int employeeRating) {
		this.employeeRating = employeeRating;
	}

	/**
	 *Returns string representation of the object
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", department=" + department + ", employeeRating=" + employeeRating
				+ ", hireDate=" + hireDate + ", email=" + email + ", phoneNumber=" + phoneNumber + ", surveyStatus="
				+ surveyStatus + "]";
	}

	
	
}
