package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoAnnotation {
  @Test(priority=1)
  public void f()
  {
	  System.out.println("test method 1");
  }
  //we dont give priority then by default alphabetical order will be followed
  @Test(priority=0)
  public void s()
  {
	  System.out.println("test method 2");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("before class");
  }
  

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("After test");
	  
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("After Suite");
  }

}
