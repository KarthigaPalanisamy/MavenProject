package SampleMaven;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	public class partiallink {
		WebDriver driver;
	@Test
	public void main(){
		

		// Launch the Online Store WebSite
		driver.get("http://toolsqa.com/Automation-practice-form/");

		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");

		// Convert element in to a string 
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);

		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
		
		}
	@BeforeMethod
	public void before(){
		System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
		// Create a new instance of the FireFox driver
		driver = new FirefoxDriver();
		
	}
	@AfterMethod
	public void after(){
		//closing the browser
		driver.quit();
		
	}
	
	}


