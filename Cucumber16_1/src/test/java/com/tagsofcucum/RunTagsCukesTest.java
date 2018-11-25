package com.tagsofcucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )

@CucumberOptions(features = {"src/test/resources/com/tagsofcucumber/" },
					glue={"com/tagsofcucum/"},
					//tags = {"@SmokeTest"},  // this will include the scenario with @SmokeTest, u can give any name like
					//tags = {"~@SmokeTest"},  // this will exclude the scenario with @SmokeTest
					//tags = {"@SmokeTest", "@RegressionTestTag"}, //this is the AND condition
					//tags = {"@SmokeTest,@RegressionTestTag"}, //this is the OR condition 
					tags = {"@Important"},  // this will include all scenario of feature file
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+945+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							}
					)



public class RunTagsCukesTest {
}