package com.MyExampleKeywordJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )

@CucumberOptions(features = {"src/test/resources/com/MyExampleKeyword/" },
					glue={"com/MyExampleKeywordJava/"},
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
								"html:target/cucumber-htmlreport", 
								"json:target/cucumber-report"+3+".json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							 }
					)


public class RunExampleCukesTest {
}