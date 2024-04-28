package helper;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class BaseProperty
{
	public WebDriver wd;
	public WebDriver initalizeBrowser(String browsername) throws Exception
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		if(browsername.equalsIgnoreCase("firefox"))
		{
			dc.setBrowserName("firefox");
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			dc.setBrowserName("chrome");
		}

		
		
		return wd;
	

}
	@BeforeTest
	public  void check()
	{
		System.setProperty("webdriver.chrome.driver","/home/luser/Desktop/seldriver/driver/chromedriver");
		 wd=new ChromeDriver();//interface
			
	}
	
}