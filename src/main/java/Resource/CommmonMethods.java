package Resource;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class CommmonMethods {
	public static WebDriver driver;
	public static void forloop(List<WebElement> Elements, String y) {
		
		for(WebElement z:Elements) {
			if(z.getText().equalsIgnoreCase(y)) {
				z.click();
				break;
			}
		}}
	public static void handleAssertions(String actual, String Expected, String message) {
		
	SoftAssert a=new SoftAssert();
	
	String ac=actual;
	String exp=Expected;
	
	a.assertEquals(ac, exp, message);
	a.assertAll();
	
	}
	
	
/*public static void loop(List<WebElement> Element, String u) {
		
		for(WebElement x:Element) {
			if(x.getText().equalsIgnoreCase(u)) {
				Actions a=new Actions(driver);
			a.moveToElement(x).perform();
				break;
			}
		}	*/
			}
				
	

