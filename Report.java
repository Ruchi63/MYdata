package DemoExtent;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	ExtentSparkReporter ext;
	ExtentTest t;
	ExtentReports ex;
	WebDriver wd;
	
	@BeforeTest
	public void loadpage() 
	{ 
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Ruchi/chromedriver");
	   wd=new ChromeDriver();
	}
	 
  @Test
  public void loginReprt()
  {
	  ex=new ExtentReports();
	  ext=new ExtentSparkReporter(new File("phplogin.html"));
	  ex.attachReporter(ext);
	  t=ex.createTest("phplogin");
	  
	  wd.get("http://localhost/phpmyadmin/index.php?route=/");
	t.info("Now first loading php page");
	
	String title="phpmyadmin";
	t.info("Second-check title");
	if(wd.getTitle().equalsIgnoreCase(title))
	{
		t.log(Status.PASS, "it is passed");
	}
	else
	{
		t.log(Status.FAIL, "it is failed");
	}
  }	  
	@AfterTest
	public void unload() 
	{
		ex.flush();
		wd.close();
		
	}
	  
	  
	  
  


	
}

