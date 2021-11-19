package stepDefinitions;

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
import pageObjects.SupplierReportPlanningPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierReportPlanning {

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
	private SupplierReportPlanningPage supplierReportPlanning;

	public SupplierReportPlanning(TestContext testContext) {
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
		this.supplierReportPlanning=testContext.getPageObjectManager().getSupplierReportPlanningPage();
	}
	
	
	
	
	@Then("User click on supply planning in report page")
	public void user_click_on_supply_planning_in_report_page() {
	    SupplierReportPlanningPage.SupplyPlanningClick();
	}

	@Then("User set date in calendar field")
	public void user_set_date_in_calendar_field() { 
	    SupplierReportPlanningPage.DateSetfromCalendar();
	}

	@Then("User click on generate report button")
	public void user_click_on_generate_report_button() {
	    SupplierReportPlanningPage.GenerateReportClick();
	}

	@Then("User click on download as csv button")
	public void user_click_on_download_as_csv_button() {
	    SupplierReportPlanningPage.DownloadasCsvClick();
	}

	@Then("User click on first code in supply planning")
	public void user_click_on_first_code_in_supply_planning() {
	   SupplierReportPlanningPage.FirstCodeClick();
	}

	@Then("User clear on quantity stock count today")
	public void user_clear_on_quantity_stock_count_today() {
	    SupplierReportPlanningPage.StockCountClear();
	}

	@Then("User enter on quantity stock count today{string}")
	public void user_enter_on_quantity_stock_count_today(String stockcount) {
	    SupplierReportPlanningPage.StockCountEnter(stockcount);
	}

	@Then("User click on checkbox stock count")
	public void user_click_on_checkbox_stock_count() {
	    SupplierReportPlanningPage.CheckboxClick(); 
	}

	@Then("User click on save button stock count")
	public void user_click_on_save_button_stock_count() {
	    SupplierReportPlanningPage.SaveButtonClick();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
