Feature: Leaftaps createlead story
Open the ChromeBrowserand mavigate to leads page


#Scenario Outline: TC001-CreateLead test case
#Given Click on create lead
#And Enter the company name <company Name>
#And Enter the first name <first Name>
#And Enter the last name <last name>
#When Click on Submit button
#Then Verify lead should be created
#Examples:
#|company Name|first Name|last name|
#|'wipro'|'San'|'E'|
#|'Alight'|'Sandhiya'|'E'|
#
#Scenario Outline: TC002-DeleteLead test case
#Given Click on Find Leads and then click on Phone Number for deletelead<Phone Number>
#And Store the leadid and delete it
#And verify the deleted lead doesn't exists
#Examples:
#|Phone Number|
#|'99'|
#
#Scenario Outline:TC003-EditLead test case
#Given Click on Find Leads and then click on Phone Number for editlead<Phone Number>
#And Click on Find Leads for editelead
#And Edit the lead and update the company name<Company Name>
#Examples:
#|Phone Number|Company Name|
#|'99'|'TCS'|
#
#Scenario Outline:TC004-DuplicateLead test case
#Given Click on Find Leads and then click on Phone Number for duplicatelead<Phone Number>
#And Click on Find Leadsfor duplicatelead
#And Duplicate the lead
#Examples:
#|Phone Number|
#|'99'|

Scenario Outline:TC005-MergeLead test case
Given Getting the first lead for Merge<first lead name>
And Getting the second lead to Merge  with first<Second lead name>
And Checking whether the lead is merged correctly
Examples:
|first lead name|Second lead name|
|'Babu'|'Hari'|




