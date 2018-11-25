package com.parameterizationjava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )

@CucumberOptions(features = {"src/test/resources/com/parameterization/" },
					glue={"com/parameterizationjava/"},
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1676+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							}
					)







public class RunParameterCukesTest {
}