package AutomationPractice_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_ResultsPage_Elements {
	
	WebDriver driver;
	
	@FindBy(css="h1.page-heading>span.lighter") public WebElement searchKyWrd;
	
	
	public AP_ResultsPage_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
