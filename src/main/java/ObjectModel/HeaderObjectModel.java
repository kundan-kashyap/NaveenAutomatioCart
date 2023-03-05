package ObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderObjectModel {

	public WebDriver driver;
	
	private By currency=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By dropdown=By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	private By call=By.xpath("//ul[@class='list-inline']/li/span");
	private By account=By.xpath("//span[@class='caret']");
	private By register=By.linkText("Register");
	private By login=By.linkText("Login");
	private By cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
	private By chkout=By.xpath("//i[@class='fa fa-share']");
	private By fname=By.xpath("//input[@id='input-firstname']");
	private By lname=By.xpath("//input[@id='input-lastname']");
	private By emailid=By.xpath("//input[@id='input-email']");
	private By telephone=By.xpath("//input[@id='input-telephone']");
	private By pass=By.xpath("//input[@id='input-password']");
	private By repass=By.xpath("//input[@id='input-confirm']");
	private By accept=By.xpath("//input[@name='agree']");
	private By conti=By.xpath("//input[@value='Continue']");
	private By logout=By.linkText("Logout");
	private By loginemail=By.xpath("//input[@id='input-email']");
	private By loginpass=By.xpath("//input[@id='input-password']");
	private By loginpage=By.xpath("//input[@value='Login']");
	

	public HeaderObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement clkCurrency() {
		return driver.findElement(currency);
	}
	public List<WebElement> select(){
		return driver.findElements(dropdown);
	}
	public WebElement checkcall() {
		return driver.findElement(call);
	}
	public WebElement openAc() {
		return driver.findElement(account);
	}
	public WebElement clkRegister() {
		return driver.findElement(register);
	}
	public WebElement clklogin() {
		return driver.findElement(login);
	}
	public WebElement clkcart() {
		return driver.findElement(cart);
	}
	public WebElement clkname() {
		return driver.findElement(fname);
	}
	public WebElement clklastname() {
		return driver.findElement(lname);
	}
	public WebElement clkemail() {
		return driver.findElement(emailid);
	}
	public WebElement entertelepho() {
		return driver.findElement(telephone);
	}
	public WebElement enterpass() {
		return driver.findElement(pass);
	}
	public WebElement enterrepas() {
		return driver.findElement(repass);
	}
	public WebElement clkaccept() {
		return driver.findElement(accept);
	}
	public WebElement clkcontinue() {
		return driver.findElement(conti);
	}public WebElement clklogout() {
		return driver.findElement(logout);
	}
	public WebElement enterlogem() {
		return driver.findElement(loginemail);
	}public WebElement enterlogpass() {
		return driver.findElement(loginpass);
	}public WebElement clkloginp() {
		return driver.findElement(loginpage);
	}
	public WebElement clkchkout() {
		return driver.findElement(chkout);
	}
}
