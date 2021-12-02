Feature: Verify Buyer Invoice upload page and test all the page
@Smoke
Scenario Outline: Verify the Invoices upload page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Then User Clicks on Invoices in the side navigation menubar
         And User is Clicks in Uploads 
         Then User is Clicks in Upload invoice
         And User is Clicks on select outlet
         Then User is Clicks on upload the image
         And User is Clicks on Upload button
         
         
          
     Examples:
             |username                     |  |password    |
             |buyerautomated3@gmail.com    |  |!123456Zm   |
 