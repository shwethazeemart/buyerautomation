package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCompanySettingsPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.SupplierPaymentPlansPage;
import pageObjects.SupplierPaymentsTransactionPgae;
import pageObjects.SupplierReportOutletPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierCompanySettings {


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
	private SupplierCompanySettingsPage supplierCompanySettings;


	public SupplierCompanySettings(TestContext testContext) {
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
		this.supplierCompanySettings=testContext.getPageObjectManager().getSupplierCompanySettingsPage();

	}




	@Then("User click on user account icon")
	public void user_click_on_user_account_icon() throws InterruptedException {
		SupplierCompanySettingsPage.UserAccountClick();
	}


	@Then("User click on company settings in user account page")
	public void user_click_on_company_settings_in_user_account_page() {
		SupplierCompanySettingsPage.CompanySettingClick();
	}
	@Then("User click on details in company settings")
	public void user_click_on_details_in_company_settings() throws InterruptedException {
		SupplierCompanySettingsPage.DetailsIconClick();
	}
	@Then("User click on payments in company settings")
	public void user_click_on_payments_in_company_settings() {
		SupplierCompanySettingsPage.PaymentsIconClick();
	}
	@Then("User click on invoicing in company settings")
	public void user_click_on_invoicing_in_company_settings() {
		SupplierCompanySettingsPage.InvoicingIconClick();
	}
	@Then("User click on integration in company settings")
	public void user_click_on_integration_in_company_settings() {
		SupplierCompanySettingsPage.IntegrationIconClick();
	}
	@Then("User click on subscription in company settings")
	public void user_click_on_subscription_in_company_settings() {
		SupplierCompanySettingsPage.SubscriptionIconClick();
	}
	@Then("User click on view priceing options in subscription")
	public void user_click_on_view_priceing_options_in_subscription() {
		//SupplierCompanySettingsPage.ViewPricingoptionsClick();
	}





















}
