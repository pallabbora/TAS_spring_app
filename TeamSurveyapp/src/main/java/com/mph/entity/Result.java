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

/**
 * @author Pallab
 * @version 11.0.12
 *
 */
@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int result_id;
    private int question1;
    private int question2;
    private int question3;
    private int question4;
    private int question5;
    private int question6;
    private int question7;
    private int question8;
    private int question9;
    private int question10;
    @Temporal(TemporalType.DATE)
    private Date surveyDate;
    private int employeeRating;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Employee_Id_FK")
    private Employee employee;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Evaluated_by")
    private Manager manager;

   

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param result_id  sets the result_id for survey
	 * @param question1 sets the question1 to employee
	 * @param question2 sets the question2 to employee
	 * @param question3 sets the question3 to employee
	 * @param question4 sets the question4 to employee
	 * @param question5 sets the question5 to employee
	 * @param question6 sets the question6 to employee
	 * @param question7 sets the question7 to employee
	 * @param question8 sets the question8 to employee
	 * @param question9 sets the question9 to employee
	 * @param question10 sets the question10 to employee
	 * @param surveyDate sets the surveyDate of the survey
	 * @param employeeRating sets the employeeRating to employee
	 * @param employee sets employee Details
	 * @param manager sets the manager details
	 */

	public Result(int result_id, int question1, int question2, int question3, int question4, int question5,
			int question6, int question7, int question8, int question9, int question10, Date surveyDate,int employeeRating,
			 Employee employee, Manager manager) {
		super();
		this.result_id = result_id;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
		this.question7 = question7;
		this.question8 = question8;
		this.question9 = question9;
		this.question10 = question10;
		this.surveyDate = surveyDate;
		this.employeeRating = employeeRating;
		this.employee = employee;
		this.manager = manager;
	
	}

	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public int getQuestion1() {
		return question1;
	}

	public void setQuestion1(int question1) {
		this.question1 = question1;
	}

	public int getQuestion2() {
		return question2;
	}

	public void setQuestion2(int question2) {
		this.question2 = question2;
	}

	public int getQuestion3() {
		return question3;
	}

	public void setQuestion3(int question3) {
		this.question3 = question3;
	}

	public int getQuestion4() {
		return question4;
	}

	public void setQuestion4(int question4) {
		this.question4 = question4;
	}

	public int getQuestion5() {
		return question5;
	}

	public void setQuestion5(int question5) {
		this.question5 = question5;
	}

	public int getQuestion6() {
		return question6;
	}

	public void setQuestion6(int question6) {
		this.question6 = question6;
	}

	public int getQuestion7() {
		return question7;
	}

	public void setQuestion7(int question7) {
		this.question7 = question7;
	}

	public int getQuestion8() {
		return question8;
	}

	public void setQuestion8(int question8) {
		this.question8 = question8;
	}

	public int getQuestion9() {
		return question9;
	}

	public void setQuestion9(int question9) {
		this.question9 = question9;
	}

	public int getQuestion10() {
		return question10;
	}

	public void setQuestion10(int question10) {
		this.question10 = question10;
	}

	public Date getSurveyDate() {
		return surveyDate;
	}

	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}

	public int getEmployeeRating() {
		System.out.println("from getter: "+employeeRating);
		return employeeRating;
	}

	public void setEmployeeRating(int employeeRating) {
		  this.employeeRating = employeeRating;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 *Returns string representation of the object
	 */
	@Override
	public String toString() {
		return "Result [result_id=" + result_id + ", question1=" + question1 + ", question2=" + question2
				+ ", question3=" + question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6="
				+ question6 + ", question7=" + question7 + ", question8=" + question8 + ", question9=" + question9
				+ ", question10=" + question10 + ", surveyDate=" + surveyDate + ", employeeRating=" + employeeRating
				+ "]";
	}

	
	
}
