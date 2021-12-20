package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerinvoicelisen {

	private TestContext testContext;
	private OrdersPage orderspage;
	// private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage;
	private DashboardPage dashboradpage;
	private Buyerinvoicelisenpage buyerinvoicelisen;

	public Buyerinvoicelisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage) testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen = testContext.getPageObjectManager().getBuyerinvoicelisen();
	}

	@When("User enters exact password{string}")
	public void user_enters_exact_password_123456Zm(String loginPassword) {
		buyerinvoicelisen.enter_exactPassword(loginPassword);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		buyerinvoicelisen.clickloginbutton();
	}

	@Then("User clicks on Invoices in the side navigation menubar")
	public void user_clicks_on_Invoices_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickInvoices();
	}

	@Then("User clicks on Pay online")
	public void user_clicks_on_Pay_online() {
		buyerinvoicelisen.clickPayonline();
	}

	@Then("User clicks on pay online close icon")
	public void user_clicks_on_pay_online_close_icon() {
		buyerinvoicelisen.clickpayonlinecloseicon();
	}

	@Then("User clicks on upload invoice")
	public void user_clicks_on_upload_invoice() {
		buyerinvoicelisen.clickuploadinvoice();
	}

	@Then("User clicks on upload invoice close icon")
	public void user_clicks_on_upload_invoice_close_icon() {
		buyerinvoicelisen.clickuploadinvoicecloseicon();
	}

	// @Then("User Enter invoice number in first textbox")
	// public void user_type_invoice_number_in_first_textbox() {
	// buyerinvoicelisen.Enterinvoicenumber();
	// }

	@Then("User click on search icon")
	public void user_click_on_search_icon() {
		buyerinvoicelisen.clicksearchicon();
	}

	@Then("User click on any one of check box")
	public void user_click_on_any_one_of_check_box() {
		buyerinvoicelisen.clickcheckbox();
	}

	@Then("User click on download data")
	public void user_click_on_download_data() {
		buyerinvoicelisen.clickdownloaddata();

	}

	@Then("User click on export to accounting system")
	public void user_click_on_export_to_accounting_system() {
		buyerinvoicelisen.clickexportaccountingsystem();

	}

	@Then("User click on cancel button in accounting system")
	public void user_click_on_cancel_button_in_accounting_system() {
		buyerinvoicelisen.clickcancelbuttonaccountingsystem();

	}

	@Then("User click on clear button")
	public void user_click_on_clear_button() {
		buyerinvoicelisen.clickclearbutton();
	}

	@Then("User click on invoice")
	public void user_click_on_invoice() {
		buyerinvoicelisen.clickoninvoice();
	}

	@Then("User click on return invoice icon")
	public void user_click_on_return_invoice_icon() {
		buyerinvoicelisen.clickonreturninvoiceicon();
	}

	@Then("User click on credit note invoice")
	public void user_click_on_credit_note_invoice() {
		buyerinvoicelisen.clickoncreditnoteinvoice();
	}

	@Then("User click on credit note return invoice icon")
	public void user_click_on_credit_note_return_invoice_icon() {
		buyerinvoicelisen.clickoncreditnotereturninvoiceicon();
	}

	@Then("User click on voided invoice")
	public void user_click_on_voided_invoice() {
		buyerinvoicelisen.clickonvoidedinvoice();
	}

	@Then("User click on voided return invoice icon")
	public void user_click_on_voided_return_invoice_icon() {
		buyerinvoicelisen.clickonreturnviodedinvoiceicon();
	}

	@Then("User click on filter icon")
	public void user_click_on_filter_icon() throws InterruptedException {
		buyerinvoicelisen.clickonfiltericon();
	}

	@Then("User clear invoice number in first textbox")
	public void user_clear_invoice_number_in_first_textbox() {
		buyerinvoicelisen.clearinvoicenumber();
	}

	@Then("User click on second time search icon")
	public void user_click_on_second_time_search_icon() {
		buyerinvoicelisen.clicksecondtimesearchicon();
	}

	@Then("User enter credit note invoice number in first textbox")
	public void user_enter_credit_note_invoice_number_in_first_textbox() {
		buyerinvoicelisen.Entercreditnoteinvoicenumber();
	}

	@Then("User click search icon")
	public void user_click_search_icon() {
		buyerinvoicelisen.clickthirdtimesearchicon();
	}

	@Then("User enter voided invoice number in first textbox")
	public void user_enter_voided_invoice_number_in_first_textbox() {
		buyerinvoicelisen.Entervoidedinvoicenumber();
	}

	@Then("User enter invoice number in first textbox")
	public void user_enter_invoice_number_in_first_textbox() {
		buyerinvoicelisen.Enterinvoicenumber();
	}

	@Then("User clear on invoice number in first time first textbox")
	public void user_clear_on_invoice_number_in_first_time_first_textbox() {
		buyerinvoicelisen.clearinvoicenumberinfirsttime();
	}

	@Then("User click on search icom in second time")
	public void user_click_on_search_icom_in_second_time() {
		buyerinvoicelisen.clicksearcchiconinsecondtime();
	}

	@Then("User click on calendar from date")
	public void user_click_on_calendar_from_date() {
		buyerinvoicelisen.clickoncalendarfromdate();
	}

	@Then("User click on calendar to date")
	public void user_click_on_calendar_to_date() {
		// buyerinvoicelisen.clickoncalendartodate();
	}

	@Then("User click on outlet")
	public void user_click_on_outlet() {
		buyerinvoicelisen.Clickonoutlet();
	}

	@Then("User click on select all")
	public void user_click_on_select_all() {
		buyerinvoicelisen.Clickonselectall();
	}

	@Then("User click on outside option")
	public void user_click_on_outside_option() {
		// buyerinvoicelisen.Clickonoutsideoption();
	}

	@Then("User click on supplier")
	public void user_click_on_supplier() {
		buyerinvoicelisen.Clickonsupplier();
	}

	@Then("User click on invoice and creditnote")
	public void user_click_on_invoice_and_creditnote() {
		buyerinvoicelisen.Clickoninvoiceandcreditnote();
	}

	@Then("User click on payments status")
	public void user_click_on_payments_status() {
		buyerinvoicelisen.Clickonpaymentsstatus();

	}

	@Then("User click on Export status in invoice page")
	public void user_click_on_Export_status_in_invoice_page() {
		buyerinvoicelisen.ClickonExportstatusininvoicepage();
	}

	@Then("User click on Reset button in order page")
	public void user_click_on_Reset_button_in_order_page() {
		buyerinvoicelisen.ResetButtonClick();
	}

}
