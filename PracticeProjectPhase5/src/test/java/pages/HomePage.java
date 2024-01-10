package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	@FindBy(linkText="Log in")
	static WebElement Link_login;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginLink() {
		Link_login.click();
	}
}