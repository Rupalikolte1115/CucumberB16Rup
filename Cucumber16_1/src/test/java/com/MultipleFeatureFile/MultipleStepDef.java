package com.MultipleFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleStepDef {
	protected WebDriver driver;
	
	@Given("^open facebook page$")
	public void openfacebookpage(){
		System.setProperty("webdriver.gecko.driver","H:\\Oct18_Selenium\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
	     WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
		@When("^I enter Login name$")
		public void i_enter_Login_name() throws Throwable {
			
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("roopapiha@gmail.com");
		}

		@Then("^I verify textbox value$")
		public void i_verify_textbox_value() throws Throwable {
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("SELENIUM");
		
		
	}



}
