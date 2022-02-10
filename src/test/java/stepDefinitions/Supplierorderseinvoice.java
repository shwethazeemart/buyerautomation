package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderseinvoicepage;
import pageObjects.Supplierorderslistingpage;

public class Supplierorderseinvoice {


	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private Supplierorderslistingpage supplierorderslisting;
	private Supplierorderseinvoicepage supplierorderseinvoice;



	public Supplierorderseinvoice(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
		this.supplierorderslisting=testContext.getPageObjectManager().getSupplierorderslistingpage();
		this.supplierorderseinvoice=testContext.getPageObjectManager().getSupplierorderseinvoicepage();
	}



	@Then("User click on first order in order list page")
	public void user_click_on_first_order_in_order_list_page() {
		Supplierorderseinvoicepage.Clickfirstorderinorderlist();
	}


	@Then("User click on acknowledge button in first order")
	public void user_click_on_acknowledge_button_in_first_order() {
		//Supplierorderseinvoicepage.Clickonacknowledgebutton();
	}
	@Then("User click on create einvoice icon in first order")
	public void user_click_on_create_einvoice_icon_in_first_order() {
		Supplierorderseinvoicepage.Clickoncreateeinvoiceicon();
	}
	@Then("User click on email field in einvoice page")
	public void user_click_on_email_field_in_einvoice_page() {
		Supplierorderseinvoicepage.Clickonemaildfield();
	}
	@Then("User enter the email einvoice field{string}")
	public void user_enter_the_email_einvoice_field_velumani_zeemart_asia(String emailfield) {
		Supplierorderseinvoicepage.Enteremailineinvoicefield(emailfield);
	}
	@Then("User click on delivery field in einvoice page")
	public void user_click_on_delivery_field_in_einvoice_page() {
		Supplierorderseinvoicepage.Clickondedeliveryfield();
	}
	@Then("User enter delivery fees in einvoice page{string}")
	public void user_enter_delivery_fees_in_einvoice_page_deliveryfees(String deliveryfees) {
		Supplierorderseinvoicepage.Enterdeliveyfees(deliveryfees);
	}
	@Then("User click on save and issue button in einvoice page")
	public void user_click_on_save_and_issue_button_in_einvoice_page() {
		Supplierorderseinvoicepage.Clickonsaveandissuebutton();
	}
	@Then("User click on options dropdown in first order")
	public void user_click_on_options_dropdown_in_first_order() throws InterruptedException {
		Supplierorderseinvoicepage.Clickoptionsdropdown();

	}
	@Then("User click on download packing slip in first order")
	public void user_click_on_download_packing_slip_in_first_order() {
		//Supplierorderseinvoicepage.Clickondownloadpackingslip();
	}
	@Then("User click on mark as shipped in first order")
	public void user_click_on_mark_as_shipped_in_first_order() {
		//Supplierorderseinvoicepage.Clickonmarkasshipped();
	}
	@Then("User click on back order button in first order")
	public void user_click_on_back_order_button_in_first_order() {
		Supplierorderseinvoicepage.Clickonbackorderbutton();
	}
	@Then("User click on fifth order in order list page")
	public void user_click_on_fifth_order_in_order_list_page() {
		Supplierorderseinvoicepage.Clickonfifthorderinorderlist();
	}
	@Then("User click on partially shipped in fifth order list")
	public void user_click_on_partially_shipped_in_fifth_order_list() {
		Supplierorderseinvoicepage.Clickonpartiallyshipped();
	}
	@Then("User click on sixth order in order list page")
	public void user_click_on_sixth_order_in_order_list_page() {
		Supplierorderseinvoicepage.Clickonsixthorderinorderlist();
	}
	@Then("User click on void order in sixth order")
	public void user_click_on_void_order_in_sixth_order() {
		Supplierorderseinvoicepage.Clickonvoidorder();
	}
	@Then("User click on requested by buyer in sixth order")
	public void user_click_on_requested_by_buyer_in_sixth_order() {
		Supplierorderseinvoicepage.Clickonrequestedbybuyer();
	}
	@Then("User click on void order button in sixth order")
	public void user_click_on_void_order_button_in_sixth_order() {
		Supplierorderseinvoicepage.Clickonvoidorderbuttonfinally();
	}
	@Then("User click on Download PDF in first order page")
	public void user_click_on_Download_PDF_in_first_order_page() {
		Supplierorderseinvoicepage.Clickondownloadpdfbutton(); 
	}


	@Then("User click on ok button of popmessage")
	public void user_click_on_ok_button_of_popmessage() {
		//Supplierorderseinvoicepage.Clickokbuttonofpopmessage();
	}













































}
