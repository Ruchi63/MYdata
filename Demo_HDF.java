package Demo_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_HDF {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver wd=new ChromeDriver();
		
		
		//open url
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//object of login page
		demo_repository d=new demo_repository(wd);
		//fis
		FileInputStream fis=new FileInputStream("/home/luser/Desktop/Untitled 3.xls");
		HSSFWorkbook wk=new HSSFWorkbook(fis);
		HSSFSheet ksh=wk.getSheet("Sheet1");
		HSSFSheet dsh=wk.getSheet("Sheet2");
		
		for(int i=1;i<=dsh.getLastRowNum();i++)
		{
	        HSSFRow drw=dsh.getRow(i);
			HSSFCell un=drw.getCell(0);
			HSSFCell pw=drw.getCell(1);
			HSSFCell res=drw.createCell(2);
			System.out.println("username-- " + un);
			System.out.println("password-- "+ pw);
	    
		try {
			
		
		for(int j=1;j<=ksh.getLastRowNum();j++)
		{
			HSSFRow krw=ksh.getRow(j);
			HSSFCell key=krw.getCell(1);
			System.out.println("Keywords--" +key);
		
			switch(key.toString())
			{
			case"username":
				d.entername(un.toString());
				break;
			case"password":
				d.enterpassword(pw.toString());
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
		}}
		res.setCellValue("Valid");
		
		System.out.println("valid");
		}
		catch(Exception e)
		{
			res.setCellValue("Invalid");
			System.out.println("Invalid");
		}}
		fis.close();
		FileOutputStream fos=new FileOutputStream("/home/luser/Desktop/Untitled 3.xls");
		wk.write(fos);
	   
}}

		
		
		

	


