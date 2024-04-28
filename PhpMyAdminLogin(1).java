package seleniumpracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpMyAdminLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/phpmyadmin/index.php?route=/");
		driver.findElement(By.id("input_username")).sendKeys("dbuser");
		driver.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		driver.findElement(By.id("input_go")).click();
//		driver.findElement(By.cssSelector("a.hover_show_full")).click();
		driver.findElement(By.linkText("BasicDB")).click();//BasicDB
		Thread.sleep(3000);
		driver.findElement(By.linkText("information_schema")).click();//information_schema
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/ul/li[2]/div[1]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("performance_schema")).click();
		

	}

}
