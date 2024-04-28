package Demo_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintestpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver wd=new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
		// create the object of repository
		
		demo_repository d=new demo_repository(wd);
	
		d.entername("Admin");
		d.enterpassword("admin123");
		d.clicklogin();
		d.clicknamee();
		d.clicklogout();
		
		
		
		
		
		
		
		
	}

}
