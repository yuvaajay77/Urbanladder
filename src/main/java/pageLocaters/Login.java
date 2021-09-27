package pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public WebDriver driver;
	
	By profile=By.cssSelector("span[class=\"header-icon-link user-profile-icon\"]");
	By loginn=By.cssSelector("*[class=\"login-link authentication_popup\"]");
	By mailid=By.cssSelector("*[id='spree_user_email']");
	By password=By.cssSelector("*[id='spree_user_password']");
	By button=By.id("ul_site_login");
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement goToProfile() {
		return driver.findElement(profile);
	}
	public WebElement goTologin() {
		return driver.findElement(loginn);
	}
	public List<WebElement> email() {
		return driver.findElements(mailid);
	}
	public List<WebElement> password() {
		return driver.findElements(password);
	}
	public WebElement loginButton() {
		return driver.findElement(button);
	}
	
}
