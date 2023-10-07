package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Options;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Day4LoginandManageWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://gyanshree.in/school/student/studentlogin.aspx");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='TxtUserName']")).sendKeys("18191");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='TxtPassword']")).sendKeys("18191");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='ct100$lnkLogout']")).click();
		Thread.sleep(5000);
		
		/*Options size = driver.manage();
		
		size.window().minimize();
		Thread.sleep(2000);
		
		size.window().maximize();
		Thread.sleep(2000);
		
		size.window().fullscreen();
		Thread.sleep(2000);
		
		size.window().maximize();
		Thread.sleep(2000);
		
		size.window().setSize(new Dimension(500,500));
		Thread.sleep(2000);
		
		driver.close();*/
		
	}

}
