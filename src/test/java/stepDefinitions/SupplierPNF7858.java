package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierPNF7858page;

public class SupplierPNF7858 {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private SupplierPNF7858page supplierPNF7858;
	private DashboardPage dashboradpage;

	public SupplierPNF7858(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.supplierPNF7858 =testContext.getPageObjectManager().getSupplierPNF7858page();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();

	}

	/*@Given("User is on available Login Page")
	public void user_is_on_available_Login_Page() {
		LogInPage.navigateTo_LogInPage3();
	}

	@When("User enter correct username{string}")
	public void user_enter_correct_username_velumanieswaran2020_gmail_com(String loginEmail) {
		LogInPage.Entercorrcectusername(loginEmail);	
	}

	@When("User enter correct password{string}")
	public void user_enter_correct_password_123456Zm(String loginPassword) {
		LogInPage.Entercorrectpassword(loginPassword);
	}

	@When("User is click login button in supplier panel")
	public void user_is_click_login_button_in_supplier_panel() throws InterruptedException {
		LogInPage.Clickloginbutton();
	}*/

	@Then("User click on Invoices in the side navigation menubar")
	public void user_click_on_Invoices_in_the_side_navigation_menubar() throws InterruptedException {
        DashboardPage.Clickoninvoiceinthesidemenu();
	}

	@Then("User click on any one invoice invoice menu")
	public void user_click_on_any_one_invoice_invoice_menu() {
		SupplierPNF7858page.Clickonanyoneinvoice();
	}

	@Then("User check on changed deliver to and linked to")
	public void user_check_on_changed_deliver_to_and_linked_to() {
		SupplierPNF7858page.Checkonchangedlinkedto();
	}


















































}
