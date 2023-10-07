package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Day2xpathGyanshree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://gyanshree.in/school/student/studentlogin.aspx");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='TxtUserName']")).sendKeys("18191");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='TxtPassword']")).sendKeys("18191");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
