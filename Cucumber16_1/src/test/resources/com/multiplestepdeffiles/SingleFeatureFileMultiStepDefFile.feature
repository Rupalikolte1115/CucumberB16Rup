Feature: Facebook3 login and Google search 
As a fb user, I want to enter username and pwd as a parameter
As a user, I want to search in google

Scenario: validate fb login Scenario1
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox


Scenario: Google Search for selenium automation1
Given user on the google search page
When he search for "selenium automation" text
Then ensure result available for search