package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;

public class Day6ExplicitWaitIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");;
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("irctc" +Keys.ENTER);
		WebElement firstResult=new WebDriverWait(driver, Duration.ofSeconds(1)).
				until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3[text()='IRCTC Next Generation eTicketing System']")));
		System.out.println(firstResult.getText());

	}

}
