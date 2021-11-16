Feature: Verify Buyer Inventory Record adjustment lisen page and test all the page

Scenario Outline: Verify the Inventory Record adjustment page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          Then User is Clicks in velu masala2020 outlet
          And User are Clicks in Lists
          Then User are Clicks the sairam list
          Then User are Click Record adjusment button
          When User is Select Reason drodown value of found 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notes>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason second drodown value of missing 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantityone>"
          Then User are type Notes in the Notes field"<Notesone>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason thirdtime drodown value of Promotion 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantitytwo>"
          Then User are type Notes in the Notes field"<Notestwo>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason fourthtime drodown value of Transfer in 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notesthree>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason fifthtime drodown value of Transfer out 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notesfour>"
          Then User are Clicks final Save button 
         
         
         
          
    Examples:
         |username                            |  |password    ||Quantity||Notes              ||Quantityone||Notesone         ||Quantitytwo||Notestwo         ||Notesthree|     |Notesfour|       |Notesfive|
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||   10   ||eswaranvelufound10  ||10     |   |velumanimissing10||10         ||velupromotions10||velutrnasferin10||velutransferout10||veluwastage10|
         
          
          