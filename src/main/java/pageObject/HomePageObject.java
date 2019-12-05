package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabWomen;

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabTshirts;

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public void clickWomen() {
		tabWomen.click();

	}

	public void clickDresses() {
		tabDresses.click();
	}

	public void clickTshirt() {
		tabTshirts.click();
	}

	public WebElement getWomen() {
		return tabWomen;
	}

	public WebElement getDresses() {
		return tabDresses;
	}

	public WebElement getTshirt() {
		return tabTshirts;
	}

}
