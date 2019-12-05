package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesObject extends BasePage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtHeader;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;

	public DressesObject() {
		PageFactory.initElements(driver, this);
	}

	public int getProductNumberFromHeader() {
		String text = txtHeader.getText();
		String[] arr = text.split(" ");
		String value = arr[2];
		int number = Integer.parseInt(value);
		return number;
		// return Integer.parseInt(txtHeader.getText().split(" ")[2]);
	}

	public int getProductCount() {
		return lstProducts.size();
	}

}
