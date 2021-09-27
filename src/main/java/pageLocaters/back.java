package pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class back {
	public WebDriver driver;
	By beds=By.cssSelector("*[class=\"topnav_item bedroomunit\"]");
	By bedswithstorage=By.cssSelector("*[href=\"/beds-with-storage?src=g_topnav_bedroom_beds_beds-with-storage\"]");
    By Backbutton=By.className("logo-with-gradient");
	
	
	public back(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clickMorePlaces() {
		return driver.findElement(Backbutton);
}}
