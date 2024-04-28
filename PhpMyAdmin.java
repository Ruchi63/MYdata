package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpMyAdmin {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Tools/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/phpmyadmin");
		driver.findElement(By.id("input_username")).sendKeys("dbuser");
		driver.findElement(By.id("input_password")).sendKeys("Squ@d123");
		driver.findElement(By.id("input_go")).click();
		String mainWin = driver.getWindowHandle();
		driver.findElement(By.linkText("Theme:")).click();
		Set<String> wins = driver.getWindowHandles();
		for(String s:wins) {
			if(!mainWin.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		String text = driver.findElement(By.xpath("//*[@id=\"page_content\"]/div[1]/h2")).getText();
		System.out.println(text);
	}
}
