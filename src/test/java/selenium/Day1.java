package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.get("https://gyanshree.in/school/student/studentlogin.aspx");
		Thread.sleep(2000);
		
		driver.get("https://www.nonograms.org/");
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		
		driver.close();

	}

}
