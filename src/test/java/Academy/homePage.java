package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingePage;
import pageObjects.loginPage;
import resources.base;

public class homePage extends base{
	@BeforeTest
	public void initializer() throws InterruptedException, IOException {
		driver= openBrowser();
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username1, String PassWord1) throws InterruptedException, IOException {
		
		driver.get(prop.getProperty("url"));
	
		landingePage l = new landingePage(driver);
		l.grtLogin().click();
		
		loginPage log = new loginPage(driver);
		log.getId().sendKeys(username1);
		log.getPassword().sendKeys(PassWord1);
		log.getloginButton().click();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[2][2];
		data[0][0]="restricteduser@qw.com";
		data[0][1]="456788";
		
		data[1][0]="nahidbabu36@gmail.com";
		data[1][1]="nahid1243";
		
		return data;
		
	}
	@AfterTest
	public void finisher() {
		driver.close();
	}
	
	

}
