package TestCases;



import java.time.Duration;

import org.testng.annotations.Test;

import ObjectModel.HeaderObjectModel;
import Resource.BaseClass;
import Resource.CommmonMethods;
import Resource.Constant;

public class VerifyHeader extends BaseClass{
	@Test
	public void Header() throws InterruptedException {	
	HeaderObjectModel hom=new HeaderObjectModel(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Currency
	hom.clkCurrency().click();
    CommmonMethods.forloop(hom.select(), "$ US Dollar");
    
    //Call
   System.out.println(hom.checkcall().getText());
    CommmonMethods.handleAssertions(hom.checkcall().getText(), Constant.calls, "Not Matching");
	//Account
    hom.openAc().click();
	//Cart
	hom.clkcart();
	//Checkout
	hom.clkchkout().click();
	//Wishlist
	hom.clkwish().click();
	}
}
