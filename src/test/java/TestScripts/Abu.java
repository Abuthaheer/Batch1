package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageObject;

public class HomePageTest {
	
	HomePageObject hp1;

	public HomePageTest() {

	hp2 = new HomePageObject();
	hp1 = new HomePageObject();

	}

	@Test
	public void verifyTabNavigation() {
		hp.clickWomen();
		hp.clickWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		hp.clickDresses();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
		hp.clickTshirt();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
	}

}
