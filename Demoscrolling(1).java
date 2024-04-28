package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.Baseclass;

public class Demoscrolling extends Baseclass {
  @Test(description="Scrolling")
  public void scroll() throws InterruptedException 
  {
	  wd.get("http://localhost/phpmyadmin/");
	  wd.findElement(By.id("input_username")).sendKeys("dbuser");
      
		wd.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		Thread.sleep(2000);
		wd.findElement(By.id("input_go")).click();
		
		wd.findElement(By.linkText("SQL")).click();
		Thread.sleep(2000);
		 
		JavascriptExecutor js=(JavascriptExecutor)wd;
		WebElement e=wd.findElement(By.id("button_submit_query"));
		js.executeScript("arguments[0].scrollIntoView",e);
	  //===============================================================
 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//top of the page
  //============================================================
 js.executeScript("window.scrollBy(0,3000)");//down
 Thread.sleep(2000);
 js.executeScript("window.scrollBy(0,-3000)");//up
 //=====================================================
 js.executeScript("window.scrollBy(3000,0)");//right
 Thread.sleep(2000);
 js.executeScript("window.scrollBy(-3000,0)");//left
 
 
 
 
  }
}
