Feature: EappLogin

Scenario: Validate login with correct credential
	Given  Init the Browser and Navigate "http://eaapp.somee.com/"
	Then   Click on login
	And    Locate User Textbox and Input UserName as "admin"
	And    Locate Password TextBox and Input Password as "password"
	And    Locate log in button and click on it
	Then   Validate if user is able to login or not.
	
Scenario: Validate login with incorrect userid and password
	Given  Init the Browser and Navigate "http://eaapp.somee.com/"
	Then   Click on login
	And    Locate User Textbox and Input UserName as "abc"
	And    Locate Password TextBox and Input Password as "xyz"
	And    Locate log in button and click on it
	Then   User should not allowed to login.
	
