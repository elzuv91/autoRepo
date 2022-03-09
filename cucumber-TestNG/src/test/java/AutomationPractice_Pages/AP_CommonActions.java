package AutomationPractice_Pages;

import org.openqa.selenium.WebDriver;

import AutomationPractice_StepDefinitions.AP_Configurations;

public class AP_CommonActions {
	
	WebDriver driver;
	
	public AP_CommonActions(AP_Configurations APConfig) {
		this.driver=APConfig.getDriver();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
