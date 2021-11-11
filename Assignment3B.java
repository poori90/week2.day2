package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3B {

	public static void main(String[] args) throws InterruptedException {
		
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();

		// Step 2 : Launch the Chrome Browse
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 4 : Maximize the Browser
		driver.manage().window().maximize();
		
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
		
		//Step 10 : Click on Phone
		
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		
		//Step 11 : Enter phone number
		
		driver.findElement(By.name("phoneNumber")).sendKeys("123");
		
		// Step 12 : Click find leads button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);	
		
		//Step 13 : Capture lead ID of First Resulting lead
		
		String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		System.out.println(leadid);
		
		//Step 14 : Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Thread.sleep(5000);
		
		//Step 15: Click Delete 
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])/a[last()]")).click();
		
		
		//Step 16: Click Find Leads
		
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		
		//Step 17: Enter captured lead ID
		
		driver.findElement(By.name("id")).sendKeys(leadid);
		
		//Step 18: Click find leads button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Step 19 : Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement
				(By.className("x-paging-info")).getText();
		System.out.println(text);
		if(text.equals("No records to display"))
			{
			System.out.println("Record Mathced ");
			
			}
		else
			System.out.println("Record Not Matched");
			
		//driver.findElement(By.xpath("//div[text()='No records to display']"));
		
		
		//Step 20 : Close the browser (Do not log out)
		driver.close();	
		
		
	}

}
