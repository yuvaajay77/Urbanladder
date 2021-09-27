package pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup {
	public WebDriver driver;
	public signup(WebDriver driver) {
		this.driver=driver;
	}
	By profile=By.cssSelector("span[class=\"header-icon-link user-profile-icon\"]");
	By signupp=By.cssSelector("*[class=\"signup-link authentication_popup\"]");
	By mailid=By.cssSelector("*[id='spree_user_email']");
	By password=By.cssSelector("*[id='spree_user_password']");
	By button=By.cssSelector("*[data-gaaction=\"signup_email_click\"]");
	public WebElement goToProfile() {
		return driver.findElement(profile);
	}
	public WebElement goToSignup() {
		return driver.findElement(signupp);
	}
	public List<WebElement> email() {
		return driver.findElements(mailid);
	}
	public List<WebElement> password() {
		return driver.findElements(password);
	}
	public WebElement SignupButton() {
		return driver.findElement(button);
	}
	
	
}
