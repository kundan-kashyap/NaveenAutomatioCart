package TestCases;



import org.testng.annotations.Test;

import ObjectModel.HeaderObjectModel;
import Resource.BaseClass;
import Resource.CommmonMethods;
import Resource.Constant;

public class VerifyHeader extends BaseClass{
	@Test
	public void Header() throws InterruptedException {	
	HeaderObjectModel hom=new HeaderObjectModel(driver);
	
	driver.manage().window().maximize();
	hom.clkCurrency().click();
    CommmonMethods.forloop(hom.select(), "$ US Dollar");
    Thread.sleep(3000);
    System.out.println(hom.checkcall().getText());
    CommmonMethods.handleAssertions(hom.checkcall().getText(), Constant.calls, "Not Matching");
	hom.openAc().click();
	hom.clkRegister().click();
	hom.clkname().sendKeys(Constant.firstname);
	hom.clklastname().sendKeys(Constant.lastname);
	hom.clkemail().sendKeys(Constant.email);
	hom.entertelepho().sendKeys(Constant.telephone);
	hom.enterpass().sendKeys(Constant.pass);
	hom.enterrepas().sendKeys(Constant.reenterpass);
	hom.clkaccept().click();
	hom.clkcontinue().click();
	//Thread.sleep(2000);
	hom.clklogout().click();
	//Thread.sleep(2000);
	hom.openAc().click();
	hom.clklogin().click();
	hom.enterlogem().sendKeys(Constant.email);
	hom.enterlogpass().sendKeys(Constant.pass);
	hom.clkloginp().click();
	
	//driver.navigate().back();
	
	//driver.navigate().back();
	hom.clkcart();
	//driver.navigate().back();
	hom.clkchkout().click();
	
	}
}
