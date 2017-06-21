package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import businessLib.BusinessLib;

public class LoginPage extends BusinessLib
{
	
	/*
	 
	 @Author: Test Engineer 1
	 
	 */
	//here we are following a static method concept to main object properties
	public static void staticmethod()
	{
		System.out.println("sample static method");
	}
	// TEST
	
	//user name object property
	public static WebElement get_UserName_txtbox()
	{
		WebElement un=driver.findElement(By.id("uid"));
		return un;
	}
	
	//Password text box
	public static WebElement get_password_txtbox()
	{
		WebElement pwd=driver.findElement(By.name("passw"));
		return pwd;
	}
	
	//Login Page
	public static WebElement get_Login_btn()
	{
		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		return login;
	}
	
	
	
	
	
	
	
	
	
}
