package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
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

public class AdminNewEssentials {

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
		     
			public AdminNewEssentials(TestContext testContext) {
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
				}
			
			@Then("User click on the New Essentials listing")
			public void user_click_on_the_New_Essentials_listing() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}

			@Then("User Click on the Next SKU")
			public void user_Click_on_the_Next_SKU() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}

			@Then("User Clear the Price option field")
			public void user_Clear_the_Price_option_field() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}

			@Then("User Enter the Price field\"{int}\"")
			public void user_Enter_the_Price_field(Integer int1) {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}

			@Then("User click on the Add to listing")
			public void user_click_on_the_Add_to_listing() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new io.cucumber.java.PendingException();
			}
 
}
