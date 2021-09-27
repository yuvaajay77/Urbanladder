package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class matress {
	public WebDriver driver;
	By matress=By.cssSelector("*[class=\"topnav_item mattressesunit\"]");
	By range=By.cssSelector("*[href=\"/mattress-by-range?src=g_topnav_mattresses_mattresses-bedding_mattress-by-range\"]");
	By dreamlite=By.className("_3UYLh");
	public matress(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement goToMatress() {
		return driver.findElement(matress);
	}
	public WebElement goToMatressByRange() {
		return driver.findElement(range);
	}
	public WebElement getHeading() {
		return driver.findElement(dreamlite);
	}
}