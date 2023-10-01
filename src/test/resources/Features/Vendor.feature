Feature: Feature to vendor screen functionalities


#Background:

#Given User is on login page
#When user enters username and password
#And clicks on login button


Scenario: Check Add vendor functionality


Given User is on vendor screen
And edit vendor option is clicked
When vendor is updated
And submit is clicked
Then vendor should get updated


Scenario: Check assign department functionality

 
Given User is on vendor screen
And assign  department option is clicked
When department is assigned
And submit is clicked
Then vendor should be assigned to your selected department
 

Scenario: Check add additional information functionality

 
Given User is on vendor screen
And add additional information option is clicked
When information is filled 
And submit is clicked
Then information should be saved successfully


Scenario: Check add mapping fields and filters functionality

Given user is on vendor screen
When add mapping field option is clicked
And submit is clicked
Then mapping fields should be added successfully





