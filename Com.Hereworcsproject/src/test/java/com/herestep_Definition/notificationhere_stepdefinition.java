package com.herestep_Definition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.Baseclasshere.Baseclass_here;
import com.configurationhere_reader.FileReaderher_Manager;
import com.singleTon_Here.Single_Here;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class notificationhere_stepdefinition extends Baseclass_here{
	
	public static Single_Here si=new Single_Here();
	
	@Given("clicking Notification icon  and clicking notification button")
	public void clicking_notification_icon_and_clicking_notification_button() throws InterruptedException {
		Click(si.getnotification().getNotification_icon());
		Thread.sleep(2000);
		Click(si.getnotification().getNotification_button());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
	    
	}

	

	@And("click edit notification button")
	public void click_edit_notification_button() throws InterruptedException {
		Click(si.getnotification().getEditnotification_button());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	    
	}

	@And("click Nothing in send me notification")
	public void click_nothing_in_send_me_notification() throws InterruptedException {
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(3000);
		Click(si.getnotification().getNothing_notification());
		Thread.sleep(4000);
	   
	}

	@And("Click Selected in send me notification")
	public void click_selected_in_send_me_notification() throws InterruptedException {
		Click(si.getnotification().getSelected_notification());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	    
	}

	@And("click OFF for Message")
	public void click_off_for_message() throws InterruptedException {
		Click(si.getnotification().getOff_On_message());
		Thread.sleep(3000);
	  
	}

	@And("click On for Message")
	public void click_on_for_message() throws InterruptedException {
		Click(si.getnotification().getOff_On_message());
		Thread.sleep(4000);
		    
	}

	@And("click Instantly for to receive notification")
	public void click_instantly_for_to_receive_notification() throws InterruptedException {
		Click(si.getnotification().getInstantly_everynintymins());
		Thread.sleep(2000);
		Click(si.getnotification().getInstantly_everyhour());
		Thread.sleep(2000);
		Click(si.getnotification().getClick_instantly());
		Thread.sleep(4000);
	    
	}

	@And("Click Email in prefer notified")
	public void click_email_in_prefer_notified() throws InterruptedException {
		Click(si.getnotification().getEmail_prefered());
		Thread.sleep(3000);
		
	   
	}

	@And("Click Turn On in message forwarding")
	public void click_turn_on_in_message_forwarding() throws InterruptedException {
		Click(si.getnotification().getTurnon_message());
		Thread.sleep(2000);
	    
	}

	@And("click setup message forwarding")
	public void click_setup_message_forwarding() throws InterruptedException {
		
		Click(si.getnotification().getSetup_message());
		Thread.sleep(2000);
	   
	}

	@And("in search circle field enter Kenny")
	public void in_search_circle_field_enter_kenny() throws IOException, InterruptedException {
		inputValue(si.getnotification().getSearchfield_enter(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getsearchname());
		Thread.sleep(4000);

		
	   
	}

	@And("click Kenny A")
	public void click_kenny_a() throws InterruptedException {
		Click(si.getnotification().getClickit_kenny());
		Thread.sleep(5000);

	  
	}

	@And("Enter Start date")
	public void enter_start_date() throws InterruptedException {
		Click(si.getnotification().getStart_date());
		Thread.sleep(2000);
		Click(si.getnotification().getClick_eightcalaendar());
		Thread.sleep(4000);
	 
	}

	@And("Enter End date")
	public void enter_end_date() throws InterruptedException {
		Click(si.getnotification().getEnd_date());
		Thread.sleep(2000);
		Click(si.getnotification().getClickfifteen_calendar());
		Thread.sleep(2000);
		Click(si.getnotification().getClick_finishsetup());
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		JavascriptExecutor jsa = (JavascriptExecutor) driver;
		jsa.executeScript("window.scrollBy(0,850)");
		Thread.sleep(3000);
	    

	  
	}

	@And("click Disable read receipent again click Turn on read receipent")
	public void click_disable_read_receipent_again_click_turn_on_read_receipent() throws InterruptedException {
		Click(si.getnotification().getDisableread_receipt());
		Thread.sleep(3000);
		Click(si.getnotification().getTurnOnread_receipt());
		Thread.sleep(3000);
	   
	}

	
	@And("Turn off and Turn On Appointments")
	public void turn_off_and_turn_on_appointments() throws InterruptedException {
		Click(si.getnotification().getAppointments_button());
		Thread.sleep(3000);
	    
	}

	@And("Turn off and Turn On Circle request")
	public void turn_off_and_turn_on_circle_request() throws InterruptedException {
		Click(si.getnotification().getCirclerequest_button());
		Thread.sleep(3000);	   
	}



	@Then("click Save preferences")
	public void click_save_preferences() throws InterruptedException {
		Click(si.getnotification().getSavePreferences());
		Thread.sleep(5000);
	    
	}



   
	
	
	

}
