package stepDefinitions;

import org.openqa.selenium.By;
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
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class AdminsupplierspageSteps {

	
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
    
    
	public AdminsupplierspageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
		
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	

	@When("User Clicks on Admin Suppliers in the side navigation menubar")
	public void user_Clicks_on_Admin_Suppliers_in_the_side_navigation_menubar() throws InterruptedException {
	   dashboradpage.clickAdminSuppliers();
	}
	

	@Then("User is Clicks in New Supplier button")
	public void user_is_Clicks_in_New_Supplier_button() {
	    adminsupplierspage.Clicksin_Newsupplierbutton();
	}

	@When("User is Select Company market in dropdown")
	public void user_is_Select_Company_market_in_dropdown() {
		WebElement company = Adminsupplierpage.getDropDowncompanyElement();
		Select select=new Select(company);
		select.selectByIndex(0);
	}

	@Then("User is Enter Company name in the company name field{string}")
	public void user_is_Enter_Company_name_in_the_company_name_field_VENKAT_MASALA(String companyname) {
	    adminsupplierspage.Company_name(companyname);
	}

	@And("User is Enter Trading name in the Trading name field{string}")
	public void user_is_Enter_Trading_name_in_the_Trading_name_field_Masala_product(String tradingname) {
	    adminsupplierspage.Enter_tradingname(tradingname);
	}

	@Then("User is Enter Company register number{string}")
	public void user_is_Enter_Company_register_number(String registernumber) {
	   adminsupplierspage.Enter_companyregisternumber(registernumber);
	}

	@And("User are Enter Post code in address field{string}")
	public void user_are_Enter_Post_code_in_address_field(String postcode) {
	    adminsupplierspage.Enter_postcode(postcode);
	}

	@Then("User is Enter Address line one in the address field{string}")
	public void user_is_Enter_Address_line_in_the_address_field_madheswarankoilstreet(String addressline1) {
	   adminsupplierspage.Enter_addresslineone(addressline1);
	}

	@And("User are Enter Address line second in the address field{string}")
	public void user_are_Enter_Address_line_in_the_address_field_Singapore(String addressline2) {
	    adminsupplierspage.Enter_addressline2(addressline2);
	}

	@Then("User is Upload image in the logo field")
	public void user_is_Upload_image_in_the_logo_field() throws InterruptedException {
	    adminsupplierspage.upload_the_profileimage();
	}

	@And("User are Enter Supplier Email in the supplier Email field{string}")
	public void user_are_Enter_Supplier_Email_in_the_supplier_Email_field_lingeshsabari2009_gmail_com(String supplierEmail) {
	    adminsupplierspage.Enter_supplierEmail(supplierEmail);
	}

	@Then("User is Clear Supplier phone in the supplier phone field")
	public void user_is_Clear_Supplier_phone_in_the_supplier_phone_field() {
	    adminsupplierspage.Clear_supplierphonefield();
	}

	@And("User are Enter Supplier phone in the supplier phone field{string}")
	public void user_are_Enter_Supplier_phone_in_the_supplier_phone_field(String supplierphone) {
	    adminsupplierspage.Enter_supplierphone(supplierphone);
	}

	@Then("User is Enter Short description in the short description field{string}")
	public void user_is_Enter_Short_description_in_the_short_description_field_Masala_distributor(String shortdescription) {
	   adminsupplierspage.Enter_shortdescription(shortdescription);
	}

	@And("User are Enter Long description in the long description filed{string}")
	public void user_are_Enter_Long_description_in_the_long_description_filed_Venkat_masala_company_manufacture_only_masala_product(String longdescription) {
	    adminsupplierspage.Enter_longdescription(longdescription);
	}

	@When("User is Select company Time zone in the dropdown field")
	public void user_is_Select_company_Time_zone_in_the_dropdown_field() throws InterruptedException {
	     Adminsupplierpage.Select_timezone();
		//WebElement Timezone = Adminsupplierpage.getDropDowntimezoneElement();
		//Select select=new Select(Timezone);
		//select.selectByVisibleText("(GMT+08:00)Asia/Singapore");
	}

	@Then("User are Enter GST in the pricing field{string}")
	public void user_are_Enter_GST_in_the_pricing_field(String GSTvalue) {
	    adminsupplierspage.Enter_GSTvalue(GSTvalue);
	}

	@And("User is Clicks checkbox of include inventory data")
	public void user_is_Clicks_checkbox_of_include_inventory_data() {
	   adminsupplierspage.Clicks_checkboxofinventorydata(); 
	}

	@Then("User are Clicks checkbox of allow negative inventory")
	public void user_are_Clicks_checkbox_of_allow_negative_inventory() {
	   adminsupplierspage.Clicks_checkboxofallownegativeinventory();
	}

	@And("User is Enter Email send report of item{string}")
	public void user_is_Enter_Email_send_report_of_item_velumanieswaran2020_gmail_com(String reportEmail) {
	    adminsupplierspage.Enter_Emailsendreport(reportEmail);
	}

	@Then("User are Clicks checkbox immediately in the Report frequency field")
	public void user_are_Clicks_checkbox_immediately_in_the_Report_frequency_field() {
	    adminsupplierspage.Clicks_checkboximmediately();
	}

	@And("User is Clicks Checkbox daily at in the Report frequency field")
	public void user_is_Clicks_Checkbox_daily_at_in_the_Report_frequency_field() {
	    adminsupplierspage.Clicks_Checkboxdailyat();
	}

	@Then("User are Clicks textbox daily at in the Report frequency field")
	public void user_are_Clicks_textbox_daily_at_in_the_Report_frequency_field() {
	    adminsupplierspage.Clicks_textboxdailyat();
	}

	@And("User is Clicks set in the POP message in the Negative Report frequency field")
	public void user_is_Clicks_set_in_the_POP_message_in_the_Negative_Report_frequency_field() throws InterruptedException {
	    adminsupplierspage.Clicks_setinthePOPmessageintheNegativeReport();    
	}

	@Then("User are Clicks  checkbox weekly on in the Report frequency field")
	public void user_are_Clicks_checkbox_weekly_on_in_the_Report_frequency_field() {
	   adminsupplierspage.Clicks_checkboxweeklyon();
	}

	@When("User is Select day in the day field dropdown")
	public void user_is_Select_day_in_the_day_field_dropdown() {
		WebElement day = Adminsupplierpage.getDropDowndayElement();
		Select select=new Select(day);
		select.selectByIndex(3);
	}

	@Then("User are Clicks textbox day field in the Report frequency field")
	public void user_are_Clicks_textbox_day_field_in_the_Report_frequency_field() {
	    adminsupplierspage.Clicks_textboxdayfield();
	}

	@And("User is Clicks set in the POP message")
	public void user_is_Clicks_set_in_the_POP_message() {
	    adminsupplierspage.Clicks_setinthePOPmessage();
	}

	@Then("User are Enter Email Upcoming delivery field{string}")
	public void user_are_Enter_Email_Upcoming_delivery_field_lingeshsabari2009_gmail_com(String upcomingEmail) {
	    adminsupplierspage.Enter_EmailUpcomingdeliveryfield(upcomingEmail);
	}

	@And("User is Clicks check box of daily at")
	public void user_is_Clicks_check_box_of_daily_at() {
	    adminsupplierspage.Clicks_checkbox_of_daily_at();
	}

	@Then("User is Clicks check box of Weekly on")
	public void user_is_Clicks_check_box_of_Weekly_on() {
	    adminsupplierspage.Clicks_check_box_of_Weekly_on();
	}

	@When("User are Select day in daydropdown field")
	public void user_are_Select_day_in_daydropdown_field() {
		WebElement Monday = Adminsupplierpage.getDropDownMondayElement();
		Select select=new Select(Monday);
		select.selectByIndex(0);	
	}

	@Then("User is Clicks Text box in the day field")
	public void user_is_Clicks_Text_box_in_the_day_field() {
	    adminsupplierspage.Clicks_Text_box_in_the_day_field();
	}

	@And("User are Clicks set in the POP message in report frequency field")
	public void user_are_Clicks_set_in_the_POP_message_in_report_frequency_field() {
	   adminsupplierspage.Clicks_set_in_the_POP_message();
	}

	@Then("User is Clicks check box of Enable supplier payments")
	public void user_is_Clicks_check_box_of_Enable_supplier_payments() throws InterruptedException {
	    adminsupplierspage.Clicks_checkboxofEnablesupplierpayments();
		//WebElement option1 =Adminsupplierpage.getEnablecheckboxElement();								
	    //option1.click();
	    //if (option1.isSelected()) {					
	        System.out.println("Checkbox is Toggled On");					

	    //} else {			
	        System.out.println("Checkbox is Toggled Off");					
	   //}
	}

	@And("User are Clicks manual payment Radio button")
	public void user_are_Clicks_manual_payment_Radio_button() {
		WebElement automaticradio = Adminsupplierpage.getmanualradioElement();
		automaticradio.click();
	}

	@Then("User is Clear the Percentage field")
	public void user_is_Clear_the_Percentage_field() {
	    adminsupplierspage.Clear_thePercentagefield();
	}

	@And("User are Enter Percentage value in the percentage field{string}")
	public void user_are_Enter_Percentage_value_in_the_percentage_field(String percentage) {
	   adminsupplierspage.Enter_Percentagevalue(percentage);
	}

	@Then("User is Clear Fixed fees field")
	public void user_is_Clear_Fixed_fees_field() {
	    adminsupplierspage.Clear_Fixedfeesfield();
	}

	@And("User are Enter value of Fixed fees field{string}")
	public void user_are_Enter_value_of_Fixed_fees_field_fixedfees(String fixedfees) {
	    adminsupplierspage.Enter_valueofFixedfeesfield(fixedfees);
	}

	@Then("User is Enter Email supplier activity field{string}")
	public void user_is_Enter_Email_supplier_activity_field_lingeshsabari2009_gmail_com(String activityEmail) {
	   adminsupplierspage.Enter_Emailsupplieractivityfield(activityEmail);
	}

	@Then("User are Clicks Save supplier only button")
	public void user_are_Clicks_Save_supplier_only_button() {
		adminsupplierspage.ClickSaveSupplier();
	}

	@Then("It should display in the supplier home page field")
	public void it_should_display_in_the_supplier_home_page_field() {
		String displaysupplier =Adminsupplierpage.getPageTitle();
		String pageTitle = displaysupplier;
		System.out.println("page title: " + pageTitle);
	}
	@When("User is clicks the subscription plan of radio button")
	public void user_is_clicks_the_subscription_plan_of_radio_button() {
		adminsupplierspage.clicks_the_subscription_plan_of_radio_button();
	}

	@Then("User is enter subscription email notification{string}")
	public void user_is_enter_subscription_email_notification_velumani_zeemart_asia(String enteremail) {
		adminsupplierspage.enter_subscription_email_notification_velumani_zeemart_asia(enteremail);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
