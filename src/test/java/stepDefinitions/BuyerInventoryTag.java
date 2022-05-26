package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerInventoryTagpage;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.Buyerinventoryactivitylisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class BuyerInventoryTag {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private Buyerinvoicelisenpage buyerinvoicelisen;
	private Buyerinventoryoutletslisenpage buyerinventoryoutletslisen;
    private Buyerdashboardlisenpage buyerdashboardlisen;
    private Buyerinventoryactivitylisenpage buyerinventoryactivitylisen;

	public BuyerInventoryTag(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerinventoryoutletslisen=testContext.getPageObjectManager().getBuyerinventoryoutletslisenpage();
		this.buyerdashboardlisen=testContext.getPageObjectManager().getBuyerdashboardlisenpage();
		this.buyerinventoryactivitylisen=testContext.getPageObjectManager().getBuyerinventoryactivitylisenpage();
	}
	
		
	
	
	@Then("User clicks on Inventory in the side navigation menubar")
	public void user_clicks_on_Inventory_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickInventory();
	}

	@Then("User click on first count")
	public void user_click_on_first_count() {
	    BuyerInventoryTagpage.FirstStockcountClick();
	}

	@Then("User click on add tag button in stockcount")
	public void user_click_on_add_tag_button_in_stockcount() {
	    BuyerInventoryTagpage.AddTagButtonClick();
	}

	@Then("User click on save button in stockcount")
	public void user_click_on_save_button_in_stockcount() throws InterruptedException {
	    BuyerInventoryTagpage.SaveButtonClick();
		
	}

	@Then("User click on back button in stockcount")
	public void user_click_on_back_button_in_stockcount() throws InterruptedException {
	    BuyerInventoryTagpage.BackButtonClick();
	}

	@Then("User click on consumption report in activity page")
	public void user_click_on_consumption_report_in_activity_page() throws InterruptedException {
	    BuyerInventoryTagpage.ConsumptionReportClick();
	}

	
	
	
}
