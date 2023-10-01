
Feature: Feature to test login and UserProfile screen functionalities


#Given User is on login page
#When user enters username and password
#And clicks on login button

@skip
Scenario: Check forgot password functionality

Given User is on forgot password screen
When email is entered
And user clicks on send button
Then reset password email should be received to the user


Scenario: Check login with valid credentials

Given User is on login page
When user enters username and password
And clicks on login button
Then user is navigated to the Dashboard


Scenario: UserProfile navigation test

Given User is on login page
When user enters username and password
And clicks on login button
And user is on dashboard screen
And user clicks on My profile
Then user is navigated to the User profile screen