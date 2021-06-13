Feature: Login functionality of leaftap application

Scenario: TC001_Login with positive data
Given Open_the_Chrome_Browser
And Load the application URL 'http://leaftaps.com/opentaps/control/main'
And Enter the username as <username>
And Enter the password as <password>
When click on Login button
Then Home_page_should_be_displayed
And DemoSalesManager_should_be_displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: TC002_Login with negative data
Given Open_the_Chrome_Browser
And Load the application URL 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa123'
When click on Login button
Then Home_page_should_be_displayed
And DemoSalesManager_should_be_displayed
But Error_message_should_be_displayed