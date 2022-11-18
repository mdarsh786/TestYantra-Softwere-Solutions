Feature: User login module

Scenario: User should login to vtiger with valid credentials

Given launch the browser
And Enter the URL
When Login page should be display enter Username and Password
And click on login button
Then Home page should be displayed
And Verify with the homepage title

Scenario: User should login to vtiger with invalid credentials

Given launch the browser
And Enter the URL
When Login page should be display enter Username "admin123" and Password "admin123"
And click on login button
Then Error message should be displayed
And Verify error message
