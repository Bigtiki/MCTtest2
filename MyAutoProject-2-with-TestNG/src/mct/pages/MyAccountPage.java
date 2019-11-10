package mct.pages;

public class MyAccountPage extends MasterPage {

	
	
	// All Locators Or XPath for this Page 
	
	String myAccountLabel = "Xpath:.//*[@id='item_details']/section/div/h3";
	
	
	// Getter & Setters -

	public String getMyAccountLabel() {
		return getElementText(myAccountLabel);
	}

	
	
	
	// What the Page Can Do Functions 

	
	
}
