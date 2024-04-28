package demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Offline {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Madhavi22/chromedriver");
		WebDriver wd=new ChromeDriver();
		//wd.get("http://localhost:8080/jenkins/");
		wd.get("http://localhost/phpmyadmin/");
		
		// Alert Handling

			wd.findElement(By.id("input_username")).sendKeys("dbuser");
			wd.findElement(By.id("input_password")).sendKeys("Squ@d123");
			wd.findElement(By.id("input_go")).click();
			
			wd.findElement(By.linkText("SQL")).click();
			Thread.sleep(2000);
			Actions act=new Actions(wd);
			act.scrollByAmount(0, 5000).perform();
		wd.findElement(By.id("button_submit_query")).click();
		Alert alt=wd.switchTo().alert();
		String msg=alt.getText();
		System.out.println(msg);
		alt.accept();
	}

}
