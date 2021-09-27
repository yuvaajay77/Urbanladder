package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Help {
	public WebDriver driver;
	By help=By.cssSelector("*[href=\"/help\"]");
	By contactus=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[10]/a");
	By mail=By.cssSelector("*[href=\"mailto:tech@urbanladder.com\"]");
	public Help(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement goToHelp() {
		return driver.findElement(help);
	}
	public WebElement goToContactus() {
		return driver.findElement(contactus);
	}
	public WebElement getMail() {
		return driver.findElement(mail);
	}
	
}