package com.herestep_Definition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.Baseclasshere.Baseclass_here;
import com.configurationhere_reader.FileReaderher_Manager;
import com.singleTon_Here.Single_Here;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Problemtracker_stepdefinition extends Baseclass_here {
	
	public static Single_Here si=new Single_Here();
	
	@Given("Clicking menu icon problem tracker")
	public void clicking_menu_icon_problem_tracker() throws InterruptedException {
		
		Click(si.getsleepHere().getMenu_button());
		Thread.sleep(2000);	    
	}

	@When("Cicking Trackers option in the menu button- problem")
	public void cicking_trackers_option_in_the_menu_button_problem() throws InterruptedException {
		Click(si.getsleepHere().getTrcakersin_menu());
		Thread.sleep(2000);		
	   
	}

	@And("Click Problem in tracker overview page")
	public void click_problem_in_tracker_overview_page() throws InterruptedException {
		Click(si.getproblemHere().getClicking_problemintracker());
		Thread.sleep(6000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	    
	}

	@And("Click Add problem Tracker")
	public void click_add_problem_tracker() throws InterruptedException {
		Click(si.getproblemHere().getClickingadd_problemtracker());
		Thread.sleep(2000);		
	   
	}

	@And("Add date - problem Tracker")
	public void add_date_problem_tracker() throws InterruptedException {
		Click(si.getproblemHere().getClickingadd_dateproblem());
		Thread.sleep(2000);		
		Click(si.getproblemHere().getClickingcurrent_dateproblem());
		Thread.sleep(2000);		
		
	   
	}

	@And("Select Problem compared to last time")
	public void select_problem_compared_to_last_time() throws InterruptedException {
		Select click=new Select(si.getproblemHere().getSelectproblem_compared());
		Thread.sleep(2000);
		click.selectByIndex(2);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);

		
	  
	}

	@And("Impact of the problem")
	public void impact_of_the_problem() throws InterruptedException {
		Click(si.getproblemHere().getImpactof_problem2());
		Thread.sleep(2000);	
		Click(si.getproblemHere().getImpactof_problem1());
		Thread.sleep(2000);		


	}
	   

	@And("Add Notes")
	public void add_notes() throws IOException, InterruptedException {
	  inputValue(si.getproblemHere().getAdd_notes(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getaddnotesProblem());	
	  Thread.sleep(2000);
	  
	}

	@Then("Click submit")
	public void click_submit() throws InterruptedException {
		Click(si.getproblemHere().getSave_buttonProblem());
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		driver.quit();
		
	  
	}




}
