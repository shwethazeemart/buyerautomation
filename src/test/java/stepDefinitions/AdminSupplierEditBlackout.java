package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierEditBlackoutpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierEditBlackout {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
    private Adminnewbuyeruserpage adminnewbuyeruserpage;
    private Adminsupplierpage adminsupplierspage;
    private Adminsuppliersviewoutletspage adminsuppliersviewoutletspage;
    private AdminSupplierEditCompanypage adminSupplierEditCompany;
    private AdminSupplierEditDefaultpage adminSupplierEditDefault;
    private AdminSupplierEditBlackoutpage adminSupplierEditBlackout;
    
	public AdminSupplierEditBlackout(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
		this.adminsuppliersviewoutletspage=testContext.getPageObjectManager().getAdminsuppliersviewoutletspage();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.adminSupplierEditCompany = testContext.getPageObjectManager().getAdminSupplierEditCompanypage();
		this.adminSupplierEditDefault = testContext.getPageObjectManager().getAdminSupplierEditDefaultpage();
		this.adminSupplierEditBlackout = testContext.getPageObjectManager().getAdminSupplierEditBlackoutpage();
		
		
	}
	
	
	@Then("User clear on search textbox in supplier filed")
	public void user_clear_on_search_textbox_in_supplier_filed() {
	    AdminSupplierEditBlackoutpage.searchtextboxClear();
	}

	@Then("User enter on supplier name in search textbox{string}")
	public void user_enter_on_supplier_name_in_search_textbox_VELU(String suppliername) {
	   AdminSupplierEditBlackoutpage.enterSupplierName(suppliername);
	}

	@Then("User click on search button in supplier field")
	public void user_click_on_search_button_in_supplier_field() {
	    AdminSupplierEditBlackoutpage.searchButtonClick();
	}

	@Then("User click on edit blockout dates for delivery")
	public void user_click_on_edit_blockout_dates_for_delivery() {
	    AdminSupplierEditBlackoutpage.editBackoutClick();
	}

	@Then("User select date form calendar in blackout field")
	public void user_select_date_form_calendar_in_blackout_field() throws InterruptedException {
	    AdminSupplierEditBlackoutpage.selectDatefromCalendar();
	}

	@Then("User click on add button in blackout field")
	public void user_click_on_add_button_in_blackout_field() {
	    AdminSupplierEditBlackoutpage.addButtonClick();
	}

	@Then("User click on close icon in blackout field")
	public void user_click_on_close_icon_in_blackout_field() {
	    AdminSupplierEditBlackoutpage.closeIconClick(); 
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
