package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demolocalhost {
	public WebDriver wd;
@BeforeTest
public void chromebrowser() 
{
	System.setProperty("webdriver.chrome.driver", "./chromedriver");
	  wd=new ChromeDriver();
	
}
	
	
	
  @Test
  public void localhost() 
  {
	  wd.get("http://localhost/phpmyadmin/");
		wd.findElement(By.id("input_username")).sendKeys("dbuser");
		wd.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		wd.findElement(By.id("input_go")).click();
		wd.findElement(By.linkText("information_schema")).click();

	  
  }
  
  
  
  @AfterTest
  public void closebrowser() 
  {
	  //wd.quit();
  }
}
