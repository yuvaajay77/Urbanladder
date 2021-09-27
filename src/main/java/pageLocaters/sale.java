package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sale {
	public WebDriver driver;
	
	public sale(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By saleunit=By.cssSelector("*[class=\"topnav_item saleunit\"]");
	By sofa=By.cssSelector("*[href=\"/sofa-bed?src=g_topnav_sale_deals-of-the-week_wooden-sofa-sets\"]");
	By viewproduct=By.cssSelector("*[class=\"btn-wrap col-md-12\"]");
	By dimensions=By.xpath("//*[@id=\"product-details-visible\"]/li[4]/span[2]");
	public WebElement goToSales() {
		return driver.findElement(saleunit);
	}
	public WebElement goToSofa() {
		return driver.findElement(sofa);
	}
	public WebElement goToViewProduct() {
		return driver.findElement(viewproduct);
	}
	public WebElement getDimensions() {
		return driver.findElement(dimensions);
	}

}
