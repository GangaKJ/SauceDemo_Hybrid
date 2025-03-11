package saucedemo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSwagLab_storelcators {
	
	WebDriver ldriver;
	// locators are stored in separate variables
	//create constructor
	public LoginSwagLab_storelcators(WebDriver rdriver)
	{
		this.ldriver=rdriver;
	}
	
	By swaguser =By.xpath("//input[@id='user-name']");
	By swagpassword =By.xpath("//input[@id='password']");
	By swag_loginclick=By.xpath("//input[@id='login-button']");
	By swag_pdtLabel= By.xpath("//span[@class='title']");
	 
	public void loginapp(String uname, String passw)
	{
		ldriver.findElement(swaguser).sendKeys(uname);	
		ldriver.findElement(swagpassword).sendKeys(passw);
		ldriver.findElement(swag_loginclick).click();
		Assert.assertTrue(ldriver.findElement(swag_pdtLabel).isDisplayed());	
	}
	
	

}
