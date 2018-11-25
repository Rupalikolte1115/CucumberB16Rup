Feature: Facebook364 login and Google search 
As a fb user, I want to enter username and pwd as a parameter
As a user, I want to search in google

Scenario: validate fb login Scenario1
Given the user is on facebook login Page
When he enters "user" as user name
And he enters "pwd" as password
Then check username is present in textbox


Scenario: validate fb login Scenario2
Given the user is on facebook login Page
When he enters "anil" as user name
And he enters "pwdwwww" as password
Then check username is present in textbox