package seleniumpracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStatus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.100.119:8080/jenkins/login?from=%2Fjenkins");
		
		driver.findElement(By.id("j_username")).sendKeys("admin"); //username field
		Thread.sleep(2000);
		driver.findElement(By.id("j_username")).clear();
		
		WebElement rememberMe = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/label"));
		rememberMe.click();
		Thread.sleep(2000);
//		boolean status= driver.findElement(By.xpath("//*[@id=\"remember_me\"]")).isSelected();
		boolean status = driver.findElement(By.id("remember_me")).isSelected();
		System.out.println(status);
	}

}
