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

public class passwordchange_stepdefinition extends Baseclass_here {
	public static Single_Here si=new Single_Here();
	
	@Given("click name icon")
	public void click_name_icon() throws InterruptedException {
		Click(si.getpasswordpage().getClickname_icon());
		Thread.sleep(2000);
	   
	}

	@When("Clicking Account button")
	public void clicking_account_button() throws InterruptedException {
		Click(si.getpasswordpage().getAccount_button());
		Thread.sleep(2000);

	  
	}
	@When("click security in account module")
	public void click_security_in_account_module() throws InterruptedException {
		Click(si.getpasswordpage().getClick_security());
		Thread.sleep(2000);
		Click(si.getLogin_Page().getLogincancel_symbol());
		Thread.sleep(2000);


	   
	}
	@And("Enter current password")
	public void enter_current_password() throws IOException, InterruptedException {
		inputValue(si.getpasswordpage().getCurrent_password(),FileReaderher_Manager.getInstanceConfig().getconfigdata().getpassword());
		Thread.sleep(2000);
	  
	}
	@And("enter New password and confirm password")
	public void enter_new_password_and_confirm_password() throws InterruptedException, IOException {
		inputValue1(si.getpasswordpage().getNew_password(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getnewpassword());
		Thread.sleep(2000);
		inputValue1(si.getpasswordpage().getConfirm_password(), FileReaderher_Manager.getInstanceConfig().getconfigdata().getconfirmpassword());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

	    
	}
	@Then("click save button")
	public void click_save_button() {
		
		Click(si.getpasswordpage().getSave_button());
	 
	}




}
