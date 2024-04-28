package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.Baseclass;

public class WindowHandling extends Baseclass
{
  @Test
  public void handlingwindow() throws Exception 
  {
	  wd.get("http://frontaccounting.squadinfotech.in/");
	  wd.findElement(By.name("user_name_entry_field")).sendKeys("fauser25");
	  wd.findElement(By.name("password")).sendKeys("fauser25");
	  Select s=new Select(wd.findElement(By.name("company_login_name")));
	  s.selectByVisibleText("Testing_Batch_THANE");
	  wd.findElement(By.name("SubmitUser")).click();
	  wd.findElement(By.partialLinkText("Sales Quotation Entry")).click();
	
	  String PID=wd.getWindowHandle();//String getting id
	  System.out.println("Parent window ID==>"+PID);// got the ID of Parent ID
	 
	  wd.findElement(By.linkText("2,417,625,030.25")).click();
	  Set<String>alwin=wd.getWindowHandles();
	  //Its not have duplicate value
	  //it will fetch the ID of current window
	  for(String W:alwin)
	  {
		  wd.switchTo().window(W);
		  System.out.println(wd.getTitle());
		  if(!(W.equals(PID))) 
		  {
			Select ss=new Select(wd.findElement(By.id("customer_id")));
			ss.selectByVisibleText("Donald Easter");
			wd.manage().window().maximize();
			Thread.sleep(2000);
			wd.close();
			  
		  }
		  
	  }
	  wd.switchTo().window(PID);
	  
  }
}
