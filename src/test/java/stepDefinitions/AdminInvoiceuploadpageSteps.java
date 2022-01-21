package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class AdminInvoiceuploadpageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private InventoryPage inventorypage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	

	public AdminInvoiceuploadpageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = testContext.getPageObjectManager().getLogInPage1();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	
	
	/*@When("User Clicks Login button")
    public void user_Clicks_Login_buttonadmin() throws InterruptedException {
        logInPage.click_LoginBtnadmin();
    }*/
	@When("User is enter exact username{string}")
	public void user_is_enter_exact_username_guna_zeemart_asia(String username) {
	    admininvoiceuploadpage.enter_exact_username_guna_zeemart_asia(username);
	}

	@When("User is enter exact password{string}")
	public void user_is_enter_exact_password_2p$2s_QU(String password) {
	    admininvoiceuploadpage.enter_exact_password_2p$2s_QU(password);
	}

	@When("User are Select country in the autocomplete text box")
	public void user_are_Select_country_in_the_autocomplete_text_box() {
		WebElement Singapore = AdminInvoiceuploadpage.getDropDownOwnerElement();
		Select select=new Select(Singapore);
		select.selectByIndex(0);
	}
	
	@When("User is press the Admin login button")
	public void user_is_press_the_Admin_login_button() {
	    admininvoiceuploadpage.press_the_Admin_login_button();
	}



	@When("User Clicks on Admin Invoices in the side navigation menubar")
	public void user_Clicks_on_Admin_Invoices_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickAdminInvoices();
    }
	
	@Given("User is Clicks in Upload_invoice")
	public void user_is_Clicks_in_Upload_invoice() throws InterruptedException {
		admininvoiceuploadpage.Clicks_in_Upload_invoice();
	}
	@Then("User are Select outlet in the autocomplete text box")
	public void user_are_Select_outlet_in_the_autocomplete_text_box() throws InterruptedException {
	    admininvoiceuploadpage.Select_Outlet();
	}

	@Then("User is Clicks the upload file")
	public void user_is_Clicks_the_upload_file() {
	   admininvoiceuploadpage.Clicks_the_upload_file();
	}

	@Then("User is Clicks the Done button")
	public void user_is_Clicks_the_Done_button() {
		admininvoiceuploadpage.ClickDoneButton();
		}


}
