package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;
import pageObjects.OutletsPagesteps;

public class Outletspagesteps {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;

	public Outletspagesteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		
	}

	@Then("User Clicks on outlets in the side navigation menubar")
	public void user_Clicks_on_outlets_in_the_side_navigation_menubar()  {
		dashboradpage.clickOutlets();
	}

	@Then("User clicks actions dropdown")
	public void user_clicks_actions_dropdown() throws InterruptedException {
	    OutletsPagesteps.clicks_actions_dropdown();
	}

	@Then("User clicks on View suppliers")
	public void user_clicks_on_View_suppliers() {
	    OutletsPagesteps.clicks_View_suppliers();
	}

	@Then("User clicks on the actions dropdown")
	public void user_clicks_on_the_actions_dropdown() {
	    OutletsPagesteps.clicks_on_the_actions_dropdown();
	}

	@Then("User Clicks on the view orders")
	public void user_Clicks_on_the_view_orders() {
	   OutletsPagesteps.Clicks_on_the_view_orders();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
