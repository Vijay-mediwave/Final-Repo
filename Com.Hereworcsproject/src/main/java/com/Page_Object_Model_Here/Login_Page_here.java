package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class Login_Page_here extends Baseclass_here {
	
	public Login_Page_here()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath="//input[@id='login_email']")
	private WebElement email_field;
	
	
	@FindBy (xpath ="//input[@id='login_password']")
	private WebElement password_field;
	
	@FindBy (xpath="//button[contains(text(),'LOGIN')]")
	private WebElement login_button;
	
	@FindBy(xpath="//a[@id='cookes-close-btn']")
	private WebElement logincancel_symbol;
	
	@FindBy (xpath="//button[contains(text(),'VERIFY')]")
	private WebElement verifybutton_gmailcode;
	
	
	

	public WebElement getVerifybutton_gmailcode() {
		return verifybutton_gmailcode;
	}

	public WebElement getLogincancel_symbol() {
		return logincancel_symbol;
	}

	public WebElement getEmail_field() {
		return email_field;
	}

	public WebElement getPassword_field() {
		return password_field;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

}
