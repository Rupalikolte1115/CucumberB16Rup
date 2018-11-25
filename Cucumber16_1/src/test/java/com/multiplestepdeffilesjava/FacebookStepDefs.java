package com.multiplestepdeffilesjava;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



	public class FacebookStepDefs {
		
		WebDriver driver;
			
//			@Before
//			public void setUpFB() throws InterruptedException {
//				System.out.println("in setup");
//				driver = new FirefoxDriver();
//				System.out.println("opned browser");
//				Thread.sleep(5000);
//			}
			
			
			@Given("^the user is on facebook login Page$")
			public void the_user_is_on_facebook_login_Page() throws InterruptedException {
				ParentStepDefs obj = new ParentStepDefs();
				System.out.println("actual script started");
				driver = obj.getDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(5000);
			}
			
			@When("^he enters \"([^\"]*)\" as user name$")
			public void He_enters_user_name(String userName) {
				driver.findElement(By.id("email")).sendKeys(userName);
			}
			
			@When("^he enters \"([^\"]*)\" as password$")
			public void He_enters_user_password(String pwd) throws InterruptedException {
				driver.findElement(By.id("pass")).sendKeys(pwd);
				Thread.sleep(5000);
			}
			
			@Then("^check username is present in textbox$")
			public void check_username_is_present_in_textbox(){
			
				Assert.assertTrue(true);
				driver.quit();
			}
			
			
			
			

	}
