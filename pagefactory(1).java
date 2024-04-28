package testng_pagefactory;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class pagefactory 
{
	public WebDriver wd;
  
  
  @BeforeTest
  public void beforeTest() {
	  //launching 
	  System.setProperty("webdriver.chrome.driver", "./chromedriver");
		 wd=new ChromeDriver();
		  wd.get("http://localhost/phpmyadmin/");
		
		
  }

  @AfterTest
  public void afterTest() {
	//  wd.quit();
  }

}
