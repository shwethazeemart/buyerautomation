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
import pageObjects.SupplierReportSalesCustomerPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierReportSalesCustomer {

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
		private SupplierCompanySettingsPage supplierCompanySettings;
		private SupplierReportSalesCustomerPage SupplierReportSalesCustomer;
		


		public SupplierReportSalesCustomer(TestContext testContext) {
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
			this.supplierCompanySettings=testContext.getPageObjectManager().getSupplierCompanySettingsPage();
			this.SupplierReportSalesCustomer=testContext.getPageObjectManager().getSupplierReportSalesCustomerPage();

		}

		@Then("User click on Sales report customer")
		public void user_click_on_Sales_report_customer() {
			SupplierReportSalesCustomerPage.ClickSalesCustomer();
		}

		@Then("User select date from calendar icon of sales customer")
		public void user_select_date_from_calendar_icon_of_sales_customer() {
			SupplierReportSalesCustomerPage.SelectDateSalesCustomer();
		}

		@Then("User Clear the date")
		public void user_Clear_the_date() {
			SupplierReportSalesCustomerPage.ClearDate();
		}

		@Then("User click on export icon of Sales customer")
		public void user_click_on_export_icon_of_Sales_customer() {
			SupplierReportSalesCustomerPage.ClickExport();
		}
	
	
}
