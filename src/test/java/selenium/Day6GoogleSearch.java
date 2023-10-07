package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day6GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.get("https://www.google.com/");
		
		WebElement inputfield = driver.findElement(By.xpath("//*[@name='q']"));
		inputfield.sendKeys("nextsoftwaretesting.com");
		Thread.sleep(2000);
		
		inputfield.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
				
		driver.close();*/
		
		 driver.manage().window().maximize();
	        driver.get("https://google.com");
	        driver.findElement(By.name("q")).sendKeys("mother");
	        Thread.sleep(2000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		  /*WebDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      //URL launch
	      driver.get("https://www.google.com/");
	      //identify element
	      WebElement r = driver.findElement(By.name("q"));
	      r.sendKeys("Cypress");
	      // press ENTER
	      r.sendKeys(Keys.RETURN);*/

	}

}
