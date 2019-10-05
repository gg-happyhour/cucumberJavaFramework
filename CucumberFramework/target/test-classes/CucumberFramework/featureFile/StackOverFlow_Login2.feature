Feature: Registered user is able to login using correct login credentials

Scenario: Login into StackOverFlow website

Given User is on the StackOverFlow website2
When Clicks on the Login Link and is navigated to login page2
And User enters valid username2
And User enters valid password2
And User clicks on login2
Then User is logged in the site2
