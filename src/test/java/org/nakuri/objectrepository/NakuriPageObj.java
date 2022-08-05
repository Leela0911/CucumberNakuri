package org.nakuri.objectrepository;

import org.nakuri.resources.Commonactionnakuri;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NakuriPageObj extends Commonactionnakuri{

	public NakuriPageObj()
	{
		PageFactory.initElements(driver,this);
	}
@FindBy (xpath = "//div[text()='Register']")
private static WebElement reg;
@FindBy (xpath = "//input[@id='name']")
private WebElement name;
@FindBy (xpath = "//input[@id='email']")
private WebElement email;
@FindBy (xpath = "//input[@type='password']")
private WebElement pwd;
@FindBy (xpath = "//input[@id='mobile']")
private WebElement mobilenumber;
@FindBy (xpath = "(//div[@class='textWrap'])[2]")
private WebElement workstatus;
@FindBy (xpath = "//span[text()='Chennai']")
private WebElement city;
@FindBy (xpath = "//button[text()='Register Now']")
private WebElement registernow;
@FindBy (xpath = "//span[text()='Skip']")
private WebElement skip;
@FindBy (xpath = "//span[text()='Graduation/Diploma']")
private WebElement education;
@FindBy (xpath = "//span[text()='B.Tech/B.E.']")
private WebElement degree;
@FindBy (xpath = "//input[@name='course-suggestor']")
private WebElement course;
@FindBy (xpath = "//input[@name='institute-suggestor']")
private WebElement institute;
@FindBy (xpath = "//span[text()='Full Time']")
private WebElement time;
@FindBy (xpath = "//span[text()='2020']")
private WebElement yearpassed ;
@FindBy (xpath = "//input[@class='suggestor-input ']")
private WebElement suggestorinput;
@FindBy (xpath = "//button[text()='Save and Continue']")
private WebElement savecontinue;
@FindBy (xpath = "//textarea[@id='resumeHeadline']")
private WebElement resumehead;
@FindBy (xpath = "(//div[@class='textWrap'])[1]")
private WebElement job ;
@FindBy (xpath = "//span[text()='Permanent']")
private WebElement position;
@FindBy (xpath = "//span[text()='Full Time']")
private WebElement fulltime ;
@FindBy (xpath = "//span[text()='Chennai']")
private WebElement place;
@FindBy (xpath = "//span[text()='Female']")
private WebElement gender ;
@FindBy (xpath = "//button[@type='submit']")
private WebElement submit;

public WebElement getReg() {
 return reg; }
public WebElement getName() {
	 return name; }

public WebElement getEmail() {
	 return email; }
public WebElement getPassword() {
	 return pwd; }
public WebElement getMobileNumber() {
	 return mobilenumber; }
public WebElement getWorkStatus() {
	 return workstatus; }
public WebElement getCity() {
	 return city; }
public WebElement getRegisterNow() {
	 return registernow; }
public WebElement getSkip() {
	 return skip; }
public WebElement getEducation()
{
	return education;
}
public WebElement getDegree() {
	 return degree; }

public WebElement getCourse() {
	 return course; }
public WebElement getInstitute() {
	 return institute; }
public WebElement getTime() {
	 return time; }
public WebElement getYear() {
	 return yearpassed; }
public WebElement getSuggestion() {
	 return suggestorinput; }
public WebElement getSaveContinue() {
	 return savecontinue; }
public WebElement getResumehead() {
	 return resumehead; }
public WebElement getJob() {
	 return job; }
public WebElement getPosition() {
	 return position; }
public WebElement getFulltime() {
	 return fulltime; }
public WebElement getPlace() {
	 return place; }
public WebElement getGender() {
	 return gender; }
public WebElement getSubmit() {
	 return submit; }



}

