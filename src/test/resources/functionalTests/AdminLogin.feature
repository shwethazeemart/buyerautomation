Feature: verify Admin panel and test all the page


Scenario Outline: Verify the Suppliers page in view outlets Admin hub    
  
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
         
          
    Examples:
         |username         |  |password    ||firstname      ||lastname ||jobtitle ||Email                     ||mobilenumber|
         |guna@zeemart.asia|  |2p$2s?QU    ||lingeshsabari  ||velumani ||ATZ test ||velumani20101978@gmail.com||+65123456789|



Scenario Outline: Verify the Suppliers Link to the Buyer company in Admin panel    
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Suppliers in the side navigation menubar 
          Then User clicks on the ABC PTE supplier actions
          And User clicks on the Buyers companies
          Then User clicks on the link to company
          And User are Select company in the autocomplete text box
          Then User enter the custom company id"<companyid>"
          And User clicks on the save settings
          
          
 Examples:
         |username         |  |password    ||companyid|
         |guna@zeemart.asia|  |2p$2s?QU    ||CGP123   |


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




Scenario Outline: Verify the Suppliers subscription page in Admin panel    
  
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
          And User is clicks the subscription plan of radio button
          Then User is enter subscription email notification"<enter email>"
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
         |username         |  |password    ||companyname    ||tradingname   ||registernumber  ||postcode ||addressline1             ||addressline2 ||supplierEmail              ||supplierphone||shortdescription  ||longdescription                                     ||enter email||GSTvalue||reportEmail                  ||upcomingEmail              ||percentage||fixedfees||activityEmail              |
         |guna@zeemart.asia|  |2p$2s?QU    ||VENKAT MASALA  ||Masala product||1234567         ||638312   ||261,madheswarankoilstreet||Singapore    ||lingeshsabari2009@gmail.com||+65123456789 ||Masala distributor||Venkat masala company manufacture only masala product||velumani@zeemart.asia||7       ||velumanieswaran2020@gmail.com||lingeshsabari2009@gmail.com||2         ||100      ||lingeshsabari2009@gmail.com|


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
          
          
    Examples:
         |username         |  |password    ||firstname ||lastname ||jobtitle  ||Email                     ||mobilenumber|               
         |guna@zeemart.asia|  |2p$2s?QU    ||velumani  ||eswaran  ||ATZ       ||velumani201978@gmail.com  ||+6512345678 |

  
   
Scenario Outline: Verify the Buyers outlets page of Admin panel   
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar 
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


Scenario Outline: Verify the Buyers outlets subscripiton page of Admin panel   
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar
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
          Then User are click on the sg government grant check box
          And User are click on the radio button Growth billed
          Then User are select dropdown of payment method
          Then User are select the calendar in the calendar field
          And User are click the radio button of Renew with same plan settings
          Then User enter email Send subscription-related notifications"<enter email>"
          And User click on the checkbox of Paying for invoice processing
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
          When User Clicks on Admin Users in the side navigation menubar
          Then User type and enter name in search box"<entername>"
          And User is clicks the search icon
          Then User is click the Action dropdown
          And User is click the Edit button
          Then User is Enter outlet name in autocomplete text box
          Then User is clicks savechanges button
          Then User is navigate to buyer panel
          When User enter exact username"<Buyerusername>"
          And User enter exact password"<Buyerpassword>"
          And User is click login button  
          Then User Clicks on Inventory in the side navigation menubar
          
  Examples:
         |username         |  |password    ||outletname      ||postcode ||addressline1         ||addressline2||outletEmail                 ||mobilenumber||outlet       ||entername      ||enter email|          |Buyerusername                ||Buyerpassword |
         |guna@zeemart.asia|  |2p$2s?QU    ||sstmasala20   ||638327   ||madheswarankoilstreet||singapore   ||lingeshsabari2009@gmail.com ||+6512345679 ||SST250       ||velu mani2     ||velumani@zeemart.asia||velumanieswaran2020@gmail.com||!123456Zm     |
