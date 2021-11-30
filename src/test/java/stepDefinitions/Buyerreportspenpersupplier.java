package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.Buyerreportspenpersupplierpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportspenpersupplier {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsviewsupplierspage buyeroutletsviewsuppliers;
    private Buyerreportspenperoutletpage buyerreportspenperoutlet;
    private Buyerreportspenpersupplierpage buyerreportspenpersupplier;
    
    
    
	public Buyerreportspenpersupplier(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsviewsuppliers = testContext.getPageObjectManager().getBuyeroutletsviewsupplierspage();
		this.buyerreportspenperoutlet = testContext.getPageObjectManager().getBuyerreportspenperoutletpage();
		this.buyerreportspenpersupplier = testContext.getPageObjectManager().getBuyerreportspenpersupplierpage();
		
	}
	
	
	
	@Then("User click on spending per supplier icon")
	public void user_click_on_spending_per_supplier_icon() {
	   Buyerreportspenpersupplierpage.Clickonspendingpersupplier();
	}

	@Then("User click on supplier search box")
	public void user_click_on_supplier_search_box() {
	    Buyerreportspenpersupplierpage.Clicksearchbox();
	}

	@Then("User enter supplier name in search box{string}")
	public void user_enter_supplier_name_in_search_box_sabari250(String name) {
	    Buyerreportspenpersupplierpage.Enterthenameinsearchbox(name);  
	}

	@Then("User click on outlets")
	public void user_click_on_outlets() {
	    Buyerreportspenpersupplierpage.Clickonoutlets();
	}


	@Then("User click on check box {string}")
	public void user_click_on_check_box(String outletname) {
		 Buyerreportspenpersupplierpage.Clickonoutlet();
	}
	
	@Then("User click Export download button")
	public void user_click_Export_download_button() {
	    Buyerreportspenpersupplierpage.ClickExportdownloadbutton();
	}


	@Then("User select date from calendar in supplier")
	public void user_select_date_from_calendar_in_supplier() {
	    Buyerreportspenpersupplierpage.Selectdatefromcalendar();
	}

	@Then("User click on filter in supplier")
	public void user_click_on_filter_in_supplier() {
	    Buyerreportspenpersupplierpage.Clickonfilter();
	}

	@Then("User click on Apply button in supplier")
	public void user_click_on_Apply_button_in_supplier() {
	    Buyerreportspenpersupplierpage.Clickonapplybutton();
	}

	@Then("User click on Reset button in supplier")
	public void user_click_on_Reset_button_in_supplier() {
	    Buyerreportspenpersupplierpage.Clickonresetbutton();
	}

	@Then("User click on outside in supplier")
	public void user_click_on_outside_in_supplier() {
	    Buyerreportspenpersupplierpage.Clickonoutside();
	}

	@Then("User click on sabari two fifty supplier")
	public void user_click_on_sabari_two_fifty_supplier() {
		Buyerreportspenpersupplierpage.Clickonsabaritwofiftysupplier();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
