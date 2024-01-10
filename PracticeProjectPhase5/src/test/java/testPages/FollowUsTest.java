package testPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.FollowUs;

public class FollowUsTest extends BaseClass{

	FollowUs fu=new FollowUs();
WebDriver driver;
	@Test
	public void followPage() {
		  PageFactory.initElements(driver, this);
		fu.facebookLink();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		openBrowser("Chrome");
	}
	
}

