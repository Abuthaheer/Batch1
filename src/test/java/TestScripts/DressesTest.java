package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.DressesObject;
import pageObject.HomePageObject;

public class DressesTest {

	HomePageObject hp;
	DressesObject dp;

	public DressesTest() {
		hp = new HomePageObject();
		dp = new DressesObject();
	}

	@Test
	public void verifyProductHeaderCount() {

		hp.clickDresses();
		Assert.assertTrue(dp.getProductNumberFromHeader() 
				== dp.getProductCount(), "Failed: Count Mismatched");

	}

}
