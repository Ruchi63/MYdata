package Demo_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro_program_KDF {

	public static void main(String[] args) throws IOException {
		// KEYWORD driven framework
		
		//launching browser and open url
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver wd=new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		//object of demo_repository
		
		demo_repository d=new demo_repository(wd);
		//file input stream
		FileInputStream fis=new FileInputStream("/home/luser/Desktop/Untitled 3.xls");
		HSSFWorkbook wk=new HSSFWorkbook(fis);
		HSSFSheet sh=wk.getSheet("Sheet1");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			HSSFRow rw=sh.getRow(i);
			HSSFCell key=rw.getCell(1);
			System.out.println(key);
			
			switch(key.toString())
			{
			case"username":
				d.entername("Admin");
				break;
			case"password":
				d.enterpassword("admin123");
				break;
			case"loginbtn":
				d.clicklogin();
				break;
			case"namee":
				d.clicknamee();
				break;
			case"logout":
				d.clicklogout();
				break;
			
			
				
			}
			
			
		}
		
		
		

	}

}
