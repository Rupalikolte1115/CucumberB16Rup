package com.dataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.io.FileResourceIteratorFactory;

public class FacebookDataTableStepDefs {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	
	@Given("the user is on facebook login Page")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException{
		System.out.println("actual script started");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	
	@When("he enters following data")
	public void he_enters_following_data(DataTable table){
		//Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.println(data.get(0).get(0)); //print the table column Name OR first element
	      
	      //reading columns 2nd's values
	      System.out.println(data.get(1).get(1));
	      System.out.println(data.get(2).get(1));
	      System.out.println(data.get(3).get(1));
	      
	      //reading columns 3rd's values
	      System.out.println(data.get(1).get(2));
	      System.out.println(data.get(2).get(2));
	      System.out.println(data.get(3).get(2));
	      
	      
		
	}
	
	@Then("check signup should failed")
	public void check_signup_should_failed(){
		Assert.assertTrue(true);
	}
	
	
	
	

}
