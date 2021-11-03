Feature: Verify Supplier Users listing page  

Scenario Outline: Verify the Supplier Users Listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Users side navigation list menubar
          Then User click on add new in users page
          Then User click on new user in users page
          Then User enter on first name in new user page"<firstname>"
          Then User enter on last name in new user page"<lastname>"
          Then User enter on job title in new user page"<jobtitle>"
          Then User enter on email in new user page"<email>"
          Then User clear on mobile number in new user page 
          Then User enter on mobile number in new user page"<mobilenumber>"
          Then User clear on whatsapp number in new user page
          Then User enter on whatsapp number in new user page"<whatsappnumber>"
          Then User on upload the profile photo in new user page
          Then User select on permission in dropdown field
          Then User click on save and exit button
          Then User click on second checkbox of users page
          Then User click on clear button in users page
          Then User click on Third checkbox of users page
          Then User click on disable button inusers page
          Then User click on yes disable popup message
          Then User click on Third checkbox of users page
          Then User click on enable button in users page
          Then User click on textbox in users page
          Then User enter on name textbox field"<name>"
          Then User click on search button in users page
          Then User click on actions dropdown field 
          Then User click on edit details icon in dropdown field
          Then User clear on jobtitle field in edit user page 
          Then User enter on job title in new user page"<jobtitle>"
          Then User click on save button in edit user page
          
          
         
 Examples:
         |username                              ||password    ||firstname||lastname||jobtitle||email                 ||mobilenumber||whatsappnumber||name     |
         |supplierautomated2@gmail.com          ||!123456Zm   ||shridi   ||sairam  ||AtoZtest||velusairam20102010@gmail.com||+65123456789||+65234567890  ||velu mani|