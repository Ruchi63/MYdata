package seleniumpracticals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/phpmyadmin/index.php?route=/");
		driver.findElement(By.id("input_username")).sendKeys("dbuser");
		driver.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		driver.findElement(By.id("input_go")).click();
		driver.findElement(By.linkText("SQL")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 5000).perform();
		
		driver.findElement(By.id("button_submit_query")).click();
        Alert alt	= driver.switchTo().alert();
        String msg = alt.getText();
        System.out.println(msg);
        alt.accept();
        
	
	}

}







