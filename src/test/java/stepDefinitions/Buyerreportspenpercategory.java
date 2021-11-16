package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportspenpercategorypage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportspenpercategory {

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
    private Buyerreportspenpercategorypage buyerreportspenpercategory;
    
    
	public Buyerreportspenpercategory(TestContext testContext) {
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
		this.buyerreportspenpercategory = testContext.getPageObjectManager().getBuyerreportspenpercategorypage();
		
	}
	
	@Then("User click on spending per category icon")
	public void user_click_on_spending_per_category_icon() {
	    Buyerreportspenpercategorypage.Clickspendingpercategory();
	}

	@Then("User click on search box in category")
	public void user_click_on_search_box_in_category() {
	    Buyerreportspenpercategorypage.Clicksearchboxincategory();
	}

	@Then("User Enter the category name in search box{string}")
	public void user_Enter_the_category_name_in_search_box_Beer(String name) {
	    Buyerreportspenpercategorypage.Enterthecategoryname(name);
	}

	@Then("User select date from calendar in category")
	public void user_select_date_from_calendar_in_category() {
	    Buyerreportspenpercategorypage.Selectdatefromcalendar(); 
	}

	@Then("User click on filter in category")
	public void user_click_on_filter_in_category() throws InterruptedException {
	    Buyerreportspenpercategorypage.Clickfilter();
	}

	@Then("User click on outlets in category")
	public void user_click_on_outlets_in_category() {
	    Buyerreportspenpercategorypage.Clickoutlets();
	}

	 @Then("User click on Check box of in category {string}")
	   public void user_click_on_Check_box_of_in_category(String outlet) {
		   Buyerreportspenpercategorypage.Clickonoutlet();
		 }
	 
	@Then("User click on apply button in category")
	public void user_click_on_apply_button_in_category() {
	    Buyerreportspenpercategorypage.Clickapplybutton();
	}

	@Then("User click on reset button in category")
	public void user_click_on_reset_button_in_category() {
	   Buyerreportspenpercategorypage.Clickresetbutton();
	}

	@Then("User click on outside in category")
	public void user_click_on_outside_in_category() {
	    Buyerreportspenpercategorypage.Clickoutside();
	}

	@Then("User click on Suppliers in category")
	public void user_click_on_Suppliers_in_category() {
	   Buyerreportspenpercategorypage.Clicksuppliers();
	}

	@Then("User click on check box of sabari in category")
	public void user_click_on_check_box_of_sabari_in_category() {
	    Buyerreportspenpercategorypage.Clickcheckboxofsabari(); 
	}


	@Then("User click on search icon in category")
	public void user_click_on_search_icon_in_category() {
	    Buyerreportspenpercategorypage.Clicksearchicon();
	}

	
	
	
	@Then("User click on Beer category")
	public void user_click_on_Beer_category() {
		 Buyerreportspenpercategorypage.ClickonBeercategory();
	}

	@Then("User select date from calendar in Beer")
	public void user_select_date_from_calendar_in_Beer() throws InterruptedException {
		 Buyerreportspenpercategorypage.Selectdatefromcalendarinbeer();
	}

	@Then("User select dropdown in month Beer")
	public void user_select_dropdown_in_month_Beer() {
		WebElement ViewbyDay = Buyerreportspenpercategorypage.getDropDownElementmonth();
		Select select=new Select(ViewbyDay);
		select.selectByIndex(1);
	} 

	@Then("User click on outside in category in Beer")
	public void user_click_on_outside_in_category_in_Beer() {
		Buyerreportspenpercategorypage.Clickonoutsidecategoryinbeer();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
