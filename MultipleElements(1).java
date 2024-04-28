package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Madhavi22/chromedriver");
		WebDriver wd=new ChromeDriver();
		//wd.get("http://localhost:8080/jenkins/");
		wd.get("http://localhost/phpmyadmin/");
			
		// window handling

			wd.findElement(By.id("input_username")).sendKeys("dbuser");
			wd.findElement(By.id("input_password")).sendKeys("Squ@d123");
			wd.findElement(By.id("input_go")).click();
			
			
		/*	WebElement ele1=wd.findElement(By.linkText("BasicDB"));
			 String dbname1 = ele1.getText();
        System.out.println(dbname1);
        
        
        WebElement ele2=wd.findElement(By.linkText("information_schema"));
       String dbname2=ele2.getText();
      System.out.println(dbname2);
			
        WebElement ele3=wd.findElement(By.linkText("performance_schema"));
        String dbname3=ele3.getText();
        System.out.println(dbname3);
*/
			Thread.sleep(2000);
			List<WebElement>allelements=wd.findElements(By.className("hover_show_full"));
			
			String name=allelements.get(1).getText();
			System.out.println(name);
			
	}

}
