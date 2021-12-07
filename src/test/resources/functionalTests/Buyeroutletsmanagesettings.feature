Feature: Verify Buyer Outlets manage settings page and test all the page

 Scenario Outline: Verify the Outlets settings page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage settings
          And User click on search box
          Then User Enter the name in search box"<Name>"
          And User click on Add member button
          Then User click on select user search box
          Then User click on check box 
          Then User click on outside section
          And User click on Add button
          Then User Clear on weekly email
          And User enter on weekly email"<WeeklyEmail>"
          Then User select dropdown list in wednesday
          Then User clear the Email list
          And User enter on Email list"<Email>"
          Then User clear outlet email
          And User enter the outletemail"<outletemail>"
          Then User click on save button finally
          
    @dev       
    Examples: 
      | username                      | | password   ||Name       | |WeeklyEmail          ||Email                      ||outletemail                  |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||buyer      | |velumani@zeemart.asia||lingeshsabari2009@gmail.com||velumanieswaran2020@gmail.com| 
      
      
     @devSecond      
    Examples: 
      | username                      | | password   ||Name       | |WeeklyEmail          ||Email                      ||outletemail                  |
      | buyerautomated3@gmail.com     | |!123456Zm   ||buyer      | |velumani@zeemart.asia||lingeshsabari2009@gmail.com||velumanieswaran2020@gmail.com| 
      
      