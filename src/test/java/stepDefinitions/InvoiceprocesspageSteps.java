package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage; 
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class InvoiceprocesspageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	//public static WebDriver driver;
	
	

	public InvoiceprocesspageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
	}

	
	
	@When("User is enter Registered username{string}")
	public void user_is_enter_Registered_username(String loginEmail) {
		LogInPage.enter_loginEmail(loginEmail);
	}

	@When("User are enter Registered password{string}")
	public void user_are_enter_Registered_password(String loginpassword) {
		LogInPage.enter_loginpassword(loginpassword);
	}


	@Given("User is available in invoices process login page")
	public void user_is_available_Invoices_process_login_page() {
		LogInPage.navigateTo_LogInPage1();
	}


	@Given("User is Clicks Invoices in the side navigation menubar")
	public void user_is_Clicks_Invoices_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickInvoices();
	}

	@Then("User are Clicks in Uploads")
	public void user_are_Clicks_in_Uploads() throws InterruptedException {
		InvoicesPage.click_Uploads();
	}

	@And("User is Clicks in Process button")
	public void user_is_Clicks_in_Process_button() throws InterruptedException {
		InvoiceprocessPage.click_processbutton();
	}

	@Then("User are Select supplier in the dropdown lists")
	public void user_are_Select_supplier_in_the_dropdown_lists() {
		WebElement velumasala2020 = invoiceProcessPage.getDropDownElement();
		Select select=new Select(velumasala2020);
		select.selectByIndex(1);
	}
	@And("User is set the invoice number{string}")
	public void user_is_set_the_invoice_number_INV(String invoicenumber) {
		InvoiceprocessPage.enter_invoicenumber(invoicenumber);
	} 


	@Then("User are Clicks in Validate button")
	public void user_are_Clicks_in_Validate_button() {
		InvoiceprocessPage.click_Validatebutton(); 
	} 


	@And("User is Select date in the calendar options")
	public void user_is_Select_date_in_the_calendar_options() {
	InvoiceprocessPage.SelectcalendarByJS();
		//WebElement selectDate = invoiceProcessPage.getCalendarDateElement();
		//selectDate.click();
		//String dateVal="17-11-2020"; 
		//String dateVal="17-11-2020"; 
		//InvoiceprocessPage.selectDateByJS(element, dateVal);

	}
	@Then("User are Clicks the Order number in textbox")
	public void user_are_Clicks_the_Order_number_in_textbox() {
		InvoiceprocessPage.click_Ordernumber();
	}
	
	@When("User are Select the Order number in textbox lists")
	public void user_are_Select_the_Order_number_in_textbox_lists() throws InterruptedException {
		InvoiceprocessPage.Enter_Ordernumber();
	
	}
	

	@And("User is Clicks in Use data")
	public void user_is_Clicks_in_Use_data() throws InterruptedException {
		InvoiceprocessPage.click_Usedata();
	}

	@Then("User are Click yes processed POP")
	public void user_are_Click_yes_processed_POP() throws InterruptedException {
		InvoiceprocessPage.click_yesprocessedPOP();

	} 

	@And("User is Select the Payments terms in the dropdown lists")
	public void user_is_Select_the_Payments_terms_in_the_dropdown_lists() {
		WebElement Paymentsterms = invoiceProcessPage.getDropDownElementPaymentsterms();
		Select select=new Select(Paymentsterms);
		select.selectByVisibleText("NET 60");
	}

	@Then("User are Clicks the Publish this invoice")
	public void user_are_Clicks_the_Publish_this_invoice() {
		InvoiceprocessPage.click_Publishbutton();

	}
	
	@Then("User are clicks in Today button")
	public void user_are_clicks_in_Today_button() {
		InvoiceprocessPage.clicks_Todaybutton();
	}



	@Then("It should display invoice in invoices page")
	public void it_should_display_invoice_in_invoices_page() {
		String displayinvoice =InvoiceprocessPage.getPageTitle();
		String pageTitle = displayinvoice;
		System.out.println("passwordresetpage failure page title: " + pageTitle);
	}	
 

}
