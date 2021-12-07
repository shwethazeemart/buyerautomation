Feature: Verify Buyer hub Entire News screen test cases

Scenario Outline: Verify the News page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on News in the side navigation menubar 
          Then User is Clicks in the test notification  
          Then user click on the close icon for test notification
          Then User Clicks on News in the side navigation menubar 
          Then User is Clicks in the test notification  
          And User are Clicks on the Whatsapp link
               
          
        @dev
        Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
         
           @devSecond 
        Examples:
         |username                            |  |password    |
         |buyerautomated3@gmail.com           |  |!123456Zm   |
          