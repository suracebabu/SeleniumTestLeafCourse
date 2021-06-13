Feature: Create Lead functionality

Background: 
Given Open_the_Chrome_Browser
And Load the application URL 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And click on Login button
And Click_CRM_Link



Scenario Outline: TC001_Login with positive data
Given Click_on_Lead_Link
And   Click_on_Create_Lead
And   Enter_the_companyName as <companyName>
And   Enter_the_firstName as <firstName>		
And   Enter_the_lastName as <lastName>
And   Enter_the_phoneNumber as <phoneNumber>
When  Click_on_CreateLead_SubmitButton
Then  New_CreateLead_information_is_Created
And Close_the_Browser_Window

Examples:
|username|password|companyName|firstName|lastName|phoneNumber|
|'Demosalesmanager'|'crmsfa'|'verizon'|'suram'|'aravind'|'6789092409'|

