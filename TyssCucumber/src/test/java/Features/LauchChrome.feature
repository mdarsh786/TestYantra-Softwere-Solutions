Feature: User login module

Scenario: User should login to vtiger with valid credentials

Given launch the "chrome" browser
And Enter the "http://localhost:8888"
When Login page should be displayed enter Username "admin" and Password "admin"
And Click on login button
Then Home Page should be displayed
And Verify with the Homepage title