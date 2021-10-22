Feature: Verify Supplier Customers Location listing page  

Scenario Outline: Verify the Supplier customers location listing page
         Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Dashboard side navigation list menubar
          Then User checking welcome back icon is displayed
          Then User checking total orders icon is dispalyed
          Then User checking number of orders icon is dispalyed
          Then User checking delivery orders icon is dispalyed
          Then User click on this month in total order page
          Then User click on this week in total order page
          Then User click on this quarter in total order page
          Then User click on YTD in total order page
          Then User click on By Team in dashboard page
          Then User click on show all in dashboard page
          Then User click on outstanding invoice 
          Then User click on all categories
          Then User click on this month in sales by category
          Then User click on this week in sales by category
          Then User click on this quarter in sales by category
          Then User click on YTD in sales by category
          Then User click on this month in best performing customers
          Then User click on this week in best performing customers
          Then User click on this quarter in best performing customer
          Then User click on YTD in best performing customer
          Then User click on view all in best performing customer
          Then User click on Dashboard side navigation list menubar
          Then User click on over fourteen days in slipping away
          Then User click on over thirdty days in slipping away
          Then User click on over sixty days in slipping away
          Then User click on over ninety days in slipping away
          Then User click on view all in slipping away 
            
          
           
          Examples:
         |loginEmail                            |  |loginPassword    |
         |supplierautomated2@gmail.com          |  |!123456Zm        |