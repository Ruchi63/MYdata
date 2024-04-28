package DemoProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FirstpropertyFile {
  @Test
  public void fileproprty() throws Exception
  {
	  Properties prop=new Properties();
 prop.load(new FileInputStream("/home/luser/eclipse-workspace/Ruchi/DemoMaven/propertyFile/Demoproperty"));
 //Java util package we create object
  String data=prop.getProperty("url");
  System.out.println(data);
  //getProperty() method will used for fetch the file
  }
}
