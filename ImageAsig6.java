package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageAsig6 {

	public static void main(String[] args) {
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch the Chrome Browse
		
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL
		
		driver.get("http://leafground.com/pages/Image.html");
		// Step 4 : Maximize the Browser
		
		driver.manage().window().maximize();
		
		//Step 5 : Click on this image to go home page
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.navigate().back();
		
		//Step 6: 	Am I Broken Image?
		
		WebElement a = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		String w = a.getAttribute("naturalWidth");
		if (w=="0");
		
		System.out.println("The image is broken");
		
		//Step 7 : Click me using Keyboard or Mouse
		
		WebElement a1 = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		
		Actions  obj= new Actions(driver);
        obj.doubleClick(a1).build().perform();
        driver.close();
                		

	}

}
