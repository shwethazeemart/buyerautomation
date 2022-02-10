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
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierReportOutlet {

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

	public SupplierReportOutlet(TestContext testContext) {
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
	}




	@Then("User click on Reports side navigation list menubar")
	public void user_click_on_Reports_side_navigation_list_menubar() throws InterruptedException {
		DashboardPage.ClickonsupplierReportsicon();
	}


	@Then("User click on orders received outlet")
	public void user_click_on_orders_received_outlet() {
		SupplierReportOutletPage.ReceivedOutletClick();
	}

	@Then("User select date from calendar icon")
	public void user_select_date_from_calendar_icon() {
		SupplierReportOutletPage.DateSelectfromCalendar();
	}
	@Then("User click filter in orders received")
	public void user_click_filter_in_orders_received() throws InterruptedException {
		SupplierReportOutletPage.FilterClick();
	}
	@Then("User select customer in dropdown list")
	public void user_select_customer_in_dropdown_list() {
		WebElement Allcustomer =supplierReportOutlet.getDropDownElementAllCustomer();
		Select select=new Select(Allcustomer);
		select.selectByVisibleText("VELU MASALA");
	}
	@Then("User select team in dropdown list")
	public void user_select_team_in_dropdown_list() {
		WebElement Team =supplierReportOutlet.getDropDownElementTeam();
		Select select=new Select(Team);
		select.selectByVisibleText("VeluTesting");
	}
	@Then("User click on apply button in recevied outlet page")
	public void user_click_on_apply_button_in_recevied_outlet_page() {
		SupplierReportOutletPage.ApplyButtonClick();
	}
	@Then("User click on outlet in recevied outlet page")
	public void user_click_on_outlet_in_recevied_outlet_page() {
		SupplierReportOutletPage.OutletIconClick();
	}
	@Then("User click on export icon in orders recevied page")
	public void user_click_on_export_icon_in_orders_recevied_page() {
		SupplierReportOutletPage.ExportButtonClick();
	}


	@Then("User click on search icon in orders recevied page")
	public void user_click_on_search_icon_in_orders_recevied_page() {
		SupplierReportOutletPage.SearchIconClick();
	}




























}
