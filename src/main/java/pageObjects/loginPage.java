package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By id = By.id("user_email");
	By Password = By.xpath("//input[@id='user_password']");
	By loginButton= By.xpath("//input[@name='commit']");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getId() {
		return driver.findElement(id);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getloginButton() {
		return driver.findElement(loginButton);
	}
	

}
