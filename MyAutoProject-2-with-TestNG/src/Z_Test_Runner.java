import java.util.Random;

public class Z_Test_Runner {

	public static void main(String[] args) {
		
		
		
		// Login Test started here 
		MCTSmokeTest mytest = new MCTSmokeTest();
		mytest.openBrowser();
		mytest.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest.loginTest();
		mytest.waitFor(2000);		
		mytest.validateProfileName("James williams");
		mytest.closeBrowser();
		
		
		
		
		// Registration Test 
		MCTSmokeTest mytest2 = new MCTSmokeTest();
		mytest2.openBrowser();
		mytest2.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest2.takeMetoSignUPPage();
		
        Random rand = new Random(); 
        int regNumber = rand.nextInt(1000); 
		mytest2.completeREgistraionWith("mrabc"+regNumber+"@gmail.com","mrabc"+regNumber,"mr","abc"+regNumber);
		mytest2.waitFor(2000);		
		mytest2.validateProfileName("mr abc"+regNumber);

		mytest2.closeBrowser();


		
		// Log Out Test 

		MCTSmokeTest mytest3 = new MCTSmokeTest();
		mytest3.openBrowser();
		mytest3.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest3.loginTest();
		mytest3.waitFor(2000);
		mytest3.logOut();
		mytest3.waitFor(2000);		
		mytest3.validateprofileNameNotExist();
		mytest3.closeBrowser();

		

	}

}
