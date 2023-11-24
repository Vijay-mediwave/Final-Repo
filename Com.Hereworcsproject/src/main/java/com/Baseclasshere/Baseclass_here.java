package com.Baseclasshere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_here {
	
public static WebDriver driver;
	
	public static WebDriver openbrowser (String type) {
		
		if (type.equalsIgnoreCase("chrome"))  {
				
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
	
	else if(type.equalsIgnoreCase ("firefox"))   {
		
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	else if(type.equalsIgnoreCase ("msedge"))   {
		
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void getURL(String URL) {
		driver.get(URL);
	}
	public static void clear(WebElement element) {
		element.clear();
		
	}
	
	public static void Click(WebElement findelement)
	{
		findelement.click();
	}
	public static void inputValue(WebElement findelement,String Username) {
		findelement.sendKeys (Username);
	}
	
	public static void inputValue1(WebElement findelement,String PassWord) {
		findelement.sendKeys (PassWord);
	}


}
