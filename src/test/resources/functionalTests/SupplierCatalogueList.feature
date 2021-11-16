Feature: Verify Supplier Catalogue list  

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