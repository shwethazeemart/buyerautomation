Feature: Verify Buyer Inventory page and test all the page

Scenario Outline: Verify the Inventory page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          Then User is Clicks in velu masala2020 outlet
          And User are Clicks in Lists
          Then User is Clicks in New list
          Then User are type the name in list name filed"<Listname>"
          Then User is Clicks in next button
          And User are Clicks the check box of parisian Baguette
          And User is Clicks Done button
          Then User are Clicks the sairam list
          And  User is Clicks the New stock count
          Then User are Clicks the Start stock count button
          And User is Clicks the increase counted Quantity of parisian Baguetee
          Then User are Clicks the increase second time counted Quantity of parisian Baguetee
          Then User are Clicks Save button
          And User is Clicks Save stock count POPUP button
          Then User are Click Record adjusment button
          When User is Select Reason drodown value of found 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notes>"
          Then User are Clicks final Save button
         
          
           
          
    Examples:
         |username                            |  |password    ||Listname        ||Quantity||Notes               |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||sairam          ||   10   ||eswaranolifound10  |
