Feature: Verify Supplier Dashboard listing page  

Scenario Outline: Verify the Supplier Dashboard listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Dashboard side navigation list menubar
          Then User clickon welcome back icon is displayed
          Then User clickon total orders icon is dispalyed
          Then User clickon number of orders icon is dispalyed
          Then User clickon delivery orders icon is dispalyed
          Then User click on this month in total order page
          Then User click on this week in total order page
          Then User click on this month in total order page
          Then User click on this quarter in total order page
          Then User click on this month in total order page
          Then User click on YTD in total order page
          Then User click on By Team in dashboard page
          Then User click on show all in dashboard page
          Then User click on outstanding invoice
          Then User click on scroll down 
          Then User click on all categories
          Then User click on this month in sales by category
          Then User click on this week in sales by category
          Then User click on this month in sales by category
          Then User click on this quarter in sales by category
          Then User click on this month in sales by category
          Then User click on YTD in sales by category
          Then User click on this month in best performing customers
          Then User click on this week in best performing customers
          Then User click on this month in best performing customers
          Then User click on this quarter in best performing customer
          Then User click on this month in best performing customers
          Then User click on YTD in best performing customer
          Then User click on view all in best performing customer
          Then User click on Dashboard side navigation list menubar
           Then User click on scroll down
          Then User click on over fourteen days in slipping away
          Then User click on over thirdty days in slipping away
          Then User click on over fourteen days in slipping away
          Then User click on over sixty days in slipping away
          Then User click on over fourteen days in slipping away
          Then User click on over ninety days in slipping away
          Then User click on view all in slipping away
          Then User click on Dashboard side navigation list menubar 
            
          
           
          Examples:
         |username                              ||password    |
         |supplierautomated2@gmail.com          ||!123456Zm   |