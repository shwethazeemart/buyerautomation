package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;
import pageObjects.Reportspage;

public class Reportspagesteps {
	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private InventoryPage inventorypage;
	private Newrecurringorderspage newrecurringorderspage;
	private Object reportspage;
	

	public Reportspagesteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.inventorypage=(InventoryPage)testContext.getPageObjectManager().getInventoryPage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.reportspage = testContext.getPageObjectManager().getReportspage();

	}
	
	@Then("User Clicks on Reports in the side navigation menubar")
	public void user_Clicks_on_Reports_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickReports();
	}


	@Then("User clicks on the spending per tag")
	public void user_clicks_on_the_spending_per_tag() {
	   Reportspage.clicks_on_the_spending_per_tag();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
