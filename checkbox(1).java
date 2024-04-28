package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import helper.Baseclass;
import junit.framework.Assert;

public class checkbox extends Baseclass {
	
  @Test(description="Checking check box")
  public void checkmethod() throws Exception 
  {
	  wd.get("http://localhost/phpmyadmin/");
	  wd.findElement(By.id("input_username")).sendKeys("dbuser");
      
		wd.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		Thread.sleep(2000);
		wd.findElement(By.id("input_go")).click();
		//wd.findElement(By.className("hover_show_full")).click();
		wd.findElement(By.linkText("SQL")).click();
		Thread.sleep(2000);
		boolean sts=wd.findElement(By.id("parameterized")).isEnabled();
		System.out.println(sts);
		Assert.assertEquals(sts,false);
	  
  }
}
