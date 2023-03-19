package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import ObjectModel.RegisterObject;
import Resource.BaseClass;
import Resource.Constant;

public class VerifyRegisterAndLogin extends BaseClass{
	@Test
	public void registerAndLogin() {
	
	RegisterObject roj=new RegisterObject(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Account
	roj.openAc().click();
	//Register
	roj.clkRegister().click();
	roj.clkname().sendKeys(Constant.firstname);
	roj.clklastname().sendKeys(Constant.lastname);
	roj.clkemail().sendKeys(Constant.email);
	roj.entertelepho().sendKeys(Constant.telephone);
	roj.enterpass().sendKeys(Constant.pass);
	roj.enterrepas().sendKeys(Constant.reenterpass);
	roj.clkaccept().click();
	roj.clkcontinue().click();
	
	//Account
	roj.openAc().click();
	//Login
	roj.clklogin().click();
	roj.enterlogem().sendKeys(Constant.email);
	roj.enterlogpass().sendKeys(Constant.pass);
	roj.clkloginp().click();
	//Account
	roj.openAc().click();
	//Logout
	roj.clklogout().click();
	
	}
}
