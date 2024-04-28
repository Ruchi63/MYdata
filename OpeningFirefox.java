package seleniumpracticals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/luser/Desktop/software/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.quit();

	}

}
