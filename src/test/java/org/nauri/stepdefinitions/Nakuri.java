package org.nauri.stepdefinitions;

import java.awt.AWTException;
import java.util.Set;

import org.nakuri.objectrepository.NakuriPageObj;
import org.nakuri.resources.Commonactionnakuri;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Nakuri extends Commonactionnakuri{
	Commonactionnakuri c = new Commonactionnakuri();
	NakuriPageObj n = new NakuriPageObj();
	

	@Given("Click Register")
	public void click_Register() {
						
			  n.getReg().isDisplayed();
			 n.getReg().click();
				   
	}

	@Given("Enter name")
	public void enter_name() {
		  c.windowsHandling();
		  c.insertText(n.getName(), "MohanDass");
	}

	@Given("Enter mail id")
	public void enter_mail_id() {
	 c.insertText(n.getEmail(), "mohan5964@gmail.com");
	}

	@Given("Password")
	public void password() {
		c.insertText(n.getPassword(),"moh321456");
	    
	}

	@Given("Enter PhoneNumber")
	public void enter_PhoneNumber() {
	    c.insertText(n.getMobileNumber(),"9874562125");
	}

	@Given("Work Status")
	public void work_Status() {
	 n.getWorkStatus().click();
	}

	@Given("Enter City")
	public void enter_City() {
	   n.getCity().click();
	}

	@When("Register Now")
	public void register_Now() throws Exception {
	 n.getRegisterNow().click();
	 Thread.sleep(3000);
	}
	@Then("Skip")
	public void skip() {
	    n.getSkip().click();
	}

	@When("Highest Qualification")
	public void highest_Qualification() {
	   n.getEducation().click();
	}

	@When("Course")
	public void course() {
	    n.getDegree().click();
	}

	@When("Specification")
	public void specification() throws AWTException {
	 n.getCourse().click();  
	 c.robokey();
	}

	@When("University")
	public void university() throws AWTException {
	  c.insertText(n.getInstitute(),"Madras University");
	   c.robokey();
	}

	@When("Course Type")
	public void course_Type() {
	 n.getTime().click();
	}

	@When("Passing year")
	public void passing_year() {
	 n.getYear().click();
	}

	@When("Enter Skills")
	public void enter_Skills() throws AWTException {
	    c.insertText(n.getSuggestion(), "java");
	    c.robokey();
	}

	@Then("Save and Continue")
	public void save_and_Continue() {
	   n.getSaveContinue().click();
	}

	@Then("Resume Headline")
	public void resume_Headline() {
	   c.insertText(n.getResumehead(),"Based on Java And Selenium");
	}

	@Then("Suggestion")
	public void suggestion() {
	  n.getJob().click();
	}

	@Then("Preferred job type")
	public void preferred_job_type() {
	 n.getPosition().click();
	}

	@Then("Preferred Employment type")
	public void preferred_Employment_type() {
	  n.getFulltime().click();
	}

	@Then("Preferred Work Location")
	public void preferred_Work_Location() {
	   n.getPlace().click();
	}

	@Then("Gender")
	public void gender() {
	  n.getGender().click();
	}

	@Then("Submit")
	public void submit() {
	    n.getSubmit().click();
	}


}
