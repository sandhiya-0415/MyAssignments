Feature: Login salesforce

Scenario: Login with positive data
Given Enter the username as 'makaia@testleaf.com'
And Enter the password as 'SelBootcamp$123'
When Click on login button

Scenario: Login with negative data
Given Enter the username as 'makaia@testleaf.com'
And Enter the password as 'Bootcamp$123'
When Click on login button