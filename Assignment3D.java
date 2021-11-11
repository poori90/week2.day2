package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3D {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();

		// Step 2 : Launch the Chrome Browse
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Step 4 : Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Step 5 :  Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 6 : Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Step 7 : Click on CRM/SFA Link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Step 8 : Click Leads link
		driver.findElement(By.linkText("Leads")).click();
				
		// Step 9 : Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Step 10 : Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anand");
		
		//Step 11 : Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		Thread.sleep(5000);
		// Step 12 : 	Click on first resulting lead	
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		
		//Step 13 :Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Step 14 : Click Edit 
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		
		//Step 15 :  Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Pvt Ltd1");
		
		//Step 16 :  Click Update
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		//Step 17 : Confirm the changed name appears
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(company);
		
		//Step  18 : Close the browser (Do not log out)
		driver.close();
				
	}

}
