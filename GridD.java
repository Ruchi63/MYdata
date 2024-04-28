package DemoGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridD 
{
	WebDriver wd;
	
  @Test
  public void griddemo() throws Exception 
  {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setBrowserName("firefox");
	  dc.setPlatform(Platform.LINUX);
	  wd=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
	//  wd.get("http://localhost:4444");
	  wd.get("https://www.google.com/");
	  
	  
	  
  }
}
