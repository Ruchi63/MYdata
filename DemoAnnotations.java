package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoAnnotations {
  @Test
  public void f() 
  {
	  System.out.println("testmethod is showing");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before mtehod is showing");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("after method is showing");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("before class is showing");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("after class is showing");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("before test is showing");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("after test is showing");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite is showing");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("after suite is showing");
  }

}
