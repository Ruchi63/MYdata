package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
	public WebDriver wd;
  @Test
  public void demoassertion() 
  {
	  System.setProperty("webdriver.chrome.driver", "./chromedriver");
	  wd=new ChromeDriver();
	
	  wd.get("http://localhost/phpmyadmin/");
	  
	  String ExpectedTitle="phpMyAdmin";
	  String ActualTitle=wd.getTitle();
	  Assert.assertEquals(ExpectedTitle, ActualTitle);
	  System.out.println(wd.getTitle());
	  
  }
}
