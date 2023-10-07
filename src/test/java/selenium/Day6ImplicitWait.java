package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://twitter.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
						
		//String eTitle = "IRCTC Next Generation eTicketing System";
				
		//String aTitle = driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		/*if(eTitle.equals(aTitle))
		{
			System.out.println("Test successful");
		}
		else
			System.out.println("Test unsuccessful");*/
		
		driver.quit();
	}

	}

