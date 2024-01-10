package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FollowUs {

	@FindBy(linkText = "Facebook")
	WebElement facebookLink;

	/*@FindBy(linkText = "Twitter")
	WebElement Twitter;

	@FindBy(linkText = "RSS")
	WebElement RSS;

	@FindBy(linkText = "YouTube")
	WebElement YouTube;

	@FindBy(linkText = "Google+")
	WebElement Google;

	public void facebook() {
		facebook.click();

	}*/

	public void facebookLink() {

		facebookLink.click();

	}

	/*public void RSS() {
		RSS.click();

	}

	public void YouTube() {
		YouTube.click();

	}

	public void Google() {


	}*/


}
