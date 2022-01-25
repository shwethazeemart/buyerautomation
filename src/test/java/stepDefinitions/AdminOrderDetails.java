package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderListingPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.AdminOrderDetailsPage;

public class AdminOrderDetails {

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
    private AdminOrderDetailsPage adminOrderDetails;
     
	public AdminOrderDetails(TestContext testContext) {
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
	    this.adminOrderDetails=testContext.getPageObjectManager().getAdminOrderDetailsPage();
	    
	
}


@Then("User click on particular order detail page")
public void user_click_on_particular_order_detail_page() {
	AdminOrderDetailsPage.ParticularOrderClicks();
}

@Then("User click on Details tab")
public void user_click_on_Details_tab() {
	AdminOrderDetailsPage.ClickDetailsTab();
}

@Then("User click on Activity tab")
public void user_click_on_Activity_tab() {
	AdminOrderDetailsPage.ClickActivityTab();
}

@Then("User click on Cancel order button")
public void user_click_on_Cancel_order_button() {
	AdminOrderDetailsPage.CancelButtonClicks();
}

@Then("User enter the reason in Others text box {string}")
public void user_enter_the_reason_in_Others_text_box(String reason) {
	AdminOrderDetailsPage.TextboxReasonEnters(reason);
}

@Then("User click on the Cancel order final button")
public void user_click_on_the_Cancel_order_final_button() {
	AdminOrderDetailsPage.FinalCancelButtonClicks();
}
}