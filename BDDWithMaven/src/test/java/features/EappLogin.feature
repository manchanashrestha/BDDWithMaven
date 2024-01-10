Feature: EappLogin

Scenario: Validate login with correct credential
	Given  Open the Browser and Navigate "http://eaapp.somee.com/"
	Then   Click on login
	And    Locate User Textbox and Input UserName as "admin"
	And    Locate Password TextBox and Input Password as "Password"
	And    Locate "submit" button
	And    Click on it.
	Then   Validate if user is able to login or not.