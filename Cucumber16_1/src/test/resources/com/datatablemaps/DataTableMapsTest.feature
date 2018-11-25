Feature: Facebook1 login validation with DataTableMap
As a fb user, I want to enter username and pwd with DataTableMap
Scenario: validate fb login page
Given the user is on facebook login Page
When he enters following data 
	| Labels                 | Params              | Params1  	|
	| First Name             | Anil                |  A				  |
	| Last Name              | Kale                |	B					|
	| Email Address          | emailID			   		 |	C					|
	| Re-enter Email Address | emailID			   		 |	D					|
	| Password               | Password1           |	E					|
	| Birthdate              | 01                  |	F					|
Then check signup should failed

