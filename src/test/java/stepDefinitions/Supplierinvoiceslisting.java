package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierinvoiceslistingpage;
import pageObjects.Supplierorderseinvoicepage;
import pageObjects.Supplierorderslistingpage;

public class Supplierinvoiceslisting {


	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private Supplierorderslistingpage supplierorderslisting;
	private Supplierorderseinvoicepage supplierorderseinvoice;
	private Supplierinvoiceslistingpage supplierinvoiceslisting;


	public Supplierinvoiceslisting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
		this.supplierorderslisting=testContext.getPageObjectManager().getSupplierorderslistingpage();
		this.supplierorderseinvoice=testContext.getPageObjectManager().getSupplierorderseinvoicepage();
		this.supplierinvoiceslisting=testContext.getPageObjectManager().getSupplierinvoiceslistingpage();
	}





	@Then("User click on Invoices side navigation list menubar")
	public void user_click_on_Invoices_side_navigation_list_menubar() throws InterruptedException {
		DashboardPage.Clickonsupplierinvoices();
	}

	@Then("User click new invoice button")
	public void user_click_new_invoice_button() {
		Supplierinvoiceslistingpage.Clickoninnewinvoice();
	}

	@Then("User select location in delivery dropdown")
	public void user_select_location_in_delivery_dropdown() throws InterruptedException {
		Supplierinvoiceslistingpage.Clickondeliverylocation();
	}

	@Then("User enter email in bill to field{string}")
	public void user_enter_email_in_bill_to_field_velumani_zeemart_asia(String email) {
		Supplierinvoiceslistingpage.Enteremailbilltofield(email);
	}

	@Then("User enter order number in order number field{string}")
	public void user_enter_order_number_in_order_number_field(String ordernumber) {
		Supplierinvoiceslistingpage.Enterordernumber(ordernumber); 
	}

	@Then("User select payment terms in dropdown list")
	public void user_select_payment_terms_in_dropdown_list() {
		WebElement NET90 =supplierinvoiceslisting.getDropDownElementPaymentterms();
		Select select=new Select(NET90);
		select.selectByIndex(13);
	}

	@Then("User enter sales person name in name field{string}")
	public void user_enter_sales_person_name_in_name_field_velu(String personname) {
		Supplierinvoiceslistingpage.Entersalespersonnmae(personname);
	}

	@Then("User enter mobile number in sales person field{string}")
	public void user_enter_mobile_number_in_sales_person_field(String mobilenumber) {
		Supplierinvoiceslistingpage.Entermobilenumber(mobilenumber);
	}

	@Then("User click on add sku button")
	public void user_click_on_add_sku_button() {
		Supplierinvoiceslistingpage.Clickonaddskubutton();
	}

	@Then("User click on enter sku name in dropdown field")
	public void user_click_on_enter_sku_name_in_dropdown_field() {
		Supplierinvoiceslistingpage.Clickskunamefield();
	}

	@Then("User click on sakthimasala sku in dropdown field")
	public void user_click_on_sakthimasala_sku_in_dropdown_field() {
		Supplierinvoiceslistingpage.Clickonsakthimasalasku(); 
	}

	@Then("User clear the quantity field")
	public void user_clear_the_quantity_field() {
		Supplierinvoiceslistingpage.Clearthequantityfield();
	}

	@Then("User enter the quantity value in that field{string}")
	public void user_enter_the_quantity_value_in_that_field(String quantityvalue) {
		Supplierinvoiceslistingpage.Enterthequantityvalue(quantityvalue);
	}

	@Then("User clear the unit price field")
	public void user_clear_the_unit_price_field() {
		Supplierinvoiceslistingpage.Clearunitprice();
	}

	@Then("User enter the unit price value in that field{string}")
	public void user_enter_the_unit_price_value_in_that_field(String unitprice) {
		Supplierinvoiceslistingpage.Enterunitpricevalue(unitprice); 
	}

	@Then("User clear delivery fees field")
	public void user_clear_delivery_fees_field() {
		Supplierinvoiceslistingpage.Cleardeliveryfees();
	}



	@Then("User click on final save and issue button")
	public void user_click_on_final_save_and_issue_button() {
		Supplierinvoiceslistingpage.Clickonfinalsaveandissuebutton();
	}

	@Then("User click on first invoice checkbox in list of invoices page")
	public void user_click_on_first_invoice_checkbox_in_list_of_invoices_page() throws InterruptedException {
		Supplierinvoiceslistingpage.Clickonfirstinvoicecheckbox();
	}

	@Then("User click on clear button in lisf of invoices page")
	public void user_click_on_clear_button_in_lisf_of_invoices_page() {
		Supplierinvoiceslistingpage.Clickonclearbutton();
	}

	@Then("User click on mark as paid button")
	public void user_click_on_mark_as_paid_button() {
		Supplierinvoiceslistingpage.Clickonmarkaspaidbutton();
	}

	@Then("User click on yes mark as paid in popup message")
	public void user_click_on_yes_mark_as_paid_in_popup_message() {
		Supplierinvoiceslistingpage.Clickonyesmarkaspaid();
	}

	@Then("User click on export xero in first invoice check box")
	public void user_click_on_export_xero_in_first_invoice_check_box() {
		Supplierinvoiceslistingpage.Clickonexportxerofield();
	}

	@Then("User click on yes proceed popup message")
	public void user_click_on_yes_proceed_popup_message() {
		Supplierinvoiceslistingpage.Clickonyesproceedpopup();
	}

	@Then("User click actions dropdown of third invoice in invoices list page")
	public void user_click_actions_dropdown_of_third_invoice_in_invoices_list_page() throws InterruptedException {
		Supplierinvoiceslistingpage.Clickonactionsdropdownthirdinvoice();
	}

	@Then("User click void actions dropdown of third invoice in invoices list page")
	public void user_click_void_actions_dropdown_of_third_invoice_in_invoices_list_page() {
		//Supplierinvoiceslistingpage.Clickonvoidinactiondropdown();
	}

	@Then("User click on reason in popup message")
	public void user_click_on_reason_in_popup_message() {
		Supplierinvoiceslistingpage.Clickonreasonfield();
	}

	@Then("User enter some reason in popup message{string}")
	public void user_enter_some_reason_in_popup_message_already_available_in_stock_count(String reason) {
		Supplierinvoiceslistingpage.Enterreasoninpopupmessage(reason); 
	}

	@Then("User click on void button in popup message")
	public void user_click_on_void_button_in_popup_message() {
		Supplierinvoiceslistingpage.Clickonvoidbuttonpopupmessage();
	}

	@Then("User click on duplicate in action dropdown field")
	public void user_click_on_duplicate_in_action_dropdown_field() {
		Supplierinvoiceslistingpage.Clickonduplicateinactions();
	}

	@Then("User click on finally save and issue button of duplicate")
	public void user_click_on_finally_save_and_issue_button_of_duplicate() throws InterruptedException {
		Supplierinvoiceslistingpage.Clickonfinallysaveandissuebuttonofduplicate();
	}

	@Then("User click on filter button in invoices page") 
	public void user_click_on_filter_button_in_invoices_page() throws InterruptedException {
		Supplierinvoiceslistingpage.Clickonfiltericon();
	}

	@Then("User click on deliver to link in invoices page")
	public void user_click_on_deliver_to_link_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickondelivertolink();
	}

	@Then("User click on select all icon in invoices page")
	public void user_click_on_select_all_icon_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickonselectalliconininvoicespage();
	}

	@Then("User click on apply button in invoices page")
	public void user_click_on_apply_button_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickonapplybuttonininvoicespage();
	}

	@Then("User click on reset button in invoices page")
	public void user_click_on_reset_button_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickonresetbuttonininvoicespage();
	}

	@Then("User click on invoice status link in invoices page")
	public void user_click_on_invoice_status_link_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickoninvoicestatuslink(); 
	}

	@Then("User click on payment status in invoices page")
	public void user_click_on_payment_status_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickonpaymentstatuslink();
	}

	@Then("User click on export status in invoices page")
	public void user_click_on_export_status_in_invoices_page() {
		Supplierinvoiceslistingpage.Clickonexportstatuslink();
	}

	@Then("User select due date in dropdown list")
	public void user_select_due_date_in_dropdown_list() {
		WebElement Duedate =supplierinvoiceslisting.getDropDownElementDuedate();
		Select select=new Select(Duedate);
		select.selectByIndex(5);
	}



	@Then("User select sakthimasala in the drodown list")
	public void user_select_sakthimasala_in_the_drodown_list() {
		Supplierinvoiceslistingpage.Clickonsakthimasalaoutlet();
	}





	@Then("User enter delivery fees field in that field{string}")
	public void user_enter_delivery_fees_field_in_that_field_deliveryfees(String deliveryfees) {
		Supplierinvoiceslistingpage.Enterdeliveryfeesinthatfield(deliveryfees);
	}








































}
