package ObjectModel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenubarObjModel {
	public WebDriver driver;
//Desktop
	private By desktop = By.linkText("Desktops");
	private By showall = By.linkText("Show All Desktops");
//Laptop
	private By laptop = By.linkText("Laptops & Notebooks");
	private By showalllappy = By.linkText("Show All Laptops & Notebooks");
//Components	
	private By component = By.linkText("Components");
	private By showallcomponent=By.linkText("Show All Components");
//MP3	
	private By mp3 = By.linkText("MP3 Players");
	private By showallmp3 = By.linkText("Show All MP3 Players");

	public MenubarObjModel(WebDriver driver2) {
		this.driver = driver2;
	}

//Desktop
	public WebElement mouseondesktop() {
		return driver.findElement(desktop);
	}
	public WebElement clkonshow() {
		return driver.findElement(showall);
	}
//Laptop
	public WebElement clklaptop() {
		return driver.findElement(laptop);
	}
	public WebElement clkshowlappy() {
		return driver.findElement(showalllappy);
	}
//Component
	public WebElement clkcomponent() {
		return driver.findElement(component);
	}
	public WebElement clkshowallcomponent() {
		return driver.findElement(showallcomponent);
	}
//MP3
	public WebElement clkonmp3() {
		return driver.findElement(mp3);
	}
	public WebElement clkshowallmp3() {
		return driver.findElement(showallmp3);
	}
}
