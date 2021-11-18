package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierDirectoryProductPage;
import pageObjects.SupplierTeamListPage;
import pageObjects.SupplierUserListPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderslistingpage;

public class SupplierDirectoryProduct {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
    private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private SupplierDirectoryProductPage supplierdirectoryproduct;
	
	
	public SupplierDirectoryProduct(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
        this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
        this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
        this.supplierdirectoryproduct= testContext.getPageObjectManager().getSupplierDirectoryProductPage();
        
	}
	

@Then("User click on Directory side navigation list menubar")
public void user_click_on_Directory_side_navigation_list_menubar() throws InterruptedException {
	DashboardPage.ClickonDirectoryinthesidemenu();
}


@Then("User click on manage products in directory page")
public void user_click_on_manage_products_in_directory_page() {
   SupplierDirectoryProductPage.ClicktheManageaproducts();
}

@Then("User click on textbox in directory page")
public void user_click_on_textbox_in_directory_page() {
	SupplierDirectoryProductPage.Textboxclick();
}

@Then("User click on search button in directory page")
public void user_click_on_search_button_in_directory_page() {
	SupplierDirectoryProductPage.Searchclick();
}

@Then("User click on Unlist in dropdown field")
public void user_click_on_Unlist_in_dropdown_field() {
	SupplierDirectoryProductPage.Unlistclick();
}

@Then("User click on list in dropdown field")
public void user_click_on_list_in_dropdown_field() {
	SupplierDirectoryProductPage.listclick();
}

@Then("User click on edit details in dropdown field")
public void user_click_on_edit_details_in_dropdown_field() {
	SupplierDirectoryProductPage.Editdetailsclick();
}

@Then("User clear on Supplier product code in edit sku page")
public void user_clear_on_Supplier_product_code_in_edit_sku_page() { 
	SupplierDirectoryProductPage.SupplierProductCodeclear();
}


@Then("User click on done & update in catalogue in edit sku page")
public void user_click_on_done_update_in_catalogue_in_edit_sku_page() {
	SupplierDirectoryProductPage.DoneUpdateCatalogueclick();
}

@Then("User click on actions dropdown field in directory page")
public void user_click_on_actions_dropdown_field_in_directory_page() {
	SupplierDirectoryProductPage.ActionsDropdownclick();
}

//@Then("User enter on Supplier product code in edit sku page {string}")
public void user_enter_on_Supplier_product_code_in_edit_sku_page(String code) {
	SupplierDirectoryProductPage.SupplierProductCodeEnter(); }



@Then("User enter on Supplier product code in edit sku page\"{int}\"")
public void user_enter_on_Supplier_product_code_in_edit_sku_page(Integer int1) {
	SupplierDirectoryProductPage.SupplierProductCodeEnter(); 
	
}
 
}