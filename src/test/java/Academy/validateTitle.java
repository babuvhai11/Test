package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingePage;
import resources.base;

public class validateTitle extends base{
	@BeforeTest
	public void initializer() throws InterruptedException, IOException {
		driver= openBrowser();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws InterruptedException, IOException {
		
		landingePage l = new landingePage(driver);
		Assert.assertEquals(l.gettitle().getText(), "FEATURED COURSES");
		
	}
	//@AfterTest
	public void finisher() {
		driver.close();
	}
	
}
