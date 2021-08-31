package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyeroutletsviewsuppliers {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsviewsupplierspage buyeroutletsviewsuppliers;
    
	public Buyeroutletsviewsuppliers(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsviewsuppliers = testContext.getPageObjectManager().getBuyeroutletsviewsupplierspage();
		
	}
	
	@Then("User Click on view market list")
	public void user_Click_on_view_market_list() {
	   Buyeroutletsviewsupplierspage.Clickviewmarketlist();
	}

	@Then("User click on name search box")
	public void user_click_on_name_search_box() {
	    Buyeroutletsviewsupplierspage.Clicksearchbox();
	}

	@Then("User Enter on name in name searchbox field{string}")
	public void user_Enter_on_name_in_name_searchbox_field(String name) {
	   Buyeroutletsviewsupplierspage.Enternameinsearchbox(name);
	}

	@Then("User click on check box of product code")
	public void user_click_on_check_box_of_product_code() {
	    Buyeroutletsviewsupplierspage.ClickCheckboxofproductcode();
	}

	@Then("User Click on Edit tags")
	public void user_Click_on_Edit_tags() {
	   Buyeroutletsviewsupplierspage.Clickonedittags();
	}

	@Then("User click on Edit tags close icon")
	public void user_click_on_Edit_tags_close_icon() {
	    Buyeroutletsviewsupplierspage.Clickonedittagscloseicon();
	}

	@Then("User click on Delete button")
	public void user_click_on_Delete_button() {
	    Buyeroutletsviewsupplierspage.Clickondeletebutton();
	}

	@Then("User click on Delete button close icon")
	public void user_click_on_Delete_button_close_icon() {
	    Buyeroutletsviewsupplierspage.Clickondeletebuttoncloseicon();
	}

	@Then("User click on options icon")
	public void user_click_on_options_icon() {
	    Buyeroutletsviewsupplierspage.Clickoptionsicon(); 
	}

	@Then("User click on copy to another outlet")
	public void user_click_on_copy_to_another_outlet() {
	   Buyeroutletsviewsupplierspage.Clickcopytoanotheroutlet();
	}

	@Then("User click on select all icon")
	public void user_click_on_select_all_icon() {
	   Buyeroutletsviewsupplierspage.Clickonselectallicon();
	}

	@Then("User click on ok button")
	public void user_click_on_ok_button() {
	   Buyeroutletsviewsupplierspage.Clickonokbutton();
	}

	@Then("User click on Download marketlist")
	public void user_click_on_Download_marketlist() {
	    Buyeroutletsviewsupplierspage.Clickondownloadmarketlist();
	} 



	@Then("User click on check box clear button")
	public void user_click_on_check_box_clear_button() {
	   Buyeroutletsviewsupplierspage.Clickonclearcheckbox();
	}
	
	
	
	
	
	
	
}
