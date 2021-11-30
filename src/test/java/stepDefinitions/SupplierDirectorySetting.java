package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierDirectoryProductPage;
import pageObjects.SupplierDirectorySettingPage;
import pageObjects.SupplierTeamListPage;
import pageObjects.SupplierUserListPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderslistingpage;

public class SupplierDirectorySetting {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
    private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private SupplierDirectorySettingPage supplierdirectorysetting;
	
	
	public SupplierDirectorySetting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
        this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
        this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
        this.supplierdirectorysetting= testContext.getPageObjectManager().getSupplierDirectorySettingPage();
        
	}
	
	@Then("User click on manage settings in directory page")
	public void user_click_on_manage_settings_in_directory_page() {
		SupplierDirectorySettingPage.ClickonManageaSettings();

	}

	@Then("User clear on about the company in general settings page")
	public void user_clear_on_about_the_company_in_general_settings_page() {
		SupplierDirectorySettingPage.AbouttheCompanyclear();

	}

	

	@Then("User click on certifications check box in directory page")
	public void user_click_on_certifications_check_box_in_directory_page() {
		SupplierDirectorySettingPage.ClickonCertificationsCheckbox();

	}

	@Then("User click on save button in directory page")
	public void user_click_on_save_button_in_directory_page() {
		SupplierDirectorySettingPage.ClickonSave();

	}

	@Then("User enter on about the company textbox field {string}")
	public void user_enter_on_about_the_company_textbox_field(String text) {
		SupplierDirectorySettingPage.AbouttheCompanyEnter(text);
	}
	
}
