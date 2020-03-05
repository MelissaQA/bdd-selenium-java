package org.testingworld.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateDriverInstance {
	
	public WebDriver generateDriverInstance() throws Exception {
		
		WebDriver driver;
		ResourceBundle config = ResourceBundle.getBundle("config");
		
		if(config.getString("browser").toString().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(config.getString("browser").toString().equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(config.getString("browser").toString().equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./Driver/internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.get(config.getString("applicationURL").toString());
		return driver;
	}
	
	public void closeDriverInstance(WebDriver driver) {
		
		driver.quit();
		
	}
}
