package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
	@Test(priority = 1)
	public void test_assert()
	{
		Assert.assertEquals("Shraddha", "shraddha");
	}
	
	@Test(priority = 2)
 public void test_softassert()
 {
	 SoftAssert softassert = new SoftAssert();
	 softassert.assertEquals("Shraddha", "Shraddha");
	 softassert.assertEquals(25, 50);
	 softassert.assertEquals("hello", "Hello");
 }
}
