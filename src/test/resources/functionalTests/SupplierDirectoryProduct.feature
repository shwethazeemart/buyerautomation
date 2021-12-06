Feature: Verify Supplier Directory manage products page  


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
