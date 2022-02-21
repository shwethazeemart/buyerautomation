package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminBuyerEditSettingsPage;
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

public class AdminBuyerEditSettings {

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

	public AdminBuyerEditSettings(TestContext testContext) {
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
	}

	@Then("User clicks on Edit settings")
	public void user_clicks_on_Edit_settings() throws InterruptedException {
		AdminBuyerEditSettingsPage.ClickOnEditSettings();
	}

	@Then("User click on search box of Edit setings")
	public void user_click_on_search_box_of_Edit_setings() throws InterruptedException {
		AdminBuyerEditSettingsPage.ClickSearchBox();
	}

	@Then("User Enter the name in search box of Edit setings{string}")
	public void user_Enter_the_name_in_search_box_of_Edit_setings_buyer(String name) {
		AdminBuyerEditSettingsPage.EnterNameSearchbox(name);
	}

	@Then("User click on check box in Edit settings page")
	public void user_click_on_check_box_in_Edit_settings_page() throws InterruptedException {
		AdminBuyerEditSettingsPage.ClickOnCheckbox();
	}

	@Then("User click on outside section of Edit settings")
	public void user_click_on_outside_section_of_Edit_settings() {
		AdminBuyerEditSettingsPage.ClickOnOutsideSection();
	}

	@Then("User click on save button setings")
	public void user_click_on_save_button_setings() {
		AdminBuyerEditSettingsPage.ClickOnSavebutton();
	}




}
