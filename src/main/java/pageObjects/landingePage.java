package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingePage {
   
	public WebDriver driver;
	
	By login = By.linkText("Login");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigationTab = By.xpath("//a[contains(text(),'Contact')]");
	
	public landingePage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement grtLogin() 
	{
		return driver.findElement(login);
	}

	public WebElement gettitle() 
	{
		return driver.findElement(title);
	}
	
	public WebElement getnavigationTab() 
	{
		return driver.findElement(navigationTab);
	}

}
