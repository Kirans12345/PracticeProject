package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchItem;

	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	WebElement searchButton;

	public void searchAll() throws InterruptedException {
		Thread.sleep(3000);

		searchItem.sendKeys("14.1-inch Laptop");
		searchButton.click();

	}

}
