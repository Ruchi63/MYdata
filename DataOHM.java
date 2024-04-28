package TestNG;

import org.testng.annotations.Test;

import day6POM.OperationOHM_loginpage;
import day6POM.OperationOHM_logoutpage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataOHM 
{
	WebDriver wd;
	
	@BeforeTest
	public void openbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		 wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
  @Test(dataProvider = "dp")
  public void f(String un, String pw)
 {
	  OperationOHM_loginpage lp=new OperationOHM_loginpage(wd);
		OperationOHM_logoutpage lg=new OperationOHM_logoutpage(wd);  
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lp.loginProcess(un, pw);
		try 
		{   
			lg.logoutProcess();
			System.out.println("valid");
		}
		catch (Exception e)
		{
			System.out.println("invalid");
		}
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "afg", "saf" },
    };
  }
  @AfterTest
  public void clsbrowser()
  {
	  //wd.close();
  }
}
