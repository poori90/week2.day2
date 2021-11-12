package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAsig6 {

	public static void main(String[] args) {
		
		// Step 1: Download and attach the Chrome driver to this test case
		
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch the Chrome Browse
		
		ChromeDriver driver=new ChromeDriver();
		
		
		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Edit.html");
		
		// Step 4 : Maximize the Browser

		driver.manage().window().maximize();
		
		//Step 5 : Enter the Email ID in the Email field 
		
		driver.findElement(By.id("email")).sendKeys("AutomateEng@gmail.com");
		
		// Step 6 : Append a text and press keyboard tab
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Automate");
		
		// Step 7 : Get default text entered
		
		String text= driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(text);
		
		// Step 8 : Clear the text
		driver.findElement(By.name("username")).clear();
		
		//Step 9 : Confirm that edit field is disabled
		
		boolean a = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		Assert.assertEquals(a, false);
		
		// Step 10 :  Close the browser 
		driver.close();
		

	}

}
