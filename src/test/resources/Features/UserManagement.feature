Feature: Feature to test Usermanagement screen functionalities


Background:

Given User is on login page
When user enters username and password
And clicks on login button


Scenario: Check Add and edit user functionality


Given User is on user management screen
And Add user tab is clicked
When user enters mandatory fields
And user clicks on cancel button
Then user should be naviagted to usermanagement screen


#Scenario: Check Edit user functionality

#Given User is on user management screen
Given user clicks on edit screen
When user details are updated 
And user clicks on submit tab 
Then user should get updated 
