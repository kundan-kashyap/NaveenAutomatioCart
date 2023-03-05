package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterObjectModel {
	
	public WebDriver driver;
	
	private By about=By.linkText("About Us");
	private By contact=By.linkText("Contact Us");
	private By brand=By.linkText("Brands");
	private By news=By.linkText("Newsletter");
	private By sitemap=By.linkText("Site Map");
	private By delivery=By.linkText("Delivery Information");
	private By returns=By.linkText("Returns");
	private By order=By.linkText("Order History");
	
	public FooterObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clkabout() {
		return driver.findElement(about);
	}
	public WebElement clkcontact() {
		return driver.findElement(contact);
	}
	public WebElement clkbrand() {
		return driver.findElement(brand);
	}
	public WebElement clknews() {
		return driver.findElement(news);
	}
	public WebElement clksitemap() {
		return driver.findElement(sitemap);
	}
	public WebElement clkdelivery() {
		return driver.findElement(delivery);
	}
	public WebElement clkreturns() {
		return driver.findElement(returns);
	}
	public WebElement clkorder() {
		return driver.findElement(order);
	}
	
	
	
	

}
