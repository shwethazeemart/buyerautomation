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

	
	










}
