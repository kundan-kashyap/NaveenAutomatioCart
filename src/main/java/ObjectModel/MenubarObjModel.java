package ObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenubarObjModel {
public WebDriver driver;
private By desktop=By.linkText("Desktops");
private By see=By.linkText("Show All Desktops");
private By laptop=By.linkText("Laptops & Notebooks");
private By comp=By.linkText("Components");
private By tablet=By.linkText("Tablets");
private By soft=By.linkText("Software");
private By phone=By.linkText("Phones & PDAs");
private By camera=By.linkText("Cameras");
private By mp3=By.linkText("MP3 Players");

public MenubarObjModel(WebDriver driver2) {
	this.driver=driver2;}

public WebElement hoverdesktop() {
	return driver.findElement(desktop);
}
public WebElement seeall() {
	return driver.findElement(see);}
public WebElement cllaptop(){
	return driver.findElement(laptop);
}
public WebElement clcomp(){
	return driver.findElement(comp);}
public WebElement tab(){
	return driver.findElement(tablet);}
public WebElement software(){
	return driver.findElement(soft);}
public WebElement pho(){
	return driver.findElement(phone);}
public WebElement cam(){
	return driver.findElement(camera);}
public WebElement player(){
	return driver.findElement(mp3);}

}
