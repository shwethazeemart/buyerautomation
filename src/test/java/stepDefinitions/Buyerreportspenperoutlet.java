package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportspenperoutlet {

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
    
	public Buyerreportspenperoutlet(TestContext testContext) {
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
		
	}
	
	
	@Then("User click on spending per outlet icon")
	public void user_click_on_spending_per_outlet_icon() {
	    Buyerreportspenperoutletpage.Clickonspendingoutletcion();
	}

	@Then("User select date from calendar")
	public void user_select_date_from_calendar() {
	    Buyerreportspenperoutletpage.clickoncalendarfromdate();

	}

	@Then("User click on filter")
	public void user_click_on_filter() {
	   Buyerreportspenperoutletpage.Clickonfilter();
	}

	@Then("User click on suppliers")
	public void user_click_on_suppliers() {
	    Buyerreportspenperoutletpage.Clickonsuppliers();
	    
	}

	@Then("User click on check box of sabari")
	public void user_click_on_check_box_of_sabari() {
	    Buyerreportspenperoutletpage.Clickonsabaricheckbox();
	}

	@Then("User click on Apply button")
	public void user_click_on_Apply_button() {
	    Buyerreportspenperoutletpage.Clickapplybutton();
	}

	@Then("User click on Reset button")
	public void user_click_on_Reset_button() {
	    Buyerreportspenperoutletpage.Clickresetbutton();
	}

	@Then("User click on outside")
	public void user_click_on_outside() {
	   Buyerreportspenperoutletpage.Clickonoutside();
	}

	@Then("User click on invoice and credit note")
	public void user_click_on_invoice_and_credit_note() {
       Buyerreportspenperoutletpage.Clickinvoiceandcreditnote();
	}

	@Then("User click on check box of processed")
	public void user_click_on_check_box_of_processed() {
	   Buyerreportspenperoutletpage.Clcikcheckboxofprocessed();
	}

	@Then("User click on check box of issued")
	public void user_click_on_check_box_of_issued() {
	    Buyerreportspenperoutletpage.Clickcheckboxofissued();
	}

	@Then("User click on payment status")
	public void user_click_on_payment_status() {
	    Buyerreportspenperoutletpage.Clickpaymentstatus(); 
	}

	@Then("User click on unpaid check box")
	public void user_click_on_unpaid_check_box() {
	    Buyerreportspenperoutletpage.Clickunpaidcheckbox();
	}

	@Then("User click on paid check box")
	public void user_click_on_paid_check_box() {
	    Buyerreportspenperoutletpage.Clickpaidcheckbox();
	}

	@Then("User click on Export status")
	public void user_click_on_Export_status() {
	   Buyerreportspenperoutletpage.Clickonexportstatus();
	}

	@Then("User click on Exported check box")
	public void user_click_on_Exported_check_box() {
	    Buyerreportspenperoutletpage.Clickonexportedcheckbox();
	}

	@Then("User click on Not Exported check box")
	public void user_click_on_Not_Exported_check_box() {
	    Buyerreportspenperoutletpage.Clickonnotexportedcheckbox();
	}


	@Then("User click on export page is CSV")
	public void user_click_on_export_page_is_CSV() {
	   Buyerreportspenperoutletpage.ClickexportpageCSV();
	}

	@Then("User click on Detailed report")
	public void user_click_on_Detailed_report() {
		Buyerreportspenperoutletpage.Clickondetailedreport();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
