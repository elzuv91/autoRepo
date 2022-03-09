package AutomationPractice_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AutomationPractice_Elements.AP_HomePage_Elements;
import AutomationPractice_StepDefinitions.AP_Configurations;

public class AP_HomePage_Actions {

	WebDriver driver;
	AP_HomePage_Elements APHmePgEle;
	
	
	public AP_HomePage_Actions(AP_Configurations APConfig) {
		this.driver=APConfig.getDriver();
		APHmePgEle= new AP_HomePage_Elements(driver);
	}
	
	public void searchItem(String searchItem) {
		APHmePgEle.searchBox.sendKeys(searchItem);
	}
	
	public void clickSearchButton() {
		APHmePgEle.searchBtn.click();
	}
	
	public void clickonLinkByText(String linkText) {
		
		driver.findElement(By.partialLinkText(linkText)).click();
		
	}
	
}
