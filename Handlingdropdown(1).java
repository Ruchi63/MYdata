package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Madhavi22/chromedriver");
		WebDriver wd=new ChromeDriver();
		
		wd.get("http://localhost/phpmyadmin/");
		
		wd.findElement(By.id("input_username")).sendKeys("dbuser");
		wd.findElement(By.id("input_password")).sendKeys("Squ@d123");
		wd.findElement(By.id("input_go")).click();
//	WebElement theme=new WebElement(wd.findElement(By.name("")))	
		
		wd.findElement(By.xpath("//*[@id=\"navipanellinks\"]/a[2]/img")).click();
	
		
		
	}

}
