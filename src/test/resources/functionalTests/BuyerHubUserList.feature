Feature: Verify buyer panel and test user list

Scenario Outline: Verify the Users page in view User list

					Given User are available in login page
          Given User is on Login Page
    			When User enters exact username "<username>"
    			When User enters exact password"<loginPassword>"
    			Then User click on login button
          When User Clicks Buyer hub users in side navigation menubar 
          Then User click search textbox
          And user enter the name in search textbox 
          Then List should be altered
          
       @dev   
       Examples:
         |username                       |  |password |
         |velumanieswaran2020@gmail.com  |   |!1234567Zm|    
          
          
       @devSecond    
       Examples:
         |username                   |  |password |
         |buyerautomated3@gmail.com  |   |!1234567Zm|    
