package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s)
  {
	  System.out.println(n+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "e" },
    };
  }
}
/*Data provider present in 2d array(two dimensional array)
 * 
 * this is return type of object with2d array is mandatory
 * first array will represent set of data
 * second array will represent array contains parameter value
 * 
 */ 
