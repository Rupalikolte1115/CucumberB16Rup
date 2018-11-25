Feature: Facebook4 login validation with Example keyword
As a fb user, I want to enter username and pwd with Example keyword

Scenario Outline: validate fb login page
Given the user is on facebook login Page
When he enters "<user>" as user name
And he enters "<pwd>" as password
Then check username is present in textbox
Examples:
		| user 			 | pwd |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
    