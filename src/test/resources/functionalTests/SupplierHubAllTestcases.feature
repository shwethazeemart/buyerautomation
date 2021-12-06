Feature: Verify Supplier Hub All Testcases  

Scenario Outline: Verify the Supplier Dashboard listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Dashboard side navigation list menubar
          Then User clickon welcome back icon is displayed
          Then User clickon total orders icon is dispalyed
          Then User clickon number of orders icon is dispalyed
          Then User clickon delivery orders icon is dispalyed
          Then User click on this month in total order page
          Then User click on this week in total order page
          Then User click on this month in total order page
          Then User click on this quarter in total order page
          Then User click on this month in total order page
          Then User click on YTD in total order page
          Then User click on By Team in dashboard page
          Then User click on show all in dashboard page
          Then User click on outstanding invoice
          Then User click on scroll down 
          Then User click on all categories
          Then User click on this month in sales by category
          Then User click on this week in sales by category
          Then User click on this month in sales by category
          Then User click on this quarter in sales by category
          Then User click on this month in sales by category
          Then User click on YTD in sales by category
          Then User click on this month in best performing customers
          Then User click on this week in best performing customers
          Then User click on this month in best performing customers
          Then User click on this quarter in best performing customer
          Then User click on this month in best performing customers
          Then User click on YTD in best performing customer
          Then User click on view all in best performing customer
          Then User click on Dashboard side navigation list menubar
           Then User click on scroll down
          Then User click on over fourteen days in slipping away
          Then User click on over thirdty days in slipping away
          Then User click on over fourteen days in slipping away
          Then User click on over sixty days in slipping away
          Then User click on over fourteen days in slipping away
          Then User click on over ninety days in slipping away
          Then User click on view all in slipping away
          Then User click on Dashboard side navigation list menubar 
            
          
           
          Examples:
         |username                              ||password    |
         |supplierautomated2@gmail.com          ||!123456Zm   |
         
         
Scenario Outline: Verify the Supplier Orders listing page
          Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Orders side navigation list menubar
          Then User click on download button in orders page
          Then User click on download pick list button
          Then User select date on download pick list
          Then User select dropdown list of outlets
          Then User click on download button of downoad pick list
          Then User click on close icon of download pick list
          Then User click on order number search box
          Then User enter the order number in searchbox"<ordernumber>"
          Then User click on search icon in order page
          Then User clear the order number search box
          Then User select delivery location dropdown
          Then User click on search icon in order page
          Then User select order date range in order page
          Then User click on search icon in order page
          Then User select delivery date range in order page
          Then User click on search icon in order page
          Then User click on filter icon in order page
          Then User click on orders status
          Then User click on select all option
          Then User click on apply button in supplier order page
          Then User click on filter icon in order page
          Then User click on reset button
          Then User click on filter icon in order page
          Then User click on deliver status
          Then User click on select all option
          Then User click on apply button in supplier order page
          Then User click on filter icon in order page
          Then User click on reset button
          Then User click on filter icon in order page
          Then User click on invoicing status
          Then User click on select all option
          Then User click on apply button in supplier order page
          Then User click on filter icon in order page
          Then User click on reset button
          Then User click on filter icon in order page
          Then User click on acknowledgement status
          Then User click on select all option
          Then User click on apply button in supplier order page
          Then User click on filter icon in order page
          Then User click on reset button
          Then User click on checkbox of second order in order page
          Then User click on clear option in order page
          Then User click on checkbox of second order in order page
          Then User click on mark as drodown icon
          Then User click on acknowledged icon
          Then User click on ok button of popup message
          Then User click on checkbox of second order in order page
          Then User click on mark as drodown icon
          Then User click on shipped icon 
          Then User click on checkbox of third order in order page
          Then User click on mark as drodown icon
          Then User click on partially shipped 
          Then User click on checkbox of second order in order page
          Then User click on download csv button
          Then User click on download csv detailed button
          Then User click on actions dropdown in first order in order page
          Then User click on void order
          Then User click on requested by buyer
          Then User click on void button
          
          
          Examples:
         |username                              ||password    ||ordernumber |
         |supplierautomated2@gmail.com          ||!123456Zm   ||202110220001|    
         
         
         
Scenario Outline: Verify the Supplier Orders e-invoice listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Orders side navigation list menubar
          Then User click on first order in order list page
          Then User click on acknowledge button in first order
          Then User click on ok button of popmessage
          Then User click on create einvoice icon in first order
          Then User click on email field in einvoice page
          Then User enter the email einvoice field"<emailfield>" 
          Then User click on delivery field in einvoice page
          Then User enter delivery fees in einvoice page"<deliveryfees>" 
          Then User click on save and issue button in einvoice page
          Then User click on Orders side navigation list menubar
          Then User click on first order in order list page
          Then User click on options dropdown in first order
          Then User click on download packing slip in first order
          Then User click on options dropdown in first order
          Then User click on mark as shipped in first order
          Then User click on back order button in first order
          Then User click on fifth order in order list page
          Then User click on options dropdown in first order
          Then User click on partially shipped in fifth order list
          Then User click on back order button in first order
          Then User click on sixth order in order list page 
          Then User click on options dropdown in first order
          Then User click on void order in sixth order
          Then User click on requested by buyer in sixth order
          Then User click on void order button in sixth order
          Then User click on first order in order list page
          Then User click on options dropdown in first order
          Then User click on Download PDF in first order page
           
          
          
          
          Examples:
         |username                              ||password    ||emailfield           ||deliveryfess|
         |supplierautomated2@gmail.com          ||!123456Zm   ||velumani@zeemart.asia||10          |
         
         
Scenario Outline: Verify the Supplier Invoices listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Invoices side navigation list menubar
          Then User click new invoice button
          Then User select location in delivery dropdown
          Then User select sakthimasala in the drodown list
          Then User enter email in bill to field"<email>"
          Then User enter order number in order number field"<ordernumber>"
          Then User select payment terms in dropdown list
          Then User enter sales person name in name field"<personname>" 
          Then User enter mobile number in sales person field"<mobilenumber>"
          Then User click on add sku button
          Then User click on enter sku name in dropdown field
          Then User click on sakthimasala sku in dropdown field
          Then User clear the quantity field
          Then User enter the quantity value in that field"<quantityvalue>"
          Then User clear the unit price field
          Then User enter the unit price value in that field"<unitprice>"
          Then User clear delivery fees field
          Then User click on final save and issue button
          Then User click on first invoice checkbox in list of invoices page
          Then User click on clear button in lisf of invoices page
          Then User click on first invoice checkbox in list of invoices page
          Then User click on mark as paid button
          Then User click on yes mark as paid in popup message
          Then User click on first invoice checkbox in list of invoices page
          Then User click on export xero in first invoice check box
          Then User click on yes proceed popup message
          Then User click actions dropdown of third invoice in invoices list page
          Then User click void actions dropdown of third invoice in invoices list page
          Then User click on reason in popup message
          Then User enter some reason in popup message"<reason>"
          Then User click on void button in popup message
          Then User click actions dropdown of third invoice in invoices list page
          Then User click on duplicate in action dropdown field
          Then User click on finally save and issue button of duplicate
          Then User click on filter button in invoices page
          Then User click on deliver to link in invoices page 
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on invoice status link in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on payment status in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on export status in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page 
          Then User select due date in dropdown list
          Then User click on apply button in invoices page
          
    
          
          
          
          Examples:
         |username                              ||password    ||email                ||ordernumber ||personname||mobilenumber||quantityvalue||unitprice||reason                          |
         |supplierautomated2@gmail.com          ||!123456Zm   ||velumani@zeemart.asia||202110270048||velu      ||65123456789 ||10           ||18       ||already available in stock count|
         
         
Scenario Outline: Verify the Supplier Invoices Add Credit Note page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Invoices side navigation list menubar
          Then User click on first invoice in the invoices list page
          Then User click on mark as paid button in that invoice page
          Then User click on yes mark as paid in popup message in the invoice page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on add credit note in the invoice page 
          Then User click on quantity field in credit note page
          Then User clear on quantity field in credit note page
          Then User enter on value in quantity field"<quantityvalue>"
          Then User click on scroll down in credit note page
          Then User click on save and issue button in credit note page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on duplicate options dropdown field
          Then User click on scroll down in duplicate page
          Then User click on save and issue button in duplicate page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on void link in invoice page
          Then User click on reason in invoice field popup message
          Then User enter on reason in invoice field popup message"<reason>"
          Then User click on void button in popup message
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on download DO in options dropdown field
    
    
     Examples:
         |username                              ||password    |quantityvalue||reason         |
         |supplierautomated2@gmail.com          ||!123456Zm   |1            ||stock available|
         
         
        
Scenario Outline: Verify the Supplier Payments Plans list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Payments side navigation list menubar
          Then User click on payment plans icon
          Then User select failed payment status in dropdown lists
          Then User select unpaid payment status in dropdown lists
          Then User select paid payment status in dropdown lists
          Then User click on paid status company
          Then User click on issued bill amount
          Then User click on Bill issued invoice
          
          
          
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |
         
         
         
        

Scenario Outline: Verify the Supplier Payments Transaction list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Payments side navigation list menubar
          Then User click on transaction icon
          Then User set date from calendar in transaction page
          Then User click on search button in transaction page
          Then User click on Export button in transaction page
          Then User click on first customer in transaction page
          Then User click on back button payments
          
          
          
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |
         
         
         
         
Scenario Outline: Verify the Supplier customers location listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Customers side navigation list menubar
          Then User enter name in search box sakthimasala "<name>" 
          Then User click on checkbox in location page
          Then User click on apply outlet setting button
          Then User select on dropdown value of sakthimasala
          Then User click on select all button
          Then User click on apply button
          Then User click on checkbox in location page
          Then User click on clear button in location page 
          Then User click on actions dropdown in location page
          Then User click on Manage settings in location page
          Then User click on customers backbutton 
          Then User click on actions dropdown in location page
          Then User click on Manage market list in location page
          Then User click on Customers backbutton in manage market page
          Then User click on Default settings in location page
          Then User click on Customers backbutton in default settings page
          Then User click on New customers in location page
          Then User click on customers backbutton in new customers page
           

         Examples:
         |username                              ||password    ||name           |
         |supplierautomated2@gmail.com          ||!123456Zm   ||Sakthimasala200|  
         
         
         
         
 Scenario Outline: Verify the Supplier customers Company list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Customers side navigation list menubar
          Then User click on companies icon
          Then User click on new customer
          Then User enter company registration number in textbox"<UENNumber>"
          Then User click on continue button
          Then User enter the company name in textbox"<CompanyName>"
          Then User select country in dropdown list
          Then User enter on postcode in textbox"<PostCode>"
          Then User enter on address line one in textbox"<AddressLineOne>"
          Then User enter on address line two in textbox"<AddressLineTwo>"
          Then User enter on company email in textbox"<CompanyEmail>"
          Then User click on checkbox in same company address
          Then User click on save button in company page
          
       
          
   Examples:
         |username                      |  |password   ||UENNumber||CompanyName ||PostCode||AddressLineOne           ||AddressLineTwo||CompanyEmail         |
         |supplierautomated2@gmail.com  |  |!123456Zm  ||UEN-2021  ||saisairammasala||638312  ||19,Murugan temple street ||Singapore     ||velusai2032@gmail.com|
 
 
 
Scenario Outline: Verify the Supplier Company Settings list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on user account icon
          Then User click on company settings in user account page
          Then User click on details in company settings
          Then User click on payments in company settings
          Then User click on invoicing in company settings
          Then User click on integration in company settings
          Then User click on subscription in company settings
          Then User click on view priceing options in subscription

                 
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |
         
         
    
Scenario Outline: Verify the Supplier Catalogue list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Catalogue side navigation list menubar
          Then User click on checkbox in catalogue list
          Then User click on clear icon in catalogue list
          Then User click on checkbox in catalogue list
          Then User click on hide from customers
          Then User click on checkbox in catalogue list
          Then User click on unhide
          Then User click on add new sku
          Then User click on backbutton of catalogue
          Then User click on options icon in catalogue list
          Then User click on view deleted sku
          Then User click on backbutton of deleted sku
          Then User click on options icon in catalogue list
          Then User click on upload catalogue
          Then User click on back button of upload catalogue
          Then User click on options icon in catalogue list
          Then User click on download entire catalogue
          Then User click on options icon in catalogue list
          Then User click upload inventory
          Then User click on back button of upload inventory
          Then User click on filter in catalogue list
          Then User click on deselect options
          Then User click on select options
          Then User click on save button in sku page
          
          
 Examples:
         |username                              ||password    |
         |supplierautomated2@gmail.com          ||!123456Zm   |
         
         
      
      
Scenario Outline: Verify the Supplier Catalogue AddNewSku List 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Catalogue side navigation list menubar
          Then User click on add new sku
          Then User enter sku name in catalogue"<skuname>"
          Then User click on brand field
          Then User click on brand options filed
          Then User enter suppliers product code"<productcode>"
          Then User select category in dropdown field
          Then User select sub category one in dropdown field
          Then User select sub category two in dropdown field
          Then User Upload photo in browse field
          Then User click on add unit size button
          Then User select order unit size in dropdown filed
          Then User clear base unit size
          Then User enter value in base unit size"<unitsize>"
          Then User click on add unit size button
          Then User select order unit size one in dropdown filed
          Then User clear base unit size one
          Then User enter value in base unit size one"<unitsize>"
          Then User click on add unit size button
          Then User select order unit size two in dropdown filed
          Then User clear base unit size two
          Then User enter value in base unit size two"<unitsize>"
          Then User click on optonal add more details field
          Then User click on description field
          Then User enter description in that field"<description>"
          Then User click on halal checkbox
          Then User click on vegetarian checkbox
          Then User select condition in drodown field
          Then User enter value shelf life field"<shelflife>"
          Then User select days in dropdown field 
          Then User select country of origin in dropdown field
          Then User enter upc number in the upc field"<upcnumber>"
          Then User click on done and list in catalogue
          
           
          
 Examples:
         |username                              ||password    ||skuname   ||productcode||unitsize||description           ||shelflife||upcnumber|
         |supplierautomated2@gmail.com          ||!123456Zm   ||250 pipers||202021       ||10      ||This is a Beer company||10       ||ZEE123   |         
         
         
             
         
Scenario Outline: Verify the Supplier Reports Ageing list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on Ageing receviables in report page
          Then User click on update button in ageing
          Then User click on export button in ageing 
          Then User click on first company
          Then User select outlet in dropdown lists in ageing
          Then User click on update button in ageing
          Then User click on export button in ageing
          Then User click on first invoice number in ageing
          
          
          
  Examples:
         |username                       ||password    ||stockcount|
         |supplierautomated2@gmail.com   ||!123456Zm   ||10        |   
         
         
         
Scenario Outline: Verify the Supplier Reports Outlet list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on orders received outlet
          Then User select date from calendar icon
          Then User click on search icon in orders recevied page
          Then User click filter in orders received
          Then User select customer in dropdown list
          Then User select team in dropdown list
          Then User click on apply button in recevied outlet page
          Then User click on scroll down
          Then User click on outlet in recevied outlet page
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          Then User click on export icon in orders recevied page
          
          
          
  Examples:
         |username                              ||password    |
         |supplierautomated2@gmail.com          ||!123456Zm   |
         
         
Scenario Outline: Verify the Supplier Reports Planning list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on supply planning in report page
          Then User set date in calendar field
          Then User click on generate report button
          Then User click on download as csv button
          Then User click on first code in supply planning
          Then User clear on quantity stock count today
          Then User enter on quantity stock count today"<stockcount>"
          Then User click on checkbox stock count
          Then User click on save button stock count
          
          
          
  Examples:
         |username                  ||password    ||stockcount|
         |mrmanager@gmail.com       ||!123456Zm   ||10        |
         
         
         
Scenario Outline: Verify the Supplier SKU list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on orders received sku
          Then User click on search sku orders recevied page
          Then User enter sku name in search icon"<skuname>"
          Then User select invoice date from calendar field
          Then User select on outlets in dropdown list
          Then User click on search icon in orders received sku page
          Then User click on export icon in sku page
          Then User click on sku in orders recevied sku page
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          Then User click on bdl quantity order
          Then User click on bch quantity order
          Then User click on blk quantity order
          Then User click on box quantity order
          Then User click on filter in sku page
          Then User select outlet in dropdown list in sku page
          Then User click on apply button in sku page
          Then User click on filter in sku page
          Then User click on export icon in sku apge
          
  Examples:
         |username                              ||password    ||skuname        |
         |supplierautomated2@gmail.com          ||!123456Zm   ||Sakthimasala100|  
         
         
Scenario Outline: Verify the Supplier Directory manage products page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Directory side navigation list menubar
          Then User click on manage products in directory page
          Then User click on textbox in directory page 
          Then User enter on name textbox field"<name>"
          Then User click on search button in directory page
          Then User click on actions dropdown field in directory page 
          Then User click on Unlist in dropdown field
          Then User click on actions dropdown field 
          Then User click on list in dropdown field         
          Then User click on actions dropdown field 
          Then User click on edit details in dropdown field
          Then User clear on Supplier product code in edit sku page 
          Then User enter on Supplier product code in edit sku page"<code>"
          Then User click on done & update in catalogue in edit sku page
          
        
   Examples:
         |username                              ||password    | |name             | |code  |
         |supplierautomated2@gmail.com          ||!123456Zm   | |sakthimasala100  | |21245 |


Scenario Outline: Verify the Supplier Directory manage settings page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Directory side navigation list menubar
          Then User click on manage settings in directory page
          Then User clear on about the company in general settings page 
          Then User enter on about the company textbox field "<text>"
          Then User click on certifications check box in directory page
          Then User click on save button in directory page
          
          
             
   Examples:
         |username                              ||password    | |text         |
         |supplierautomated2@gmail.com          ||!123456Zm   | |Fresh fruits |


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
         |supplierautomated2@gmail.com          ||!123456Zm   ||Saisabarisaitesting|
         
         
         
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
         |username                              ||password    ||firstname||lastname||jobtitle||email                 ||mobilenumber||whatsappnumber|     |name     |
         |supplierautomated2@gmail.com          ||!123456Zm   ||shridi   ||sairam  ||AtoZtest||velusairam201202010@gmail.com||+65123456789||+65234567890  ||velu mani|         
         
                                                                                       