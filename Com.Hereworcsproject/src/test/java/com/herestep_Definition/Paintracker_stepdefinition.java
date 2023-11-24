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

public class Paintracker_stepdefinition extends Baseclass_here {
	
	public static Single_Here si=new Single_Here();
	
	@Given("Clicking menu icon")
	public void clicking_menu_icon() throws InterruptedException {
		Click(si.getsleepHere().getMenu_button());
		Thread.sleep(2000);
	    
	}

	@When("Cicking Trackers option in the menu button pain")
	public void cicking_trackers_option_in_the_menu_button_pain() throws InterruptedException {
		Click(si.getsleepHere().getTrcakersin_menu());
		Thread.sleep(2000);		
	  
	}

	@When("Click Pain in tracker overview page")
	public void click_pain_in_tracker_overview_page() throws InterruptedException {
		Click(si.getpainHere().getClickpain_tracker());
		Thread.sleep(2000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);

	}

	@When("Click Calendar- pain")
	public void click_calendar_pain() throws InterruptedException {
		Click(si.getpainHere().getClick_calendar());
		Thread.sleep(2000);		

	   
	}

	@When("Select Date- pain")
	public void select_date_pain() throws InterruptedException {
		Click(si.getpainHere().getSelect_Date());
		Thread.sleep(3000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);	

	 
	}

	@When("Select Pain severity rating")
	public void select_pain_severity_rating() throws InterruptedException {
		Select click=new Select(si.getpainHere().getSelectpain_severity());
		click.selectByIndex(6);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
	   
	}

	@When("Select types ofpain")
	public void select_types_ofpain() throws InterruptedException, IOException {
		inputValue(si.getpainHere().getSelecttypesof_pain(),FileReaderher_Manager.getInstanceConfig().getconfigdata().getstypesofPain());
		Thread.sleep(2000);
	   
	}

	@When("Selct Location")
	public void selct_location() throws IOException, InterruptedException {
		inputValue(si.getpainHere().getSelect_location(),FileReaderher_Manager.getInstanceConfig().getconfigdata().getLoactionpain());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

	    
	}

	@Then("Click Submit-pain")
	public void click_submit_pain() throws InterruptedException {
		Click(si.getpainHere().getClick_submit());
		Thread.sleep(2000);

	  
	}

	@Given("Click View Graph- pain")
	public void click_view_graph_pain() throws InterruptedException {
		Click(si.getpainHere().getClickView_graph());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(4000);

	   
	}

	@When("Select Day field- pain")
	public void select_day_field_pain() throws InterruptedException {
		driver.quit();
		

		
	   
	}



	
}