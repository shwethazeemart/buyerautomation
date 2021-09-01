package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerdashboardlisen {

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


	public Buyerdashboardlisen(TestContext testContext) {
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
	}

	
	@Then("User Clicks on Dashboard in the side navigation menubar")
	public void user_Clicks_on_Dashboard_in_the_side_navigation_menubar() {
	    Buyerdashboardlisenpage.ClickonDashboardmenubar();
	}

	@Then("User click on New order icon")
	public void user_click_on_New_order_icon() {
	    Buyerdashboardlisenpage.Clickonneworder(); 
	}

	@Then("User click on New order close icon")
	public void user_click_on_New_order_close_icon() {
	    Buyerdashboardlisenpage.ClickonNewordercloseicon();
	}

	@Then("User click on upload invoice icon")
	public void user_click_on_upload_invoice_icon() {
	   Buyerdashboardlisenpage.Clickonuploadinvoiceicon();
	}

	@Then("User click on upload invoice close icon")
	public void user_click_on_upload_invoice_close_icon() {
	    Buyerdashboardlisenpage.Clickonuploadinvoicecloseicon();
	}

	@Then("User select dropdown spending overview list of velu masala")
	public void user_select_dropdown_spending_overview_list_of_velu_masala() {
		WebElement velumasala2020 = Buyerdashboardlisenpage.getDropDownElementvelumasala();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@Then("User click on YTD icon")
	public void user_click_on_YTD_icon() throws InterruptedException {
	  Buyerdashboardlisenpage.ClickonYTDicon();
	}

	@Then("User click on Last year icon")
	public void user_click_on_Last_year_icon() {
	    Buyerdashboardlisenpage.ClickonLastyearicon();
	}

	@Then("User click on Past twelve week icon")
	public void user_click_on_Past_twelve_week_icon() {
	   Buyerdashboardlisenpage.Clickonpasttwelveweekicon();
	}

	@Then("User click on view spending report icon")
	public void user_click_on_view_spending_report_icon() {
	   Buyerdashboardlisenpage.Clickonviewspendingreoprticon();
	}

	@Then("User click on Dashboard side navigation menubar")
	public void user_click_on_Dashboard_side_navigation_menubar() {
	    Buyerdashboardlisenpage.Clickondashboardsidenavigationmenubar();
	}

	@Then("User select dropdown top expenditures list of velu masala")
	public void user_select_dropdown_top_expenditures_list_of_velu_masala() {
		WebElement velumasala2020 = Buyerdashboardlisenpage.getDropDownElementvelumasalatwentytwenty();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@Then("User click on SKU icon")
	public void user_click_on_SKU_icon() throws InterruptedException {
	   Buyerdashboardlisenpage.ClickonSKUicon(); 
	}

	@Then("User click on category icon")
	public void user_click_on_category_icon() {
	   Buyerdashboardlisenpage.Clickoncategoryicon();
	}

	@Then("User click on supplier icon")
	public void user_click_on_supplier_icon() {
	    Buyerdashboardlisenpage.Clickonsuppliericon();
	}

	@Then("User click on This month icon")
	public void user_click_on_This_month_icon() {
	   Buyerdashboardlisenpage.Clickonthismonthicon();
	}

	@Then("User click on This week icon")
	public void user_click_on_This_week_icon() { 
	    Buyerdashboardlisenpage.Clickonthisweekicon();
	}

	@Then("User click on Last week icon")
	public void user_click_on_Last_week_icon() {
	    Buyerdashboardlisenpage.Clickonlastweekicon();
	}

	@Then("User click on Last month icon")
	public void user_click_on_Last_month_icon() {
	   Buyerdashboardlisenpage.Clickonlastmonthicon();
	}

	@Then("User click on view all spending by supplier")
	public void user_click_on_view_all_spending_by_supplier() {
	    Buyerdashboardlisenpage.Clickonviewspendingbusupplier();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
