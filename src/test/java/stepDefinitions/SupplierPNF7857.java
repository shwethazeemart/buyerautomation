package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerPNF7797page;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierPNF7857page;
import pageObjects.SupplierPNF7858page;

public class SupplierPNF7857 {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private SupplierPNF7858page supplierPNF7858;
	private DashboardPage dashboradpage;
	private SupplierPNF7857page supplierPNF7857;
   
	
	
	public SupplierPNF7857(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.supplierPNF7858 =testContext.getPageObjectManager().getSupplierPNF7858page();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.supplierPNF7857 =testContext.getPageObjectManager().getSupplierPNF7857page();

	}

	@Then("User click on Customers in the side navigation menubar")
	public void user_click_on_Customers_in_the_side_navigation_menubar() throws InterruptedException {
	   DashboardPage.ClickonCustomersinthesidemenu();
	}

	@Then("User click on New customer icon")
	public void user_click_on_New_customer_icon() {
	   SupplierPNF7857page.Clickonnewcustomericon();
	}

	@Then("User Enter the UEN number registration field{string}")
	public void user_Enter_the_UEN_number_registration_field(String UEN) {
	    SupplierPNF7857page.EntertheUENfield(UEN);
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
	    SupplierPNF7857page.Clickoncontinuebutton();
	}

	@Then("User upload the image in draganddrop field")
	public void user_upload_the_image_in_draganddrop_field() throws InterruptedException {
	    SupplierPNF7857page.Uploadimage();
	}

	@Then("User select check box of velumasala")
	public void user_select_check_box_of_velumasala() throws InterruptedException {
	    SupplierPNF7857page.Selectcheckboxofvelumasala();
	}

	@Then("User enter information in note field{string}")
	public void user_enter_information_in_note_field_Hi_all_this_is_masala_company(String information) {
	    SupplierPNF7857page.Enterinformation(information);
	}

	@Then("User submit button in finally")
	public void user_submit_button_in_finally() {
	    SupplierPNF7857page.Clicksubmitbutton(); 
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
