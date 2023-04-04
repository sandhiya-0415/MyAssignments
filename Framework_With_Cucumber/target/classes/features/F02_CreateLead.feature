Feature: Login salesforce

Scenario: CreateLead with positive data
Given Enter the username as 'makaia@testleaf.com'
And Enter the password as 'SelBootcamp$123'
When Click on login button

Scenario: CreateLead with negative data
Given Enter the username as 'makaia@testleaf.com'
And Enter the password as 'Bootcamp$123'
When Click on login button