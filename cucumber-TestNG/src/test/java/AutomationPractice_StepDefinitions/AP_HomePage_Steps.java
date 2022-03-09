package AutomationPractice_StepDefinitions;

import static org.junit.Assert.fail;

import AutomationPractice_Pages.AP_CommonActions;
import AutomationPractice_Pages.AP_HomePage_Actions;
import AutomationPractice_Pages.AP_ResultsPage_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AP_HomePage_Steps {
 
 AP_CommonActions APCmmnAct;
 AP_HomePage_Actions APHmePgAct;
 AP_ResultsPage_Actions APRsltAct;
 
 public AP_HomePage_Steps( AP_CommonActions APCmmnAct, AP_HomePage_Actions APHmePgAct, AP_ResultsPage_Actions APRsltAct) {
	 this.APCmmnAct=APCmmnAct;
	 this.APHmePgAct=APHmePgAct;
	 this.APRsltAct=APRsltAct;
 }
	
	@Given("I am Automation Practice Homepage")
	public void i_am_automation_practice_homepage() {
	
		APCmmnAct.navigateToUrl("http://automationpractice.com/index.php");
		
	}
	
	@When("I search dress")
	public void i_search_dress() throws Exception {
		
		APHmePgAct.searchItem("top");
		APHmePgAct.clickSearchButton();
		Thread.sleep(1000);
	}

	@Then("I navigate to search results page")
	public void i_navigate_to_search_results_page() {
		
		System.out.println(APCmmnAct.getPageTitle());
		
		System.out.println(APRsltAct.getSearchKeyword());
		
	}
		@When("I search for {string}")
		public void i_search_for(String searchItem) throws Exception {
	
			APHmePgAct.searchItem(searchItem);
			APHmePgAct.clickSearchButton();
			Thread.sleep(1000);
		}

		@Then("I validate search keyword {string}")
		public void i_validate_search_keyword(String searchKyWrd) {
			
			String actualKyWrd = APRsltAct.getSearchKeyword();
			
			if(!(actualKyWrd.equals(searchKyWrd))) {
			fail("search keyword is not displayed "+ searchKyWrd); 
			}
		}
		
		@When("I click on link{string}")
		public void i_click_on_link(String linkCat) {
		   
			APHmePgAct.clickonLinkByText(linkCat);
		}

		@Then("I validate the page navigates to {string} and {string}")
		public void i_validate_the_page_navigates_to_and(String expURL, String expTitle) {
		    
			  String actualURL = APCmmnAct.getPageURL(); 
			  String actualTitle =APCmmnAct.getPageTitle();
			  
			  System.out.println(actualTitle);
			  
			  
			  if(!(actualURL.equals(actualURL))) {
			  fail("User is not navigated to expected url " + expURL); }
			  if(!(actualTitle.contains(expTitle))) {
			  fail("User is not navigated to expected title " + expTitle); }
			 
			
		}


}
