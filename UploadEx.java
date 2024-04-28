package day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.Baseclass;

public class UploadEx extends Baseclass{
  @Test
  public void demoupload()
  {
	  wd.get("https://www.foundit.in/seeker/registration");
	  wd.findElement(By.xpath("//*[@id='file-upload']")).sendKeys("/home/luser/Desktop/Ruchi/NOTES/TestNG_Installation.pdf");
  System.out.println("File uploaded");
  ////*[@id="file-upload"]
  }
}
