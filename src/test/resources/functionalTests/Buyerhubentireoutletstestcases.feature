Feature: Verify Buyerhub Outlets Entire testcases

Scenario Outline: Verify the Outlets page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Clicks on the view orders
           
    Examples: 
      | username                      | | password  |
      | velumanieswaran2020@gmail.com | |!123456Zm   |
      
      
Scenario Outline: Verify the Outlets manage details page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage details
          And User clear on outlet email
          Then User enter the new email id"<Email>"
          Then User click on first manage subscription
          And User click on manage subscription
          Then User click on manage subscription close icon
          Then User click on save button
           
    Examples: 
      | username                      | | password   ||Email                      |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||lingeshsabari2009@gmail.com| 
      
      
Scenario Outline: Verify the Outlets settings page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage settings
          And User click on search box
          Then User Enter the name in search box"<Name>"
          And User click on Add member button
          Then User click on select user search box
          Then User click on check box of arul oli
          Then User click on outside section
          And User click on Add button
          Then User Clear on weekly email
          And User enter on weekly email"<WeeklyEmail>"
          Then User select dropdown list in wednesday
          Then User clear the Email list
          And User enter on Email list"<Email>"
          Then User clear outlet email
          And User enter the outletemail"<outletemail>"
          Then User click on save button finally
           
    Examples: 
      | username                      | | password   ||Name       | |WeeklyEmail          ||Email                      ||outletemail                  |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||velu mani2 | |velumani@zeemart.asia||lingeshsabari2009@gmail.com||velumanieswaran2020@gmail.com| 
      
      
  
Scenario Outline: Verify the Outlets view suppliers page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Click on view market list
          And User click on name search box
          Then User Enter on name in name searchbox field"<name>"
          And User click on check box of product code
          Then User Click on Edit tags
          Then User click on Edit tags close icon
          And User click on Delete button
          Then User click on Delete button close icon
          Then User click on check box clear button
          And User click on options icon
          Then User click on copy to another outlet
          And User click on select all icon
          Then User click on ok button
          And User click on options icon
          Then User click on Download marketlist
           
    Examples: 
      | username                      | | password   ||name      |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||100pipers|      
                 