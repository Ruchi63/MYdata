package offline;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import helper1.BaseClass1;

public class jenkinsscreenshot extends BaseClass1 {
  @Test
  public void screenshot() throws Exception
  {
	 // wd=new ChromeDriver();
		wd.get("http://localhost:8080/jenkins/login?from=%2Fjenkins%2F");
		tksscrsht();
  }
  public void tksscrsht() throws Exception 
  {
	  TakesScreenshot ts=(TakesScreenshot)wd;
	  //FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./scrsht"));
	  FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./scrsht2"+tm()+".png"));
  }
  public String tm() 
  {
	  return new SimpleDateFormat("yyyy-mm-dd-HH-MM-SS").format(new Date());
  }
}
