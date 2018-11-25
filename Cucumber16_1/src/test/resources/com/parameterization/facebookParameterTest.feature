Feature: Facebook5 login validation with parameter
As a fb user, I want to enter username and pwd as a parameter
Scenario: validate fb login page
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox