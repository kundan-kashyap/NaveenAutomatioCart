package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterObject {
	
	public WebDriver driver;
	
	//Account
		private By account=By.xpath("//span[@class='caret']");
		//Register
		private By register=By.linkText("Register");
		private By fname=By.xpath("//input[@id='input-firstname']");
		private By lname=By.xpath("//input[@id='input-lastname']");
		private By emailid=By.xpath("//input[@id='input-email']");
		private By telephone=By.xpath("//input[@id='input-telephone']");
		private By pass=By.xpath("//input[@id='input-password']");
		private By repass=By.xpath("//input[@id='input-confirm']");
		private By accept=By.xpath("//input[@name='agree']");
		private By conti=By.xpath("//input[@value='Continue']");
		
	//Login
	    private By login=By.linkText("Login");
		private By loginemail=By.xpath("//input[@id='input-email']");
	    private By loginpass=By.xpath("//input[@id='input-password']");
		private By loginpage=By.xpath("//input[@value='Login']");
		//Logout
		private By logout=By.linkText("Logout");
		
		
		
		
		public RegisterObject(WebDriver driver2) {
			this.driver=driver2;
		}
		//Account
		public WebElement openAc() {
			return driver.findElement(account);
		}
		//Register
		public WebElement clkRegister() {
			return driver.findElement(register);
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
			
		}
		
		//Login
		public WebElement clklogin() {
			return driver.findElement(login);
		}	
		public WebElement enterlogem() {
			return driver.findElement(loginemail);
		}public WebElement enterlogpass() {
			return driver.findElement(loginpass);
		}public WebElement clkloginp() {
			return driver.findElement(loginpage);
		}
	//Logout	
		public WebElement clklogout() {
			return driver.findElement(logout);
		}

}
