package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class Sleeptrackerpage_here extends Baseclass_here{
	public Sleeptrackerpage_here()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='footer-desktop-img position-relative']")
	private WebElement menu_button;
	
	@FindBy(xpath="//*[@id=\"popup-desktop\"]/div[3]/div[5]/a/li")
	private WebElement Trcakersin_menu;
	
	@FindBy(xpath="//a[contains(text(),' Sleep')]")
	private WebElement sleepin_Trcakerspage;
	
	public WebElement getMenu_button() {
		return menu_button;
	}

	public WebElement getTrcakersin_menu() {
		return Trcakersin_menu;
	}

	public WebElement getSleepin_Trcakerspage() {
		return sleepin_Trcakerspage;
	}

	public WebElement getAddsleep_information() {
		return addsleep_information;
	}

	public WebElement getClick_calendar() {
		return click_calendar;
	}

	public WebElement getSelectdate_calendar() {
		return selectdate_calendar;
	}

	public WebElement getClicktime_from() {
		return clicktime_from;
	}

	public WebElement getWakeup_count() {
		return wakeup_count;
	}

	public WebElement getClick_average() {
		return click_average;
	}

	public WebElement getRecordsleep_click() {
		return recordsleep_click;
	}
	public WebElement getTime_upto() {
		return time_upto;
	}


	@FindBy( xpath="//button[contains(text(),' ADD SLEEP INFORMATION')]")
	private WebElement addsleep_information;
	
	
	@FindBy(xpath="//input[@id='from_date']")
	private WebElement click_calendar;
	
	
	@FindBy(xpath="(//span[@class='vc-day-content vc-focusable'])[6]")    //in calenedar it select date 02-dec
	private WebElement selectdate_calendar;
	
	@FindBy(xpath="//select[@id='bed_time']")
	private WebElement clicktime_from;
	
	@FindBy(xpath="//select[@id='wakeup_count']")
	private WebElement wakeup_count;
	
	@FindBy(xpath="//label[contains(text(),'Average')]")
	private WebElement click_average;
	
	@FindBy(xpath="(//button[@name='button'])[9]")
	private WebElement recordsleep_click;
	
	@FindBy(xpath="//select[@id='wakeup_time']")
	private WebElement time_upto;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Month ')]")
	private WebElement clickmonth_foredit;
	
	@FindBy(xpath="//label[contains(text(),'Year')]")
	private WebElement clickyear_foredit;
	
	@FindBy(xpath="//button[contains(text(),'EDIT')]")
	private WebElement click_edit;
	
	@FindBy(xpath="//span[contains(text(),'DELETE')]")
	private WebElement click_delete;
	
	@FindBy(xpath="//button[@class='mw-btn m-2']")
	private WebElement update_button;
	
	@FindBy(xpath="(//button[contains(text(),'CONTINUE')])[2]")
	private WebElement continue_delete;
	

	public WebElement getContinue_delete() {
		return continue_delete;
	}

	public WebElement getUpdate_button() {
		return update_button;
	}

	public WebElement getClickmonth_foredit() {
		return clickmonth_foredit;
	}

	public WebElement getClickyear_foredit() {
		return clickyear_foredit;
	}

	public WebElement getClick_edit() {
		return click_edit;
	}

	public WebElement getClick_delete() {
		return click_delete;
	}

	
	
	
	
	
	



}
