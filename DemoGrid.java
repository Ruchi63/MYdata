package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoGrid 
{
	WebDriver wd;
  @Test
  public void gridDemo() throws Exception
  {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setBrowserName("firefox");
	  dc.setPlatform(Platform.LINUX);
	  wd=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
	  
  }
  //java -jar selenium-server-4.3.0.jar node --detect-drivers true --publish-events tcp://172.16.100.21:4442 --subscribe-events tcp://172.16.100.21:4443
}
