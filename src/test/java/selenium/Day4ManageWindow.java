package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.Dimension;

public class Day4ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Options size = driver.manage();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		size.window().maximize();
		Thread.sleep(2000);
		
		size.window().minimize();
		Thread.sleep(2000);
		
		size.window().maximize();
		Thread.sleep(2000);
		
		size.window().setSize(new Dimension(1000,1000));
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
