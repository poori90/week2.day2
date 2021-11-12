package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAsign6 {

	public static void main(String[] args) {

		// Step 1: Download and attach the Chrome driver to this test case
				WebDriverManager.chromedriver().setup();
				
				// Step 2 : Launch the Chrome Browse
				
				ChromeDriver driver = new ChromeDriver();
				
				// Step 3: Load the URL
				driver.get("http://leafground.com/pages/checkbox.html");
				
				// Step 4 : Maximize the Browser
				
				driver.manage().window().maximize();
				
				//Step 5 : Added Implicit wait 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				// Step 6 : Select the languages that you know? 
						
				driver.findElement(By.xpath("//div[text()='Java']/input")).click();
				driver.findElement(By.xpath("//div[text()='C']/input")).click();
				
				//Step 7 : Confirm Selenium is checked
				
				driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
				
				//Step 8 :DeSelect only checked
				
				if (driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
					driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
				
				// Step 9 : Select all below checkboxes
				
				driver.findElement(By.xpath("//div[contains(text(),'Option 1')]/input")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Option 2')]/input")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Option 3')]/input")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Option 4')]/input")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Option 5')]/input")).click();
				
				// Step 10 : Closing the browser 
				
				driver.close();	
				System.out.println("Chrome Browser closed successfully");
	}

}
