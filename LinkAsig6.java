package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAsig6 {

	public static void main(String[] args) {
		// Step 1: Download and attach the Chrome driver to this test case
		
				WebDriverManager.chromedriver().setup();
				
				// Step 2 : Launch the Chrome Browse
				
				ChromeDriver driver=new ChromeDriver();
				
				
				// Step 3: Load the URL
				driver.get("http://leafground.com/pages/Link.html");
				
				// Step 4 : Maximize the Browser

				driver.manage().window().maximize();
				
				//Step 5 : Go to Home Page
				driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//a")).click();
				
				driver.navigate().back();
				
				//Step 6 : Find where am supposed to go without clicking me?

				String link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
						.getAttribute("href");
				
				System.out.println("Here is the link to navigate: " + link);
				
				//Step 7 : Verify am I broken?
				
				driver.findElement(By.linkText("Verify am I broken?")).click();
				
				String a = driver.getTitle();

				if (a.contains("404"))
					System.out.println("The link is broken");
				else
					System.out.println("The link is not broken");
				driver.navigate().back();
				
				//Step 8 : Go to Home Page (Interact with same link name)
				
				driver.findElement(By.linkText("Go to Home Page")).click();
				driver.navigate().back();
				
				//Step 9 : How many links are available in this page?
				
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Number of links:" + links.size());

	}



}
