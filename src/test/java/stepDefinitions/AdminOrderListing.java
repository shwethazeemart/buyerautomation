package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderListingPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminOrderListing {
	
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
     
	public AdminOrderListing(TestContext testContext) {
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
	    
	}
	
	
	@When("User Clicks on Admin Orders in the side navigation menubar")
	public void user_Clicks_on_Admin_Orders_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickAdminOrders();
	}

	@Then("User Clicks on the order ID")
	public void user_Clicks_on_the_order_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Enter the order ID\"{int}\"")
	public void user_Enter_the_order_ID(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User select Delivery date from the calendar")
	public void user_select_Delivery_date_from_the_calendar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User select the Placed on from the calendar")
	public void user_select_the_Placed_on_from_the_calendar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Search icon")
	public void user_Click_on_the_Search_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the first checkbox")
	public void user_Click_on_the_first_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Clear button")
	public void user_Click_on_the_Clear_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on Filter icon")
	public void user_Click_on_Filter_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Oultet")
	public void user_click_the_Oultet() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Select All option")
	public void user_click_the_Select_All_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on the Apply button")
	public void user_click_on_the_Apply_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on Filter icon")
	public void user_click_on_Filter_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Reset button")
	public void user_click_the_Reset_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Supplier")
	public void user_click_the_Supplier() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Order status")
	public void user_click_the_Order_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Invoicing status")
	public void user_click_the_Invoicing_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click the Order type")
	public void user_click_the_Order_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
