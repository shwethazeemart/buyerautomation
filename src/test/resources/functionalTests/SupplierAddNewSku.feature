Feature: Verify Supplier Catalogue AddNewSku List  

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
         |supplierautomated2@gmail.com          ||!123456Zm   ||200 pipers||2021       ||10      ||This is a Beer company||10       ||ZEE123   |