package offline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import helper1.BaseClass1;

public class scrolling extends BaseClass1 {
  @Test
  public void scrolling() throws Exception
  {
	  wd.get("https://www.selenium.dev/downloads/");
	  JavascriptExecutor js=(JavascriptExecutor) wd;
	  wd.findElement(By.linkText("Chrome"));
	  js.executeScript("window.scrollBy(0,5000)");// downward position
	  Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-2000)");// upward position
  }
}
