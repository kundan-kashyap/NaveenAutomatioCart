package TestCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectModel.MenubarObjModel;
import Resource.BaseClass;
import Resource.CommmonMethods;

public class VerifyMenubar extends BaseClass{
	
	@Test
	public void MenuBar() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MenubarObjModel mom=new MenubarObjModel(driver);
		driver.manage().window().maximize();
		
Actions a=new Actions(driver);

a.moveToElement(mom.hoverdesktop()).perform();
mom.seeall().click();

a.moveToElement(mom.cllaptop()).perform();
a.moveToElement(mom.clcomp()).perform();
a.moveToElement(mom.tab()).perform();
a.moveToElement(mom.software()).perform();
a.moveToElement(mom.cam()).perform();
a.moveToElement(mom.player()).perform();
a.moveToElement(mom.pho()).perform();


	}
}
