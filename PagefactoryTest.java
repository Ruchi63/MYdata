package testng_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PagefactoryTest extends pagefactory {
	
  @Test
  public void Demopg() {
	  
	  Repositorypage RT=new Repositorypage(wd);
	RT.loginprocess("dbuser", "Squ@d123");
	 
  }
}
