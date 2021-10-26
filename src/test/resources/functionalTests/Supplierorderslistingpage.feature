Feature: Verify Supplier Dashboard listing page  

Scenario Outline: Verify the Supplier Dashboard listing page
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