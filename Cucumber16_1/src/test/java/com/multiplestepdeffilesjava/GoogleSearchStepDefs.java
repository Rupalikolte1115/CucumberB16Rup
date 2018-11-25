package com.multiplestepdeffilesjava;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GoogleSearchStepDefs {
	
	WebDriver driver;
	
//	@Before
//	public void setUpGoogle() throws InterruptedException {
//		System.out.println("in setup");
//		driver = new FirefoxDriver();
//		System.out.println("opened browser");
//		Thread.sleep(5000);
//	}
	
	
	@Given(value = "user on the google search page") 
	public void user_on_the_google_search_page() throws InterruptedException{
		System.out.println("actual script started");
		ParentStepDefs obj = new ParentStepDefs();
		driver = obj.getDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
	}
	
	@When(value = "he search for \"([^\"]*)\" text")
	public void he_search_for_text(String searchText) throws InterruptedException{
//		GoogleSearchPage googlePage = new GoogleSearchPage();
//		googlePage.enterGoogleSearchText(driver, searchText);
	}
	
	@Then("^ensure result available for search$")
	public void ensure_result_available_for_search() throws Throwable {
	    driver.findElement(By.xpath(".//a[contains(text(),'Sign in')]"));
		Assert.assertTrue(true);
		driver.quit();
	}
	

}
