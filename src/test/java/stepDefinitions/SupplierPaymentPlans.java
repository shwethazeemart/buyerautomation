package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.SupplierPaymentPlansPage;
import pageObjects.SupplierPaymentsTransactionPgae;
import pageObjects.SupplierReportOutletPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierinvoiceslistingpage;

public class SupplierPaymentPlans {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private SupplierCustomerCompanyPage supplierCustomerCompany;
	private SupplierCatalogueListPage supplierCatalogueList;
	private SupplierAddNewSkuPage supplierAddNewSku;
	private Buyerreportspenperoutletpage buyerreportspenperoutlet;
	private SupplierReportOutletPage supplierReportOutlet;
	private SupplierPaymentsTransactionPgae supplierPaymentsTransaction;
	private SupplierPaymentPlansPage supplierPaymentPlans;
	private Supplierinvoiceslistingpage supplierinvoiceslisting;
	

	public SupplierPaymentPlans(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
		this.supplierCatalogueList=testContext.getPageObjectManager().getSupplierCatalogueListPage();
		this.supplierAddNewSku=testContext.getPageObjectManager().getSupplierAddNewSkuPage();
		this.buyerreportspenperoutlet = testContext.getPageObjectManager().getBuyerreportspenperoutletpage(); 
		this.supplierReportOutlet=testContext.getPageObjectManager().getSupplierReportOutletPage(); 
        this.supplierPaymentsTransaction=testContext.getPageObjectManager().getSupplierPaymentsTransactionPgae();
        this.supplierPaymentPlans=testContext.getPageObjectManager().getSupplierPaymentPlansPage();
        this.supplierinvoiceslisting=testContext.getPageObjectManager().getSupplierinvoiceslistingpage();
	}





	@Then("User click on payment plans icon")
	public void user_click_on_payment_plans_icon() {
		SupplierPaymentPlansPage.PaymentPlansIconClick();
	}

	
	@Then("User click on paid status company")
	public void user_click_on_paid_status_company() {
		SupplierPaymentPlansPage.PaidStayusCompanyClick();
	}
	@Then("User click on issued bill amount")
	public void user_click_on_issued_bill_amount() {
		SupplierPaymentPlansPage.IssuedBillAmountClick();
	}
	@Then("User click on Bill issued invoice")
	public void user_click_on_Bill_issued_invoice() {
		SupplierPaymentPlansPage.BillInvoiceClick();
	}



	
	@Then("User select failed payment status in dropdown lists")
	public void user_select_failed_payment_status_in_dropdown_lists() throws InterruptedException {
	   SupplierPaymentPlansPage.PaymentFailedStatusSelect();
	}
 


	
	@Then("User select unpaid payment status in dropdown lists")
	public void user_select_unpaid_payment_status_in_dropdown_lists() throws InterruptedException {
	    SupplierPaymentPlansPage.PaymentUnpaidStatusSelect();
	}
    

	@Then("User select paid payment status in dropdown lists")
	public void user_select_paid_payment_status_in_dropdown_lists() throws InterruptedException {
		SupplierPaymentPlansPage.PaymentPaidStatusSelect();
	}

	//Export xero
	
	@Then("User click on first order in order page")
	public void user_click_on_first_order_in_order_page() throws InterruptedException {
		SupplierPaymentPlansPage.firstOrderInvoiceClick();
	}

	@Then("User click on create einvoice in the particular order")
	public void user_click_on_create_einvoice_in_the_particular_order() throws InterruptedException {
		SupplierPaymentPlansPage.createeInvoiceClick(); 
	}

	@Then("User click on email filed in invoice page")
	public void user_click_on_email_filed_in_invoice_page() throws InterruptedException {
		SupplierPaymentPlansPage.emailFieldClick();
	}

	@Then("User clear the email field in invoice page")
	public void user_clear_the_email_field_in_invoice_page() {
		SupplierPaymentPlansPage.emailFieldClear();
	}

	@Then("User enter the email in invoice page{string}")
	public void user_enter_the_email_in_invoice_page_velumani_zeemart_asia(String email) {
		SupplierPaymentPlansPage.emailEnterintheFiled(email);
	}

	@Then("User click on save and issue button in invoice page")
	public void user_click_on_save_and_issue_button_in_invoice_page() {
		SupplierPaymentPlansPage.saveandissueButtonClick();
	}

	@Then("User click on check box of first invoice")
	public void user_click_on_check_box_of_first_invoice() throws InterruptedException {
		SupplierPaymentPlansPage.firstCheckBoxClick();
	}

	@Then("User click on export xero icon in invoice page")
	public void user_click_on_export_xero_icon_in_invoice_page() {
		SupplierPaymentPlansPage.exportXeroIconClick();
	}

	@Then("User click on yes processed popup message")
	public void user_click_on_yes_processed_popup_message() throws InterruptedException {
		SupplierPaymentPlansPage.yesProcessedPopUpClick();
	}












}
