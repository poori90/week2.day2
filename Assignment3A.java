package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3A {

	public static void main(String[] args) {
		
		// Step 1: Download and attach the Chrome driver to this test case
				WebDriverManager.chromedriver().setup();

				// Step 2 : Launch the Chrome Browse
				ChromeDriver driver = new ChromeDriver();

				// Step 3: Load the URL
				driver.get("http://leaftaps.com/opentaps/control/login");

				// Step 4 : Maximize the Browser
				driver.manage().window().maximize();
				
				// Step 5 :  Enter UserName and Password Using Id Locator
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Step 6 : Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
		
				//Step 7 : Click on CRM/SFA Link
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// Step 8 : Click on contacts Button
				driver.findElement(By.linkText("Contacts")).click();
				
				//Step 9 : Click on Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				
				// Step 10 : Enter FirstName Field Using id Locator
				driver.findElement(By.id("firstNameField")).sendKeys("Allu");
				
				
				// Step 11 : Enter LastName Field Using id Locator
				driver.findElement(By.id("lastNameField")).sendKeys("Arjun");
				
				
				//Step 12 :  Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Iconic");
				
				
				//Step 13 :  Enter LastName(Local) Field Using id Locator
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Star");
				
				//Step 14: Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("FilmIndustry");
				
				//Step 15 : Enter Description Field Using any Locator of your choice 
				driver.findElement(By.id("createContactForm_description")).sendKeys("FilmIndustry Famous Personlaity in Allu Family. Current Rocking Star for Youth and Young kids");
				
				
				//Step 16: Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id(("createContactForm_primaryEmail"))).sendKeys("alluarjun@gmail.com");
				
				
				//Step 17: Select State/Province as NewYork Using Visible Text 
				WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select select=new Select(state);
				select.selectByVisibleText("New York");
				
				//Step 18 :   Click on Create Contact
				
				driver.findElement(By.name("submitButton")).click();
				 
				//Step 19 : Click on edit button 
				driver.findElement(By.linkText("Edit")).click();
				
				//Step 20 : 	 Clear the Description Field using .clear
				
				driver.findElement(By.id("updateContactForm_description")).clear();
			
				//Step 21 : Fill ImportantNote Field with Any text
				
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is 1st program in Assignment 3");
				
				//Step 22 : Click on update button using Xpath locator
				
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//Step 23 : Get the Title of Resulting Page. 
				String title = driver.getTitle();
				System.out.println(title);				
				
	}

}
