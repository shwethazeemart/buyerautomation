package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.Buyerinventoryactivitylisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerinventoryactivitylisen {

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

	public Buyerinventoryactivitylisen(TestContext testContext) {
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
	
	@Then("User click on Activity icon")
	public void user_click_on_Activity_icon() {
	    Buyerinventoryactivitylisenpage.Clickactivityicon();
	}

	@Then("User select the calendar this month from date to To date")
	public void user_select_the_calendar_this_month_from_date_to_To_date() {
	   Buyerinventoryactivitylisenpage.Selectcalendardate();
	}

	@Then("User click on download button")
	public void user_click_on_download_button() {
	   Buyerinventoryactivitylisenpage.Clickdownloadbutton();
	}

	@Then("User ckicks on outlet {string}")
	public void user_ckicks_on_outlet(String outletname) {
		Buyerinventoryactivitylisenpage.ClickonOutlet();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
