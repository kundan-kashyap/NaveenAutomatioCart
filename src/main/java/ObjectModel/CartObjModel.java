package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartObjModel {
	public WebDriver driver;
//Search
	private By search=By.xpath("//input[@name='search']");
	private By button=By.xpath("//button[@class='btn btn-default btn-lg']");
//Iphone Price	
	private By iphoneprice=By.xpath("//p[@class='price']");
//Add to cart iphone	 
	private By addiphone=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
//Samsung Price	
	private By samsungprice=By.xpath("(//p[@class='price'])[2]");
//Add to cart samsung
	private By addsamsung=By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
//click on cart	
	private By cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
//Total Price	
	private By total=By.xpath("(//td[@class='text-right'])[12]");
	
	
	public CartObjModel(WebDriver driver2) {
		this.driver=driver2;}
//Search	
	public WebElement clksearch() {
		return driver.findElement(search);
	}
	public WebElement clkbutton() {
		return driver.findElement(button);
	}
//Iphone Price	
	public WebElement clkprice() {
		return driver.findElement(iphoneprice);
	}
//Add to cart iphone
	public WebElement clkaddiphone() {
		return driver.findElement(addiphone);
	}
//price samsung
	public WebElement textsamsungprice() {
		return driver.findElement(samsungprice);
	}
//Add to cart samsung	
	public WebElement addsamsung() {
		return driver.findElement(addsamsung);
//Click on cart		
	}public WebElement clkcart() {
		return driver.findElement(cart);
	}
//total price	
	public WebElement totaltext() {
		return driver.findElement(total);
	}}