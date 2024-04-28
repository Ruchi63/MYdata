package DayProp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import helper.BaseProperty;

public class DemoPrope extends BaseProperty{
  @Test(description="propety file")
  public void bingtest() throws Exception 
  {
	  Properties prop = new Properties();
	  prop.load(new FileInputStream("/home/luser/Desktop/Ruchi328/DemoMaven/DemoProperty/PropertyFile"));
	  
	  String data = prop.getProperty("url");
	 // System.out.println(data);

	  wd.get(prop.getProperty("url"));
	  wd.findElement(By.xpath(prop.getProperty("SearchField"))).sendKeys("squad");
	  
	  Thread.sleep(2000);
	  wd.findElement(By.xpath(prop.getProperty("SearchField"))).sendKeys(Keys.ENTER);
  }
}
