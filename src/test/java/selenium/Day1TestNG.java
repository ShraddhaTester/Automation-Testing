package selenium;

import org.testng.annotations.Test;

public class Day1TestNG {
	
	@Test (priority = 2)
	public void test_1()
	{
		System.out.println("Hey Shraddha");
		}
	@Test (priority = 1)
	public void test_2()
	{
		System.out.println("Hey Kirti");
	}
	@Test(priority = 4)
	public void test_3()
	{
		System.out.println("How are you?");
	}
	@Test(priority = 3)
	public void test_4()
	{
		System.out.println("Whats up");
	}

}
