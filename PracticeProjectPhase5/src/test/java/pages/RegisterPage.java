package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(id="FirstName")
	WebElement firstname;

	@FindBy(id="LastName")
	WebElement lastname;

	@FindBy(id="Email")
	WebElement email;

	@FindBy(id="Password")
	WebElement password;

	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;

	@FindBy(id="register-button")
	WebElement register_button;

	public void register() {

		register.click();

	}
	public void sendCredentials() {

		firstname.sendKeys("demo");
		lastname.sendKeys("user");
		email.sendKeys("demouser@gmail.com");
		password.sendKeys("12345");
		confirmpassword.sendKeys("12345");

	}
	public void clickOnRegister() {
		register_button.click();
	}

}
