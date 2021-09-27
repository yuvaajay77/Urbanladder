package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bedroom {
	public WebDriver driver;
	By beds=By.cssSelector("*[class=\"topnav_item bedroomunit\"]");
	By bedswithstorage=By.cssSelector("*[href=\"/beds-with-storage?src=g_topnav_bedroom_beds_beds-with-storage\"]");
	By pricelimit=By.id("price_limit_30000-34999");
	By price=By.cssSelector("*[data-group=\"price\"]");
	public Bedroom(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement goToBeds() {
		return driver.findElement(beds);
	}
	public WebElement goTobedswithstorage() {
		return driver.findElement(bedswithstorage);
	}
	public WebElement goToPrice() {
		return driver.findElement(price);
	}
	public WebElement setPrice() {
		return driver.findElement(pricelimit);
	}
}
