package hybridTest;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo_pom.LoginSwagLab_storelcators;

public class SauceLogin_child extends BaseClass {

	@Test
	public void Login() {
		
		/* String url="https://www.saucedemo.com/";
		 String user="standard_user";
		 String pwd="secret_sauce";*/
		driver.get(base_url);
		LoginSwagLab_storelcators sl= new LoginSwagLab_storelcators(driver);
		sl.loginapp(user, pwd);
		
		/* WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		 WebElement password=  driver.findElement(By.xpath("//input[@id='password']"));
		 WebElement btn_click= driver.findElement(By.xpath("//input[@id='login-button']"));
		
		// Actions
		 username.sendKeys(user);
		 password.sendKeys(pwd);
		 btn_click.click();
		  
		/* //After successful login ensure the webpage is navigating to Products page. Get the label of the page
		 WebElement pdt_label=  driver.findElement(By.xpath("//span[@class='title']"));
		 Assert.assertTrue(pdt_label.isDisplayed()); */
		 
	}

}
