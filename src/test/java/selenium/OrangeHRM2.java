package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']//following::div[4]")).sendKeys(Keys.DOWN, Keys.ENTER);
		driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::div/input")).sendKeys("Mohanadasan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::div/input")).sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Status')]//following::div[4]")).sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Username')]//following::div/input")).sendKeys("Shraddha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Password')]//following::div/input")).sendKeys("Ss12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Confirm Password')]//following::div/input")).sendKeys("Ss12345");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(5000);
		
		WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'Shraddha')]/../preceding-sibling::div//span"));
		new Actions(driver).scrollToElement(checkbox).perform();
		Thread.sleep(4000);
		checkbox.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Shraddha')]//following::button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']//following::button[3]")).click();
	}

}
