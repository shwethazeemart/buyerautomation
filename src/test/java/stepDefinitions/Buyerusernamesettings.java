package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerpaymentspaymentplanspage;
import pageObjects.Buyerpaymentstransactonspage;
import pageObjects.Buyerusernamesettingspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerusernamesettings {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyerusernamesettingspage buyerusernamesettings;
    
    
    
	public Buyerusernamesettings(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyerusernamesettings = testContext.getPageObjectManager().getBuyerusernamesettingspage();
		
	}
	
		
	@Then("User click on user name in settings")
	public void user_click_on_user_name_in_settings() throws InterruptedException {
	   Buyerusernamesettingspage.Clickusernameinrighthandside();
	}

	@Then("User click on settings in user page")
	public void user_click_on_settings_in_user_page() {
	    Buyerusernamesettingspage.Clcikonsetting();
	}

	@Then("User click on Linked companies in settings page")
	public void user_click_on_Linked_companies_in_settings_page() {
	    Buyerusernamesettingspage.Clickonlinkedcompanies(); 
	}

	@Then("User click on velu masala actions dropdown in settings page")
	public void user_click_on_velu_masala_actions_dropdown_in_settings_page() {
	    Buyerusernamesettingspage.Clickonvelumasaladropdownicon();
	}

	@Then("User click on manage payment settings")
	public void user_click_on_manage_payment_settings() {
	    Buyerusernamesettingspage.Clickonmanagepaymentsettings();
	}

	@Then("User click on Back button of My account")
	public void user_click_on_Back_button_of_My_account() {
	    Buyerusernamesettingspage.Clickbackbuttonofmyaccount();
	}

	@Then("User click on manage Integration")
	public void user_click_on_manage_Integration() {
	   Buyerusernamesettingspage.Clickonmanageintegration();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
