package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class Paintracker_here extends Baseclass_here{
	
	public Paintracker_here() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[contains(text(),' Pain')]")
	private WebElement clickpain_tracker;
	
	@FindBy (xpath="//input[@id='pain_date']")
	private WebElement click_calendar;
	
	@FindBy (xpath="(//a[@class='ui-state-default'])[6]")          //select date 2 dec
	private WebElement select_Date;
	
	@FindBy (xpath="//select[@id='rate']")          
	private WebElement selectpain_severity;
	
	@FindBy (xpath="//textarea[@id='pain_feel']")          
	private WebElement selecttypesof_pain;
	
	@FindBy (xpath="//textarea[@id='pain_place']")          
	private WebElement select_location;
	
	@FindBy (xpath="//button[@id='save_button']")          
	private WebElement click_submit;
	
	@FindBy (xpath="//button[@class='chart-previous-link day-prev-btn click-btn-access']")          
	private WebElement select_day;
	
	@FindBy (xpath="//a[contains(text(),'View graph')]")          
	private WebElement clickView_graph;

	public WebElement getClickpain_tracker() {
		return clickpain_tracker;
	}

	public WebElement getClick_calendar() {
		return click_calendar;
	}

	public WebElement getSelect_Date() {
		return select_Date;
	}

	public WebElement getSelectpain_severity() {
		return selectpain_severity;
	}

	public WebElement getSelecttypesof_pain() {
		return selecttypesof_pain;
	}

	public WebElement getSelect_location() {
		return select_location;
	}

	public WebElement getClick_submit() {
		return click_submit;
	}

	public WebElement getSelect_day() {
		return select_day;
	}

	public WebElement getClickView_graph() {
		return clickView_graph;
	}
	
	
	
	
	
	
	
	
	
	

}
