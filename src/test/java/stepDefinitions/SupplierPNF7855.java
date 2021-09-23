package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierPNF7855page;
import pageObjects.SupplierPNF7858page;

public class SupplierPNF7855 {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private SupplierPNF7858page supplierPNF7858;
	private DashboardPage dashboradpage;
	private SupplierPNF7855page supplierPNF7855;

	public SupplierPNF7855(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.supplierPNF7858 =testContext.getPageObjectManager().getSupplierPNF7858page();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.supplierPNF7855 =testContext.getPageObjectManager().getSupplierPNF7855page();

	}
	
	
	@Then("User click on Customers in the side navigation menubar")
	public void user_click_on_Customers_in_the_side_navigation_menubar() throws InterruptedException {
	    DashboardPage.ClickonCustomersinthesidemenu();
	}

	@Then("User check on verify the Location")
	public void user_check_on_verify_the_Location() {
	    SupplierPNF7855page.Checkonverifythelocation();
	}

	@Then("User check on changed to search icon location")
	public void user_check_on_changed_to_search_icon_location() {
	    SupplierPNF7855page.Checkonseachiconislocation();
	}

	@Then("User check on Column is location")
	public void user_check_on_Column_is_location() {
	    SupplierPNF7855page.Checkoncloumnislocation();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
