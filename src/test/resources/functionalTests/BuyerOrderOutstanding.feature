Feature: Verify Buyer New Order Outstanding page and test all the page

Scenario Outline: Verify the New Order outstanding options page of Buyer panel   

         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar 
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on  in the supplier page outletname
         Then User click on ok button of pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page outletnameone
         Then User click on ok button of pop message outletone
         Then User click on close icon first pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page outletnametwo
         Then User click on ok button of pop message outletone
         Then User click on close icon first pop message
           
         
           @dev
           Examples:
             |username                         |  |password    | 
             |velumanieswaran2020@gmail.com    |  |!123456Zm   |  
    
    

  @naren
  Examples:
             |username                     |  |password    | 
             |buyerautomated3@gmail.com    |  |!123456Zm   | 
    
           