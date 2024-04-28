package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPageFactory2 {
	public DemoPageFactory2(WebDriver wd) 
	{
		PageFactory.initElements(wd, this);
	}
	
	//Repository
	@FindBy(name="username")WebElement uname;
	@FindBy(name="password")WebElement pword;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement login;
	public void username(String un)
	{
		uname.sendKeys(un);
	}
	public void password(String pw)
	{
		pword.sendKeys(pw);
	}
	public void loginbtn()
	{
		login.click();
	}
	
}
