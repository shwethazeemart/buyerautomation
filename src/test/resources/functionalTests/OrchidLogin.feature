Feature: verify login and the Orchid page

 Scenario Outline: Verify the Orchid page in view outlets Admin panel    
  
          Given User is navigateTo LogInPage
          When User is  Clicks in Home link button
          When User is Clicks POP Message in the Home page
          When User is Clicks in online booking link 
          And User is enter exact Email Address in the Email Address field"<Email>"
          Then User is enter full name of the playerone"<playerone>"
          And User is enter membership number one"<membershipnumberone>"
          Then User is enter mobilenumber"<mobilenumber>" 
          And Users is Clicks date in calendar field
          Then User is Clicks Radio button in booking type
          And User is enter prepare tee time"<teetime>"
          Then User is enter player name two"<playernametwo>"
          And User is enter membership number two"<membershipnumbertwo>"
          Then User is enter player name three"<playernamethree>"
          And User is enter membership number three"<membershipnumberthree>"
          Then User is enter player name four"<playernamefour>" 
          And User is enter membership number four"<membershipnumberfour>" 
          Then User is Clicks the next button
          Then It should display orchid another page
          

    Examples:
        |Email                ||playerone      ||membershipnumberone||mobilenumber||teetime||playernametwo  ||membershipnumbertwo||playernamethree||membershipnumberthree||playernamefour     ||membershipnumberfour|
        |velumani@zeemart.asia||velumanieswaran||1234567            ||+65123456789||12.00  ||eswarannagappan||456789             ||logambaleswaran||789456               ||vekatammalarthanari| |123789             | 

