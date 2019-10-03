Feature: Registered user is able to login using correct login credentials

Scenario: Login into StackOverFlow website

Given User is on the StackOverFlow website
When Clicks on the Login Link and is navigated to login page
And User enters valid username
And User enters valid password
And User clicks on login 
Then User is logged in the site
