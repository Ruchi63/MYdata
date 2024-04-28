package testng_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Repositorypage  {

	 //pom with page factory
	 
	Repositorypage(WebDriver wd)
	{
		
		 PageFactory.initElements(wd,this);
		 
	 }
	 // identify web elements
	 @FindBy(id="input_username") WebElement username;
	 @FindBy(id="input_password") WebElement password;
	 @FindBy(id="input_go") WebElement go;
	 //creats methods
	
	 public void enterusername(String use) {
		 username.clear();
		 username.sendKeys(use);
	 }
	 public void enterpassword(String pwd) {
		 password.clear();
		 password.sendKeys(pwd);
	 }
	 public void clickonlogin() {
		 go.click();
	 }
	 public void loginprocess(String use,String pwd)
	 {
		 enterusername(use);
		 enterpassword(pwd);
		 clickonlogin();
		 
	 }
	}

