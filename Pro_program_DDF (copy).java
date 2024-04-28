package Day1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_program_DDF {

	public static void main(String[] args) throws IOException {
		// launch browser

		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver wd=new ChromeDriver();
		
		
		//open url
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//fis
		FileInputStream fis=new FileInputStream("/home/luser/Desktop/Untitled 2.xls");
		HSSFWorkbook wk=new HSSFWorkbook(fis);
		HSSFSheet sh=wk.getSheet("Sheet1");
		
		//use for loop to read data from each row(i=no.of row)
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			HSSFRow rw=sh.getRow(i);
			HSSFCell un=rw.getCell(0);
			HSSFCell pw=rw.getCell(1);
			HSSFCell res=rw.createCell(2);
			//find elements for login
			wd.findElement(By.name("username")).sendKeys(un.toString());
			wd.findElement(By.name("password")).sendKeys(pw.toString());
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			try
			{
				//logout process
				wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
				wd.findElement(By.linkText("Logout")).click();
				System.out.println("PASSED");
				res.setCellValue("PASSED");
			}
			catch(Exception e)
			{
				//for invalid
				System.out.println("FAILED");
				res.setCellValue("FAILED");
			}
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("/home/luser/Desktop/Untitled 2.xls");
		wk.write(fos);
		

	}

}
