import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {

	public static void main(String[] args) {
		
		
		// Open Chrome 
		
		WebDriver mydriver = new ChromeDriver();
		
		
		// Go to Applition 
		
		mydriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		
		
		// CLick Login
		mydriver.findElement(By.id("dLabellogin")).click();
		

		// Click SignUp 
		
		mydriver.findElement(By.id("jqSignup")).click();

		
		
		// Enter Email 
		mydriver.findElement(By.id("txtEmail")).sendKeys("MRJames@gmail.com");

		
		// Enter User Name 
		mydriver.findElement(By.id("txtUserName")).sendKeys("MRJames");

		
		// Enter Password 
		mydriver.findElement(By.id("txtPassword")).sendKeys("ABC123");

		
		// Enter Cpassword 
		mydriver.findElement(By.id("txtCnfPassword")).sendKeys("ABC123");

		
		
		// Enter Fanme 
		
		mydriver.findElement(By.id("txtFirstName")).sendKeys("MR");

		
		
		// Enter Last Name 
		mydriver.findElement(By.id("txtLastName")).sendKeys("James");

		
		
		// Enter Address 
		mydriver.findElement(By.xpath("//input[@placeholder='Address *']")).sendKeys("123 People n Tech");

		
		
		
		// Click Check Box 
		
		mydriver.findElement(By.name("check_news")).click();

		
		
		
		// Click Create Account Button 
		mydriver.findElement(By.id("btnRegister")).click();

		
		
		
		
		

	}

}
