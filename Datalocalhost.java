package testng;

import org.testng.annotations.Test;

import dayPOM.Login_pagelocalhost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Datalocalhost {
	public WebDriver wd;
  @Test(dataProvider = "dp")
  public void f(String n, String s)
  {

	  System.setProperty("webdriver.chrome.driver", "./chromedriver");
	  wd=new ChromeDriver();
	
	  wd.get("http://localhost/phpmyadmin/");
	  Login_pagelocalhost lin=new Login_pagelocalhost(wd);
	  lin.loginprocess(n, s);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "dbuser", "Squ@d123" },
      new Object[] { "aas", "sdghas" },
    };
  }
}
