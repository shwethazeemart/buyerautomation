package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerpaymentstransactonspage;
import pageObjects.Buyerreportpriceupdatespage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerpaymentstransactions {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsviewsupplierspage buyeroutletsviewsuppliers;
    private Buyerpaymentstransactonspage buyerpaymentstransactons;
    
    
	public Buyerpaymentstransactions(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsviewsuppliers = testContext.getPageObjectManager().getBuyeroutletsviewsupplierspage();
		this.buyerpaymentstransactons = testContext.getPageObjectManager().getBuyerpaymentstransactonspage();
		
	}
	
	@Then("User Clicks on Payments in the side navigation menubar")
	public void user_Clicks_on_Payments_in_the_side_navigation_menubar() {
		 dashboradpage.clickPayments();
	}

	
	@Then("User click on Transactions icon")
	public void user_click_on_Transactions_icon() {
	   Buyerpaymentstransactonspage.Clickontransactions();
	}

	@Then("User select companies from dropdown list")
	public void user_select_companies_from_dropdown_list() {
		//WebElement SAKTHIMASALA123 = Buyerpaymentstransactonspage.getDropDownElementsakthimasala();
		//Select select=new Select(SAKTHIMASALA123);
		//select.selectByIndex(3);

	}

	@Then("User selecct suppliers from dropdown list")
	public void user_selecct_suppliers_from_dropdown_list() {
		//WebElement MRFruits = Buyerpaymentstransactonspage.getDropDownElementmrfruits();
		//Select select=new Select(MRFruits);
		//select.selectByIndex(1);
	}

	@Then("User click on calendar and select date")
	public void user_click_on_calendar_and_select_date() {
	    Buyerpaymentstransactonspage.Selectdatefromcalendaricon();
	}

	@Then("User click on Search icon from transactions page")
	public void user_click_on_Search_icon_from_transactions_page() {
	   Buyerpaymentstransactonspage.Clicksearchicon();
	}

	@Then("User Click on download button from trans actions apge")
	public void user_Click_on_download_button_from_trans_actions_apge() {
	   Buyerpaymentstransactonspage.Clickondownloadbutton();
	}

	@Then("User click on listed supplier")
	public void user_click_on_listed_supplier() {
	    Buyerpaymentstransactonspage.Clickonlistedsupplier();
	}

	@Then("User click on payments back button")
	public void user_click_on_payments_back_button() {
	   Buyerpaymentstransactonspage.Clickonpaymentsbackbutton();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
