Feature: Feature to test work queue screen module


Scenario: To add a manual entry for your user

Given user is on work queue screen
When Manual entry tab is clicked
And mandatory fields are filled 
Then entry should be added on submit button


Scenario: To verify edit work queue functionality

Given user navigates to edit screen
When fields are updated 
And User clicks on submit button
Then data should get saved successfully

Scenario: To verify view additional information and filter functionality


Given user navigates to view additional information screen
When information is verified  
And User filters the data 
And Export the customer data
Then data should get exported
And Data should get filtered correctly