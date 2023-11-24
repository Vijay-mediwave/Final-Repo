package com.configurationhere_reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configurationhere_reader {
	
	public static Properties proper;
	public Configurationhere_reader() throws IOException {
		
		File f=new File("C:\\10 NOVember automation\\My code\\Com.Hereworcsproject\\src\\main\\java\\com\\configurationhere_properties\\configration_propertiesHer.properties");
		FileInputStream f1=new FileInputStream(f);
		 proper=new Properties();	
		  proper.load(f1);
		
	}
	
	
	 public String getURL() {
		 String property= proper.getProperty("URL");
		 return property;
		  	  
	  }
	 public String getusername() {
		 String property= proper.getProperty("UserName");
		 return property;
		  	  
	  }
	 public String getpassword() {
		 String property= proper.getProperty("Password");
		 return property;
		  	  
	  }
	 
	 public String getnewpassword() {
		String property= proper.getProperty("NewPassword");
		return property;
		 
	 }

	 public String getconfirmpassword() {
			String property= proper.getProperty("ConfirmPassword");
			return property;
			 
		 }
	 public String getsearchname() {
			String property= proper.getProperty("searchName");
			return property;
			 
		 }
	 public String getsearchNote() {
			String property= proper.getProperty("Notes");
			return property;
			 
		 }
	 public String getstypesofPain() {
			String property= proper.getProperty("Typesofpain");
			return property;
			 
		 }
	 public String getLoactionpain() {
			String property= proper.getProperty("Locationpain");
			return property;
			 
		 }

     public String getaddnotesProblem() {
		String property= proper.getProperty("Addnotes");
		return property;
		 
	 }

}
