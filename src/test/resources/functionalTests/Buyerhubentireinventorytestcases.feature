Feature: Verify Buyer hub Entire Inventory screen test cases

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
         |username                            |  |password    ||Listname        ||Quantity||Notes              |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||sairam          ||   10   ||eswaranolifound10  |
         
         
         
Scenario Outline: Verify the Inventory Activity lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on velu masala outlet
          Then User click on Activity icon
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon
          And User select the calendar this month from date to To date
          Then User click on download button
          
     Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
         
         
         
Scenario Outline: Verify the Inventory Outlets lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User click on settings
          And User click on settings close icon
          Then User click on Export download icon
          And User click on new list of sstmasala
          Then User click on new list close icon
          And User click on starter plan of sstmasala
          Then User click on starter plan close icon
          Then User click on search outlets
          And User send outlet name in search icon"<outletname>"
          Then User click on status icon
          And User click on checkbox of Has items below par
          Then User click on velu masala
          And User return to outlet page
           
          
          Examples:
         |username                            |  |password    ||outletname     |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||velu masala2020|
         
         
Scenario Outline: Verify the Inventory SKU lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on velu masala outlet
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon
          And User click on Export download button
          Then User click on Add SKU
          And User Select dropdown list name in velu
          Then User click on check box of SKU
          And User click on done button
          Then User click on the first check box of SKU
          Then User click on Edit par level
          And User click on Edit par level close icon
          Then User click on Remove from inventory list icon
          And User click on Remove from inventory list close icon
          Then User click on clear icon
          
     Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
         