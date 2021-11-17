Feature: Verify Buyer Outlets listing page test

Scenario Outline: Verify the Outlets listing page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          Then User click on sst masala checkbox
          Then User click on make inactive
          Then User Enter in Disable text box "<confirm>"
          Then User click on yes make inactive button
          Then User click on sst masala checkbox
          Then User click on make active icon
          Then User click on sst masala checkbox
          Then User click on clear icon
          Then User click on Actions dropdown in velu masala
          Then User click on manage details in velu masala
          Then User click on back button of outlets icon
          Then User click on Actions dropdown in velu masala
          Then User click on manage setting in velu masala 
          Then User click on back button of outlets icon
          Then User click on Actions dropdown in velu masala
          Then User click on view suppliers in velu masala 
          Then User click on back button of outlets icon
          Then User enter the outlet name in text box "<outletname>"
           
    Examples:  
      | username                      | | password   ||confirm||outletname|
      | velumanieswaran2020@gmail.com | |!123456Zm   ||DISABLE||velu masala2020|