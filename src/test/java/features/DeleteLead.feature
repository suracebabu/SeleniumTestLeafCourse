Feature: Delete Lead functionality

Background: 
Given Open_the_Chrome_Browser
And Load the application URL 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And click on Login button
And Click_CRM_Link

Scenario Outline: TC4_DeleteLead with positive data
Given Click_on_Lead_Link
And   Find_Lead_through_Phone_Number as <phoneNumber>
When  Delete_the_First_Lead
Then  Verify_Lead_information_is_deleted_Successfully
And Close_the_Browser_Window
Examples:
|username|password|companyName|firstName|lastName|phoneNumber|companyName|
|'Demosalesmanager'|'crmsfa'|'verizon'|'suram'|'aravind'|'99'|'verizon'|