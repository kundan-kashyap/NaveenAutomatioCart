package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import ObjectModel.FooterObjectModel;
import Resource.BaseClass;

public class VerifyFooter extends BaseClass {
@Test
	public void footer() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FooterObjectModel fom=new FooterObjectModel(driver);
		driver.manage().window().maximize();
		fom.clkabout().click();
		fom.clkcontact().click();
		fom.clkbrand().click();
		fom.clknews().click();
		fom.clkdelivery().click();
		fom.clknews().click();
		fom.clkreturns().click();
		fom.clksitemap().click();
		
	}

}
