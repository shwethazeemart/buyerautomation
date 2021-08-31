package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.Buyerreportspenperskupage;
import pageObjects.Buyerreportspenpersupplierpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportspenpersku {

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
    private Buyerreportspenperskupage buyerreportspenpersku;
    
    
	public Buyerreportspenpersku(TestContext testContext) {
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
		this.buyerreportspenpersku = testContext.getPageObjectManager().getbuyerreportspenpersku();
		
	}
	
	
	@Then("User click on spending per sku icon")
	public void user_click_on_spending_per_sku_icon() {
	   Buyerreportspenperskupage.Clickonspendingsku();
	}

	@Then("User click on search box in sku")
	public void user_click_on_search_box_in_sku() {
	    Buyerreportspenperskupage.Clickonsearchbox();
	}

	@Then("User Enter the sku name in search box{string}")
	public void user_Enter_the_sku_name_in_search_box_100pipers(String name) {
	    Buyerreportspenperskupage.Entertheskuinsearchbox(name);
	}

	@Then("User select date from calendar in sku")
	public void user_select_date_from_calendar_in_sku() {
	    Buyerreportspenperskupage.Selectdatefromcalendar(); 
	}

	@Then("User click on filter in sku")
	public void user_click_on_filter_in_sku() {
         Buyerreportspenperskupage.Clickonfilter();
	}

	@Then("User click on outlets in sku")
	public void user_click_on_outlets_in_sku() {
	    Buyerreportspenperskupage.Clickonoutlets();
	}

	@Then("User click on Check box of velumasala in sku")
	public void user_click_on_Check_box_of_velumasala_in_sku() {
	    Buyerreportspenperskupage.Clickcheckboxofvelumasala();
	}

	@Then("User click on apply button in sku")
	public void user_click_on_apply_button_in_sku() {
	    Buyerreportspenperskupage.Clickapplybutton();
	}

	@Then("User click on reset button in sku")
	public void user_click_on_reset_button_in_sku() {
	   Buyerreportspenperskupage.Clickonresetbutton();
	}

	@Then("User click on outside in sku")
	public void user_click_on_outside_in_sku() {
	    Buyerreportspenperskupage.Clickonoutside();
	}

	@Then("User click on Suppliers in sku")
	public void user_click_on_Suppliers_in_sku() {
	   Buyerreportspenperskupage.Clickonsupplier();
	}

	@Then("User click on check box of sabari in sku")
	public void user_click_on_check_box_of_sabari_in_sku() {
	    Buyerreportspenperskupage.Clickcheckboxofsabari();
	}

	@Then("User click on export download button in sku")
	public void user_click_on_export_download_button_in_sku() {
	    Buyerreportspenperskupage.Clickexportdownloadbutton();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
