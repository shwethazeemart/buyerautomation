package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

public class AdminBuyersEditDetails {

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
		     
			public AdminBuyersEditDetails(TestContext testContext) {
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
				}
			
			@Then("User clicks on Edit details")
			public void user_clicks_on_Edit_details() throws InterruptedException {
				AdminBuyersEditDetailsPage.ClickOnEditDetails();
			}

			@Then("User clear on Outlet email")
			public void user_clear_on_Outlet_email() throws InterruptedException {
				AdminBuyersEditDetailsPage.ClearOnOutletEmail();
			}

			@Then("User click on the Tags")
			public void user_click_on_the_Tags() throws InterruptedException {
				AdminBuyersEditDetailsPage.ClickOnTags();
			}

			@Then("User Enter the Tags{string}")
			public void user_Enter_the_Tags(String tags) {
				AdminBuyersEditDetailsPage.EnterTags(tags);
			}
			
			
}