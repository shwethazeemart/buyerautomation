Feature: Verify Buyer Inventory SKU lisen page and test all the page
@Smoke         
Scenario Outline: Verify the Inventory SKU lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User clicks on outlet 
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon 
          And User click on Export download button
          Then User click on Add SKU
          And User Select dropdown list name 
          Then User click on check box of SKU
          And User click on done button
          Then User click on the first check box of SKU
          Then User click on Edit par level
          And User click on Edit par level close icon
          Then User click on Remove from inventory list icon
          Then User close on Remove from inventory list Delete icon
          Then User click on Add SKU
          And User Select dropdown list name   
          Then User click on check box of SKU
          And User click on done button
          Then User click on consumption report
          Then User click on backbutton of consumption report
          
     @dev     
     Examples:
         |username                        |  |password    | 
         |buyerautomated3@gmail.com       |  |!123456Zm   |
         
              
     @naren    
     Examples:
         |username                        |  |password    | 
         |buyerautomated3@gmail.com       |  |!123456Zm   |
        
         