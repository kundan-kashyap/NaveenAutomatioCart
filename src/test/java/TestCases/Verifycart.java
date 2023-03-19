package TestCases;

import java.time.Duration;


import org.testng.annotations.Test;

import ObjectModel.CartObjModel;
import Resource.BaseClass;


public class Verifycart extends BaseClass {
	@Test
	public void cart() throws InterruptedException {
		
		Thread.sleep(5000);
		CartObjModel com = new CartObjModel(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Search for Iphone		
		com.clksearch().sendKeys("iphone");
		com.clkbutton().click();
		// Thread.sleep(3000);
//price		
		String iphone = com.clkprice().getText();
		// System.out.println(iphone);//$123.20 //Ex Tax: $101.00
//Split the Values		
		String[] price = iphone.split("\\s+");
		// System.out.println(Arrays.toString(price)); [$123.20 Ex, Tax:, $101.00]
		String dollar = price[0];
		// System.out.println(dollar); $123.20
//RemoveDollar		
		String replace = dollar.replaceAll("[$,]", "");
		// System.out.println(replace); 123.20
//StoreintoDouble		
		double d1 = Double.parseDouble(replace);
		//System.out.println(d1);
//Add to Cart		
		com.clkaddiphone().click();
		com.clksearch().clear();
//Search for Samsung		
		com.clksearch().sendKeys("samsung");
		com.clkbutton().click();
//price		
		String samsung = com.textsamsungprice().getText(); // $241.99 Ex Tax: $199.99
		// System.out.println(samsung);
//Split the vlues		
		String[] tabprice = samsung.split("\\s+");
		// System.out.println(Arrays.toString(tabprice)); [$241.99 Ex, Tax:, $199.99]
		String seprate = tabprice[0];
		// System.out.println(seprate); $241.99
//RemoveDollar	
		String removedollar = seprate.replaceAll("[$,]", "");
		// System.out.println(removedollar); 241.99]
//StoreintoDouble		
		double d2 = Double.parseDouble(removedollar);
//Add to cart	
		com.addsamsung().click();
		Thread.sleep(2000);
		
		com.clkcart().click();
//Addition prices
		double d = d1 + d2;
		String values = com.totaltext().getText();
		//System.out.println(values);    $365.19
		String totaldollar = values.replaceAll("[$,]", "");
		//System.out.println(totaldollar);   365.19
		double d3 = Double.parseDouble(totaldollar);
		//System.out.println(d3);      365.19
//Compariosn price
		if (d == d3) {
			System.out.println("total is matching");
		}}}
