package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminBuyersListingPage;
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

public class AdminBuyersListing {

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
	    private AdminBuyersListingPage adminBuyersListingPage;
		     
			public AdminBuyersListing(TestContext testContext) {
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
					this.adminBuyersListingPage=testContext.getPageObjectManager().getAdminBuyersListingPage();
				}

			@Then("User click on Disable")
			public void user_click_on_Disable() {
				AdminBuyersListingPage.ClickOnDisable();
			}

			@Then("User click on Disable button")
			public void user_click_on_Disable_button() {
				AdminBuyersListingPage.ClickOnDisableButton();
			}

			@Then("User click on Enable icon")
			public void user_click_on_Enable_icon() {
				AdminBuyersListingPage.ClickOnEnable();		
				}

			@Then("User click on Enable button")
			public void user_click_on_Enable_button() {
				AdminBuyersListingPage.ClickOnEnableButton();
			}

			@Then("User click on Edit details")
			public void user_click_on_Edit_details() {
				AdminBuyersListingPage.ClickOnEditDetails();
			}

			@Then("User click on back button of Buyers icon")
			public void user_click_on_back_button_of_Buyers_icon() {
				AdminBuyersListingPage.ClickOnBacktoBuyers();
			}

			@Then("User click on Edit settings")
			public void user_click_on_Edit_settings() {
				AdminBuyersListingPage.EditSettings();
			}

			@Then("User click on View suppliers")
			public void user_click_on_View_suppliers() {
				AdminBuyersListingPage.ClickOnViewSuppliers();
			}

}
