package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Options;

public class Day5loginNaviSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//li[@id='menu-item-20']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a)[8]")).click(); //a[text()='Test Login Page']
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
				
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			Options size = driver.manage();
			
			size.window().maximize();
			Thread.sleep(2000);
			
			size.window().minimize();
			Thread.sleep(2000);
			
			size.window().setSize(new Dimension(500,500));
			Thread.sleep(2000);
			
			driver.quit();

	}

}
