package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletslistingpage;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyeroutletslisting {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletslistingpage buyeroutletslisting;
    
	public Buyeroutletslisting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletslisting = testContext.getPageObjectManager().getBuyeroutletslistingpage();
		
	}
	
	
	 
	@Then("User click on sst masala checkbox")
	public void user_click_on_sst_masala_checkbox() {
	   Buyeroutletslistingpage.Clickonsstmasalacheckbox();
	}

	@Then("User click on make inactive")
	public void user_click_on_make_inactive() {
	    Buyeroutletslistingpage.Clickonmakeinactive();
	}

	@Then("User Enter in Disable text box{string}")
	public void user_Enter_in_Disable_text_box(String DISABLE) {
	    Buyeroutletslistingpage.EntertheDisableintextbox(DISABLE);
	}

	@Then("User click on yes make inactive button")
	public void user_click_on_yes_make_inactive_button() {
	    Buyeroutletslistingpage.Clickyesmakeinactivebutton();
	}

	@Then("User click on make active icon")
	public void user_click_on_make_active_icon() {
	    Buyeroutletslistingpage.Clickonmakeactiveicon();
	}

	@Then("User click on Actions dropdown in velu masala")
	public void user_click_on_Actions_dropdown_in_velu_masala() {
	    Buyeroutletslistingpage.Clickonactionsdropdownvelumasala();
	}

	@Then("User click on manage details in velu masala")
	public void user_click_on_manage_details_in_velu_masala() {
	    Buyeroutletslistingpage.Clickonmanagedetails();
	}

	@Then("User click on back button of outlets icon")
	public void user_click_on_back_button_of_outlets_icon() {
	    Buyeroutletslistingpage.Clickonbackbuttonofoutlets();
	}

	@Then("User click on manage setting in velu masala")
	public void user_click_on_manage_setting_in_velu_masala() {
	   Buyeroutletslistingpage.Clickonmanagesettings();
	}

	@Then("User click on view suppliers in velu masala")
	public void user_click_on_view_suppliers_in_velu_masala() {
	    Buyeroutletslistingpage.Clickonviewsuppliers();
	}

	@Then("User enter the outlet name in text box {string}")
	public void user_enter_the_outlet_name_in_text_box(String velumasala2020) {
	    Buyeroutletslistingpage.Entertheoutletname(velumasala2020);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
