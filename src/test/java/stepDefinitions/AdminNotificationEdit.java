package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminBuyerEditSettingsPage;
import pageObjects.AdminBuyersEditDetailsPage;
import pageObjects.AdminEssentialsPage;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminNewEssentialsPage;
import pageObjects.AdminNotificationEditPage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminNotificationEdit {

	
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

		public AdminNotificationEdit(TestContext testContext) {
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
		}

		@When("User Clicks on Admin Notification in the side navigation menubar")
		public void user_Clicks_on_Admin_Notification_in_the_side_navigation_menubar() throws InterruptedException {
			dashboradpage.clickAdminNotification();
		}

		@Then("User clicks Search Title of Notificaion")
		public void user_clicks_Search_Title_of_Notificaion() {
			AdminNotificationEditPage.ClickSearchTitle();
		}

		@Then("User Enter Search Title of Notificaion{string}")
		public void user_Enter_Search_Title_of_Notificaion_testing(String searchtitle) {
			AdminNotificationEditPage.EnterSearchTitle(searchtitle);
		}

		@Then("User Select the dropdown Status of Notification")
		public void user_Select_the_dropdown_Status_of_Notification() {
			WebElement status = AdminNotificationEditPage.getDropDownStatusElement();
			Select select=new Select(status);
			select.selectByIndex(1);	
		}

		@Then("User Clicks Search icon of Notification")
		public void user_Clicks_Search_icon_of_Notification() {
			AdminNotificationEditPage.ClickSearchIcon();
		}

		@Then("User Click the Actions dropdown of Notification")
		public void user_Click_the_Actions_dropdown_of_Notification() {
			AdminNotificationEditPage.ClickActionsDropdown();
		}

		@Then("User Click the Edit")
		public void user_Click_the_Edit() {
			AdminNotificationEditPage.ClickEdit();
		}

		@Then("User Clear the Title")
		public void user_Clear_the_Title() {
			AdminNotificationEditPage.ClickClear();
		}

		@Then("User Enter the Title{string}")
		public void user_Enter_the_Title_Notifie_Test(String title) {
			AdminNotificationEditPage.EntertheTitle(title);
		}
		
		@Then("User Click on the Save button of Notification")
		public void user_Click_on_the_Save_button_of_Notification() {
			AdminNotificationEditPage.ClickSave();
		}

		@Then("User Click the Delete")
		public void user_Click_the_Delete() {
			AdminNotificationEditPage.ClicktheDelete();
		}

		@Then("User clicks on the Clear selection")
		public void user_clicks_on_the_Clear_selection() {
			AdminNotificationEditPage.ClicktheClearSelectionIcon();
		}

		@Then("User click first checkbox")
		public void user_click_first_checkbox() {
			AdminNotificationEditPage.ClickCheckbox();
		}

		@Then("User click Delete option")
		public void user_click_Delete_option() {
			AdminNotificationEditPage.ClickDeleteOption();
		}

		
		
}
