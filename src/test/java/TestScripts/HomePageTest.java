package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageObject;

public class HomePageTest {
	
	HomePageObject hp;

	public HomePageTest() {
		hp = new HomePageObject();
	}

	@Test
	public void verifyTabNavigation() {
		hp.clickWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		hp.clickDresses();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
		hp.clickTshirt();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
	}

}
