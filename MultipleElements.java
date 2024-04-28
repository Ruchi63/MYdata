package seleniumpracticals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/phpmyadmin/index.php?route=/");
		driver.findElement(By.id("input_username")).sendKeys("dbuser");
		driver.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		driver.findElement(By.id("input_go")).click();
//        WebElement ele = driver.findElement(By.linkText("BasicDB"));
//        String dbname = ele.getText();
//        System.out.println(dbname);
//        
//        WebElement ele1 = driver.findElement(By.linkText("information_schema"));
//        String dbname1 = ele1.getText();
//        System.out.println(dbname1);
//        
//        WebElement ele2 = driver.findElement(By.linkText("performance_schema"));
//        String dbname2 = ele2.getText();
//        System.out.println(dbname2);
        
        List<WebElement> list = driver.findElements(By.className("hover_show_full"));
        String name = list.get(1).getText();
        System.out.println(name);
        
	}

}






