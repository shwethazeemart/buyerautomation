package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminReportsOutletspage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class AdminReportsOutlets {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
	private Adminbuyeroutletsubscriptionpage adminbuyerouletsubscriptionpage; 
    private Object adminbuyerlinktothecompany;
    private AdminOrderListingPage adminOrderListingPage;
    private AdminReportsOutletspage adminReportsOutlets; 
    
    
	public AdminReportsOutlets(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
        this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
	    this.adminbuyerlinktothecompany=testContext.getPageObjectManager().getAdminbuyerlinktothecompany();
	    this.adminOrderListingPage=testContext.getPageObjectManager().getAdminOrderListingPage();
	    this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	    this.adminReportsOutlets = testContext.getPageObjectManager().getAdminReportsOutletspage();
	    
	}
	
	
	
	@When("User Clicks on Admin Reports in the side navigation menubar")
	public void user_Clicks_on_Admin_Reports_in_the_side_navigation_menubar() throws InterruptedException {
	   dashboradpage.clickAdminReports();
	}

	@Then("User click on By outlet option")
	public void user_click_on_By_outlet_option() throws InterruptedException {
	  AdminReportsOutletspage.ByOutletOptionClick();
	}

	@Then("User select date from calendar field")
	public void user_select_date_from_calendar_field() throws InterruptedException {
	    AdminReportsOutletspage.SelectDatefromCalendar();
	}

	@Then("User click on search icon in outlet field")
	public void user_click_on_search_icon_in_outlet_field() {
	    AdminReportsOutletspage.SearchIconClick();
	}

	@Then("User click on export download button")
	public void user_click_on_export_download_button() {
	    AdminReportsOutletspage.exportButtonClick();
	}

	@Then("User click on filter in outlet field")
	public void user_click_on_filter_in_outlet_field() {
	    AdminReportsOutletspage.filterClick();
	}

	@Then("User click on outlet in filter field")
	public void user_click_on_outlet_in_filter_field() {
	    AdminReportsOutletspage.outletFilterClick();
	}

	@Then("User click on select all option in filter field")
	public void user_click_on_select_all_option_in_filter_field() {
	   AdminReportsOutletspage.allOptionSelect();
	}

	@Then("User click on apply button in filter field")
	public void user_click_on_apply_button_in_filter_field() {
	    AdminReportsOutletspage.applyButtonClick();
	}

	@Then("User click on processing time in filter field")
	public void user_click_on_processing_time_in_filter_field() {
	    AdminReportsOutletspage.processingtimeClick();
	}

	@Then("User click on number of line items")
	public void user_click_on_number_of_line_items() {
	    AdminReportsOutletspage.numberofLineitemsClick();
	}

	@Then("User select user in dropdown field")
	public void user_select_user_in_dropdown_field() {
		WebElement user = AdminReportsOutletspage.getDropDownElementUser();
		Select select=new Select(user);
		select.selectByVisibleText("velu mani");
	}

	@Then("User click on reset button in filter field")
	public void user_click_on_reset_button_in_filter_field() {
	   AdminReportsOutletspage.resetButtonClick();
	}



	
	
	
	
	
}
