package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class ProblemTracker_here extends Baseclass_here {
	
	public  ProblemTracker_here() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath="//a[contains(text(),' Problem')]")
	private WebElement clicking_problemintracker;
	
	@FindBy (xpath="//a[contains(text(),'Add problem tracker')]")
	private WebElement clickingadd_problemtracker;
	
	@FindBy (xpath="//input[@id='problem_date']")
	private WebElement clickingadd_dateproblem;
	
	@FindBy (xpath="(//a[@class='ui-state-default'])[3]") //select date 2 
	private WebElement clickingcurrent_dateproblem;
	
	@FindBy (xpath="//select[@id='overviews_rate']")
	private WebElement selectproblem_compared;
	
	
	@FindBy (xpath="(//label[@class='form-check-label checkmark'])[1]")
	private WebElement Impactof_problem1;
	
	@FindBy (xpath="(//label[@class='form-check-label checkmark'])[2]")
	private WebElement Impactof_problem2;
	
	@FindBy (xpath="//textarea[@id='note']")
	private WebElement Add_notes;
	
	public WebElement getClicking_problemintracker() {
		return clicking_problemintracker;
	}

	public WebElement getClickingadd_problemtracker() {
		return clickingadd_problemtracker;
	}

	public WebElement getClickingadd_dateproblem() {
		return clickingadd_dateproblem;
	}

	public WebElement getClickingcurrent_dateproblem() {
		return clickingcurrent_dateproblem;
	}

	public WebElement getSelectproblem_compared() {
		return selectproblem_compared;
	}

	public WebElement getImpactof_problem1() {
		return Impactof_problem1;
	}

	public WebElement getImpactof_problem2() {
		return Impactof_problem2;
	}

	public WebElement getAdd_notes() {
		return Add_notes;
	}

	public WebElement getSave_buttonProblem() {
		return save_buttonProblem;
	}

	@FindBy (xpath="//button[@id='save_button']")
	private WebElement save_buttonProblem;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
     

}
