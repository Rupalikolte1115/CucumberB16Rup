package com.SharingObjectWithPicoContainerJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	//private static boolean startBrowser = false;
	WebDriver driver;
	
	
	@Before
	public WebDriver launchBrowser() throws InterruptedException {
		System.out.println("in setup");
		if(driver ==null){
			System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		System.out.println("opened browser");
		Thread.sleep(2000);		
		return driver;
	}
	
	@After
	public void tearDown(){
		driver.quit();
		driver = null;
	}
	
	
	
	
	
	
//	public static WebDriver getDriver() {  
//		if(driver==null){
//			System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		
//		return driver;
//	}
    
}
