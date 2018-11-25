package com.HandleIntparameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HandleIntParameterStepDefs {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException {
		System.out.println("actual script started");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	@When("^he enters (\\d+) as file path$")
	public void He_enters_user_name(int  numbers) {
		System.out.println("number = "+numbers);
		Integer.toString(numbers);
		//driver.findElement(By.id("email")).sendKeys(filePath);
	}

}
