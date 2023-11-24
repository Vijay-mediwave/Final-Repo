package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class Notification_page_here extends Baseclass_here {
	
	public Notification_page_here() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[@class='dropdown position-relative']")
	private WebElement notification_icon;
	
	@FindBy (xpath="//button[contains(text(),'GO TO THE NOTIFICATIONS PAGE')]")
	private WebElement notification_button;
	
	@FindBy (xpath="(//button[@class='mw-btn'])[2]")
	private WebElement editnotification_button;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[3]")
	private WebElement nothing_notification;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[2]")
	private WebElement selected_notification;
	
	
	@FindBy (xpath="(//span[@id='targetClick'])[1]")
	private WebElement Off_On_message;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[4]")
	private WebElement click_instantly;
	
	@FindBy(xpath="(//span[@class='radio-checkmark'])[6]")
	private WebElement instantly_everyhour;
	
	@FindBy(xpath="(//span[@class='radio-checkmark'])[7]")
	private WebElement instantly_everynintymins;
	
	public WebElement getInstantly_everyhour() {
		return instantly_everyhour;
	}

	public WebElement getInstantly_everynintymins() {
		return instantly_everynintymins;
	}

	@FindBy (xpath="(//span[@class='checkmark'])[1]")
	private WebElement email_prefered;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[8]")
	private WebElement turnon_message;
	
	@FindBy (xpath="//button[contains(text(),'SETUP MESSAGE FORWARDING')]")
	private WebElement setup_message;
	
	@FindBy (xpath="//input[@id='search_name']")
	private WebElement searchfield_enter;
	
	
	@FindBy (xpath="(//h2[@class='text-primary'])[2]")
	private WebElement clickit_kenny;
	
	@FindBy (xpath="//input[@id='form_date']")
	private WebElement start_date;
	
	@FindBy (xpath="(//span[@class='vc-day-content vc-focusable'])[2]")
	private WebElement click_eightcalaendar;
	
	@FindBy (xpath="//input[@id='to_date']")
	private WebElement end_date;
	
	
	@FindBy (xpath="(//span[@class='vc-day-content vc-focusable'])[9]")
	private WebElement clickfifteen_calendar;
	
	public WebElement getNotification_icon() {
		return notification_icon;
	}

	public WebElement getNotification_button() {
		return notification_button;
	}

	public WebElement getEditnotification_button() {
		return editnotification_button;
	}

	public WebElement getNothing_notification() {
		return nothing_notification;
	}

	public WebElement getSelected_notification() {
		return selected_notification;
	}

	public WebElement getOff_On_message() {
		return Off_On_message;
	}

	public WebElement getClick_instantly() {
		return click_instantly;
	}

	public WebElement getEmail_prefered() {
		return email_prefered;
	}

	public WebElement getTurnon_message() {
		return turnon_message;
	}

	public WebElement getSetup_message() {
		return setup_message;
	}

	public WebElement getSearchfield_enter() {
		return searchfield_enter;
	}

	public WebElement getClickit_kenny() {
		return clickit_kenny;
	}

	public WebElement getStart_date() {
		return start_date;
	}

	public WebElement getClick_eightcalaendar() {
		return click_eightcalaendar;
	}

	public WebElement getEnd_date() {
		return end_date;
	}

	public WebElement getClickfifteen_calendar() {
		return clickfifteen_calendar;
	}

	public WebElement getClick_finishsetup() {
		return click_finishsetup;
	}

	public WebElement getDisableread_receipt() {
		return disableread_receipt;
	}

	public WebElement getTurnOnread_receipt() {
		return turnOnread_receipt;
	}

	public WebElement getAppointments_button() {
		return appointments_button;
	}

	public WebElement getCirclerequest_button() {
		return Circlerequest_button;
	}

	public WebElement getSavePreferences() {
		return savePreferences;
	}

	@FindBy (xpath="//button[contains(text(),'FINISH SETUP')]")
	private WebElement click_finishsetup;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[11]")
	private WebElement disableread_receipt;
	
	@FindBy (xpath="(//span[@class='radio-checkmark'])[10]")
	private WebElement turnOnread_receipt;
	
	@FindBy (xpath="(//span[@id='targetClick'])[2]")
	private WebElement appointments_button;
	
	@FindBy (xpath="(//span[@id='targetClick'])[3]")
	private WebElement Circlerequest_button;
	
	@FindBy (xpath="//button[contains(text(),'SAVE PREFERENCES')]")
	private WebElement savePreferences;
	
	
	
	
	
	
	
	

	

}
