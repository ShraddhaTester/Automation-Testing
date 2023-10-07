package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3TestNG {
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void open_url()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 3)
	public void search_user() throws InterruptedException
	{
driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Name')]//following::div/input")).sendKeys("aal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Name')]//following::div/input")).sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Id')]//following::div/input")).sendKeys("0038");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
	
}
