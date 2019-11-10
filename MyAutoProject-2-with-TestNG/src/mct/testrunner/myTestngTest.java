package mct.testrunner;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.RegPage;

public class myTestngTest {
	
	
	HomePage home;
	
	
	@BeforeMethod
	public void rampUP() {
		
		System.out.println("Browser SHould Start Here .. Ramping UP ");
		home = new HomePage(); 
		home.gotoByUsing("chrome");
	}
	
	
	
	
	
	
  @Test
  public void login() {
	  
		home.loginTest();
		String actualProfileName = home.getProfileNameLabel();
		Assert.assertEquals(actualProfileName, "MR PNT2","Failed To FInd Proper Profile Name ");
  }
  
  
  @Test
  public void logOut() {
	 
		home.loginTest();
		home.logOut();
		String actualProfileName = home.getProfileNameLabel();
		Assert.assertEquals(actualProfileName, "XNULLX","Failed Login Doesn't Happend");
  }
  
  
  
  @Test
  public void signUP() {
	  	  
		home.takeMetoSignUPPage();
		RegPage regPage = new RegPage();
        Random rand = new Random(); 
        int regNumber = rand.nextInt(1000);
		regPage.completeREgistraionWith("mrabc"+regNumber+"@gmail.com","mrabc"+regNumber,"mr","abc"+regNumber);		
		String actualProfileName = home.getProfileNameLabel();
		Assert.assertEquals(actualProfileName, "mr abc"+regNumber,"Failed To FInd Proper Profile Name After Registration");

  }
  
  
  @Test
  public void myAccount() {
		home.loginTest();
		home.takeMetoMyAccountPage();		
		MyAccountPage myaccount = new MyAccountPage();
		String actualMyAccount = myaccount.getMyAccountLabel();		
		Assert.assertEquals(actualMyAccount,"My Account","Failed to go to my Account");

  }
  
  
  
  
  
  @AfterMethod
	public void rampDown() {
		// home.closeBrowser();
		System.out.println("Browser Should Close Here ");
	}
  
}
