package com.hooksSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HooksStepDef {
	
	
	WebDriver driver =null;
	
	@Before(order=1)
	public void beforeSetup1(){
		System.out.println("in before1");
		System.setProperty("webdriver.gecko.driver","H:\\Oct18_Selenium\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@Before(order=2)
	public void beforeSetup2(){
		System.out.println("in before2");
		
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
		Thread.sleep(1000);
	}
	
	@Then("^checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException{
		String userNameActual =driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals(userNameActual, userNameActual);
		Thread.sleep(1000);
	}
	
	
	@And("User enters user \"([^\"]*)\" surname")
	public void user_enters_user_surname(String surName) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@Then("User Mobile field should be blank")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual =driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals(mobileActual, mobileActual);
		Thread.sleep(1000);
	}
	
	
//	@Then("close browser")
//	public void close_browser(){
//		driver.quit();
//		driver =null;
//	}
	
	@After(order=2)
	public void tearDown1(){
		System.out.println("in After order 2");
		driver.quit();
		driver =null;
		System.out.println("====================================================================");
	}
	
	@After(order=1)
	public void tearDown2(){
		System.out.println("in After order 1");
		
	}

	
	
}
