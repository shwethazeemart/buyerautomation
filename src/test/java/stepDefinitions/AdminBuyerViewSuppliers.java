package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminBuyerViewSuppliersPage;
import pageObjects.AdminBuyersEditDetailsPage;
import pageObjects.AdminEssentialsPage;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminNewEssentialsPage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminBuyerViewSuppliers {

	
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
	    private AdminEssentialsPage adminEssentialsPage;
	    private AdminNewEssentialsPage adminNewEssentialsPage;
	    private AdminBuyersEditDetailsPage adminBuyersEditDetailsPage;
	    private AdminBuyerViewSuppliersPage adminBuyerViewSuppliersPage;
		     
			public AdminBuyerViewSuppliers(TestContext testContext) {
				super();
		
					this.testContext = testContext;
					this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
					this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
					this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
					this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
					this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
					this.adminsuppliersviewoutletspage=testContext.getPageObjectManager().getAdminsuppliersviewoutletspage();				
					this.testContext = testContext;
					this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
					this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
					this.adminEssentialsPage=testContext.getPageObjectManager().getAdminEssentialsPage();	
					this.adminNewEssentialsPage=testContext.getPageObjectManager().getAdminNewEssentialsPage();
					this.adminBuyersEditDetailsPage=testContext.getPageObjectManager().getAdminBuyersEditDetailsPage();
					this.adminBuyerViewSuppliersPage=testContext.getPageObjectManager().getAdminBuyerViewSuppliersPage();
				}
			
			@Then("User click on back to return page")
			public void user_click_on_back_to_return_page() throws InterruptedException {
				AdminBuyerViewSuppliersPage.ClickOnReturnBackpage();
			}
			
}
