package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagesettingspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
//import pageObjects.SupplierPNF7857page;
//import pageObjects.SupplierPNF7858page;
import pageObjects.Suppliercustomerlocationlistingpage;

public class Suppliercustomerlocationlisting {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	//private SupplierPNF7858page supplierPNF7858;
	private DashboardPage dashboradpage;
	//private SupplierPNF7857page supplierPNF7857;
    private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	
	
	public Suppliercustomerlocationlisting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		//this.supplierPNF7858 =testContext.getPageObjectManager().getSupplierPNF7858page();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		//this.supplierPNF7857 =testContext.getPageObjectManager().getSupplierPNF7857page();
        this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
	}

	
	@Then("User click on Customers side navigation list menubar")
	public void user_click_on_Customers_side_navigation_list_menubar() throws InterruptedException {
	    DashboardPage.ClickonCustomersinthesidemenu();
	}

	@Then("User enter name in search box sakthimasala {string}")
	public void user_enter_name_in_search_box_sakthimasala(String Sakthimasala100) {
	    //Suppliercustomerlocationlistingpage.Enterthenameinsearchbox(Sakthimasala100);
	}

	@Then("User click on checkbox in location page")
	public void user_click_on_checkbox_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clickoncheckbox();
	}

	@Then("User click on apply outlet setting button")
	public void user_click_on_apply_outlet_setting_button() {
	    Suppliercustomerlocationlistingpage.Clickonapplybutton();
	}

	@Then("User select on dropdown value of sakthimasala")
	public void user_select_on_dropdown_value_of_sakthimasala() {
		WebElement Sakthimasala = Suppliercustomerlocationlistingpage.getDropDownElementoutletsettings();
		Select select=new Select(Sakthimasala);
		select.selectByIndex(1);
	}

	@Then("User click on select all button")
	public void user_click_on_select_all_button() {
	    Suppliercustomerlocationlistingpage.Clickselectallbutton();
	}

	@Then("User click on apply button")
	public void user_click_on_apply_button() {
	    Suppliercustomerlocationlistingpage.Clickonapplybuttonoutletsettingpage();
	}

	@Then("User click on clear button in location page")
	public void user_click_on_clear_button_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clickonclearbutton();
	}

	@Then("User click on actions dropdown in location page")
	public void user_click_on_actions_dropdown_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clickonactionsdropdown();
	}

	@Then("User click on Manage settings in location page")
	public void user_click_on_Manage_settings_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clcikonmanagesettings();
	}

	@Then("User click on customers backbutton")
	public void user_click_on_customers_backbutton() {
	    Suppliercustomerlocationlistingpage.Clickoncustomersbackbutton();
	}

	@Then("User click on Manage market list in location page")
	public void user_click_on_Manage_market_list_in_location_page() {
	   Suppliercustomerlocationlistingpage.Clickonmanagemarketlist();
	}

	@Then("User click on Customers backbutton in manage market page")
	public void user_click_on_Customers_backbutton_in_manage_market_page() {
	   Suppliercustomerlocationlistingpage.Clickcustomerbackbuttoninmanagemarket();
	}

	@Then("User click on Default settings in location page")
	public void user_click_on_Default_settings_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clickondefaultsetting();
	}

	@Then("User click on Customers backbutton in default settings page")
	public void user_click_on_Customers_backbutton_in_default_settings_page() {
	    Suppliercustomerlocationlistingpage.Clickbackbuttonindefaultsettings();
	}

	@Then("User click on New customers in location page")
	public void user_click_on_New_customers_in_location_page() {
	    Suppliercustomerlocationlistingpage.Clickonnewcustomers();
	}

	@Then("User click on customers backbutton in new customers page")
	public void user_click_on_customers_backbutton_in_new_customers_page() {
	    Suppliercustomerlocationlistingpage.Clickoncustomerbackbuttoninnewcustomerpage();
	}


	
	
}
