package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerOutletApproverpage;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsmanagesettingspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class BuyerOutletApprover {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
	private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
	private Buyeroutletsmanagesettingspage buyeroutletsmanagesettings;
	private BuyerOutletApproverpage buyerOutletApprover;

	public BuyerOutletApprover(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsmanagesettings = testContext.getPageObjectManager().getBuyeroutletsmanagesettingspage();
		this.buyerOutletApprover = testContext.getPageObjectManager().getBuyerOutletApproverpage();

	}
	
	
	@Then("User click on action dropdown in approver")
	public void user_click_on_action_dropdown_in_approver() throws InterruptedException {
	   BuyerOutletApproverpage.actionDropDownClick();
	}

	@Then("User click on manage setting in approver")
	public void user_click_on_manage_setting_in_approver() {
	    BuyerOutletApproverpage.manageSettingClick();
	}

	@Then("User click on check box of approver")
	public void user_click_on_check_box_of_approver() throws InterruptedException {
	    BuyerOutletApproverpage.approverCheckboxClick();
	}

	@Then("User click final save button in approver")
	public void user_click_final_save_button_in_approver() {
	    BuyerOutletApproverpage.finalSaveButtonClick();
	}

	
	
	
	
	
	
	
	
	
	
	
}
