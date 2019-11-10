import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	
	
	public static WebDriver mydriver;

	
	
	
	public static void Login() {

		// Open Chrome from this machine 
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");	
		mydriver = new ChromeDriver();
		
		// GO to The Muticart Site using Chrome 
		mydriver.get("https://demo.iscripts.com/multicart/demo/index.php");
		
		// CLick On Login Link 
		mydriver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
		
		
		// Enter ID 
		
		mydriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");

		
		// Enter Password 
		
		mydriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");

		
		
		// CLick The login Button 
		mydriver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		// Open Chrome from this machine 
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");	
		WebDriver mydriver = new ChromeDriver();
		
		// GO to The Muticart Site using Chrome 
		mydriver.get("https://demo.iscripts.com/multicart/demo/index.php");
	
		
		// CLick On Login Link 
		mydriver.findElement(By.id("dLabellogin")).click();
		
		
		// Enter ID 
		
		mydriver.findElement(By.id("username")).sendKeys("user");


		//*[@id="txtFirstName"]		// Enter Password 
		
				
		
		mydriver.findElement(By.id("password")).sendKeys("pass");

		
		
		// CLick The login Button 
		mydriver.findElement(By.id("jqLogin")).click();

	
		try {
			Thread.sleep(1000); // Sleep for one thousand milisecond 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
		// Check James William is there or Not [ is james is there then its pass or itfailed ]

		
		String actualProfilename = mydriver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
		String expectedProfilename = "James williamsX";
		
		
		
		
		if(actualProfilename.equalsIgnoreCase(expectedProfilename)) {
			System.out.println("Login Test Passed ");
		} else {
			System.out.println("Login Test Failed... ");

		}

		
		mydriver.close();
		
		
		
	}

}
