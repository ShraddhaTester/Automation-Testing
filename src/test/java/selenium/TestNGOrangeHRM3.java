package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGOrangeHRM3 {
	
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
	
	@Test(priority = 4)
	public void add_user() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div/input")).sendKeys("Aabc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div[7]/input")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Employee Full Name')]//following::div[10]/input")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
	
	@Test(priority = 5)
	public void delete_added_user() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
		WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'Aabc')]/../preceding-sibling::div//span"));
		new Actions(driver).scrollToElement(checkbox).perform();
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Aabc')]//following::button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']//following::button[3]")).click();
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
