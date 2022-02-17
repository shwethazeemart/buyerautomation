package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminPromoCodePage;
import pageObjects.AdminSupplierEditBlackoutpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.AdminSupplierEditDirectorypage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierEditDirectory {

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
    private AdminSupplierEditCompanypage adminSupplierEditCompany;
    private AdminSupplierEditDefaultpage adminSupplierEditDefault;
    private AdminSupplierEditBlackoutpage adminSupplierEditBlackout;
    private AdminSupplierEditDirectorypage adminSupplierEditDirectory;
    
    
	public AdminSupplierEditDirectory(TestContext testContext) {
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
		this.adminSupplierEditCompany = testContext.getPageObjectManager().getAdminSupplierEditCompanypage();
		this.adminSupplierEditDefault = testContext.getPageObjectManager().getAdminSupplierEditDefaultpage();
		this.adminSupplierEditBlackout = testContext.getPageObjectManager().getAdminSupplierEditBlackoutpage();
		this.adminSupplierEditDirectory = testContext.getPageObjectManager().getAdminSupplierEditDirectorypage();
		
		
		
	}
	
	
	
	@Then("User click on edit directory setting")
	public void user_click_on_edit_directory_setting() {
	    AdminSupplierEditDirectorypage.editDirectoryClick();
	}

	@Then("User click on manage products in directory field")
	public void user_click_on_manage_products_in_directory_field() {
	    AdminSupplierEditDirectorypage.manageProductsClick();
	}

	@Then("User enter on search name in search textbox field{string}")
	public void user_enter_on_search_name_in_search_textbox_field_100pipers(String searchname) {
	    AdminSupplierEditDirectorypage.enterSupplierName(searchname);
	}

	@Then("User click on search icon in directory field")
	public void user_click_on_search_icon_in_directory_field() throws InterruptedException {
	    AdminSupplierEditDirectorypage.searchIconClick();
	}

	@Then("User clear on search name in directory field")
	public void user_clear_on_search_name_in_directory_field() {
	    AdminSupplierEditDirectorypage.supplierNameClear(); 
	}

	@Then("User select on listed option in dropdown filed")
	public void user_select_on_listed_option_in_dropdown_filed() throws InterruptedException {
		AdminSupplierEditDirectorypage.selectListedValue();
		
	}

	@Then("User select on unlisted option in dropdown field")
	public void user_select_on_unlisted_option_in_dropdown_field() throws InterruptedException {
		AdminSupplierEditDirectorypage.selectUnlistedValue();
	}

	@Then("User select on all sku option in dropdown field")
	public void user_select_on_all_sku_option_in_dropdown_field() throws InterruptedException {
		AdminSupplierEditDirectorypage.selectAllSkusValue();
	}

	@Then("User click on actions dropdown in directory field")
	public void user_click_on_actions_dropdown_in_directory_field() {
	   AdminSupplierEditDirectorypage.actionsDropdownClick();
	}

	@Then("User click on unlist in dropdown field")
	public void user_click_on_unlist_in_dropdown_field() {
	    AdminSupplierEditDirectorypage.unlistIconClick();
	}

	@Then("User click on edit in dropdown field")
	public void user_click_on_edit_in_dropdown_field() {
	    AdminSupplierEditDirectorypage.editLinkClick();
	}

	@Then("User clear on supplier product code")
	public void user_clear_on_supplier_product_code() {
	    AdminSupplierEditDirectorypage.productCodeClear();
	}

	@Then("User enter on value in supplier product code{string}")
	public void user_enter_on_value_in_supplier_product_code(String productcode) {
		AdminSupplierEditDirectorypage.enterProductCode(productcode);
	}

	@Then("User click on done update cataglogue button")
	public void user_click_on_done_update_cataglogue_button() {
	   AdminSupplierEditDirectorypage.doneandupdateCatalogueClick(); 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
