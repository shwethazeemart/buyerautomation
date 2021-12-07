Feature: Verify Buyer Order page and test all the page

Scenario Outline: Verify the New recurring orders page of Buyer panel  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          When User is click login button 
          And User is Clicks Orders in the side navigation menubar
          When User in Clicks New order dropdown value
          When User Clicks New recurring orders in the dropdown value 
          When User select outlet in the dropdown list
          When User select supplier in the dropdown list
          When User Clicks on deliver date in tuesday
          When User Clicks on deliver date in wednesday
          When User Clicks on checkbox Public holidays
          When User Clicks on Radio button of Never
          When User select contact person in the dropdown list
          When User Clicks on the Done button 
          When User Clicks on Add to order in the first product
          Then User Clicks on first time increase the order button in the first product
          Then User Clicks on second time increase the order button in the first product
          Then User Clicks on third time increase the order button in the first product 
          Then User Clicks on fourth time increase the order button in the first product
          Then User Clicks on fifth time increase the order button in the first product
          Then User Clicks on sixth time increase the order button in the first product
          Then User Clicks on seven time increase the order button in the first product
          Then User Clicks on eight time increase the order button in the first product
          Then User Clicks on nineth time increase the order button in the first product
          Then User Clicks on Review Order button
          Then User Clicks on Save recurring order
         
          
          @dev  
          Examples:
             |username                                   |  |password    |
             |velumanieswaran2020@gmail.com              |  |!123456Zm   |     
             
          @naren 
          Examples:
             |username                               |  |password    |
             |buyerautomated3@gmail.com              |  |!123456Zm   |     