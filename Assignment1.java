package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v88.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
			// Step 1: Download and attach the Chrome driver to this test case 
			WebDriverManager.chromedriver().setup();
			
			//Step 2 : Launch the Chrome Browse 
			ChromeDriver driver=new ChromeDriver();
			
			// Step 3: Load the URL 
			 driver.get("https://en-gb.facebook.com/");
			 
			 //Step 4 : Maximize the Browser 
			 driver.manage().window().maximize();
			 
			 //Step 5 : Add Implicit Wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			 // Step 6: 	 Click on Create New Account button
			 
			driver.findElement(By.linkText("Create New Account")).click(); 
					 
			//Step 7 : Enter the First Name
			 //driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Automate");
			// driver.findElement(By.xpath("//div[text()='First name']/following::input")).sendKeys("Automate");
			 driver.findElement(By.name("firstname")).sendKeys("Automate");
					 
			 //Step 8: Enter the last Name 
					 
			 driver.findElement(By.name("lastname")).sendKeys("Eng");
			 
			 // Step 9: Enter the mobile number
			 
			 driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9911223344"); 
			
			 
			 
			 // Step 10 :  Enter the password
			 
			 driver.findElement(By.id("password_step_input")).sendKeys("abcd@123");
			 
			 //Step 11 : Handle all the three drop downs
			 
			 driver.findElement(By.id("day")).sendKeys("15");
			 
			 driver.findElement(By.id("month")).sendKeys("May");
			 
			 driver.findElement(By.id("year")).sendKeys("1990");
			 
			// Step 12: Select the radio button "Female" 
			 
			 driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//input")).click();
			 
			 
			 //Step 13:   Click on the Submit Button 
			 
			 driver.findElement(By.name("websubmit")).click();	
			 
			 driver.close();
			 

	}

}
