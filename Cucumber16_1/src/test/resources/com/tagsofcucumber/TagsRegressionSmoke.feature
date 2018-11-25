@Important
Feature: Facebook6 login validation with parameter
As a fb user, I want to enter username and pwd as a parameter


@SmokeTest
Scenario: validate fb login page(smoketaged)
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox

#you can provide any tag name like @abc, @myTag
@RegressionTestTag
Scenario: validate fb login page(regressiontag)
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox

@SmokeTest @RegressionTestTag
Scenario: validate fb login page(bothtag)
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox