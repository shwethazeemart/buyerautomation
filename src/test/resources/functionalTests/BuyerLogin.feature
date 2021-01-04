Feature: verify Orchid page and the View outlets page

Scenario Outline: Verify the Orchid page in view outlets Admin panel    
  
          Given User are available in login page
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


Scenario Outline: Verify the Suppliers page in view outlets Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>" 
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar 
          Then User are Clicks Suppliers icon in the suppliers page
          And User is Enter name supplier search box in the suppliers page"<suppliername>"
          Then User are Clicks Search button in the suppliers page
          And User is Clicks Actions dropdown in the suppliers page
          Then User are Clicks View outlets in the dropdown field
          And User is Clicks Link outlets in the venkat masala page
          When User are Select outlet in the autocomplete textbox
          Then User is Enter the custom outletID"<outletid>"
          And User are Enter custom billingID"<billingid>" 
          Then User is Clicks the checkbox in default settings
          And User are Enter Email in the Email address field"<Email>"
          Then User is Enter mobile number in the SMS field"<Mobilenumbersms>"  
          And User are Enter mobile number whatsapp field"<mobilenumberwhatsapp>"
          Then User is Enter amount in minium order field"<minimumamount>"
          And User are Clicks checkbox in block order field 
          Then User is Click Radio button in apply delivery fees
          And User is Clicks the increase counted Quantity of apply fees
          And User are Enter the value in increment and decrement field
          Then User is First time Clicks in increment field
          When User is Select orders in the dropdown field
          Then User are Clicks monday checkbox
          And User is Enter monday cutoff time"<mondaycutofftime>"
          Then User is Clicks monday time field
          And User are Clicks POP message of set in monday
          Then User are Clicks Tuesday checkbox
          And User is Enter tuesday cutoff time"<tuesdaycutofftime>"
          Then User are Clicks tuesday time field
          And User is Clicks POP message of set in tuesday
          Then User are Enter Vehicle number in the vehicle number field"<vehiclenumber>"
          And User is Enter Recipient mail in the recipient field"<recipientEmail>"
          When User are Select payment in the payment terms dropdown
          Then User is Enter name in our sales person field"<salespersonname>"
          And User are Enter phone number in our sales person field"<phonenumnber>"
          Then User is Enter message in the notes field"<notesfield>"
          And User are Clicks save changes button 
          Then It should display in the Buyer outlets page
          
    Examples:
         |username         |  |password    ||suppliername ||outletid  ||billingid ||Email                 ||mobilenumbersms ||mobilenumberwhatsapp||minimumamount||mondaycutofftime||tuesdaycutofftime||vehiclenumber||recipientEmail   ||salespersonname| |phonenumber   ||notesfield                              |
         |guna@zeemart.asia|  |2p$2s?QU    ||VENKAT MASALA||CGP_12345 ||ZM-456    ||velumani@zeemart.asia ||+65123456789    ||+65123456789        ||100          ||1               ||1                ||SIN-4178   ||velumani@zeemart.asia||velumani     | |+65123456789 ||In our company sales only masala product|










Scenario Outline: Verify the Users page new admin user in Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>" 
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel users in the side navigation menubar 
          Then User are Clicks in Add New user button 
          And User are Clicks in New Admin user
          When User are Select outlet in the autocomplete textbox
          When User is Select supplier in the autocomplete textbox
          Then User are Enter First name in the new admin user page"<firstname>" 
          And User is Enter Last name in the new admin user page"<lastname>"
          Then User are Enter Job title in the new admin user page"<jobtitle>"
          And User is Enter Email in the new admin user page"<Email>"
          Then User are clear the mobile phone field in the new admin user page
          And User is Enter mobile number in the new admin user page"<mobilenumber>"
          Then User are Upload profile photo in the new admin user page
          When User is Select language in the dropdown field of new admin user page
          When User are Select market in the dropdown field of new admin user page
          Then User is Clicks Singapore market in new admin user page
          When User is Select role in the dropdown field of new admin user page
          Then User is Clicks manage orders role in new admin user page
          Then User is Clicks save changes button in the new admin user page
          Then It should display in the Admins page
          
    Examples:
         |username         |  |password    ||firstname      ||lastname ||jobtitle ||Email                     ||mobilenumber|
         |guna@zeemart.asia|  |2p$2s?QU    ||lingeshsabari  ||velumani ||ATZ test ||velumani20101978@gmail.com||+65123456789|




Scenario Outline: Verify the Suppliers page new supplier user in Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>" 
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin panel users in the side navigation menubar 
          Then User is Clicks in Add New user button 
          And User are Clicks in New supplier user
          When User are Select supplier in the supplier dropdown
          Then User is Enter First name in the new supplier user page"<firstname>"
          And User are Enter Last name in the new supplier user page"<lastname>"
          Then User is Enter Email in the new supplier user page"<Email>"
          And User are Clear mobile phone field in the new supplier user page
          Then User is Enter mobile number in the new supplier user page"<mobilenumber>"
          And User are Enter job title in the new supplier user page"<jobtitle>"
          Then User is Upload profile photo in the new supplier user page
          And User are Clicks Save changes button in the new supplier user page
          Then It should display in the Users Suppliers page
          
    Examples:
         |username         |  |password    ||firstname      ||lastname ||Email                     ||mobilenumber   ||jobtitle |
         |guna@zeemart.asia|  |2p$2s?QU    ||lingeshsabari  ||velumani ||velumani20101978@gmail.com||+65123456789   ||ATZ test |




 






Scenario Outline: Verify the Suppliers page in Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Suppliers in the side navigation menubar 
          Then User is Clicks in New Supplier button 
          When User is Select Company market in dropdown
          Then User is Enter Company name in the company name field"<companyname>"
          And User is Enter Trading name in the Trading name field"<tradingname>"
          Then User is Enter Company register number"<registernumber>"
          And User are Enter Post code in address field"<postcode>"
          Then User is Enter Address line one in the address field"<addressline1>"
          And User are Enter Address line second in the address field"<addressline2>"
          Then User is Upload image in the logo field
          And User are Enter Supplier Email in the supplier Email field"<supplierEmail>"
          Then User is Clear Supplier phone in the supplier phone field
          And User are Enter Supplier phone in the supplier phone field"<supplierphone>"
          Then User is Enter Short description in the short description field"<shortdescription>"
          And User are Enter Long description in the long description filed"<longdescription>"
          When User is Select company Time zone in the dropdown field
          Then User are Enter GST in the pricing field"<GSTvalue>"
          And User is Clicks checkbox of include inventory data
          Then User are Clicks checkbox of allow negative inventory
          And User is Enter Email send report of item"<reportEmail>"
          Then User are Clicks checkbox immediately in the Report frequency field
          And User is Clicks Checkbox daily at in the Report frequency field
          Then User are Clicks textbox daily at in the Report frequency field
          And User is Clicks set in the POP message in the Negative Report frequency field
          Then User are Clicks  checkbox weekly on in the Report frequency field
          When User is Select day in the day field dropdown
          Then User are Clicks textbox day field in the Report frequency field
          And User is Clicks set in the POP message
          Then User are Enter Email Upcoming delivery field"<upcomingEmail>"
          Then User is Clicks check box of daily at
          And User is Clicks check box of Weekly on
          When User are Select day in daydropdown field 
          Then User is Clicks Text box in the day field
          And User are Clicks set in the POP message in report frequency field
          Then User is Clicks check box of Enable supplier payments
          And User are Clicks manual payment Radio button 
          Then User is Clear the Percentage field
          And User are Enter Percentage value in the percentage field"<percentage>"
          Then User is Clear Fixed fees field
          And User are Enter value of Fixed fees field"<fixedfees>" 
          Then User is Enter Email supplier activity field"<activityEmail>"
          And User are Clicks savechanges button
          Then It should display in the supplier home page field
          
    Examples:
         |username         |  |password    ||companyname    ||tradingname   ||registernumber  ||postcode ||addressline1             ||addressline2 ||supplierEmail              ||supplierphone||shortdescription  ||longdescription                                     ||GSTvalue||reportEmail                  ||upcomingEmail              ||percentage||fixedfees||activityEmail              |
         |guna@zeemart.asia|  |2p$2s?QU    ||VENKAT MASALA  ||Masala product||1234567         ||638312   ||261,madheswarankoilstreet||Singapore    ||lingeshsabari2009@gmail.com||+65123456789 ||Masala distributor||Venkat masala company manufacture only masala product||7       ||velumanieswaran2020@gmail.com||lingeshsabari2009@gmail.com||2         ||100      ||lingeshsabari2009@gmail.com|




 



Scenario Outline: Verify the Users page of New Buyer user in Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Users in the side navigation menubar 
          Then User is Clicks in Add new user dropdown
          And User are Clicks in New Buyer user 
          When User is Select Company in autocomplete text box
          When User is Select Outlet in autocomplete text box
          Then User is Enter First name in the First name field"<firstname>"
          And User is Enter Last name in the Last name field"<lastname>"
          Then User is Enter Job title"<jobtitle>"
          And User are Enter Email in the Email field"<Email>"
          Then User is Clicks checkbox of send Email notification
          And User are Clear Mobile field
          Then User is Enter Mobile number in the mobile field"<mobilenumber>"
          And User are Upload Profile photo in the Profile field
          When User are Select Permissions in the Permissions field
          Then User is Clicks Save changes button
          And User is Clicks Buyers icon
          Then User Enter the Email in the Email field<Emailfield>"
          And User are Clicks serach button
          Then It should display the particular User in Buyers page
          
          
    Examples:
         |username         |  |password    ||firstname ||lastname ||jobtitle  ||Email                     ||mobilenumber||Emailfield                |
         |guna@zeemart.asia|  |2p$2s?QU    ||velumani  ||eswaran  ||ATZ       ||velumani20101978@gmail.com||+6512345678 ||velumani20101978@gmail.com|


    






Scenario Outline: Verify the Buyers outlets page of Admin panel   
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          And User Clicks on Admin Buyers in the side navigation menubar 
          Then User is Clicks in Add new by dropdown
          And User are Clicks in New Buyer 
          Then User User are Select Company in the autocomplete text box
          Then User is Enter Outlet name in the Outlet field"<outletname>"
          And User are Enter Post code"<postcode>"
          Then User is Enter Address Line1"<addressline1>"
          And User are Enter Address Line2"<addressline2>"
          Then User is Clicks Browse button and upload the image
          And User are Enter outlet Email"<outletEmail>"
          Then User is Clear the Mobile number field
          And User are Enter the Mobile number"<mobilenumber>"
          When User are Select Type of business in the select dropdown
          Then User is Clicks checkbox of American type of cuisine
          And User are Clicks checkbox of Bakery type of cuisine
          Then User is Clicks checkbox of BBQ type of cuisine
          And User are Clicks checkbox of Peranakan other cuisine type 
          And User is Clicks checkbox of Vegetarian other cuisine type
          Then User are Clicks checkbox of Halal other features
          And  User are Clicks checkbox of Vegetarian-friendly other features
          Then User is Enter the name in the Tag field
          And User is Clicks Save outlet only button
          Then User is Clicks outlets icon
          And User Enter the outlet in serach outlet box"<outlet>"
          Then User is Clicks serach button
          Then It should display the particular outlet in outlets page
          
          
    Examples:
         |username         |  |password    ||outletname     ||postcode ||addressline1         ||addressline2||outletEmail                 ||mobilenumber||outlet       |
         |guna@zeemart.asia|  |2p$2s?QU    ||venkatmasala250||638327   ||madheswarankoilstreet||singapore   ||lingeshsabari2009@gmail.com ||+6512345679 ||venkatmasal250|




Scenario Outline: Verify the Invoice Process page of Admin panel 
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          And User Clicks on Admin Invoices in the side navigation menubar 
          Then User is Clicks in Sort by dropdown
          And User are Clicks in Newest first
          Then User is Clicks the Zeewebteseroutlet of process button
          Then User is Enter Order number in the Order number field"<ordernumber>"
          And User are Clicks Use data button
          Then User is Clicks Yes processed POPUP message
          And User are Enter Invoice number in the invoice number field"<invoicenumber>"
          Then User is Clicks validate button
          When User are Select date in the invoice date field
          When User is Select payment terms in payment terms dropdown
          And User are Clear the Delivery fee textbox
          Then User is Enter the value in delivery fee field textbox"<deliveryfees>"
          And User are Clicks publish  this invoice button
          Then It should display the particular invoice in invoices processed icon
          
    Examples:
         |username                     |  |password    ||ordernumber ||invoicenumber||deliveryfess|
         |guna@zeemart.asia            |  |2p$2s?QU    ||202012010002||INV-2020120  ||10          | 


    


Scenario Outline: Verify the Upload Invoice page of Admin panel 
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          And User Clicks on Admin Invoices in the side navigation menubar 
          Then User is Clicks in Upload invoice
          And User are Select outlet in the autocomplete text box
          Then User is Clicks the upload file
          Then User is Clicks the Upload button
          Then It should display the particular image in invoices Pending icon  
          
    Examples:
         |username                     |  |password    |
         |guna@zeemart.asia            |  |2p$2s?QU    |
         
 Scenario Outline: Verify the Inventory page of Buyer panel 
  
          Given User are available in login page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          Then User is Clicks in murugan idli shop outlet
          And User are Clicks in Lists
          Then User is Clicks in New list
          Then User are type the name in list name filed"<Listname>"
          Then User is Clicks in next button
          And User are Clicks the check box of parisian Baguette
          And User is Clicks Done button
          Then User are Clicks the lingesh list
          And  User is Clicks the New stock count
          Then User are Clicks the Start stock count button
          And User is Clicks the increase counted Quantity of parisian Baguetee
          Then User are Clicks the increase second time counted Quantity of parisian Baguetee
          Then User are Clicks Save button
          And User is Clicks Save stock count POPUP button
          Then User are Click Record adjusment button
          When User is Select Reason drodown value of found 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notes>"
          Then User are Clicks final Save button
          
           
          
    Examples:
         |username                     |  |password    ||Listname ||Quantity||Notes         |
         |kovalan@zeemart.asia         |  |!123456Zm   ||lingesh  ||   10   ||lingeshfound10|
    

  


Scenario Outline: Verify the Users page of Buyer panel 
  
          Given User are available in login page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is Clicks in Add new user button
          When User are Select Company in the textbox lists
          When User is Selct Outlet in the textbox lists
          And User enter the First name in the First name field"<First name>"
          Then User enter the Last name in the Last name field"<Last name>"
          And User enter Job title in the Job title field"<Job title>"
          Then User are enter Email in the Email field"<Email>"
          And User is Clicks checkbox
          Then User are enter Mobile phone in the Mobile phone field"<Mobile phone>"  
          And User is upload Profile photo in that field
          Then User is Select Owner in the permissions dropdown
          Then User is Clicks Save button 
          
    Examples:
         |username                     |  |password    ||First name||Last name||Job title||Email                          ||Mobile phone|
         |velumanieswaran2020@gmail.com|  |!123456Zm   ||lingesh   ||sabari   ||ATZ      ||lingeshsabari10072009@gmail.com||+6512345678|       
    


 
       
      
Scenario Outline: Verify the Invoices page of Buyer panel
         Given User are available in login page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Then User Clicks on Invoices in the side navigation menubar
         And User is Clicks in Uploads 
         Then User is Clicks in Upload invoice
         And User is Clicks on select outlet
         Then User is Clicks on upload the image
         And User is Clicks on Upload button
         Then It should display the particular image number and process button 
         
     Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com|  |!123456Zm   |
  
Scenario Outline: Verify the Invoices process page of Buyer panel 
          Given User is available in invoices process login page
          When User is enter Registered username"<username>"
          And User are enter Registered password"<password>"
          And User is click login button 
          And User is Clicks Invoices in the side navigation menubar
          Then User are Clicks in Uploads
          And User is Clicks in Process button
          Then User are Select supplier in the dropdown lists
          And User is set the invoice number"<invoicenumber>"
          Then User are Clicks in Validate button 
          And User is Select date in the calendar options
          Then User are Clicks the Order number in textbox 
          When User are Select the Order number in textbox lists
          And User is Clicks in Use data
          Then User are Click yes processed POP
          And User is Select the Payments terms in the dropdown lists
          Then User are Clicks the Publish this invoice
          Then It should display invoice in invoices page
          
         Examples:
         |invoicenumber|  |username                     |  |password    |
         |INV-20123456 |  |velumanieswaran2020@gmail.com|  |!123456Zm   |      
         
 
           









Scenario Outline: Verify the New recurring orders page of Buyer panel  
          Given User are available in login page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          When User is click login button 
          And User is Clicks Orders in the side navigation menubar
          When User in Clicks New order dropdown value
          When User Clicks New recurring orders in the dropdown value
          When User select outlet in the dropdown list
          When User select supplier in the dropdown list
          When User Clicks on deliver date in tuesday
          When User Clicks on deliver date in wednesday
          When User Clicks on checkbox Public holidays
          When User Clicks on Radio button of Never
          When User select contact person in the dropdown list
          When User Clicks on the Done button 
          When User Clicks on Add to order in the first product
          Then User Clicks on first time increase the order button in the first product
          Then User Clicks on second time increase the order button in the first product
          Then User Clicks on third time increase the order button in the first product 
          Then User Clicks on fourth time increase the order button in the first product
          Then User Clicks on fifth time increase the order button in the first product
          Then User Clicks on sixth time increase the order button in the first product
          Then User Clicks on Review Order button
          Then User Clicks on Save recurring order
          Then It should display the particular order in recurring orders page
          
          Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com|  |!123456Zm   |     
             
 
  

  Scenario Outline: Verify the Orders page of Buyer panel
         Given User are available in login page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
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
      

     


 