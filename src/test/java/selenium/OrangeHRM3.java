package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;

public class OrangeHRM3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Name')]//following::div/input")).sendKeys("aal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Name')]//following::div/input")).sendKeys(Keys.DOWN, Keys.ENTER);
		
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Id')]//following::div/input")).sendKeys("0038");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div/input")).sendKeys("Aabc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div[7]/input")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div[10]/input")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'Aabc')]/../preceding-sibling::div//span"));
		new Actions(driver).scrollToElement(checkbox).perform();
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Aabc')]//following::button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']//following::button[3]")).click();
		

	
	}
		

	}


