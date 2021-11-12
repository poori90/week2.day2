package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioAsign6 {

	public static void main(String[] args) {
		
		// Step 1: Download and attach the Chrome driver to this test case
				WebDriverManager.chromedriver().setup();
				
				// Step 2 : Launch the Chrome Browse
				
				ChromeDriver driver = new ChromeDriver();
				
				// Step 3: Load the URL
				driver.get("http://leafground.com/pages/radio.html");
				
				// Step 4 : Maximize the Browser
				
				driver.manage().window().maximize();
				
				//Step 5: Are you enjoying the classes?
				
				driver.findElement(By.id("yes")).click();
				
				//Step 6 :  Find default selected radio button
				
				WebElement radio = driver.findElement(By.xpath("//label[@for = 'Checked']/input"));
				if (radio.isSelected())

					System.out.println("Default Radio button is Selected");
				else
					radio.click();
				
				//Step 7 :  Select your age group (Only if choice wasn't selected)
				
				WebElement age = driver.findElement(By.xpath("//input[@class='myradio'][2]"));

				if (age.isSelected())
					System.out.println("Age is already Selected");
				else {
					driver.findElement(By.xpath("//input[@class='myradio'][2]")).click();
				}

	}

}
