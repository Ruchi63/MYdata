package dayJDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.xdevapi.Result;

import day5POMohm.OperationOHM_logoutpage;


public class DemoJDBC {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Connection con=DriverManager.getConnection("jdbc:mysql://148.72.215.41:3306/testingdb","testuser","testuser");
	//un==>dbuser pw==>Squ@d123	
	Connection con=DriverManager.getConnection("jdbc:mysql://172.16.100.23:3306/BasicDB","dbuser","Squ@d123");
	
	Statement st=con.createStatement();
	//SELECT * FROM OHM_314;
	//ResultSet res=st.executeQuery("select * from 309_ajay");
	ResultSet res=st.executeQuery("SELECT * FROM OHM_314");
	
	String un,pw;
	while(res.next()) 
	{
		un=res.getString(1);
		pw=res.getString(2);
		System.out.println(un+" "+pw);
		
		wd.findElement(By.name("username")).sendKeys(un);
		wd.findElement(By.name("password")).sendKeys(pw);
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		OperationOHM_logoutpage lg=new OperationOHM_logoutpage(wd);
		lg.logoutProcess();
	}
	
	}

}
