package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
			// Step 1: Download and attach the Chrome driver to this test case
				WebDriverManager.chromedriver().setup();

				// Step 2 : Launch the Chrome Browse
				ChromeDriver driver = new ChromeDriver();

				// Step 3: Load the URL
				driver.get("https://acme-test.uipath.com/login");

				// Step 4 : Maximize the Browser
				driver.manage().window().maximize();
				
				//Step 5 : Enter email as "kumar.testleaf@gmail.com"
				
				driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
				
				//Step 6 :  Enter Password as "leaf@12"
				
				driver.findElement(By.name("password")).sendKeys("leaf@12");
				
				//Step 7 :  Click login button
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				//Step 8 : Get the title of the page and print
				
				String title = driver.getTitle();
				System.out.println(title);	
				
				//Step 9 : Click on Log Out
				
				driver.findElement(By.linkText("Log Out")).click();
				
				//Step 10 : Close the browser (use -driver.close())
				
				driver.close();			

	}

}
