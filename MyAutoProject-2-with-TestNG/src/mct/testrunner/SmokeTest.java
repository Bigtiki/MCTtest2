package mct.testrunner;

import java.util.Random;

import mct.pages.HomePage;
import mct.pages.MasterPage;
import mct.pages.MyAccountPage;
import mct.pages.RegPage;

public class SmokeTest {

	public static void main(String[] args) {
		
		
		// ====== >>> Login Test 
		
		HomePage home = new HomePage(); 
		home.gotoByUsing("chrome");
		home.loginTest();
		
		// Test Should Do the Validation 
		String actualProfileName = home.getProfileNameLabel();
		
		if(actualProfileName.equalsIgnoreCase("MR PNT2")) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");
		}

		
		
		// ====== >>> Log Out Test 
		HomePage home2 = new HomePage(); 
		home2.gotoByUsing("chrome");
		home2.loginTest();
		home2.logOut();
		
		
		// Test Should Do the Validation 
		String actualProfileName2 = home.getProfileNameLabel();
		
		if(actualProfileName2.equalsIgnoreCase("NULL")) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");
		}

		
		// Test Sign UP 
		HomePage home3 = new HomePage();
		home3.gotoByUsing("chrome");
		home3.takeMetoSignUPPage();
		
		RegPage regPage = new RegPage();
        Random rand = new Random(); 
        int regNumber = rand.nextInt(1000);

		regPage.completeREgistraionWith("mrabc"+regNumber+"@gmail.com","mrabc"+regNumber,"mr","abc"+regNumber);
		
		// Test Should Do the Validation 
		String actualProfileName3 = home3.getProfileNameLabel();
		
		if(actualProfileName3.equalsIgnoreCase("mr abc"+regNumber)) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");
		}

		
		
		//  Test My Account Page 
		
		HomePage home4 = new HomePage();
		home4.gotoByUsing("chrome");
		home4.loginTest();
		home4.takeMetoMyAccountPage();
		
		// Test Should Do the Validation 
		MyAccountPage myaccount = new MyAccountPage();
		String actualMyAccount = myaccount.getMyAccountLabel();
		
		if(actualMyAccount.equalsIgnoreCase("My Account")) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");
		}

		
		
		

	}

}
