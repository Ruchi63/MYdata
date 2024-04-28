package offline;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper1.BaseClass1;
import junit.framework.Assert;

public class jenkinscheckbox extends BaseClass1 {
  @Test(description="jenkins checkbox")
  public void checkbox()
  {
	  wd.get("http://localhost:8080/jenkins/");
	  wd.findElement(By.id("j_username")).sendKeys("admin");
	  wd.findElement(By.name("j_password")).sendKeys("admin");
	  boolean sts= wd.findElement(By.id("remember_me")).isSelected();
		Assert.assertEquals(sts, false);//comparing result with assert class
	 
	 

  }
}
