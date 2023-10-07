package selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		driver.quit();
		
		try
		{
			FileUtils.copyFile(screenshot,new File ("C:\\SeleniumScreenshot\\picture.png"));
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
