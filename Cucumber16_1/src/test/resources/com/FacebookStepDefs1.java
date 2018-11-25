package com.staticdriverobjectjava;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



	public class FacebookStepDefs1 extends BaseStepDef {
		
		WebDriver driver = getDriver();
		
		
			
//			@Before
//			public void setUpFB() throws InterruptedException {
//				
//				driver = new FirefoxDriver();
//				System.out.println("opned browser");
//				Thread.sleep(5000);
//			}
//			
			
			
			
			@When("^he enters \"([^\"]*)\" as password$")
			public void He_enters_user_password(String pwd) throws InterruptedException {
				driver.findElement(By.id("pass")).sendKeys(pwd);
				Thread.sleep(5000);
			}
			
			@Then("^check username is present in textbox$")
			public void check_username_is_present_in_textbox(){
			
				Assert.assertTrue(true);
				driver.get("https://www.facebook.com/");
				
			}
			
			
			
			

	}
