package TestCases;

import java.time.Duration;


import org.testng.annotations.Test;

import ObjectModel.FooterObjectModel;
import Resource.BaseClass;


public class VerifyFooter extends BaseClass {
	@Test
	public void footer() throws InterruptedException {
		
		Thread.sleep(2000);
		FooterObjectModel fom = new FooterObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Information
		fom.clkabout().click();
		fom.clkdelivery().click();
		fom.clkprivacy().click();
		fom.clkterms().click();
//Customer Service
		fom.clkcontact().click();
		fom.clkreturns().click();
		fom.clksitemap().click();
// Extras
		fom.clkbrand().click();
		fom.clkgift().click();
		fom.clkaffilate().click();
		fom.clkspecial().click();
//My Account
		fom.clknews().click();
		fom.clknews().click();
	}
}
