package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.SupplierReportOutletPage;
import pageObjects.SupplierReportSkuPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierReportSku {

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
	private SupplierAddNewSkuPage supplierAddNewSku;
	private Buyerreportspenperoutletpage buyerreportspenperoutlet;
	private SupplierReportOutletPage supplierReportOutlet;
	private SupplierReportSkuPage supplierReportSku;

	public SupplierReportSku(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
		this.supplierCatalogueList=testContext.getPageObjectManager().getSupplierCatalogueListPage();
		this.supplierAddNewSku=testContext.getPageObjectManager().getSupplierAddNewSkuPage();
		this.buyerreportspenperoutlet = testContext.getPageObjectManager().getBuyerreportspenperoutletpage(); 
		this.supplierReportOutlet=testContext.getPageObjectManager().getSupplierReportOutletPage();
		this.supplierReportSku=testContext.getPageObjectManager().getSupplierReportSkuPage();
	}


 

	@Then("User click on orders received sku")
	public void user_click_on_orders_received_sku() {
		SupplierReportSkuPage.OrdersReceviedSkuClick();
	}
 

	@Then("User click on search sku orders recevied page")
	public void user_click_on_search_sku_orders_recevied_page() {
		SupplierReportSkuPage.SearchBoxClick();
	}
	@Then("User enter sku name in search icon{string}")
	public void user_enter_sku_name_in_search_icon_Sakthimasala100(String skuname) {
		SupplierReportSkuPage.SkuNameEnter(skuname); 
	}
	@Then("User select invoice date from calendar field")
	public void user_select_invoice_date_from_calendar_field() {
		SupplierReportSkuPage.SelectDatefromCalendar(); 
	}
	@Then("User select on outlets in dropdown list")
	public void user_select_on_outlets_in_dropdown_list() {
		WebElement Outlet =supplierReportSku.getDropDownElementOutlet();
		Select select=new Select(Outlet);
		select.selectByIndex(3);
	}
	@Then("User click on search icon in orders received sku page")
	public void user_click_on_search_icon_in_orders_received_sku_page() throws InterruptedException {
		SupplierReportSkuPage.SearchIconClick();
	}
	@Then("User click on export icon in sku page")
	public void user_click_on_export_icon_in_sku_page() throws InterruptedException {
		SupplierReportSkuPage.ExportIconClick();
	}
	@Then("User click on sku in orders recevied sku page")
	public void user_click_on_sku_in_orders_recevied_sku_page() throws InterruptedException {
		SupplierReportSkuPage.SkuOrderClick();
	}
	@Then("User click on bdl quantity order")
	public void user_click_on_bdl_quantity_order() {
		SupplierReportSkuPage.BdlClick();
	}
	@Then("User click on bch quantity order")
	public void user_click_on_bch_quantity_order() {
		SupplierReportSkuPage.BchClick();
	}
	@Then("User click on blk quantity order")
	public void user_click_on_blk_quantity_order() {
		SupplierReportSkuPage.BlkClick(); 
	}
	@Then("User click on box quantity order")
	public void user_click_on_box_quantity_order() {
		SupplierReportSkuPage.BoxClick();
	}
	@Then("User click on filter in sku page")
	public void user_click_on_filter_in_sku_page() {
		SupplierReportSkuPage.FilterClick();
	}
	@Then("User select outlet in dropdown list in sku page")
	public void user_select_outlet_in_dropdown_list_in_sku_page() {
		WebElement SelectOutlet =supplierReportSku.getDropDownElementOutletTwo();
		Select select=new Select(SelectOutlet);
		select.selectByIndex(3);
	}
	@Then("User click on export icon in sku apge")
	public void user_click_on_export_icon_in_sku_apge() throws InterruptedException {
		SupplierReportSkuPage.ExportIconTwoClick();
	}



	@Then("User click on apply button in sku page")
	public void user_click_on_apply_button_in_sku_page() {
		SupplierReportSkuPage.ApplyButtonClick();
	}





}
