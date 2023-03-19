package TestCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectModel.MenubarObjModel;
import Resource.BaseClass;


public class VerifyMenubar extends BaseClass{
	
	@Test
	public void MenuBar() {
		
		MenubarObjModel mom=new MenubarObjModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Actions a=new Actions(driver);
//Desktop
    a.moveToElement(mom.mouseondesktop()).perform();
    mom.clkonshow().click();
//Laptop
    a.moveToElement(mom.clklaptop()).perform();
    mom.clkshowlappy().click();
//Component    
   a.moveToElement(mom.clkcomponent()).perform();
   mom.clkshowallcomponent().click();
//MP3
   a.moveToElement(mom.clkonmp3()).perform();
   mom.clkshowallmp3().click();	
	}
}
