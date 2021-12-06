Feature: Verify buyer panel and test user list
@Smoke
Scenario Outline: Verify the Users page in view User list

					Given User are available in login page
          Given User is on Login Page
    			When User enters exact username "<username>"
    			When User enters exact password"<loginPassword>"
    			Then User click on login button
          When User Clicks Buyer hub users in side navigation menubar 
          Then User click search textbox
          And user enter the name in search textbox 
          Then List should be altered
          
Examples:
         |username|              |password |
         |kovalan@zeemart.asia|  |!1234567Zm|    
