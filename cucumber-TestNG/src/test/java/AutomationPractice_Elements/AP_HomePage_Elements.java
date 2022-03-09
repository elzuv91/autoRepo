package AutomationPractice_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_HomePage_Elements {
	
	WebDriver driver;
	
	@FindBy(css="#search_query_top") public WebElement searchBox;
	@FindBy(css=".button-search") public WebElement searchBtn;
	
	public AP_HomePage_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
