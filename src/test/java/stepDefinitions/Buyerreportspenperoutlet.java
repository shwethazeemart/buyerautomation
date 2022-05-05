package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerpaymentstransactonspage;
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
	public void user_select_date_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.clickoncalendarfromdate();

	}

	@Then("User click on filter")
	public void user_click_on_filter() {
	   Buyerreportspenperoutletpage.Clickonfilter();
	}
	
	@Then("User click on Outlets")
	public void user_click_on_Outlets() {
		Buyerreportspenperoutletpage.ClickOutlets();
	}

	@Then("User click on check box of outlets")
	public void user_click_on_check_box_of_outlets() {
		Buyerreportspenperoutletpage.ClickchecboxofOutlets();
	}


	@Then("User click on suppliers")
	public void user_click_on_suppliers() {
	    Buyerreportspenperoutletpage.Clickonsuppliers();
	    
	}

	@Then("User click on check box")
	public void user_click_on_check_box() {
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
	
	@Then("User click on Today date from calendar")
	public void user_click_on_Today_date_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickontodaydatefromcalendar();
	}

	@Then("User click on Yesterday date from calendar")
	public void user_click_on_Yesterday_date_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickonyesterdaydatefromcalendar();
	}

	@Then("User click on This week date from calendar")
	public void user_click_on_This_week_date_from_calendar() throws InterruptedException {
	   Buyerreportspenperoutletpage.Clickonthisweekfromcalendar();
	}

	@Then("User click on This month from calendar")
	public void user_click_on_This_month_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickonthismonthfromcalendar();
	}

	@Then("User click on Last year from calendar")
	public void user_click_on_Last_year_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.ClickonLastyearfromcalendar();
	}

	@Then("User click on Custom range from calendar")
	public void user_click_on_Custom_range_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickoncustomrangefromcalendar();
	}

	@Then("User click on YTD from calendar")
	public void user_click_on_YTD_from_calendar() throws InterruptedException {
	    Buyerreportspenperoutletpage.ClickonYTDfromcalendar();
	}


    @Then("User click on download button ")
    public void user_click_on_download_button() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickondownloadbutton();
	} 
    
    @Then("User click on summary button")
    public void user_click_on_summary_button() {
	   //Buyerreportspenperoutletpage.Clickonvelumasalasummarybutton();
	}

    @Then("User click on detailed button")
    public void user_click_on_detailed_button() {
	    //Buyerreportspenperoutletpage.Clickonvelumasaladetailedbutton();
	} 

    @Then("User click on List of invoices button")
    public void user_click_on_List_of_invoices_button() {
	   //Buyerreportspenperoutletpage.Clickonvelumasalalistofinvoicesbutton();
	}

    @Then("User click on outlet icon")
    public void user_click_on_outlet_icon() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickonoutleticon();
	}

	@Then("User select dropdown in month")
	public void user_select_dropdown_in_month() {
		WebElement ViewbyDay = Buyerreportspenperoutletpage.getDropDownElementmonth();
		Select select=new Select(ViewbyDay);
		select.selectByIndex(1);
	}

	@Then("User click download button of export")
	public void user_click_download_button_of_export() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickonexportdownloadbutton();
	}
	
	@Then("User click on back button of spending report")
	public void user_click_on_back_button_of_spending_report() throws InterruptedException {
	    Buyerreportspenperoutletpage.Clickonbackbuttonofspendingreport();
	}

	@Then("User click on back button of reports")
	public void user_click_on_back_button_of_reports() {
	    Buyerreportspenperoutletpage.Clickbackbuttonofreports(); 
	}

	@Then("User click on apply in custom range")
	public void user_click_on_apply_in_custom_range() {
	    Buyerreportspenperoutletpage.Clickonapplybuttonincustomrange();
	}
	
	/*@Then("User click on download button")
	public void user_click_on_download_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/
}