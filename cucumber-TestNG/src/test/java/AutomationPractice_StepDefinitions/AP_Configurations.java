package AutomationPractice_StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AP_Configurations {
	
	WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
		
	}

}
