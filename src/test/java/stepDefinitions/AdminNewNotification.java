package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminBuyerEditSettingsPage;
import pageObjects.AdminBuyersEditDetailsPage;
import pageObjects.AdminEssentialsPage;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminNewEssentialsPage;
import pageObjects.AdminNewNotificationPage;
import pageObjects.AdminNotificationEditPage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminNewNotification {

		
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
		private AdminBuyerEditSettingsPage adminBuyerEditSettingsPage;
		private AdminNotificationEditPage adminNotificationEditPage;
		private AdminNewNotificationPage adminNewNotificationPage;
		

		public AdminNewNotification(TestContext testContext) {
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
			this.adminBuyerEditSettingsPage=testContext.getPageObjectManager().getAdminBuyerEditSettingsPage();
			this.adminNotificationEditPage=testContext.getPageObjectManager().getAdminNotificationEditPage();
			this.adminNewNotificationPage=testContext.getPageObjectManager().getAdminNewNotificationPage();
			
		}

		@Then("User click on the New notification")
		public void user_click_on_the_New_notification() {
			AdminNewNotificationPage.ClickNewNotification();
		}

		@Then("User Enter the Short description{string}")
		public void user_Enter_the_Short_description_Hiiii(String descrip) {
			AdminNewNotificationPage.EnterShortDescription(descrip);
		}

		@Then("User Enter the Full description{string}")
		public void user_Enter_the_Full_description_Have_to_create_a_notification(String fulldescrip) {
			AdminNewNotificationPage.EnterFullDescription(fulldescrip);
		}

		@Then("User click on the Image")
		public void user_click_on_the_Image() throws InterruptedException {
			//AdminNewNotificationPage.ClickImage(); 
		}

		@Then("User click on intenal link of radio button")
		public void user_click_on_intenal_link_of_radio_button() throws InterruptedException {
			AdminNewNotificationPage.internalLinkClick();
		}

		@Then("User select go to dropdown of create order")
		public void user_select_go_to_dropdown_of_create_order() {
			AdminNewNotificationPage.gotoDropdownClick();			

		}
		
		@Then("User click on dropdown of create order")
		public void user_click_on_dropdown_of_create_order() {
			//AdminNewNotificationPage.createOrderClick();			

		}

		@Then("User enter on button label{string}")
		public void user_enter_on_button_label_velu(String label) {
			AdminNewNotificationPage.enterbuttonLabelValue(label);	
		}

		
}
