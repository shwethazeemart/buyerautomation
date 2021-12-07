  Feature: Verify Buyer Inventory Outlets lisen page and test all the page

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
          And User click on new list "<outletnameone>"
          Then User click on new list close icon
          And User click on starter plan "<outletnametwo>"
          Then User click on starter plan close icon
          Then User click on search outlets
          And User send outlet name in search icon"<outletname>"
          Then User click on status icon
          And User click on checkbox of Has items below par
          Then User click on uncheckbox of Has items below par
          Then User click on checkbox of last count 
          Then User click on uncheckbox of last count
          Then User click on outletname
          Then User click vertically scroll up in the page
          And User return to outlet page
           
          @dev
          Examples:
         |username                       |  |password    ||outletname     ||outletnameone | |outletnametwo |
         |velumanieswaran2020@gmail.com  |  |!123456Zm   ||velu masala2020||sstmasala     | |sstmasala2020 |
         
           @naren
          Examples:
         |username                       |  |password    ||outletname     ||outletnameone | |outletnametwo |
         |buyerautomated3@gmail.com      |  |!123456Zm   ||velu masala2020||sstmasala     | |sstmasala2020 |
         
         