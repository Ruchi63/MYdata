package day4;

import java.time.Duration;

import org.testng.annotations.Test;

import helper.Baseclass;

public class ExecutePF extends Baseclass{
  @Test
  public void DemoPF() 
  {
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  DemoPageFactory2 d=new DemoPageFactory2(wd);
	  d.username("Admin");
	  d.password("admin123");
	  d.loginbtn();
  }
}
