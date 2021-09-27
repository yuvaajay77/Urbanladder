package pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class furniture {
	public WebDriver driver;
	By allfurniture=By.xpath("//*[@id=\"content\"]/div[3]/div/div[3]/a[7]");
	By studyroom=By.cssSelector("*[title*=\"Study Room Furniture\"]");
	By categories=By.cssSelector("*[class=\"infotext\"]");
	

	public furniture(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement goToAllFurniture() {
		return driver.findElement(allfurniture);
	}
	public WebElement goToStudyRoom() {
		return driver.findElement(studyroom);
	}
	public List<WebElement> getCategories() {
		return driver.findElements(categories);
	}
}
