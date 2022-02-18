Feature: verify Admin panel Entier test all the page

 
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
          And User is Clicks Link outlets in the outlet page
          When User are Select outlet in the autocomplete textbox
          Then User is Enter the custom outletID"<outletid>"
          And User are Enter custom billingID"<billingid>" 
          Then User is Clicks the checkbox in default settings 
          Then User is Clicks the checkbox in Disable ordering function
          Then User is Select reason in dropdown field
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
          
    @dev    
    Examples:
         |username                     |  |password    ||suppliername ||outletid   ||billingid ||minimumamount||mondaycutofftime||tuesdaycutofftime||vehiclenumber ||recipientEmail   ||salespersonname| |phonenumber   ||notesfield                              |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||VELU MASALA1 ||Masala-12  ||ZM-456    ||100          ||1               ||1                ||SIN-4178      ||velumani@zeemart.asia||velumani     | |+65123456789 ||In our company sales only masala product|


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
         |username                       |  |password    ||firstname      ||lastname ||jobtitle ||Email                     ||mobilenumber|
         |velumanisabari2009@gmail.com   |  |#f=6T7uX    ||lingeshsabari  ||velumani ||ATZ test ||velumani20101978@gmail.com||+65123456789|



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
         |username                    |  |password    ||companyid|
         |velumanisabari2009@gmail.com|  |#f=6T7uX    ||CGP123   |


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
         |username                    |  |password    ||firstname      ||lastname ||Email                     ||mobilenumber   ||jobtitle |
         |velumanisabari2009@gmail.com|  |#f=6T7uX   ||lingeshsabari  ||velumani ||velumani20101978@gmail.com||+65123456789   ||ATZ test |




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
         |username                    |  |password   ||companyname ||tradingname   ||registernumber  ||postcode ||addressline1             ||addressline2 ||supplierEmail              ||supplierphone||shortdescription  ||longdescription                                     ||enter email||GSTvalue||reportEmail                  ||upcomingEmail              ||percentage||fixedfees||activityEmail              |
         |velumanisabari2009@gmail.com|  |#f=6T7uX   ||Naga        ||Masala product||1234567         ||638312   ||261,madheswarankoilstreet||Singapore    ||lingeshsabari2009@gmail.com||+65123456789 ||Masala distributor||Venkat masala company manufacture only masala product||velumani@zeemart.asia||7       ||velumanieswaran2020@gmail.com||lingeshsabari2009@gmail.com||2         ||100      ||lingeshsabari2009@gmail.com|


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
         |username                     |  |password    ||firstname ||lastname ||jobtitle  ||Email                     ||mobilenumber|               
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||Shwetha   ||RM       ||ATZ       ||velumani201978@gmail.com  ||+6512345678 |

  
 
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
         |username                     |  |password    ||outletname     ||postcode ||addressline1         ||addressline2||outletEmail                 ||mobilenumber||outlet       |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||venkatmasala250||638327   ||madheswarankoilstreet||singapore   ||lingeshsabari2009@gmail.com ||+6512345679 ||venkatmasal250|




Scenario Outline: Verify the Invoice Process page of Admin panel 
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          And User Clicks on Admin Invoices in the side navigation menubar 
          Then User is Clicks in Sort by dropdown
          And User are Clicks in Newest first
          Then User is Clicks the outlet process button
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
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||202012010002||INV-2020120  ||10          | 


   

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
          Then User is Clicks the Done button
          
    Examples:
         |username                     |  |password    |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    |


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
         |username                     |  |password    ||outletname      ||postcode ||addressline1         ||addressline2||outletEmail                 ||mobilenumber||outlet       ||entername      ||enter email|          |Buyerusername                ||Buyerpassword |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||sstmasala20   ||638327     ||madheswarankoilstreet||singapore   ||lingeshsabari2009@gmail.com ||+6512345679 ||SST250       ||velu mani2     ||velumani@zeemart.asia||velumanieswaran2020@gmail.com||!123456Zm     |


   
Scenario Outline: Verify the Order listing page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Orders in the side navigation menubar
          Then User Clicks on the order ID
          Then User Enter the order ID"<orderid>"
          Then User select Delivery date from the calendar
          Then User select the Placed on from the calendar
          Then User Click on the Search icon
          Then User Click on Filter icon
          Then User click the Order type
          And User click the Select All option
          Then User click on the Apply button
          Then User click on Filter icon
          Then User click the Reset button
          Then User Click on the first checkbox
          Then User Click on the Clear button
          
          
          
       Examples:
         |username                     |  |password    | |orderid       |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |202201130007  |
         
       
Scenario Outline: Verify the Order Details page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Orders in the side navigation menubar 
          Then User click on particular order detail page
          Then User click on Details tab
          Then User click on Activity tab
          Then User click on Cancel order button
          Then User enter the reason in Others text box "<reason>"
          Then User click on the Cancel order final button 
                
          
       Examples:
       |username                     |  |password    | |reason              |
       |velumanisabari2009@gmail.com |  |#f=6T7uX    | |Available in order  |
         

Scenario Outline: Verify the Promotion Deals page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Promotions in the side navigation menubar 
          Then User click on Deals Tab
          Then User clicks Search box
          Then User Enter the Search Deal "<Deal>" 
          Then User Select the dropdown status
          Then User Select the Supplier in dropdown list 
          Then User Clicks Search icon
          Then User click on the Organise deals
          Then User click on Close icon of Organise deals
          Then User click the Actions dropdown
          Then User click New deal icon
          Then User click Back button of promotion
          Then User click on New Promo Code
          Then User click Back button of promo codes
          
      Examples:

       |username                     |  |password    | |Deal     |
       |velumanisabari2009@gmail.com |  |#f=6T7uX    | |Bug test |
         
          
      
 Scenario Outline: Verify the Promotion New deal page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Promotions in the side navigation menubar 
          Then User click on New deal
          Then User Select the Supplier in the dropdown list
          Then User Enter on the Title "<Title>"
          Then User Enter the Descripton "<Description>"   
          Then User Select the Carousel banner
          Then User Click on the Drag and dropdown field
          Then User Save the Carousel banner
          Then User Select the Landing banner
          Then User Click on the Landing banner of Drag and dropdown field
          Then User Save the Landing banner
          Then User select the Calendar From date of Validity field
          Then User select the Calendar Until date of Validity field
          Then User Enter the value of Minimum order field"<Minimumorder>"
          Then User Click on radio button of Apply fee
          Then User Enter the value of CutOff time"<CutOfftime>"
          Then User click on Apply fee Dropdown 
          Then User select the to all Orders
          Then User click on Checkbox of Monday
          Then User Enter the CutOff time"<MondayCutOfftime>"
          Then User Click on the Time field
          Then User Click on Set button 
          Then User click on Checkbox of Wednesday
          Then User Enter the Wednesday CutOff time"<WedCutOfftime>"
          Then User Click on the Time field of Wednesday
          Then User Click on Set button of Wednesday
          Then User click on Checkbox of Friday
          Then User Enter the Friday CutOff time"<FridayCutOfftime>"
          Then User Click on the Time field of Friday
          Then User Click on Set button of Friday
          Then User Click on Radio button of All outlets
          Then User Enter the Email of By email field"<Byemail>"
          Then User Click the Next SKU
          Then User click the Add SKU
          Then User click the First checkbox
          Then User click on the UOM options dropdown
          Then User Clear the Block option field
          Then User Clear the Deal price option field          
          Then User Enter the Deal price field"<Dealprice>"
          Then User Enter the Original price field"<Originalprice>"
          Then User Clear the MOQ option field          
          Then User Enter the MOQ field"<MOQ>"
          Then User Enter the Shelf life"<Shelflife>"                  
          Then User click on the Save changes
          
    
         Examples:
         |username                     |  |password    | |Title   | |Description  | |Minimumorder | |CutOfftime | |MondayCutOfftime | |WedCutOfftime | |FridayCutOfftime| |Byemail           | |Dealprice | |Originalprice | |MOQ | |Shelflife |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |Omicron | |New Virus    | |5            | |3          | |2                | |1             | |1               | |shwetha@gmail.com | |20        | | 15           | |10  | |1           |
        
         
 Scenario Outline: Verify the Promo code page


          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Promotions in the side navigation menubar    
          Then User Click on the New promo code
          Then User Enter the Promo code"<promocode>"   
          Then User Enter the Promo name"<promoname>"
          Then User Enter the Promo description"<promodescription>"
          Then User clicks the Profile photo
          Then User select the Calendar From date of Validity 
          Then User select the Calendar Until date of Validity
          Then User Click Applies to dropdown
          Then User click Discount type dropdown
          Then User Enter the Discount value percentage"<discountpercentage>"
          Then User Enter the Min order value"<minorder>"
          Then User Enter Usage restrictions overall quota"<overallquota>"
          Then User Click the Save

     
      Examples:
         |username                     |  |password    | |promocode | |promoname | |promodescription |  |discountpercentage | |minorder  | |overallquota | 
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |COD101    | |kinley    | |Hii Kinley       |  |5                  | |15        | |150          |
          
          
          
          
Scenario Outline: Verify the Reports outlets page

          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Reports in the side navigation menubar 
          Then User click on By outlet option 
          Then User select date from calendar field
          Then User click on search icon in outlet field
          Then User click on export download button
          Then User click on filter in outlet field
          Then User click on outlet in filter field
          Then User click on select all option in filter field
          Then User click on apply button in filter field
          Then User click on processing time in filter field
          Then User click on select all option in filter field
          Then User click on apply button in filter field
          Then User click on number of line items
          Then User click on select all option in filter field
          Then User click on apply button in filter field
          Then User select user in dropdown field
          Then User click on reset button in filter field
          

          
     Examples:
       |username                     |  |password    | 
       |velumanisabari2009@gmail.com |  |#f=6T7uX    |             

          
Scenario Outline: Verify the Reports users page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Reports in the side navigation menubar 
          Then User click on By processor user option 
          Then User click on users icon in admin reports 
          Then User select date from calendar field in user field
          Then User click on search icon in users field
          Then User click on export download button users field
          Then User click on filter in users field
          Then User click on processed user in users field
          Then User click on select all option in users field
          Then User click on apply button in users field
          Then User click on reset button in users field
          
          
     Examples:
       |username                     |  |password    | 
       |velumanisabari2009@gmail.com |  |#f=6T7uX    |                 

          
          

Scenario Outline: Verify the Buyers New Company page of Admin panel   

 
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar
          Then User is Clicks in Add new by dropdown  
          Then User click on new company in buyer
          Then User enter registered name in create buyer company"<registeredname>"
          Then User enter alias name in create buyer company"<aliasname>"
          Then User enter post code in create buyer company"<postcode>"
          Then User enter address line one in create buyer company"<addresslineone>"
          Then User enter address line two in create buyer comapny"<addresslinetwo>"
          Then User enter company registration number in create buyer company"<companyregistrationnumber>"
          Then User enter tax registration number in create buyer company"<taxregistrationnumber>"
          Then User click on acra certificate browse button
          Then User click on logo browse button
          Then User enter company email in create buyer company"<companyemail>"
          Then User clear company phone number in create buyer company
          Then User enter company phone number in create buyer company"<companyphonenumber>"
          Then User click on finaxarpay checkbox in create buyer company
          Then User click on save company in create buyer company
          
    Examples:
       |username                     |  |password    | |registeredname||aliasname||postcode||addresslineone               ||addresslinetwo||companyregistrationnumber||taxregistrationnumber||companyemail         ||companyphonenumber|
       |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU MASALA9 ||AtoZ Test||600041  ||261,Madheswaran temple street||singapore     | |AZ789                   | |tax-897             ||velumani@zeemart.asia||+6512345678       | 
          
    
    
          
         
          
Scenario Outline: Verify the Promo codes listing page
  
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button         
          When User Clicks on Admin Promotions in the side navigation menubar    
          Then User Click on the Promo codes tab
          Then User clicks SEARCH CODE
          Then User Enter the SEARCH CODE"<code>" 
          Then User Select the dropdown status of promo codes
          Then User select the Calendar Validity period 
          Then User Clicks Search icon of promocodes
          Then User Click the Actions dropdown of Promocodes
          Then User Click the View settings
          Then User Clear the Promo code
          Then User Enter the Promo code in View settings"<promocode>"
          Then User Click on the Save button
          Then User Click on action icon of 123promocode
          Then User Click the View details usage
          Then User Click return back to Promo codes
          Then User Click on Action icon of ABCDpromocode
          Then User Click the End promo
          Then User Click the Close icon
          
        Examples:
         |username                     |  |password    | |code  |  |promocode  |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |1234  |  |1234newcode|
         
          
       
Scenario Outline: Verify the Admin supplier Edit Company 
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar 
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field          
          Then User click on action bootstrap dropdown
          Then User click on edit company details
          Then User clear on also know as field
          Then User enter on also know as field"<knowas>"
          Then User clear on company registration number
          Then User enter on company registration number"<companyregistrationnumber>"
          Then User click on update button in edit company
          
          
  Examples:
         |username                     |  |password    | |knowas      |  |companyregistrationnumber  ||suppliername|
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |AtoZ Test   |  |LS-9087                    ||VELU        |
               
                
Scenario Outline: Verify the Essentials page in Admin hub    
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar     
          Then User click the Essentials Tab
          And User Enter name in Search supplier box in the Essentials page"<suppliername>"
          Then user select the status of the dropdown
          Then User are Clicks Search button in the Essentials page 
          Then User Click the Actions dropdown of Essentials
          Then User Click on the View settings
          Then User Select Supplier in the dropdown list
          Then User Enter the short Descripton"<Descrip>"
          Then User Enter in the Descripton"<Description>"   
          Then User Click the Landing banner of Drag and dropdown field
          Then User Save the Landing banner of Essentials
          Then User Enter the Rebate percent"<percentvalue>"
          Then User Click on the Drag and dropdown field of Essentials
          Then User Save the Carousel banner of Essentials
          Then User select the Calendar From date of Validity field of Essentials
          Then User select the Calendar Until date of Validity field of Essentials
          Then User Enter the value of Minimum order field of Essentials"<Minimumorder>"
          Then User Click on radio button of Apply fee of Essentials
          Then User Enter the value of CutOff time of Essentials"<CutOfftime>"
          Then User click on Apply fee Dropdown of Essentials
          Then User click on Essentials Checkbox of Monday
          Then User Enter the CutOff time of Essentials"<MondayCutOfftime>"
          Then User Click on the Time field of Essentials
          Then User Click on Set button of Essentials
          Then User click on Essentials Checkbox of Wednesday
          Then User Enter the Wednesday CutOff time of Essentials"<WedCutOfftime>"
          Then User Click on the Time field of Wednesday of Essentials
          Then User Click on Set button of Wednesday of Essentials
          Then User Click on Radio button of All outlets of Essentials
          Then User Enter the Email of By email field of Essentials"<Byemail>"
          Then User Click the Update Settings
         
       Examples:
         |username                     |  |password    ||suppliername    |  |Descrip | |Description |  |percentvalue | |Minimumorder | |CutOfftime | |MondayCutOfftime | |WedCutOfftime | |Byemail          |  
         |velumanisabari2009@gmail.com |  |#f=6T7uX    ||Supplie testing |  |Hello   | |Testing     |  |5            | |5            | |3          | |2                | |1             | |shwetha@gmail.com|


Scenario Outline: Verify the Admin supplier Edit Default Setting 
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field           
          Then User click on action bootstrap dropdown
          Then User click on edit edit default setting
          Then User clear on minimum order field
          Then User enter on minimum order field"<minimumorder>"
          Then User clear on sales person field
          Then User enter on sales person field"<salesperson>"
          Then User clear on sales person phone field
          Then User enter on sales person phone field"<phonenumber>"
          Then User click on update button in edit default setting
          
          
  Examples:

         |username                     |  |password    | |salesperson        |  |minimumorder||phonenumber  |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |lingeshsabarisai   |  |102         ||+65345678929 |          
          
                  
Scenario Outline: Verify the New Essentials listing page in Admin hub    
        
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar     
          Then User click the Essentials Tab
          Then User click on the New Essentials listing 
          Then User Select Supplier in the dropdown list
          Then User Enter the short Descripton"<Descrip>"
          Then User Enter in the Descripton"<Description>"   
          Then User Click the Landing banner of Drag and dropdown field
          Then User Save the Landing banner of Essentials
          Then User Enter the Rebate percent"<percentvalue>"
          Then User Click on the Drag and dropdown field of Essentials
          Then User Save the Carousel banner of Essentials
          Then User select the Calendar From date of Validity field of Essentials
          Then User select the Calendar Until date of Validity field of Essentials
          Then User Enter the value of Minimum order field of Essentials"<Minimumorder>"
          Then User Click on radio button of Apply fee of Essentials
          Then User Enter the value of CutOff time of Essentials"<CutOfftime>"
          Then User click on Apply fee Dropdown of Essentials
          Then User click on Essentials Checkbox of Monday
          Then User Enter the CutOff time of Essentials"<MondayCutOfftime>"
          Then User Click on the Time field of Essentials
          Then User Click on Set button of Essentials
          Then User click on Essentials Checkbox of Wednesday
          Then User Enter the Wednesday CutOff time of Essentials"<WedCutOfftime>"
          Then User Click on the Time field of Wednesday of Essentials
          Then User Click on Set button of Wednesday of Essentials
          Then User Click on Radio button of All outlets of Essentials
          Then User Enter the Email of By email field of Essentials"<Byemail>"
          Then User Click on the Next SKU
          Then User click the Add SKU
          Then User click the First checkbox
          Then User click on the UOM options dropdown
          Then User Clear the Block option field
          Then User Clear the Price option field of Essentials          
          Then User Enter the Price field of Essentials"<price>"
          Then User Enter the Original price field"<Originalprice>"
          Then User Clear the MOQ option field          
          Then User Enter the MOQ field"<MOQ>"
          Then User Enter the Shelf life"<Shelflife>"                  
          Then User click on the Add to listing 
                    
   Examples:
         |username                     |  |password    | |Descrip | |Description |  |percentvalue | |Minimumorder | |CutOfftime | |MondayCutOfftime | |WedCutOfftime | |Byemail          |  | Price | |Originalprice | |MOQ | |Shelflife |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |Hello   | |Testing     |  |5            | |5            | |3          | |2                | |1             | |shwetha@gmail.com|  | 10    | | 15           | |5  | |1         |



Scenario Outline: Verify the Admin supplier Edit Blackout Dates 

          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field        
          Then User click on action bootstrap dropdown 
          Then User click on edit blockout dates for delivery
          Then User select date form calendar in blackout field
          Then User click on add button in blackout field
          Then User click on close icon in blackout field
          
          
          
   Examples:
         |username                     |  |password    | |suppliername     |  
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU             |            
          

          

Scenario Outline: Verify the Admin supplier Edit Directory Setting 
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field        
          Then User click on action bootstrap dropdown 
          Then User click on edit directory setting
          Then User click on manage products in directory field
          Then User enter on search name in search textbox field"<searchname>"
          Then User click on search icon in directory field
          Then User clear on search name in directory field
          Then User click on search icon in directory field
          Then User select on unlisted option in dropdown field
          Then User click on search icon in directory field
          Then User select on all sku option in dropdown field
          Then User click on search icon in directory field
          Then User select on listed option in dropdown filed
          Then User click on search icon in directory field
          Then User click on actions dropdown in directory field
          Then User click on unlist in dropdown field
          Then User click on actions dropdown in directory field
          Then User click on list in dropdown field
          Then User click on actions dropdown in directory field
          Then User click on edit in dropdown field
          Then User clear on supplier product code
          Then User enter on value in supplier product code"<productcode>"
          Then User click on done update cataglogue button
          
                   
          
          
  Examples:
         |username                     |  |password    | |suppliername     | |searchname||productcode| 
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU             | | 100pipers||298        |
         
         

Scenario Outline: Verify the Admin supplier Edit Directory Manage Setting
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field        
          Then User click on action bootstrap dropdown 
          Then User click on edit directory setting
          Then User click on manage setting in supplier field
          Then User clear on minimum order filed
          Then User enter on value in minimum order filed"<minimumorder>" 
          Then User click on save button in general setting field    
          
          
          
     Examples:
         |username                     |  |password    | |suppliername     | |searchname| |minimumorder|
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU             | | 100pipers| |5           |   
         
         

Scenario Outline: Verify the Admin Supplier Screen Supplier Teams 
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field        
          Then User click on action bootstrap dropdown 
          Then User click on supplier teams in action dropdown field
          Then User click on add new button in supplier teams
          Then User enter name on team name field"<teamname>"
          Then User click on next link to outlet in add team field
          Then User click on add new in link outlet field
          Then User click on select outlet in link outlet field
          Then User click on second outlet in select outlet field
          Then User click on select outlet icon
          Then User click on save button in select outlet field
          Then User click on action dropdown in edit field
     
                  
     Examples:
         |username                     |  |password    | |suppliername    | |teamname     |
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU            | |palanimurugansai|   
         

Scenario Outline: Verify the Admin Supplier Screen Buyers Companies 
  
          Given User are available in login page
          When User is enter exact username"<username>"  
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks in Admin panel Suppliers in the side navigation menubar
          Then User clear on search textbox in supplier filed
          Then User enter on supplier name in search textbox"<suppliername>"  
          Then User click on search button in supplier field        
          Then User click on action bootstrap dropdown 
          Then User click on buyers companies in action dropdown field
          Then User click on link to company in supplier field
          Then User click on select company in link field
          Then User click on save settings in link field
          Then User click on actions icon in supplier field
          Then User click on edit details in supplier field
          Then User enter on customer company id number"<companyid>"
          Then User click on save settings in link field
                  
     Examples:
         |username                     |  |password    | |suppliername    | |companyid|
         |velumanisabari2009@gmail.com |  |#f=6T7uX    | |VELU            | |592      |
                             
                    
       
 Scenario Outline: Verify the Buyers Outlets listing page of Admin
 
         Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar 
          Then User click on checkbox 
          Then User click on Disable
          Then User click on Disable button
          Then User click on checkbox
          Then User click on Enable icon
          Then User click on Enable button
          Then User click on checkbox
          Then User click on clear icon
          Then User click on Actions dropdown 
          Then User click on Edit details 
          Then User click on back button of Buyers icon
          Then User click on Actions dropdown 
          Then User click on Edit settings 
          Then User click on back button of Buyers icon
          Then User click on Actions dropdown 
          Then User click on View suppliers 
          Then User click on back button of Buyers icon
          Then User enter the outlet name in text box"<outletname>"
          
         
    Examples:  
      | username                         | | password   |  |outletname     |
      | velumanisabari2009@gmail.com     | |#f=6T7uX    |  |velu masala2020|
      
        
 Scenario Outline: Verify the Outlets Edit Details page of Admin
 
         Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar 
          Then User click on Actions dropdown 
          Then User clicks on Edit details
          And User clear on Outlet email
          Then User enter the new email id"<Email>"
          Then User click on the Tags
          Then User Enter the Tags"<tags>"         
          Then User click on save button
           
    Examples: 
      | username                         | | password   ||Email                 ||tags  |
      |velumanisabari2009@gmail.com      | |#f=6T7uX    ||shwetha11@gmail.com   ||Party |
      
      
        
 Scenario Outline: Verify the Buyers Outlets Edit settings page of Admin
 
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar 
          Then User click on Actions dropdown           
          Then User clicks on Edit settings
          And User click on search box of Edit setings
          Then User Enter the name in search box of Edit setings"<Name>"
          And User click on Add member button
          Then User click on select user search box
          Then User click on check box in Edit settings page
          Then User click on outside section of Edit settings
          And User click on Add button
          Then User Clear on weekly email
          And User enter on weekly email"<WeeklyEmail>"          
          Then User select dropdown on wednesday send every
          Then User click on save button setings
          
          
          
    Examples: 
      | username                     | | password  ||Name       | |WeeklyEmail          |
      | velumanisabari2009@gmail.com | |#f=6T7uX   ||buyer      | |shwetha@gmail.com    |          
      
      
@Smoke        
 Scenario Outline: Verify the Buyers Outlets View Suppliers page of Admin
 
          Given User are available in login page
          When User is enter exact username"<username>"
          And User is enter exact password"<password>"
          When User are Select country in the autocomplete text box
          And User is press the Admin login button 
          When User Clicks on Admin Buyers in the side navigation menubar 
          Then User click on Actions dropdown   
          Then User clicks on View suppliers
          Then User click on back to return page          
         
           
        
    Examples: 
      | username                         | | password   |
      | velumanisabari2009@gmail.com     | |#f=6T7uX    |           
             
            
         