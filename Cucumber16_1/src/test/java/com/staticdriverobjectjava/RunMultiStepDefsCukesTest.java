package com.staticdriverobjectjava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )

@CucumberOptions(features = {"src/test/resources/com/staticdriverobjectfeature/" },
					glue={"com/staticdriverobjectjava/"},
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+2478+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							}
					)

//This program will run all scenarios without closing the browser

public class RunMultiStepDefsCukesTest {
}