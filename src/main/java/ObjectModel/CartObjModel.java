package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartObjModel {
	public WebDriver driver;
	
	private By search=By.xpath("//input[@name='search']");
	private By button=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By iphoneprice=By.xpath("//p[@class='price']");
	private By addiphone=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
	private By samsungprice=By.xpath("(//p[@class='price'])[2]");
	private By addsamsung=By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	private By total=By.xpath("(//td[@class='text-right'])[12]");
	
	
	public CartObjModel(WebDriver driver2) {
		this.driver=driver2;}
	
	public WebElement clksearch() {
		return driver.findElement(search);
	}
	public WebElement clkbutton() {
		return driver.findElement(button);
	}
	public WebElement clkprice() {
		return driver.findElement(iphoneprice);
	}
	public WebElement clkadd() {
		return driver.findElement(addiphone);
	}
	public WebElement textiphone() {
		return driver.findElement(samsungprice);
	}
	public WebElement textsamsung() {
		return driver.findElement(addsamsung);
	}public WebElement clkcart() {
		return driver.findElement(cart);
	}
	public WebElement totaltext() {
		return driver.findElement(total);
	}
	
	
	}

