package com.herestep_Definition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.Baseclasshere.Baseclass_here;
import com.configurationhere_reader.FileReaderher_Manager;
import com.singleTon_Here.Single_Here;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginhere_stepdefinition extends Baseclass_here {
	public static Single_Here si=new Single_Here();
	
	@Given("Launching browser")
	public void launching_browser() throws IOException, InterruptedException {
		openbrowser("chrome");
		String url = FileReaderher_Manager.getInstanceConfig().getconfigdata().getURL();
		getURL(url);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);


	}
	  


	@When("User Entering email")
	public void user_entering_email() throws IOException, InterruptedException {
		inputValue(si.getLogin_Page().getEmail_field(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getusername());
		Thread.sleep(2000);
	}
	@When("User enetring password")
	public void user_enetring_password() throws IOException, InterruptedException {
		inputValue(si.getLogin_Page().getPassword_field(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getpassword());
		Thread.sleep(2000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);

	   
	}
	@Then("User clicking button")
	public void user_clicking_button() throws InterruptedException {
		Click(si.getLogin_Page().getLogin_button());
		Thread.sleep(25000);
		Click(si.getLogin_Page().getVerifybutton_gmailcode());
		Thread.sleep(10000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(5000);
		

	    
	}
	@Given("Clicking menu button")
	public void clicking_menu_button() throws InterruptedException {
		
		
		Click(si.getsleepHere().getMenu_button());
		Thread.sleep(2000);
	}


	@When("cicking Trackers option in menu button")
	public void cicking_trackers_option_in_menu_button() throws InterruptedException {
		Click(si.getsleepHere().getTrcakersin_menu());
		Thread.sleep(2000);		
	    
	}
	@When("click sleep  in tracker overview page")
	public void click_sleep_in_tracker_overview_page() throws InterruptedException {
		Click(si.getsleepHere().getSleepin_Trcakerspage());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);

	  
	}
	@When("click Add Sleep Information")
	public void click_add_sleep_information() throws InterruptedException {
		Click(si.getsleepHere().getAddsleep_information());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);


	}
		
	   
	@When("select Date")
	public void select_date() throws InterruptedException {
		Click(si.getsleepHere().getClick_calendar());
		Thread.sleep(3000);
		Click(si.getsleepHere().getSelectdate_calendar());
		Thread.sleep(3000);
	
	}

	@When("Select Time From")
	public void select_time_from() throws InterruptedException {
		Click(si.getsleepHere().getClicktime_from());
		Thread.sleep(2000);
		Select timefrom=new Select(si.getsleepHere().getClicktime_from());
		Thread.sleep(2000);

		timefrom.selectByIndex(4);
		Thread.sleep(3000);
	  
	}
	@When("Select Time upto")
	public void select_time_upto() throws InterruptedException {
		Click(si.getsleepHere().getTime_upto());
		Thread.sleep(2000);
		Select timeupto=new Select(si.getsleepHere().getTime_upto());
		Thread.sleep(2000);

		timeupto.selectByIndex(6);
		Thread.sleep(3000);
	
	}

	  
	
	@When("select how many time wake up")
	public void select_how_many_time_wake_up() throws InterruptedException {
		Click(si.getsleepHere().getWakeup_count());
		Thread.sleep(2000);
		Select wakeup=new Select(si.getsleepHere().getWakeup_count());
		wakeup.selectByIndex(5);
		Thread.sleep(3000);
	    
	}
	@When("click Average")
	public void click_average() throws InterruptedException {
		Click(si.getsleepHere().getClick_average());
		Thread.sleep(3000);
	    
	}
	@Then("Click record sleep")
	public void click_record_sleep() throws InterruptedException {
		Click(si.getsleepHere().getRecordsleep_click());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(4000);
			
	    
	}

	@Given("Click month")
	public void click_month() throws InterruptedException {
		
		Click(si.getsleepHere().getClickmonth_foredit());
		Thread.sleep(3000);
	    
	}


	@When("click Year")
	public void click_year() throws InterruptedException {
		Click(si.getsleepHere().getClickyear_foredit());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(4000);
	    
	}
	@When("Click edit")
	public void click_edit() throws InterruptedException {
		Click(si.getsleepHere().getClick_edit());
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(3000);
		
	  
	}
	@When("change how many times did u wake up")
	public void change_how_many_times_did_u_wake_up() throws InterruptedException {
		Click(si.getsleepHere().getWakeup_count());
		Thread.sleep(2000);
		Select wakeupnow=new Select(si.getsleepHere().getWakeup_count());
		Thread.sleep(2000);
		wakeupnow.selectByIndex(9);
		Thread.sleep(3000);
	    
	   
	}
	@When("click update sleep")
	public void click_update_sleep() throws InterruptedException {
		Click(si.getsleepHere().getUpdate_button());
		Thread.sleep(4000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(3000);
	   
	}
	@Then("Delete the addedd entry")
	public void delete_the_addedd_entry() throws InterruptedException {
		Click(si.getsleepHere().getClick_delete());
		Thread.sleep(2000);
		Click(si.getsleepHere().getContinue_delete());
		driver.quit();
	 
	}









}
