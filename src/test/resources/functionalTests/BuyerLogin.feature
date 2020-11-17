Feature: Login Action of Buyer Module
 
  Scenario Outline: Verify the Orders page of Buyer panel
         Given User are available in login page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Given User is on Orders Page 
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         And User Clicks velu masala2020 in the Suppliers page 
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

          Examples:
             |Order ID        ||username                     |  |password    |
             |202011130001    ||velumanieswaran2020@gmail.com|  |!123456Zm   |     
             
             
             
  


          
      
      
      
      
      
      
      