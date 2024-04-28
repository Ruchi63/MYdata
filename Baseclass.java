package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	public WebDriver wd;
	@BeforeTest
	public  void check()
	{
		System.setProperty("webdriver.chrome.driver","/home/luser/Desktop/seldriver/driver/chromedriver");
		 wd=new ChromeDriver();//interface
			
	}
	@AfterTest()
	public void closebrowser()
	{
	 // wd.close();	
	}

}
