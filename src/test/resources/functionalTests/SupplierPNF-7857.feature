Feature: Verify Supplier Customers page tested 

Scenario Outline: Verify the Supplier customers page
          Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Customers in the side navigation menubar 
          Then User click on New customer icon
          Then User Enter the UEN number registration field"<UEN>" 
          Then User click on continue button
          Then User upload the image in draganddrop field
          Then User select check box of velumasala
          Then User enter information in note field"<information>"
          Then User submit button in finally
          
           
          Examples:
         |loginEmail                            |  |loginPassword    ||UEN    ||information                  |
         |velumanieswaran2020@gmail.com         |  |!123456Zm        ||UEN-456||Hi all this is masala company|