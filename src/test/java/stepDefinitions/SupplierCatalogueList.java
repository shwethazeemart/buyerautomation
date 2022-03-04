package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierCatalogueList {

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

	public SupplierCatalogueList(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
		this.supplierCatalogueList=testContext.getPageObjectManager().getSupplierCatalogueListPage();
	}




	@Then("User click on Catalogue side navigation list menubar")
	public void user_click_on_Catalogue_side_navigation_list_menubar() throws InterruptedException {
		DashboardPage.ClickonsupplierCatalogueicon();
	}

	@Then("User click on checkbox in catalogue list")
	public void user_click_on_checkbox_in_catalogue_list() {
		SupplierCatalogueListPage.CheckboxClick();
	}

	@Then("User click on clear icon in catalogue list")
	public void user_click_on_clear_icon_in_catalogue_list() {
		SupplierCatalogueListPage.ClearIconClick();
	}

	@Then("User click on hide from customers")
	public void user_click_on_hide_from_customers() throws InterruptedException {
		SupplierCatalogueListPage.HideFromCustomersClick();
	}
	@Then("User click on unhide")
	public void user_click_on_unhide() throws InterruptedException {
		SupplierCatalogueListPage.UnhideClick();
	}
	@Then("User click on add new sku")
	public void user_click_on_add_new_sku() throws InterruptedException {
		SupplierCatalogueListPage.AddNewSkuClick();
	}
	@Then("User click on backbutton of catalogue")
	public void user_click_on_backbutton_of_catalogue() {
		SupplierCatalogueListPage.AddNewSkuBackbuttonClick();
	}
	
	@Then("User click on options icon in catalogue list")
	public void user_click_on_options_icon_in_catalogue_list() throws InterruptedException {
	    SupplierCatalogueListPage.OptionsClick();
	}
	
	@Then("User click on view deleted sku")
	public void user_click_on_view_deleted_sku() {
		SupplierCatalogueListPage.ViewDeletedSKUClick();
	}
	@Then("User click on backbutton of deleted sku")
	public void user_click_on_backbutton_of_deleted_sku() {
		SupplierCatalogueListPage.BackbuttonofDeletedSKU();
	}
	@Then("User click on upload catalogue")
	public void user_click_on_upload_catalogue() {
		SupplierCatalogueListPage.UploadCatalogueClick();
	}
	@Then("User click on back button of upload catalogue")
	public void user_click_on_back_button_of_upload_catalogue() {
		SupplierCatalogueListPage.BackbuttonofUploadCatalogueClick();
	}
	@Then("User click on download entire catalogue")
	public void user_click_on_download_entire_catalogue() {
		SupplierCatalogueListPage.EntireCatalogueClick();
	}
	@Then("User click upload inventory")
	public void user_click_upload_inventory() {
		SupplierCatalogueListPage.UploadInventoryClick();
	}
	@Then("User click on back button of upload inventory")
	public void user_click_on_back_button_of_upload_inventory() {
		SupplierCatalogueListPage.BackbuttonofUploadInventory();
	}
	@Then("User click on filter in catalogue list")
	public void user_click_on_filter_in_catalogue_list() throws InterruptedException {
		SupplierCatalogueListPage.FilterClick();
	}
	@Then("User click on deselect options")
	public void user_click_on_deselect_options() {
		SupplierCatalogueListPage.DeselectOptionsClick();
	}
	@Then("User click on select options")
	public void user_click_on_select_options() {
		SupplierCatalogueListPage.SelectOptionsClick();
	}
	@Then("User click on save button in sku page")
	public void user_click_on_save_button_in_sku_page() {
		SupplierCatalogueListPage.SaveButtonClick();
	}


	@Then("User click on  second checkbox in catalogue list")
	public void user_click_on_second_checkbox_in_catalogue_list() {
		SupplierCatalogueListPage.secondCheckboxClick();
	}



	




}
