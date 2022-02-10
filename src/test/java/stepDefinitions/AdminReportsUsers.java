package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminReportsOutletspage;
import pageObjects.AdminReportsUserspage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminReportsUsers {

	
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
    private AdminReportsUserspage adminReportsUsers;
    
    
	public AdminReportsUsers(TestContext testContext) {
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
	    this.adminReportsUsers = testContext.getPageObjectManager().getAdminReportsUserspage();
	    
	    
	}
	
	
	
	@Then("User click on By processor user option")
	public void user_click_on_By_processor_user_option() throws InterruptedException {
	    AdminReportsUserspage.byprocessorUserClick();
	}

	@Then("User click on users icon in admin reports")
	public void user_click_on_users_icon_in_admin_reports() {
	    AdminReportsUserspage.userIconClick();
	}

	@Then("User select date from calendar field in user field")
	public void user_select_date_from_calendar_field_in_user_field() throws InterruptedException {
	    AdminReportsUserspage.selectDatformCalendar();
	}

	@Then("User click on search icon in users field")
	public void user_click_on_search_icon_in_users_field() throws InterruptedException {
	    AdminReportsUserspage.searchIconClick();
	}

	@Then("User click on export download button users field")
	public void user_click_on_export_download_button_users_field() throws InterruptedException {
	    AdminReportsUserspage.expoertdownloadButtonClick();
	}

	@Then("User click on filter in users field")
	public void user_click_on_filter_in_users_field() {
	    AdminReportsUserspage.filterClickinUsers();
	}

	@Then("User click on processed user in users field")
	public void user_click_on_processed_user_in_users_field() {
	    AdminReportsUserspage.processedUserClick();
	}

	@Then("User click on select all option in users field")
	public void user_click_on_select_all_option_in_users_field() {
	    AdminReportsUserspage.selectAllOptionClick();
	}

	@Then("User click on apply button in users field")
	public void user_click_on_apply_button_in_users_field() {
	    AdminReportsUserspage.applubuttonClick();
	}

	@Then("User click on reset button in users field")
	public void user_click_on_reset_button_in_users_field() throws InterruptedException {
	    AdminReportsUserspage.resetButtonClick();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
