package DayProp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FirstPropertyex {
	@Test
	public void first() throws Exception {

	  Properties prop = new Properties();
	  prop.load(new FileInputStream("/home/luser/Desktop/Ruchi328/DemoMaven/DemoProperty/PropertyFile"));
	  
	  String data = prop.getProperty("url");
	  System.out.println(data);

}
}
