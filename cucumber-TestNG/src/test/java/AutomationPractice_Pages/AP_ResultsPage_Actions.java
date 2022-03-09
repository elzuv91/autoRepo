package AutomationPractice_Pages;

import org.openqa.selenium.WebDriver;

import AutomationPractice_Elements.AP_ResultsPage_Elements;
import AutomationPractice_StepDefinitions.AP_Configurations;

public class AP_ResultsPage_Actions {
	
	WebDriver driver;
	AP_ResultsPage_Elements APRsltEle;
	
	public AP_ResultsPage_Actions (AP_Configurations APConfig) {
		this.driver=APConfig.getDriver();
		APRsltEle = new AP_ResultsPage_Elements(driver);
	}
	
	public String getSearchKeyword() {
		
		String searchKyWd = APRsltEle.searchKyWrd.getText().trim().toLowerCase();
		String searchKyWdValue = searchKyWd.replace("\"","");
		return searchKyWdValue;
		
	}
	
	

}
