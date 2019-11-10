import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCTSmokeTest {

	// Global Main Driver 
	public static WebDriver driver;


	
	// Base Functions 
	
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver");
		driver = new ChromeDriver();

	}

	public void gotoURL(String url) {
		driver.get(url);
	}

	
	
	// Test Functions 
	
	public void takeMetoSignUPPage() {
		// 
		String signUpButton = "ID:jqSignup";
		String loginLink = "ID:dLabellogin";
		
		
		clickElement(loginLink);
		clickElement(signUpButton);


	}
	
	public void loginTest() {

		// All Locators Variables for login Only 
		String loginLink = "ID:dLabellogin";
		String usernameFIeld = "ID:username";
		String passwordField = "ID:password";
		String loginButton = "ID:jqLogin";


		clickElement(loginLink);
		typeOnElement(usernameFIeld,"user");
		typeOnElement(passwordField,"pass");
		clickElement(loginButton);		

	}


	public void completeREgistraionWith(String email, String uname, String fname, String lname ) {
		
		// Locators For Registration 
		String emailField = "ID:txtEmail";
		String userNameField = "ID:txtUserName";
		String passwordField = "ID:txtPassword";
		String cnfPassword = "ID:txtCnfPassword";	
		String firstNameField = "ID:txtFirstName";
		String lastNameField = "ID:txtLastName";
		String addressField = "Xpath://input[@placeholder='Address *']";
		String checknewsBox = "Name:check_news";
		String btnRegister = "ID:btnRegister";
		
		
		typeOnElement(emailField, email); 
		typeOnElement(userNameField, uname);
		
		typeOnElement(passwordField, "Abc123");
		typeOnElement(cnfPassword, "Abc123");

		typeOnElement(firstNameField, fname);
		typeOnElement(lastNameField, lname);
		typeOnElement(addressField, "123 Fifth Ave");
		
		clickElement(checknewsBox);
		clickElement(btnRegister);

		


		
	}

	

	public void logOut() {
		
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[3]/a";

		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}


	// ======= Utility Funbctions 

	public void clickElement(String locatores) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
		} else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();
		}
		
	}

	public void typeOnElement(String locatores, String valueTotype) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);
		}  else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).sendKeys(valueTotype);
		}

	}

	
	public String getElementText(String locatores) {
		if(locatores.contains("ID")) {
			return driver.findElement(By.id(locatores.split(":")[1])).getText();
		}  else if(locatores.contains("Xpath")) {
			return driver.findElement(By.xpath(locatores.split(":")[1])).getText();
		} else if(locatores.contains("Name")) {
			return driver.findElement(By.name(locatores.split(":")[1])).getText();
		}
		
		return "";

	}
	

	public boolean elementNotExist(String locatores) {
		
		try {
			if(locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
			}  else if(locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();
			} else if(locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();
			}	
		} catch(Exception e) {
			return false;
		}
		
		return false;
	}
	
	
	
	
	
	public void closeBrowser() {
		driver.close();
	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls); // Sleep for one thousand milisecond 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	// ===== Validtion Functions 

	public void validateProfileName(String expectedValue) {

		// Locators for Profile Name 
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		
		
		String actualProfilename = getElementText(profileNameLabel);
		String expectedProfilename = expectedValue;
		if(actualProfilename.equalsIgnoreCase(expectedProfilename)) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");

		}


	}

	public void validateprofileNameNotExist() {
		
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
		
		if(elementNotExist(profileNameLabel)==false) {
			System.out.println("Log Out Happened Test Passed ");
		} else {
			
			System.out.println("Log Out Not Happened Test Faled ");
		}
		
	}
	

}
