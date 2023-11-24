package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class Changing_password_page extends Baseclass_here {
	
	public Changing_password_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn home-dropdown dropdown-toggle white droparrow-white']")
	private WebElement clickname_icon;
	
	@FindBy(xpath="//a[contains(text(),'Account')]")
	private WebElement account_button;
	
	@FindBy(xpath="//a[contains(text(),'Security')]")
	private WebElement click_security;
	
	@FindBy(xpath="//input[@id='current_password']")
	private WebElement current_password;
	
	@FindBy(xpath="//input[@id='new_password']")
	private WebElement new_password;
	
	@FindBy(xpath="//input[@id='update_password']")
	private WebElement confirm_password;
	
	@FindBy(xpath="//button[@id='save_button']")
	private WebElement save_button;

	public WebElement getClickname_icon() {
		return clickname_icon;
	}

	public WebElement getAccount_button() {
		return account_button;
	}

	public WebElement getClick_security() {
		return click_security;
	}

	public WebElement getCurrent_password() {
		return current_password;
	}

	public WebElement getNew_password() {
		return new_password;
	}

	public WebElement getConfirm_password() {
		return confirm_password;
	}

	public WebElement getSave_button() {
		return save_button;
	}
	
	
	
	
	
	
	
	

}
