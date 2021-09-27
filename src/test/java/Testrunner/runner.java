package Testrunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageLocaters.Bedroom;
import pageLocaters.Decor;
import pageLocaters.Help;
import pageLocaters.Login;
import pageLocaters.back;
import pageLocaters.matress;
import pageLocaters.sale;
import pageLocaters.signup;
import pageLocaters.store;
import resources.base;

public class runner extends base {

	public static Logger log=LogManager.getLogger(base.class.getName());
	  @Test(priority= 0)
	public void setPriceLimit1() throws IOException {
		WebElement ele=null;
		driver=initializeDriver();
		driver.get(p.getProperty("searchurl"));
		base.closePopup();
		Bedroom br=new Bedroom(driver);
		Actions a=new Actions(driver);
		a.moveToElement(br.goToBeds()).build().perform();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		ele=br.goTobedswithstorage();
		jse.executeScript("arguments[0].click()", ele);
		log.info("redirected to beds with storage");
		//base.closePopup();
		a.moveToElement(br.goToPrice()).build().perform();
		ele=br.setPrice();
		jse.executeScript("arguments[0].click()", ele);
		log.info("set price limit succesfully");
	}
@Test(priority= 1)
public void signupdetails1() throws IOException, InterruptedException {
	WebElement ele=null;
	driver=initializeDriver();
	driver.get(p.getProperty("searchurl"));
	base.closePopup();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	signup s=new signup(driver);
	Actions a=new Actions(driver);
	a.moveToElement(s.goToProfile()).build().perform();
	ele=s.goToSignup();
	jse.executeScript("arguments[0].click()", ele);
	log.info("clicked on signup button");
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]") ));
	List<WebElement> elem = s.email();
	ele=elem.get(0);
	jse.executeScript("arguments[0].setAttribute('value', 'mnh@gamil.com')", ele);
	log.info("entered mailid");
	elem = s.password();
	ele=elem.get(1);
	jse.executeScript("arguments[0].setAttribute('value', 'password')", ele);
	log.info("Entered the password");
	ele=s.SignupButton();
	jse.executeScript("arguments[0].click()", ele);
	log.info("Clicked on sig-nup ");
	
}

@Test(priority=2)
public void getcontactmail1() throws IOException, InterruptedException {
	WebElement ele=null;
	driver=initializeDriver();
	driver.get(p.getProperty("searchurl"));
	base.closePopup();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	Help h=new Help(driver);
	h.goToHelp().click();
	log.info("clicked on help button");
	h.goToContactus().click();
	String contactemail=h.getMail().getText();
	log.info("Got contact and e-mail");
	System.out.println("contactemail: "+contactemail);
	}
 @Test(priority=3)
	public void setPriceLimit() throws IOException, InterruptedException {
		WebElement ele=null;
		driver=initializeDriver();
		driver.get(p.getProperty("searchurl"));
		base.closePopup();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Decor d=new Decor(driver);
		Actions a=new Actions(driver);
		a.moveToElement(d.goToDecor()).build().perform();
		ele=d.goToStandingMirrors();
		jse.executeScript("arguments[0].click()", ele);
		log.info("Clicked on Standing mirrors");
		//base.closePopup();
		d.clickInStock().click();
		log.info("selected Instock products");
		Thread.sleep(3500);
		String mirror=d.getMirrorname().getText();
		String cost=d.getMirrorcost().getText();
		log.info("Got the first mirror name and cost");
		System.out.println("Mirror type: "+mirror+" ,cost= "+cost.substring(1));
		
	}
	@Test(priority=4)
	public void signupdetails() throws IOException, InterruptedException {
		WebElement ele=null;
		driver=initializeDriver();
		driver.get(p.getProperty("searchurl"));
		base.closePopup();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		store s=new store(driver);
		s.goToStore().click();
		log.info("clicked in store");
		s.goToViewDetails().click();
		
		System.out.println(s.getAddress().getText());
		log.info("got Creaticity Store address");
		
	}
   @Test(priority=5)
public void logindetails1() throws IOException, InterruptedException {
	WebElement ele=null;
	driver=initializeDriver();
	driver.get(p.getProperty("searchurl"));
	base.closePopup();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	matress m=new matress(driver);
	Actions a=new Actions(driver);
	a.moveToElement(m.goToMatress()).build().perform();
	ele=m.goToMatressByRange();
	jse.executeScript("arguments[0].click()", ele);
	log.info("clicked on matress by range");
	System.out.println(m.getHeading().getText());
	log.info("dreamlite is present");
	
}
	 @Test(priority=6)
	public void getcontactmail() throws IOException, InterruptedException {
		WebElement ele=null;
		driver=initializeDriver();
		driver.get(p.getProperty("searchurl"));
		base.closePopup();
		Bedroom br=new Bedroom(driver);
		Actions a=new Actions(driver);
		a.moveToElement(br.goToBeds()).build().perform();

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		ele=br.goTobedswithstorage();
		jse.executeScript("arguments[0].click()", ele);
		log.info("redirected to beds with storage");
		
		back d=new back(driver);
		d.clickMorePlaces().click();
		log.info("clicked on Back button");
	}
	@Test(priority=7)
	public void Logindetails() throws IOException, InterruptedException {
		WebElement ele=null;
		driver=initializeDriver();
		driver.get(p.getProperty("searchurl"));
		base.closePopup();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Login l=new Login(driver);
		Actions a=new Actions(driver);
		a.moveToElement(l.goToProfile()).build().perform();
		ele=l.goTologin();
		jse.executeScript("arguments[0].click()", ele);
		log.info("clicked on login button");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-gaaction=\"popup.auth.close\"]") ));
		List<WebElement> elem = l.email();
		ele=elem.get(1);
		jse.executeScript("arguments[0].setAttribute('value', 'abc@gamil.com')", ele);
		log.info("entered email");
		elem = l.password();
		ele=elem.get(2);
		jse.executeScript("arguments[0].setAttribute('value', 'password')", ele);
		log.info("entered password");
		ele=l.loginButton();
		jse.executeScript("arguments[0].click()", ele);
		log.info("clicked on login");
		
	}}