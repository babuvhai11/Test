package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	protected WebDriver driver;
	public Properties prop;
	
	public WebDriver openBrowser() throws InterruptedException, IOException {
		  
		  prop = new Properties();
		  FileInputStream fil = new FileInputStream("C:\\Users\\nahid\\eclipse-workspace\\FrameWork\\"
		  		+ "src\\main\\java\\resources\\data.properties");
		  prop.load(fil);
		  String browserName = prop.getProperty("browser");
		  Thread.sleep(2000);
		  if (browserName.equals("Chrome")) {
			  driver = new ChromeDriver();
		  }
		  else if (browserName.equals("Firefox")) {
			  driver = new FirefoxDriver();
		  }
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		  //driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		  driver.manage().window().maximize();
		  return driver;
	}
	
    public void exitBrowser() throws Exception {
		Thread.sleep(4000);
    	driver.quit();
    }
}
