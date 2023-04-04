Feature: LT-65123 Leaaftaps Login story
Scenario: TC001- verify the login with valid creditals
Given Open the Chrome Browser,maximize and set the timeout
And Load the Application url
And Enter Username
And Enter password
When Login button is clicked
Then verify the user logged in sucessfully.


Scenario: TC002- verify the login with invalid credentials
Given Open the Chrome Browser,maximize and set the timeout
And Load the Application url
And Enter Username
And Enter password
When Login button is clicked
But verify the error message is displayed.
