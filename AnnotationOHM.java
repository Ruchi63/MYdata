package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationOHM 
{
	WebDriver wd;

	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		 wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@BeforeClass
	public void loginProcess() 
	{
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
	}
  @Test
  public void myinfo() 
  {
	 wd.findElement(By.className("oxd-main-menu-item")).click(); 
  }
  @AfterClass
  public void logoutProcess()
  {
	  //wd.findElement(By.partialLinkText("Welcome")).click();
	 wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
	 wd.findElement(By.linkText("Logout")).click();
  }
  @AfterSuite
  public void closebrowser() 
  {
	wd.close();  
  }
  
  
	
}
