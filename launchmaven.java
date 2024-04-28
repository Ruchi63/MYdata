package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchmaven {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/home/luser/Desktop/seldriver/driver/chromedriver");
		WebDriver wd=new ChromeDriver();//interface
		wd.get("http://localhost/phpmyadmin/");
		wd.findElement(By.id("input_username")).sendKeys("dbuser");
      
		wd.findElement(By.name("pma_password")).sendKeys("Squ@d123");
		Thread.sleep(2000);
		wd.findElement(By.id("input_go")).click();
		//wd.findElement(By.className("hover_show_full")).click();
	//	wd.findElement(By.partialLinkText("information_sche")).click();
		Thread.sleep(2000);
		//wd.findElement(By.xpath("//*[@id=\"pma_navigation_tree_content\"]/ul/li[3]/a")).click();
	//wd.findElement(By.xpath("//*[@id=\"pma_navigation_tree_content\"]/ul/li[1]/a")).click();
	wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/ul/li[1]/a")).click();
	

	}

}
