package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.Buyerreportspenpersupplierpage;
import pageObjects.Buyerreportspenpertagpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportspenpertag {

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
    private Buyerreportspenpertagpage buyerreportspenpertag;
    
    
	public Buyerreportspenpertag(TestContext testContext) {
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
		this.buyerreportspenpertag = testContext.getPageObjectManager().getBuyerreportspenpertagpage();
		
	}
	
	@Then("User click on spending per tag icon")
	public void user_click_on_spending_per_tag_icon() {
	    Buyerreportspenpertagpage.Clickonspendingpertag(); 
	}

	@Then("User click on search box in tag")
	public void user_click_on_search_box_in_tag() {
	    Buyerreportspenpertagpage.Clicksearchbox();
	}
	
	@Then("User Enter the tag name in search box{string}")
	public void user_Enter_the_tag_name_in_search_box_masala(String name) {
	    Buyerreportspenpertagpage.Entertagnameinsearchbox(name);
	}

	@Then("User select date from calendar in tag")
	public void user_select_date_from_calendar_in_tag() {
	    Buyerreportspenpertagpage.Selectdatefromcalendar();
	}

	@Then("User click on filter in tag")
	public void user_click_on_filter_in_tag() {
	   Buyerreportspenpertagpage.Clickonfilter();
	}

	@Then("User click on outlets in tag")
	public void user_click_on_outlets_in_tag() {
	    Buyerreportspenpertagpage.Clickonoutlets();
	}

	
	@Then("User click on Check box of in tag {string}")
	public void user_click_on_Check_box_of_in_tag(String outlet) {
		  Buyerreportspenpertagpage.Clickonoutlet();
	}


	@Then("User click on apply button in tag")
	public void user_click_on_apply_button_in_tag() {
	   Buyerreportspenpertagpage.Clickonapplybutton();
	}

	@Then("User click on reset button in tag")
	public void user_click_on_reset_button_in_tag() {
	   Buyerreportspenpertagpage.Clickonresetbutton();
	}

	@Then("User click on outside in tag")
	public void user_click_on_outside_in_tag() {
	   Buyerreportspenpertagpage.Clickonoutside();
	}

	@Then("User click on Suppliers in tag")
	public void user_click_on_Suppliers_in_tag() {
	   Buyerreportspenpertagpage.Clickonsuppliers();
	}

	@Then("User click on check box of sabari in tag")
	public void user_click_on_check_box_of_sabari_in_tag() {
	   Buyerreportspenpertagpage.Clickoncheckboxofsabari();
	}

	@Then("User click on Export download button in tag")
	public void user_click_on_Export_download_button_in_tag() {
	    Buyerreportspenpertagpage.Clickonexportdownloadbutton();
	}
 
	


	@Then("User click on masala Tag")
	public void user_click_on_masala_Tag() {
		Buyerreportspenpertagpage.Clickonmasalatag();
	}

	@Then("User click on Export download button in masala")
	public void user_click_on_Export_download_button_in_masala() {
		Buyerreportspenpertagpage.Clickonexportbuttoninmasala();   
	}

	@Then("User click on filter tag in masala")
	public void user_click_on_filter_tag_in_masala() {
		Buyerreportspenpertagpage.Clickonfiltertaginmasala();
		
	}

	
	@Then("User click on outside tag in masala")
	public void user_click_on_outside_tag_in_masala() {
		Buyerreportspenpertagpage.Clickonoutsidetaginmasala();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
