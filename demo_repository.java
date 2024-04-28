package Demo_POM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class demo_repository {
	WebDriver driver;
	
	demo_repository(WebDriver wd)
	{
		driver=wd;
	}
//find elements
By username= By.name("username");
By password= By.name("password");
By loginbtn= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
By namee= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
By logout=By.linkText("Logout");
//creating method to perform operation on element
public void entername(String user)
{
	driver.findElement(username).sendKeys(user);
}
public void enterpassword(String pw)
{
	driver.findElement(password).sendKeys(pw);
}
public void clicklogin()
{
	driver.findElement(loginbtn).click();
}
public void clicknamee()
{
	driver.findElement(namee).click();
}
public void clicklogout()
{
	driver.findElement(logout).click();
}}

