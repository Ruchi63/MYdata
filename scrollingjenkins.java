package offline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper1.BaseClass1;

public class scrollingjenkins extends BaseClass1 {
  @Test
  public void scrolled() throws Exception {
	  
	  wd.get("http://localhost:8080/jenkins/");
	  wd.findElement(By.id("j_username")).sendKeys("admin");
	  wd.findElement(By.name("j_password")).sendKeys("admin");
	  wd.findElement(By.name("Submit")).click();
	  wd.findElement(By.partialLinkText("Manage Jenkins")).click();
	  JavascriptExecutor js=(JavascriptExecutor) wd;
		WebElement e=wd.findElement(By.className("jenkins-section__item__icon"));
		js.executeScript("window.scrollBy(0,5000)");// downward position
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,-2000)");// upward position
  }
}
