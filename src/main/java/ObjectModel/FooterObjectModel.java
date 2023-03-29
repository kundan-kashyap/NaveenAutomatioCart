package ObjectModel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterObjectModel {
	
	public WebDriver driver;
//Information
	private By about=By.linkText("About Us");
	private By delivery=By.linkText("Delivery Information");
	private By privacy=By.linkText("Privacy Policy");
	private By terms=By.linkText("Terms & Conditions");
//Customer Service	
	private By contact=By.linkText("Contact Us");
	private By returns=By.linkText("Returns");
	private By sitemap=By.linkText("Site Map");
//Extras
	private By brand=By.linkText("Brands");
	private By gift=By.linkText("Gift Certificates");
	private By affiliate=By.linkText("Affiliate");
	private By specials=By.linkText("Specials");
//My Account
	private By news=By.linkText("Newsletter"); 
	private By order=By.linkText("Order History");
	
	public FooterObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
//Information
	public WebElement clkabout() {
		return driver.findElement(about);
	}
	public WebElement clkdelivery() {
		return driver.findElement(delivery);
	}
	public WebElement clkprivacy() {
		return driver.findElement(privacy);
	}
	public WebElement clkterms() {
		return driver.findElement(terms);
	}
//Customer service
	public WebElement clkcontact() {
		return driver.findElement(contact);
	}
	public WebElement clkreturns() {
		return driver.findElement(returns);
	}
	public WebElement clksitemap() {
		return driver.findElement(sitemap);
	}
//Extras
	public WebElement clkbrand() {
		return driver.findElement(brand);
	}
	public WebElement clkgift() {
		return driver.findElement(gift);
	}
	public WebElement clkaffilate() {
		return driver.findElement(affiliate);
	}
	public WebElement clkspecial() {
		return driver.findElement(specials);
	}
//My Account
	public WebElement clknews() {
		return driver.findElement(news);
	}
	public WebElement clkorder() {
		return driver.findElement(order);
	}
}
