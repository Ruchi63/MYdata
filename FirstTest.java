package seleniumpracticals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.close();
		driver.quit();
	}

}
