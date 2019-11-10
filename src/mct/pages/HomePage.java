package mct.pages;

public class HomePage extends MasterPage{

	// All Locators Or XPath for this Page  
	String loginLink = "ID:dLabellogin";
	String usernameFIeld = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
	String signUpButton = "ID:jqSignup";
	String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
	String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";

	
	String myAccountLink = "Xpath:.//*[@id='drp_div']/ul/li/div/div[1]/a";

	
	
	
	
	
	// Getter & Setters -
	public String getProfileNameLabel() {
		return getElementText(profileNameLabel);
	}


	
	// What the Page Can Do Functions 
	public void gotoByUsing(String broowser) {
		openBrowser(broowser);
		gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
	}
	
	
	public void closeBrowser() {
		MasterPage CloseHomePage=new MasterPage();
		CloseHomePage.closeBrowser();
		
	}
	
	
	public void loginTest() {
		clickElement(loginLink);
		typeOnElement(usernameFIeld,"pnt2batch");
		typeOnElement(passwordField,"abc123");
		clickElement(loginButton);		
	}

	public void takeMetoSignUPPage() {
		clickElement(loginLink);
		clickElement(signUpButton);
	}

	public void takeMetoMyAccountPage() {
		clickElement(profileNameLabel);
		clickElement(myAccountLink);
	}
	
	
	
	
	public void logOut() {
		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}
	

}
