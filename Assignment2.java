package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();

		// Step 2 : Launch the Chrome Browse
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		// Step 4 : Maximize the Browser
		driver.manage().window().maximize();

		// Step 5 : Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 6: Fill in all the text boxes

		driver.findElement(By.name("UserFirstName")).sendKeys("Test");

		driver.findElement(By.name("UserLastName")).sendKeys("Leaf");

		driver.findElement(By.name("UserEmail")).sendKeys("testleaf@gmail.com");

		driver.findElement(By.name("CompanyName")).sendKeys("Test Leaf Pvt Lmt");

		driver.findElement(By.name("UserPhone")).sendKeys("9090909090");

		// Step 7: Handle all the dropdowns

		WebElement title = driver.findElement(By.name("UserTitle"));
		// Convert the WebElement as Select class (for Webdriver to understand)
		Select select = new Select(title);
		select.selectByVisibleText("IT Manager");

		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		// Convert the WebElement as Select class (for Webdriver to understand)
		Select select1 = new Select(emp);
		select1.selectByIndex(3);

		WebElement cntry = driver.findElement(By.name("CompanyCountry"));
		// Convert the WebElement as Select class (for Webdriver to understand)
		Select select2 = new Select(cntry);
		select2.selectByVisibleText("India");
		
		/*WebElement state = driver.findElement(By.name("CompanyState"));
		// Convert the WebElement as Select class (for Webdriver to understand)
		Select select3 = new Select(state);
		select3.selectByVisibleText("India"); */
		
		
		// Step 8: Click the check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		//driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
		
		
		// Step 9: Close the browser
		driver.close();

	}

}
