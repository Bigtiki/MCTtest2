import org.openqa.selenium.By;

public class Automation2 {

	public static void main(String[] args) {
		
		
		
		Automation.Login();
		
		
		try {
			Thread.sleep(1000); // Sleep for one thousand milisecond 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		Automation.mydriver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).click();
		Automation.mydriver.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[3]/a")).click();

		
		
		
		
		
		// Check The Log Out Process is complete 
		

	
	
		
		// Check James William is there or Not [ is james is there then its pass or itfailed ]

		
		String actualProfilename = Automation.mydriver.findElement(By.xpath("//*[@id=\\\"dLabellogin\\\"]/span")).getText();
		String expectedProfilename = "Login";
		
		
		
		
		if(actualProfilename.equalsIgnoreCase(expectedProfilename)) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");

		}


	}

}
