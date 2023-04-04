Feature: Leaftaps login story
Background:
Given Open the Chrome Browser,maximize and set the timeout
And Load the Application url "http://leaftaps.com/opentaps/"
@unit
Scenario Outline: TC001-CreateLead in leaftaps
Given Enter Username <username>
And Enter password <password>
And Click on DecorativeSubmit
And Click on CRM/SFA link
And Click on Lead Link
And Enter the company name
And Enter the first name
And Enter the last name
When Click on Submit button
Then Verify lead should be created
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'Democsr'|'crmsfa'|
@Negative @regression
Scenario Outline: TC002-CreateLead in leaftaps
Given Enter Username <username>
And Enter password <password>
And Click on DecorativeSubmit
And Click on CRM/SFA link
And Click on Lead Link
And Enter the company name
And Enter the first name
And Enter the last name
When Click on Submit button
Then Verify lead should be created
Examples:
|username|password|
|'Test123'|'crmsfa'|