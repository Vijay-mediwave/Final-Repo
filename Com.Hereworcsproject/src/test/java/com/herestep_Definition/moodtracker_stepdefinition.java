package com.herestep_Definition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.Baseclasshere.Baseclass_here;
import com.configurationhere_reader.FileReaderher_Manager;
import com.singleTon_Here.Single_Here;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class moodtracker_stepdefinition extends Baseclass_here{
	
	public static Single_Here si=new Single_Here();
	@When("Cicking Trackers option in menu button")
	public void cicking_trackers_option_in_menu_button() throws InterruptedException {
		Click(si.getmoodHere().getTrcakersin_menu());
		Thread.sleep(2000);
	   
	}

	@And("Click Mood  in tracker overview page")
	public void click_mood_in_tracker_overview_page() throws InterruptedException {
		Click(si.getmoodHere().getClick_Mood());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");	
		Thread.sleep(3000);

	    
	}
	@And("click Add my Mood Information")
	public void click_add_my_mood_information() throws InterruptedException {
	  Click(si.getmoodHere().getAddMood_information());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");	
		Thread.sleep(3000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);

	}
	@And("Click Calendar")
	public void click_calendar() throws InterruptedException {
		Click(si.getmoodHere().getClick_calendar());
		Thread.sleep(2000);

	   
	}
	@When("Select Date")
	public void select_date() throws InterruptedException {
		Click(si.getmoodHere().getSelectDate_calendar());
		Thread.sleep(2000);

	}
	@And("Select How are you feeling today")
	public void select_how_are_you_feeling_today() throws InterruptedException {
		Click(si.getmoodHere().getSelectFeeling_Neutraltoday());
		Thread.sleep(4000);
		Click(si.getmoodHere().getSelectFeeling_Happytoday());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");	
		Thread.sleep(3000);

	    
	}
	@And("Select compare previous mood entry")
	public void select_compare_previous_mood_entry() throws InterruptedException {
		Click(si.getmoodHere().getPreviousmoodsad_Entry());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");	
		Thread.sleep(3000);
	   
	}
	@And("Enter Notes")
	public void enter_notes() throws IOException, InterruptedException {
		inputValue(si.getmoodHere().getEnter_Notes(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getsearchNote());
		Thread.sleep(3000);
	   
	}
	@Then("Click record Mood")
	public void click_record_mood() throws InterruptedException {
		Click(si.getmoodHere().getRecord_Mood());
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(3000);
		
	    
	}
	
	@Given("Click month in Mood")
	public void click_month_in_mood() throws InterruptedException {
		Click(si.getmoodHere().getClickmonth_foredit());
		Thread.sleep(3000);

	    
	}

	@When("click Year in Mood")
	public void click_year_in_mood() throws InterruptedException {
		Click(si.getmoodHere().getClickyear_foredit());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");	
		Thread.sleep(3000);
	   
	}

	@When("Click edit 	In Mood")
	public void click_edit_in_mood() throws InterruptedException {
		Click(si.getmoodHere().getClick_edit());
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");	
		Thread.sleep(3000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);
	    
	}

	@When("change how are you feeling today")
	public void change_how_are_you_feeling_today() throws InterruptedException {
		Click(si.getmoodHere().getSelectFeeling_VeryHappytoday());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");	
	  
	}

	@When("click update record Mood")
	public void click_update_record_mood() throws InterruptedException {
	Click(si.getmoodHere().getUpdate_recordMood());
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-1200)");	
	Thread.sleep(3000);
	Click(si.getLogin_Page().getLogincancel_symbol());
	js.executeScript("window.scrollBy(0,1100)");	
	Thread.sleep(2000);


	   
	}

	@Then("Delete the addedd Mood entry")
	public void delete_the_addedd_mood_entry() throws InterruptedException {
		Click(si.getmoodHere().getDeleteadded_Entry());
		Thread.sleep(2000);
		Click(si.getmoodHere().getContinue_delete());
	    
	}







}
