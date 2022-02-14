package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminEssentialsPage;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.AdminPromotionNewDealPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminEssentials {

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
	     
		public AdminEssentials(TestContext testContext) {
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
			}
			
		@Then("User click the Essentials Tab")
		public void user_click_the_Essentials_Tab() {
			AdminEssentialsPage.ClickEssentialsTab();		
		}

		@Then("User Enter name in Search supplier box in the Essentials page{string}")
		public void user_Enter_name_in_Search_supplier_box_in_the_Essentials_page_supplietesting(String name) {
			AdminEssentialsPage.EnterSupplierName(name);
		}

		@Then("user select the status of the dropdown")
		public void user_select_the_status_of_the_dropdown() {
			WebElement status = AdminEssentialsPage.getDropDownStatusElement();
			Select select=new Select(status);
			select.selectByIndex(1);
		}

		@Then("User are Clicks Search button in the Essentials page")
		public void user_are_Clicks_Search_button_in_the_Essentials_page() {
			AdminEssentialsPage.ClickSearchBtn();
		}

		@Then("User Click the Actions dropdown of Essentials")
		public void user_Click_the_Actions_dropdown_of_Essentials() {
			AdminEssentialsPage.ClickActions();
		}

		@Then("User Click on the View settings")
		public void user_Click_on_the_View_settings() {
			AdminEssentialsPage.ViewSettingsClick();
		}

		@Then("User Select Supplier in the dropdown list")
		public void user_Select_Supplier_in_the_dropdown_list() {
			WebElement supplier = AdminEssentialsPage.getDropDownsupplierElement();
			Select select=new Select(supplier);
			select.selectByIndex(2);
		}

		@Then("User Enter the short Descripton{string}")
		public void user_Enter_the_short_Descripton_Hello(String descrip) {
			AdminEssentialsPage.EnterShortDescrip(descrip);
		}

		@Then("User Enter in the Descripton{string}")
		public void user_Enter_in_the_Descripton_Testing(String description) {
			AdminEssentialsPage.EnterDescription(description);
		}

		@Then("User Click the Landing banner of Drag and dropdown field")
		public void user_Click_the_Landing_banner_of_Drag_and_dropdown_field() {
			AdminEssentialsPage.ClickLandingBanner();
		}

		@Then("User Save the Landing banner of Essentials")
		public void user_Save_the_Landing_banner_of_Essentials() {
			AdminEssentialsPage.ClickSaveLandingBanner();
		}

		@Then("User Enter the Rebate percent{string}")
		public void user_Enter_the_Rebate_percent(String rebate) {
			AdminEssentialsPage.EnterRebatePercent(rebate);
		}

		@Then("User Click on the Drag and dropdown field of Essentials")
		public void user_Click_on_the_Drag_and_dropdown_field_of_Essentials() {
			AdminEssentialsPage.ClickCarousebanner();
		}

		@Then("User Save the Carousel banner of Essentials")
		public void user_Save_the_Carousel_banner_of_Essentials() {
			AdminEssentialsPage.ClickSaveCarousebanner();
		}

		@Then("User Click the Update Settings")
		public void user_Click_the_Update_Settings() {
			AdminEssentialsPage.ClickUpdateSettings();
		}
	
	    
		
		
		
}
