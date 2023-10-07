package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.get("https://github.com/");
		Thread.sleep(4000);
		
		driver.get("https://www.jenkins.io/");
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
