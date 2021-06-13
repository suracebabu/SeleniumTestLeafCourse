Feature: Edit Lead functionality

Background: 
Given Open_the_Chrome_Browser
And Load the application URL 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And click on Login button
And Click_CRM_Link

Scenario Outline: TC001_Edit_Lead with positive data
Given Click_on_Lead_Link
And   Find_Lead_through_Phone_Number as <phoneNumber>
When  Edit_the_first_lead_companyName as <companyName>
And   Click_Edit_Submit
Then  Verify_Lead_information_is_Edited_Successfully

Examples:
|username|password|companyName|firstName|lastName|phoneNumber|companyName|
|'Demosalesmanager'|'crmsfa'|'verizon'|'suram'|'aravind'|'98'|'verizon'|