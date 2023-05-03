@Feature2
Feature: To Validate the login functonilty of myntra application
@Smoke
Scenario: User has to login the myntra page using invalid mobile number 
Given User has to launch the browser and maximize the window 
When User has to launch the url
And User hit the profile button
And  To click the login button
And User has to pass the mobile number in mobile field
And User has to click the continue button
Then Close the browser 

