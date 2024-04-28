package seleniumpracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/phpmyadmin/index.php?route=/");
		driver.findElement(By.id("input_username")).sendKeys("dbuser");
		driver.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		driver.findElement(By.id("input_go")).click();
		WebElement theme = driver.findElement(By.name("set_theme"));
		Select s = new Select(theme);
//		s.selectByIndex(1);
//		s.selectByVisibleText("Metro");
		s.selectByValue("original");
	}

}







