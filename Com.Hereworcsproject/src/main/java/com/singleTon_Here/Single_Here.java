package com.singleTon_Here;

import com.Baseclasshere.Baseclass_here;
import com.Page_Object_Model_Here.Changing_password_page;
import com.Page_Object_Model_Here.Login_Page_here;
import com.Page_Object_Model_Here.MoodTracker_here;
import com.Page_Object_Model_Here.Notification_page_here;
import com.Page_Object_Model_Here.Paintracker_here;
import com.Page_Object_Model_Here.ProblemTracker_here;
import com.Page_Object_Model_Here.Sleeptrackerpage_here;


public class Single_Here extends Baseclass_here {
	
private Login_Page_here login_Page;
private Sleeptrackerpage_here sleep_tracker;
private Changing_password_page changing_password;
private Notification_page_here notification_page;
private MoodTracker_here mood_tracker;
private Paintracker_here pain_tracker;
private ProblemTracker_here problem_trcker;
	
	
	public Login_Page_here getLogin_Page() {
		login_Page=new Login_Page_here();
		return login_Page;
	}
	
	
	public Sleeptrackerpage_here getsleepHere() {
		sleep_tracker=new Sleeptrackerpage_here();
		return sleep_tracker;
	}
	
	public Changing_password_page getpasswordpage() {
		changing_password=new Changing_password_page();
		return changing_password;
		
	}
	
	public  Notification_page_here  getnotification() {
		notification_page=new Notification_page_here();
		return notification_page;

	}
	
	public  MoodTracker_here getmoodHere() {
		mood_tracker=new MoodTracker_here();
		return mood_tracker;

	}
	
	public  Paintracker_here getpainHere() {
		pain_tracker=new Paintracker_here();
		return pain_tracker;
		

	}
	
	public  ProblemTracker_here getproblemHere() {
		problem_trcker=new ProblemTracker_here();
		return problem_trcker;

	}
	
	

}
