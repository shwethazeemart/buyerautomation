Feature: Login Action of Buyer Module
Scenario: Successful Login with Valid Credentials
Given Open the Chrome Browser
Given Maximise the Browser
Given Set the timeouts
Given Load the URL
Given Enter the username
Given Enter the Password
When click on the login
Then verify login suceesful
Scenario: Successful Login with inValid Credentials
Given Open the Chrome Browser
Given Maximise the Browser
Given Set the timeouts
Given Load the URL
Given Enter the invalid username
Given Enter the invalid Password
When click on the login
Then verify login unsuccessful
