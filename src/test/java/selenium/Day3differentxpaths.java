package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3differentxpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@data-test='username' and @id='user-name']"))
		.sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]"))
		.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
		
	}

}
