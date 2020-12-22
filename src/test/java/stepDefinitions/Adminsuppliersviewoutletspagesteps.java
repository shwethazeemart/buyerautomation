package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Adminsuppliersviewoutletspagesteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
    private Adminnewbuyeruserpage adminnewbuyeruserpage;
    private Adminsupplierpage adminsupplierspage;
    private Adminsuppliersviewoutletspage adminsuppliersviewoutletspage;
    
	public Adminsuppliersviewoutletspagesteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
		this.adminsuppliersviewoutletspage=testContext.getPageObjectManager().getAdminsuppliersviewoutletspage();
		
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	@When("User Clicks in Admin panel Suppliers in the side navigation menubar")
	public void user_Clicks_in_Admin_panel_Suppliers_in_the_side_navigation_menubar() throws InterruptedException {
	    dashboradpage.clickAdminSuppliers();
	}

	@Then("User are Clicks Suppliers icon in the suppliers page")
	public void user_are_Clicks_Suppliers_icon_in_the_suppliers_page() {
	   adminsuppliersviewoutletspage.Clicks_Suppliersicon();
	}

	@And("User is Enter name supplier search box in the suppliers page{string}")
	public void user_is_Enter_name_supplier_search_box_in_the_suppliers_page_VENKAT_MASALA(String suppliername) {
	    adminsuppliersviewoutletspage.Enter_namesuppliersearchbox(suppliername);
	}

	@Then("User are Clicks Search button in the suppliers page")
	public void user_are_Clicks_Search_button_in_the_suppliers_page() {
	    adminsuppliersviewoutletspage.Clicks_Searchbutton();
	}

	@And("User is Clicks Actions dropdown in the suppliers page")
	public void user_is_Clicks_Actions_dropdown_in_the_suppliers_page() {
	    adminsuppliersviewoutletspage.Clicks_Actionsdropdown();
	}

	@Then("User are Clicks View outlets in the dropdown field")
	public void user_are_Clicks_View_outlets_in_the_dropdown_field() {
	    adminsuppliersviewoutletspage.Clicks_Viewoutlets();
	}

	@And("User is Clicks Link outlets in the venkat masala page")
	public void user_is_Clicks_Link_outlets_in_the_venkat_masala_page() {
	    adminsuppliersviewoutletspage.Clicks_Linkoutlets();
	}

	@Then("User is Enter the custom outletID{string}")
	public void user_is_Enter_the_custom_outletID_CGP_(String outletid) {
	   adminsuppliersviewoutletspage.Enter_thecustomoutletID(outletid);
	}

	@And("User are Enter custom billingID{string}")
	public void user_are_Enter_custom_billingID_ZM(String billingid) {
	    adminsuppliersviewoutletspage.Enter_custom_billingID(billingid);
	}

	@Then("User is Clicks the checkbox in default settings")
	public void user_is_Clicks_the_checkbox_in_default_settings() {
	    adminsuppliersviewoutletspage.Clicks_thecheckbox();
	}

	@And("User are Enter Email in the Email address field{string}")
	public void user_are_Enter_Email_in_the_Email_address_field_velumani_zeemart_asia(String Email) {
	    adminsuppliersviewoutletspage.Enter_EmailintheEmailaddressfield(Email);
	}

	@Then("User is Enter mobile number in the SMS field{string}")
	public void user_is_Enter_mobile_number_in_the_SMS_field_Mobilenumbersms(String mobilenumbersms) throws InterruptedException {
	    adminsuppliersviewoutletspage.Enter_mobilenumberintheSMSfield(mobilenumbersms);
	}

	@And("User are Enter mobile number whatsapp field{string}")
	public void user_are_Enter_mobile_number_whatsapp_field(String mobilenumberwhatsapp) {
	    adminsuppliersviewoutletspage.Enter_mobile_number_whatsapp_field(mobilenumberwhatsapp);
	}

	@Then("User is Enter amount in minium order field{string}")
	public void user_is_Enter_amount_in_minium_order_field(String minimumamount) {
	    adminsuppliersviewoutletspage.Enter_minimumamount(minimumamount);
	}

	@And("User are Clicks checkbox in block order field")
	public void user_are_Clicks_checkbox_in_block_order_field() {
		WebElement option1 =Adminsuppliersviewoutletspage.getEnablecheckboxElement();								
	    option1.click();
	    if (option1.isSelected()) {					
	        System.out.println("Checkbox is Toggled On");					

	    } else {			
	        System.out.println("Checkbox is Toggled Off");					
	    }
	}
	

	@Then("User is Click Radio button in apply delivery fees")
	public void user_is_Click_Radio_button_in_apply_delivery_fees() {
		WebElement automaticradio = Adminsuppliersviewoutletspage.getapplyfeesradioElement();
		automaticradio.click();
	}
	@And("User is Clicks the increase counted Quantity of apply fees")
	public void user_is_Clicks_the_increase_counted_Quantity_of_apply_fees() {
	    adminsuppliersviewoutletspage.Clicks_the_increase_counted_Quantity_of_apply_fees();
	}

	@And("User are Enter the value in increment and decrement field")
	public void user_are_Enter_the_value_in_increment_and_decrement_field() {
	    adminsuppliersviewoutletspage.Clicks_the_increase_second_time_counted_Quantity_of_apply_fees();
	}

	@Then("User is First time Clicks in increment field")
	public void user_is_First_time_Clicks_in_increment_field() {
	    adminsuppliersviewoutletspage.First_timeClicksinincrementfield();
	}

	@When("User is Select orders in the dropdown field")
	public void user_is_Select_orders_in_the_dropdown_field() {
		WebElement allorders = Adminsuppliersviewoutletspage.getDropDowntoallordersElement();
		Select select=new Select(allorders);
		select.selectByIndex(1);	
	}

	@Then("User are Clicks monday checkbox")
	public void user_are_Clicks_monday_checkbox() {
		WebElement monday =Adminsuppliersviewoutletspage.getEnablemondaycheckboxElement();								
	    monday.click();
	    if (monday.isSelected()) {					
	        System.out.println("Checkbox is Toggled On");					

	    } else {			
	        System.out.println("Checkbox is Toggled Off");					
	    }
	}
	

	@And("User is Enter monday cutoff time{string}")
	public void user_is_Enter_monday_cutoff_time(String mondaycutofftime) {
	    adminsuppliersviewoutletspage.Enter_mondaycutofftime(mondaycutofftime);
	}

	@Then("User is Clicks monday time field")
	public void user_is_Clicks_monday_time_field() {
	    adminsuppliersviewoutletspage.Clicks_mondaytimefield();
	}

	@And("User are Clicks POP message of set in monday")
	public void user_are_Clicks_POP_message_of_set_in_monday() {
	    adminsuppliersviewoutletspage.Clicks_POPmessageofsetinmonday();
	}

	@Then("User are Clicks Tuesday checkbox")
	public void user_are_Clicks_Tuesday_checkbox() {
		WebElement tuesday =Adminsuppliersviewoutletspage.getEnabletuesdaycheckboxElement();								
	    tuesday.click();
	    if (tuesday.isSelected()) {					
	        System.out.println("Checkbox is Toggled On");					

	    } else {			
	        System.out.println("Checkbox is Toggled Off");					
	    }
	}

	@And("User is Enter tuesday cutoff time{string}")
	public void user_is_Enter_tuesday_cutoff_time(String tuesdaycutofftime) {
	    adminsuppliersviewoutletspage.Enter_tuesdaycutofftime(tuesdaycutofftime);
	}

	@Then("User are Clicks tuesday time field")
	public void user_are_Clicks_tuesday_time_field() {
		adminsuppliersviewoutletspage.Clicks_tuesdaytimefield();
	}

	@And("User is Clicks POP message of set in tuesday")
	public void user_is_Clicks_POP_message_of_set_in_tuesday() {
		adminsuppliersviewoutletspage.Clicks_POPmessageofsetintuesday();
	}

	@Then("User are Enter Vehicle number in the vehicle number field{string}")
	public void user_are_Enter_Vehicle_number_in_the_vehicle_number_field_SIN(String vehiclenumber) {
	    adminsuppliersviewoutletspage.Enter_Vehiclenumber(vehiclenumber);
	}

	@And("User is Enter Recipient mail in the recipient field{string}")
	public void user_is_Enter_Recipient_mail_in_the_recipient_field_velumani_zeemart_asia(String recipientEmail) {
	   adminsuppliersviewoutletspage.Enter_Recipientmail(recipientEmail);
	}

	@When("User are Select payment in the payment terms dropdown")
	public void user_are_Select_payment_in_the_payment_terms_dropdown() {
		WebElement NET60 = Adminsuppliersviewoutletspage.getDropDownpaymenttermsElement();
		Select select=new Select(NET60);
		select.selectByIndex(13);	
	}

	@Then("User is Enter name in our sales person field{string}")
	public void user_is_Enter_name_in_our_sales_person_field_velumani(String salespersonname) {
	    adminsuppliersviewoutletspage.Enter_nameinoursalesperson(salespersonname);
	}

	@And("User are Enter phone number in our sales person field{string}")
	public void user_are_Enter_phone_number_in_our_sales_person_field_phonenumnber(String phonenumber) throws InterruptedException {
	    adminsuppliersviewoutletspage.Enter_phonenumber(phonenumber);
	}

	@Then("User is Enter message in the notes field{string}")
	public void user_is_Enter_message_in_the_notes_field_In_our_company_sales_only_masala_product(String notesfield) {
	    adminsuppliersviewoutletspage.Enter_messageinthenotesfield(notesfield);
	}

	@And("User are Clicks save changes button")
	public void user_are_Clicks_save_changes_button() {
	    //adminsuppliersviewoutletspage.Clicks_savechangesbutton(); 
	}

	@Then("It should display in the Buyer outlets page")
	public void it_should_display_in_the_Buyer_outlets_page() {
		String displayinbuyeroutlets =Adminsuppliersviewoutletspage.getPageTitle();
		String pageTitle = displayinbuyeroutlets;
		System.out.println("page title: " + pageTitle);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
