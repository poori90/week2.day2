package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAsig6 {

	public static void main(String[] args) {
	// Step 1: Download and attach the Chrome driver to this test case
		
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch the Chrome Browse
		
		ChromeDriver driver=new ChromeDriver();
		
		
		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Button.html");
		
		// Step 4 : Maximize the Browser

		driver.manage().window().maximize();
		
		//Step 5 : Click button to travel home page
		
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		System.out.println("clicked successfully");
		
		//Step 6: Find position of button (x,y)
		driver.navigate().back();
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//Step 7 : Find button color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Step 8 :  Find the height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		
		driver.close();

	}

}
