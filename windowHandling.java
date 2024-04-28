package demo1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Madhavi22/chromedriver");
WebDriver wd=new ChromeDriver();
//wd.get("http://localhost:8080/jenkins/");
wd.get("http://localhost/phpmyadmin/");
	
// window handling

	wd.findElement(By.id("input_username")).sendKeys("dbuser");
	wd.findElement(By.id("input_password")).sendKeys("Squ@d123");
	wd.findElement(By.id("input_go")).click();
	
	
	String mainwin=wd.getWindowHandle();
	wd.findElement(By.linkText("Theme:")).click();
	
	Set<String>wins=wd.getWindowHandles();
	for(String s:wins) 
	{
		if(!mainwin.equals(s)) {
			
		
	
		wd.switchTo().window(s);
	
	}
	}
	String text=wd.findElement(By.xpath("//*[@id=\"page_content\"]/div[1]/h2")).getText();
	System.out.println(text);

}
}
