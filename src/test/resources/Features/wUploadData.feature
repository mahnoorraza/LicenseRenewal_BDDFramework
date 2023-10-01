Feature: Feature to test upload customer data module


Scenario: Upload customer data file functioanlity

Given user is on upload customer data screen
When departments and assigned vendors are selected
And customer data file is uploaded
Then file should get uploaded successfully

