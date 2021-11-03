Feature: Verify Supplier Teams list page  

Scenario Outline: Verify the Supplier Teams List page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Users side navigation list menubar
          Then User click on teams icon
          Then User click on add new in users page
          Then User click on new team in users page
          Then User enter on team name in team page"<TeamName>"
          Then User click on next link to outlet
          Then User click on add new button
          Then User select on outlet in dropdown field
          Then User click on first dropdown list
          Then User click on save button in popup field
          Then User click on actions dropdown
          Then User click on go to outlet setting
          Then User click on Users side navigation list menubar
          Then User click on teams icon
          Then User click on actions dropdown teams field
          Then User click on edit details in actions filed
          Then User clear on team name field
          Then User enter on team name in team page"<TeamName>"
          Then User click on save button in team page
          
          
          
                 
          
 Examples:
         |username                              ||password    ||TeamName        |
         |supplierautomated2@gmail.com          ||!123456Zm   ||Saisabaritesting|