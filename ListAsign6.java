package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAsign6 {

	public static void main(String[] args) {
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch the Chrome Browse
		
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		// Step 4 : Maximize the Browser
		
		driver.manage().window().maximize();
		
		//Step 5: Select training Program using Index
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select d1 = new Select(dropdown1);
		d1.selectByIndex(3);
		
		// Step 6 : Select Training Program using Text 
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select d2 = new Select(dropdown2);
		d2.selectByVisibleText("Selenium");
		
		//Step 7 : Select training Program using Value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select d3 = new Select(dropdown3);
		d3.selectByValue("4");
		
		//Step 8: Get the No of Drop Down Options
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select d4 = new Select(dropdown4);
		int n = d4.getOptions().size();
		System.out.println("No of dropdowns "+n);
		
		// Step 9 : You can also Use SendKeys to select
		
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("Appium");
		
		//Step 10 : Select your Program list
		
		WebElement dropdown6 = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		Select d6 = new Select(dropdown6);
		d6.selectByVisibleText("UFT/QTP");
		
		driver.close();

	}

}
