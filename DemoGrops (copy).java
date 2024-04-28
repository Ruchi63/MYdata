package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGrops {
	WebDriver wd;
	
	 @Test(groups= {"orange"})
	  
	public void orangehrm() 
	  { 
		  System.setProperty("webdriver.chrome.driver", "./chromedriver");
			 wd=new ChromeDriver();
			 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
				wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				wd.findElement(By.name("username")).sendKeys("Admin");
				wd.findElement(By.name("password")).sendKeys("admin123");
				wd.findElement(By.xpath("//button[@type='submit']")).click();
	  }	
  @Test(groups= {"blazedemo"})
  public void blazeDemo() 
  { 
	  System.setProperty("webdriver.chrome.driver", "./chromedriver");
		 wd=new ChromeDriver();
		 wd.get("https://blazedemo.com/");
  }	 
	  
  
 
  }

