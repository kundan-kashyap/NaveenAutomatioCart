package ObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderObjectModel {

	public WebDriver driver;
	
	//Currency
	private By currency=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By dropdown=By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	//Call
	private By call=By.xpath("//ul[@class='list-inline']/li/span");
	//Account
	private By account=By.xpath("//span[@class='caret']");

	//Cart
	private By cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
	//Checkout
	private By chkout=By.xpath("//i[@class='fa fa-share']");
	//Wishlist
	private By wish=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	
	

	public HeaderObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
	//Currency
	public WebElement clkCurrency() {
		return driver.findElement(currency);
	}
	public List<WebElement> select(){
		return driver.findElements(dropdown);
	}
	//Call
	public WebElement checkcall() {
		return driver.findElement(call);
	}
	//Account
			public WebElement openAc() {
				return driver.findElement(account);
			}
//Cart
	public WebElement clkcart() {
		return driver.findElement(cart);
	}
	//Checkout
	public WebElement clkchkout() {
		return driver.findElement(chkout);
	}
	//Wishlist
	public WebElement clkwish() {
		return driver.findElement(wish);
	}
}
