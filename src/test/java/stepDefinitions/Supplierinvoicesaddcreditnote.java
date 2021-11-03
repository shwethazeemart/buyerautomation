package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierinvoicesaddcreditnotepage;
import pageObjects.Supplierinvoiceslistingpage;
import pageObjects.Supplierorderseinvoicepage;
import pageObjects.Supplierorderslistingpage;

public class Supplierinvoicesaddcreditnote {

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
    private Supplierinvoicesaddcreditnotepage supplierinvoicesaddcreditnote;

	public Supplierinvoicesaddcreditnote(TestContext testContext) {
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
		this.supplierinvoicesaddcreditnote=testContext.getPageObjectManager().getSupplierinvoicesaddcreditnotepage();
		
	}




	@Then("User click on first invoice in the invoices list page")
	public void user_click_on_first_invoice_in_the_invoices_list_page() {
		Supplierinvoicesaddcreditnotepage.Clickonfirstinvoiceinlists();
	}


	@Then("User click on mark as paid button in that invoice page")
	public void user_click_on_mark_as_paid_button_in_that_invoice_page() {
		Supplierinvoicesaddcreditnotepage.Clickonmarkaspaid();
	}
	@Then("User click on options dropdown in the invoice page")
	public void user_click_on_options_dropdown_in_the_invoice_page() {
		Supplierinvoicesaddcreditnotepage.Clickononoptionsdropdownicon();
	}
	@Then("User click on add credit note in the invoice page")
	public void user_click_on_add_credit_note_in_the_invoice_page() {
		Supplierinvoicesaddcreditnotepage.Clickonaddcreditnote();
	}
	@Then("User click on quantity field in credit note page")
	public void user_click_on_quantity_field_in_credit_note_page() {
		Supplierinvoicesaddcreditnotepage.Clickonquantityfieldincreditnotepage();
	}
	@Then("User clear on quantity field in credit note page")
	public void user_clear_on_quantity_field_in_credit_note_page() {
		Supplierinvoicesaddcreditnotepage.Clearquantityfield();
	}
	@Then("User enter on value in quantity field{string}")
	public void user_enter_on_value_in_quantity_field(String quantityvalue) {
		Supplierinvoicesaddcreditnotepage.Enteronquantityvalueinquantityfield(quantityvalue);
	}
	@Then("User click on scroll down in credit note page")
	public void user_click_on_scroll_down_in_credit_note_page() {
		Supplierinvoicesaddcreditnotepage.Clickonscrolldownincreditnotepage();
	}
	@Then("User click on save and issue button in credit note page")
	public void user_click_on_save_and_issue_button_in_credit_note_page() throws InterruptedException {
		Supplierinvoicesaddcreditnotepage.Clickonsaveandissuebutton();
	}
	@Then("User click on duplicate options dropdown field")
	public void user_click_on_duplicate_options_dropdown_field() {
		Supplierinvoicesaddcreditnotepage.Clickonduplicateoptionsindropdown();
	}
	@Then("User click on scroll down in duplicate page")
	public void user_click_on_scroll_down_in_duplicate_page() {
		Supplierinvoicesaddcreditnotepage.Clickonscrolldowninduplicatepage();
	}
	@Then("User click on save and issue button in duplicate page")
	public void user_click_on_save_and_issue_button_in_duplicate_page() throws InterruptedException {
		Supplierinvoicesaddcreditnotepage.Clickonsaveandissuebuttoninduplicatepage();
	}
	@Then("User click on void link in invoice page")
	public void user_click_on_void_link_in_invoice_page() {
		Supplierinvoicesaddcreditnotepage.Clickonvoidlinkininvoicepage();
	}
	@Then("User click on reason in invoice field popup message")
	public void user_click_on_reason_in_invoice_field_popup_message() {
		Supplierinvoicesaddcreditnotepage.Clickonreasonpopupmessagefield();
	}
	
	
	@Then("User click on download DO in options dropdown field")
	public void user_click_on_download_DO_in_options_dropdown_field() {
		Supplierinvoicesaddcreditnotepage.ClickondownloadDOinoptionsfield();
	}

    @Then("User click on yes mark as paid in popup message in the invoice page")
    public void user_click_on_yes_mark_as_paid_in_popup_message_in_the_invoice_page() {
    	Supplierinvoicesaddcreditnotepage.Clickonyesmarkpaidpopup(); 

	}


		

    @Then("User enter on reason in invoice field popup message{string}")
	public void user_enter_on_reason_in_invoice_field_popup_message_reason(String reason) {
		Supplierinvoicesaddcreditnotepage.Enteronreasoninopoup(reason);
	}










}
