package com.Page_Object_Model_Here;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclasshere.Baseclass_here;

public class MoodTracker_here extends Baseclass_here{
	
	public MoodTracker_here() 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='footer-desktop-img position-relative']")
	private WebElement menu_button;
	
	@FindBy(xpath="//*[@id=\"popup-desktop\"]/div[3]/div[5]/a/li")
	private WebElement Trcakersin_menu;
	
	@FindBy (xpath="//a[contains(text(),' Mood')]")
	private WebElement Click_Mood;
	
	@FindBy( xpath="//button[contains(text(),' ADD MY MOOD INFORMATION')]")
	private WebElement addMood_information;
	
	@FindBy(xpath="//input[@id='from_date']")
	private WebElement click_calendar;
	
	@FindBy(xpath="(//span[@class='vc-day-content vc-focusable'])[8]")    //in calenedar it select date 04-dec
	private WebElement selectDate_calendar;
	
    @FindBy(xpath="(//div[@class='card card-gl-dashboard tracker mw-bg-white-card '])[2]")
    private WebElement selectFeeling_Happytoday;     //it click happy mood
    
    @FindBy(xpath="(//div[@class='card card-gl-dashboard tracker mw-bg-white-card '])[1]")
    private WebElement selectFeeling_VeryHappytoday;     //it click Veryhappy mood
    
    @FindBy(xpath="(//div[@class='card card-gl-dashboard tracker mw-bg-white-card '])[3]")
    private WebElement selectFeeling_Neutraltoday;    //it click Nutral mood
    
    @FindBy(xpath="(//label[@class='checkmark'])[3]")
    private WebElement previousmoodsad_Entry;   // it click poor
    
    @FindBy(xpath="(//label[@class='checkmark'])[2]")
    private WebElement previousmoodGreat_Entry;   // it click Great
    
    @FindBy(xpath="//textarea[@id='notes']")
    private WebElement Enter_Notes;
    
   @FindBy(xpath="//button[contains(text(),' RECORD MOOD')]")    
   private WebElement record_Mood;
   
   @FindBy(xpath="//label[contains(text(),'Month ')]")
	private WebElement clickmonth_foredit;
	
	@FindBy(xpath="//label[contains(text(),'Year')]")
	private WebElement clickyear_foredit;
	
	@FindBy(xpath="//button[contains(text(),'EDIT')]")
	private WebElement click_edit;
	
	@FindBy(xpath="//button[contains(text(),'UPDATE RECORD MOOD')]")
	private WebElement update_recordMood;
	
	
	@FindBy (xpath="//span[@class='mw-btn outline focusto d-inline-block']")
	private WebElement deleteadded_Entry;
	
	@FindBy (xpath="(//button[contains(text(),'CONTINUE')])[2]")
	private WebElement continue_delete;

	public WebElement getMenu_button() {
		return menu_button;
	}

	public WebElement getTrcakersin_menu() {
		return Trcakersin_menu;
	}

	public WebElement getClick_Mood() {
		return Click_Mood;
	}

	public WebElement getAddMood_information() {
		return addMood_information;
	}

	public WebElement getClick_calendar() {
		return click_calendar;
	}

	public WebElement getSelectDate_calendar() {
		return selectDate_calendar;
	}

	public WebElement getSelectFeeling_Happytoday() {
		return selectFeeling_Happytoday;
	}

	public WebElement getSelectFeeling_VeryHappytoday() {
		return selectFeeling_VeryHappytoday;
	}

	public WebElement getSelectFeeling_Neutraltoday() {
		return selectFeeling_Neutraltoday;
	}

	public WebElement getPreviousmoodsad_Entry() {
		return previousmoodsad_Entry;
	}

	public WebElement getPreviousmoodGreat_Entry() {
		return previousmoodGreat_Entry;
	}

	public WebElement getEnter_Notes() {
		return Enter_Notes;
	}

	public WebElement getRecord_Mood() {
		return record_Mood;
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

	public WebElement getUpdate_recordMood() {
		return update_recordMood;
	}

	public WebElement getDeleteadded_Entry() {
		return deleteadded_Entry;
	}

	public WebElement getContinue_delete() {
		return continue_delete;
	}
	
	
	
	
	
	
	
	

}
