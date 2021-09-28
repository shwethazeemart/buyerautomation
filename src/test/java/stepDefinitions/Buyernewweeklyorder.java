package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyernewweeklyorderpage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyernewweeklyorder {

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
	private Buyernewweeklyorderpage buyernewweeklyorder;
	

	public Buyernewweeklyorder(TestContext testContext) {
		super();
		
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.inventorypage=(InventoryPage)testContext.getPageObjectManager().getInventoryPage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyernewweeklyorder = testContext.getPageObjectManager().getBuyernewweeklyorderpage();

	}
	
	@Then("User click on New weekly order")
	public void user_click_on_New_weekly_order() {
	    Buyernewweeklyorderpage.Clickonnewweeklyorder();
	}

	@Then("User click on dropdown of weekly order")
	public void user_click_on_dropdown_of_weekly_order() {
	    Buyernewweeklyorderpage.Clickondropdownofweeklyorder();
	}

	@Then("User click on velu masala in weekly order")
	public void user_click_on_velu_masala_in_weekly_order() {
	    Buyernewweeklyorderpage.Clickonvelumasalainweeklyorder(); 
	}

	@Then("User click on checkbox of Last thrity days order")
	public void user_click_on_checkbox_of_Last_thrity_days_order() {
	    Buyernewweeklyorderpage.Clickoncheckboxoflastthirtydaysorder();
	}

	@Then("User click on Download button in new weekly order")
	public void user_click_on_Download_button_in_new_weekly_order() {
	    Buyernewweeklyorderpage.Clickdownloadbutton();
	}

	@Then("User Upload the weekly order excel file")
	public void user_Upload_the_weekly_order_excel_file() throws InterruptedException {
	    Buyernewweeklyorderpage.Uploadtheexcelfile();
	}

	@Then("User click on upload and review order button")
	public void user_click_on_upload_and_review_order_button() {
	    Buyernewweeklyorderpage.Clickonuploadandreviewbutton();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
