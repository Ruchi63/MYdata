package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert {
	WebDriver wd;
	//Assertion==> it is to verify that expected result
	// and actual result are matching
	
  @Test
  public void googleasert() 
  {
	  System.setProperty("webdriver.chrome.driver", "./chromedriver");
		 wd=new ChromeDriver();
         wd.get("https://www.google.com/");
         
         String ExpectedTitle="Google";
         /*ExpectedTitle--> if there matching result then will get as pass
          * -->if there is not matching result then it will get as fail
          */

   //  String nm="rs"; 
         String ActualTitle=wd.getTitle();
         
         Assert.assertEquals( ExpectedTitle,ActualTitle);
         
         System.out.println("Actaul title of webpage==> "+ActualTitle);
         
  }
}





