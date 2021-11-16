Feature: Verify Buyer New Order page and test all the page


Scenario Outline: Verify the New Order page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page "<outletname>"
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         Then User Clicks second time increase the order button
         Then User Clicks third time increase the order button 
         Then User Clicks fourth time increase the order button
         Then User Clicks fifth time increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And  User Clicks Review order
         And User Clicks Place Order
         And User clicks the Back to Orders button 
         Then User click the newly created order
         Then User Copy the particular order number in newly created 
         Then User clicks backbutton orders
         Then User paste the newly created order number in Search order ID
         And User Clicks Search button in the orders page
         Then It should display the particular order ID "<order ID>"
         
          
        @dev 
        Examples:
             |Order ID       ||username                   | |password    | |outletname      |
             |202110270051   ||buyerautomated3@gmail.com  | |!123456Zm   | |velumasala2020  |
          
          
        @naren  
        Examples:
             |Order ID       ||username                   | |password    | |outletname      |
             |202110270051   ||buyerautomated1@gmail.com  | |!123456Zm   | |velumasala2020  |
             
             
   
   Scenario Outline: Verify the New Order outstanding options page of Buyer panel   
 
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on  in the supplier page "<outletname>"
         Then User click on ok button of pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page "<outletnameone>"
         Then User click on ok button of pop message
         Then User click on close icon first pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page "<outletnametwo>"
         Then User click on ok button of pop message
         Then User click on close icon first pop message
           
         
           @dev
           Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com|  |!123456Zm   |   

             |username                     |  |password    |  |outletname      | |outletnameone   |   |outletnametwo      |
             |buyerautomated3@gmail.com    |  |!123456Zm   |  |velumasalathree | |velumasalasix   |   |velumasalatwofifty |
    
    
           @naren
           Examples:
             |username                     |  |password    |  |outletname      | |outletnameone   |   |outletnametwo      |
             |buyerautomated1@gmail.com    |  |!123456Zm   |  |velumasalathree | |velumasalasix   |   |velumasalatwofifty |
    

 

