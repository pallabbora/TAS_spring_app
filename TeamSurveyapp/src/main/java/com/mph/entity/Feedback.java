package com.mph.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity

public class Feedback{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedback_Id;
    private String employeeName;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Employee_Id_FK")
    private Employee employee;
    
    @OneToOne
    @JoinColumn(name="Result_Id_fk")
    private Result result;


    
    private int employeeRating;
    private String trainingRequired;

    
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Feedback(int feedback_Id, String employeeName, Employee employee, Result result, int employeeRating,
			String trainingRequired) {
		super();
		this.feedback_Id = feedback_Id;
		this.employeeName = employeeName;
		this.employee = employee;
		this.result = result;
		this.employeeRating = employeeRating;
		this.trainingRequired = trainingRequired;
	}


	public int getFeedback_Id() {
		return feedback_Id;
	}


	public void setFeedback_Id(int feedback_Id) {
		this.feedback_Id = feedback_Id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Result getResult() {
		return result;
	}


	public void setResult(Result result) {
		this.result = result;
	}


	public int getEmployeeRating() {
		return employeeRating;
	}


	public void setEmployeeRating(int employeeRating) {
		this.employeeRating = employeeRating;
	}


	public String getTrainingRequired() {
		return trainingRequired;
	}


	public void setTrainingRequired(String trainingRequired) {
		this.trainingRequired = trainingRequired;
	}


	@Override
	public String toString() {
		return "Feedback [feedback_Id=" + feedback_Id + ", employeeName=" + employeeName 
				+ ", result=" + result + ", employeeRating=" + employeeRating + ", trainingRequired=" + trainingRequired
				+ "]";
	}
	
	

}
