package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(3000);

	}

}
