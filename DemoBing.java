package DemoProperty;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import helper.Baseclass;

public class DemoBing extends Baseclass {
	
  @Test
  public void bingProperty()
  {
	 
	 wd.get(prop.getProperty("url"));
	 wd.findElement(By.xpath(prop.getProperty("searchField"))).sendKeys("squad");

	 wd.findElement(By.xpath(prop.getProperty("searchField"))).sendKeys(Keys.ENTER);
  }
}
