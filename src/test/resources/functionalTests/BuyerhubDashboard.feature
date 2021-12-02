Feature: Verify Buyer Dashboard lisen page and test all the page
@Smoke
Scenario Outline: Verify the Dashboard lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Dashboard in the side navigation menubar 
          And User click on New order icon
          Then User click on the supplier
          And User click on show favourites check box
          Then User click on show favourites uncheck box
          And User click on filter in order page 
          Then User click on Tags
          And User click on selectall
          Then User click on Apply button in order page
          And User click on Reset button in order page
          Then User click on outside of order page
          And User click on filter in order page
          And User click on categories
          And User click on selectall
          Then User click on Apply button in order page
          And User click on Reset button in order page
          Then User click on outside of order page
          And User click on filter in order page
          Then User click on cretifications
          Then User click on outside of order page
          And User click on Search box SKU name
          Then User enter sku in search box"<name>"
          Then User click on close icon in order page
          And User click on upload invoice icon
          Then User click on "<outletname>"
          And User click on upload image in drag and dorp filed
          Then User click on Done button in drag and drop filed
          And User select dropdown spending overview list "<outletname>"
          Then User click on YTD icon
          And User click on Last year icon
          Then User click on Past twelve week icon
          Then User click on view spending report icon
          Then User click on Dashboard side navigation menubar
          And User select dropdown top expenditures list "<outletname>"
          Then User click on SKU icon
          Then User click on category icon 
          And User click on supplier tab icon
          Then User click on This month icon
          And User click on This week icon
          Then User click on Last week icon
          And User click on Last month icon
          Then User click on view all spending by supplier
          
           Examples:
         |username                            |  |password    ||name     | |outletname  |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||100pipers| |velu masala |
         
        
       
          
          

