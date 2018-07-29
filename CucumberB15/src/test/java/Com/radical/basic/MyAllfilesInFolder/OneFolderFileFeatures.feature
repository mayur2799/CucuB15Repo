Feature: Facebook login
As a fb user, I want to enter username and pwd as a parameter

Scenario: validate fb login Scenario1
Given ther user is on facebook login Page
When he enters "Anil" as user name
And he enters "mayur" as password
Then check username is present in textbox