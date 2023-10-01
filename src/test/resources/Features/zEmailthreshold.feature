Feature: Feature to verify email threshold functionality

Scenario: To set email threshold setting and send email

Given User is on Email threshold screen
When email notification settings are set
Then Email notification details should be saved successfully

