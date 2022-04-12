package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdmininvoiceprocesspageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	

	public AdmininvoiceprocesspageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	@Then("User is Clicks in Sort by dropdown")
	public void user_is_Clicks_in_Sort_by_dropdown() throws InterruptedException {
	    admininvoiceprocesspage.Clicks_in_Sort_by_dropdown();
	}

	@And("User are Clicks in Newest first")
	public void user_are_Clicks_in_Newest_first() {
	    admininvoiceprocesspage.Clicks_in_Newest_first();
	}

	//@Then("User is Clicks the outlet process button")
	//public void user_is_Clicks_the_outlet_process_button() throws InterruptedException {
	   //admininvoiceprocesspage.ClicksOutlet_process_button();
	//}
	
	    
	@Then("User is Enter Order number in the Order number field{string}")
	public void user_is_Enter_Order_number_in_the_Order_number_field(String ordernumber) throws InterruptedException {
	    admininvoiceprocesspage.Enter_Order_number_in_the_Order_number_field(ordernumber);
	}

	@And("User are Clicks Use data button")
	public void user_are_Clicks_Use_data_button() {
	    admininvoiceprocesspage.Clicks_Use_data_button(); 
	}

	@Then("User is Clicks Yes processed POPUP message")
	public void user_is_Clicks_Yes_processed_POPUP_message() {
	    admininvoiceprocesspage.Clicks_Yes_processed_POPUP_message();
	}

	@And("User are Enter Invoice number in the invoice number field{string}")
	public void user_are_Enter_Invoice_number_in_the_invoice_number_field_INV(String invoicenumber) {
	    admininvoiceprocesspage.Enter_Invoice_number(invoicenumber);
	}

	@Then("User is Clicks validate button")
	public void user_is_Clicks_validate_button() {
	    admininvoiceprocesspage.Clicks_validate_button();
	}

	@When("User are Select date in the invoice date field")
	public void user_are_Select_date_in_the_invoice_date_field() {
	    admininvoiceprocesspage.SelectcalendarByJS();
	}

	@When("User is Select payment terms in payment terms dropdown")
	public void user_is_Select_payment_terms_in_payment_terms_dropdown() {
		WebElement COD = Admininvoiceprocesspage.getDropDownOwnerElement();
		Select select=new Select(COD);
		select.selectByVisibleText("COD");
	}

	@And("User are Clear the Delivery fee textbox")
	public void user_are_Clear_the_Delivery_fee_textbox() throws InterruptedException {
	    admininvoiceprocesspage.Clear_the_Delivery_fee_textbox();
	}

	@Then("User is Enter the value in delivery fee field textbox{string}")
	public void user_is_Enter_the_value_in_delivery_fee_field_textbox_deliveryfees(String deliveryfees) {
	   admininvoiceprocesspage.Enter_the_value_in_delivery_fee(deliveryfees);
	}

	@And("User are Clicks publish  this invoice button")
	public void user_are_Clicks_publish_this_invoice_button() {
	    admininvoiceprocesspage.Clicks_publish_this_invoice_button();
	}

	@Then("It should display the particular invoice in invoices processed icon")
	public void it_should_display_the_particular_invoice_in_invoices_processed_icon() {
		String displayinvoiceprocessedicon =Admininvoiceprocesspage.getPageTitle();
		String pageTitle = displayinvoiceprocessedicon;
		System.out.println("page title: " + pageTitle);
	}



	@Then("User is Clicks the outlet process button")
	public void user_is_Clicks_the_outlet_process_button() throws InterruptedException {
		 admininvoiceprocesspage.outletsProcessClick(); 
	}

	@Then("User select on supplier in dropdown field")
	public void user_select_on_supplier_in_dropdown_field() {
		WebElement VELUMASALA2 = Admininvoiceprocesspage.getDropDownOwnerElement0fvelumasala2();
		Select select=new Select(VELUMASALA2);
		select.selectByVisibleText("VELU MASALA2");
	}
	
	
	
	
	
	
	
}
