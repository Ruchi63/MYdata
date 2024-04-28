package dayPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteData {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Madhavi22/chromedriver");
		WebDriver wd=new ChromeDriver();
		//wd.get("http://localhost:8080/jenkins/");
		wd.get("http://localhost/phpmyadmin/");

		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis=new FileInputStream("/home/luser/Desktop/Madhavi22/DataExcel1.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh=wk.getSheet("ReadDDFlocalhost");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow rw=sh.getRow(i);
			XSSFCell un=rw.getCell(0);
			XSSFCell pw=rw.getCell(1);
			XSSFCell res=rw.createCell(2);
			Thread.sleep(10);
			System.out.println("The Username is:--->>>" +un+"The password is--->"+pw);
			Thread.sleep(10);
			wd.findElement(By.id("input_username")).clear();
			wd.findElement(By.id("input_username")).sendKeys(un.toString());
			Thread.sleep(10);
			wd.findElement(By.id("input_password")).sendKeys(pw.toString());
			wd.findElement(By.id("input_go")).click();
			
		try 
		{
			wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/a[2]/img")).click();
		    System.out.println("valid");
			res.setCellValue("pass");
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("invalid");
			res.setCellValue("fail");
		}
		
		FileOutputStream fos=new FileOutputStream("/home/luser/Desktop/Madhavi22/DataExcel1.xlsx");
		wk.write(fos);	
				
			
			
		}	
			
			
		
			
			
		
		

	}

}
