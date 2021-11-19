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
import pageObjects.SupplierPaymentsTransactionPgae;
import pageObjects.SupplierReportOutletPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierPaymentsTransaction {

	
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
	
	public SupplierPaymentsTransaction(TestContext testContext) {
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
	}
	

	
	
	@Then("User click on Payments side navigation list menubar")
	public void user_click_on_Payments_side_navigation_list_menubar() throws InterruptedException {
	    DashboardPage.ClickonsupplierPaymentsicon();
	}

	@Then("User click on transaction icon")
	public void user_click_on_transaction_icon() {
	    SupplierPaymentsTransactionPgae.TransactionIconClick();
	}

	@Then("User set date from calendar in transaction page")
	public void user_set_date_from_calendar_in_transaction_page() {
	    SupplierPaymentsTransactionPgae.SetDatefromCalendar();
	}

	@Then("User click on search button in transaction page")
	public void user_click_on_search_button_in_transaction_page() {
	   SupplierPaymentsTransactionPgae.SearchButtonClick();
	}

	@Then("User click on Export button in transaction page")
	public void user_click_on_Export_button_in_transaction_page() throws InterruptedException {
	    SupplierPaymentsTransactionPgae.ExportButtonClick();
	}

	@Then("User click on first customer in transaction page")
	public void user_click_on_first_customer_in_transaction_page() {
	    SupplierPaymentsTransactionPgae.FirstCustomerClick();
	}

	@Then("User click on back button payments")
	public void user_click_on_back_button_payments() {
	    SupplierPaymentsTransactionPgae.PaymentsBackButtonClick();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
