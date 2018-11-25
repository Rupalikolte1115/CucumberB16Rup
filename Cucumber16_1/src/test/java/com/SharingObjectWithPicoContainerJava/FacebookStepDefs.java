package com.SharingObjectWithPicoContainerJava;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



	public class FacebookStepDefs {
		
		WebDriver driver;
		
		public FacebookStepDefs(SharedClass sharedObj) throws InterruptedException{
			driver = sharedObj.launchBrowser();
		}
			
			@Given("^the user is on facebook login Page$")
			public void the_user_is_on_facebook_login_Page() throws InterruptedException {
				//ParentStepDefs obj = new ParentStepDefs();
				System.out.println("actual script started");
				//driver = getDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(5000);
			}
			
			@When("^he enters \"([^\"]*)\" as user name$")
			public void He_enters_user_name(String userName) {
				driver.findElement(By.id("email")).sendKeys(userName);
			}
			
			
			
			
			
			

	}
