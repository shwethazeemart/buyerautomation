package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerPNF7797page;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierPNF7856page;
import pageObjects.SupplierPNF7858page;

public class SupplierPNF7856 {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private SupplierPNF7858page supplierPNF7858;
	private DashboardPage dashboradpage;
    private SupplierPNF7856page supplierPNF7856;
	
	public SupplierPNF7856(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.supplierPNF7858 =testContext.getPageObjectManager().getSupplierPNF7858page();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.supplierPNF7856 =testContext.getPageObjectManager().getSupplierPNF7856page();

	}
	
	
	@Then("User click on Customers in the side navigation menubar")
	public void user_click_on_Customers_in_the_side_navigation_menubar() throws InterruptedException {
	    DashboardPage.ClickonCustomersinthesidemenu();
	}

	@Then("User click on New customer icon in customers page")
	public void user_click_on_New_customer_icon_in_customers_page() {
	    SupplierPNF7856page.Clickonnewcustomericon();
	}

	@Then("User enter UEN number in the registration field {string}")
	public void user_enter_UEN_number_in_the_registration_field(String UEN) {
	    SupplierPNF7856page.EnterUENnumber(UEN);
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
	    SupplierPNF7856page.Clickoncontinuebutton();
	}

	@Then("User enter the company name {string}")
	public void user_enter_the_company_name(String companyname) {
	    SupplierPNF7856page.Enterthecompanyname(companyname);
	}

	@Then("User select country in address field")
	public void user_select_country_in_address_field() throws InterruptedException {
		WebElement Singapore = SupplierPNF7856page.getDropDownElementsingapore();
		Select select=new Select(Singapore);
		select.selectByVisibleText("Singapore");
	}

	@Then("User enter the postcode in address field {string}")
	public void user_enter_the_postcode_in_address_field(String postcode) {
	    SupplierPNF7856page.Enterthepostcode(postcode);
	}

	@Then("User enter the Address line one in address field {string}")
	public void user_enter_the_Address_line_one_in_address_field(String addresslineone) {
	    SupplierPNF7856page.Entertheaddresslineone(addresslineone);
	}

	@Then("User enter the Address line two in address field {string}")
	public void user_enter_the_Address_line_two_in_address_field(String addresslinetwo) {
	    SupplierPNF7856page.Entertheaddresslinetwo(addresslinetwo);
	}

	@Then("User enter the company email {string}")
	public void user_enter_the_company_email(String companyemail) {
	    SupplierPNF7856page.Enterthecompanyemail(companyemail);
	}

	@Then("User click on same company address checkbox")
	public void user_click_on_same_company_address_checkbox() throws InterruptedException {
	   SupplierPNF7856page.Clickonsamecompanyaddresscheckbox();
	}

	@Then("User finally click on sava button")
	public void user_finally_click_on_sava_button() {
	   SupplierPNF7856page.Clickonsavebuttonfinally();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
