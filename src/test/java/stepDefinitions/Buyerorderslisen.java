package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyerorderslisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerorderslisen {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private Buyerinvoicelisenpage buyerinvoicelisen;
	private Buyerorderslisenpage buyerorderslisenpage;



	public Buyerorderslisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerorderslisenpage=testContext.getPageObjectManager().getBuyerorderslisenpage();
	}



	@When("User Clicks on New order dropdown value")
	public void user_Clicks_on_New_order_dropdown_value() {
		Buyerorderslisenpage.Clickonneworderdropdown();
	}

	@Then("User click on outside order icon")
	public void user_click_on_outside_order_icon() {
		Buyerorderslisenpage.Clickonoutsideicon();
	}

	@Then("User click on Download option")
	public void user_click_on_Download_option() {
		Buyerorderslisenpage.Clickondownloadicon();
	}

	@Then("User click on Download receving list")
	public void user_click_on_Download_receving_list() {
		Buyerorderslisenpage.ClickonDownloadrecevinglist();
	}

	@Then("User click on select date from calendar")
	public void user_click_on_select_date_from_calendar() throws InterruptedException {
		Buyerorderslisenpage.Selectdatefromcalendar();
	}

	@Then("User select outlet in dropdown value")
	public void user_select_outlet_in_dropdown_value() {
		WebElement velumasala2020 = Buyerorderslisenpage.getDropDownElementvelumasala2020();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@Then("User click on download button in order page")
	public void user_click_on_download_button_in_order_page() {
		Buyerorderslisenpage.Clickondownloadbutton();
	}

	@Then("User click on all orders icon")
	public void user_click_on_all_orders_icon() {
		Buyerorderslisenpage.Clickonallordersicon();
	}

	@Then("User click on Needs approval icon")
	public void user_click_on_Needs_approval_icon() {
		Buyerorderslisenpage.Clickonneedapprovalicon();
	}

	@Then("User click on Drafts icon")
	public void user_click_on_Drafts_icon() {
		Buyerorderslisenpage.Clickondraftsicon();
	}

	@Then("User click on Recurring orders")
	public void user_click_on_Recurring_orders() {
		Buyerorderslisenpage.Clickonrecurringordersicon();
	}

	@Then("User click on search box order id")
	public void user_click_on_search_box_order_id() {
		Buyerorderslisenpage.Clickonsearchboxorderid();
	}

	@Then("User enter the order id search box{string}")
	public void user_enter_the_order_id_search_box(String orderid) {
		Buyerorderslisenpage.Entertheorderidinsearchbox(orderid);
	}

	@Then("User click on search icon in orders page")
	public void user_click_on_search_icon_in_orders_page() {
		Buyerorderslisenpage.Clickonsearchicon();
	}

	@Then("User clear the search box")
	public void user_clear_the_search_box() {
		Buyerorderslisenpage.Clearthesearchbox();
	}

	@Then("User select delivery date from calendar")
	public void user_select_delivery_date_from_calendar() {
		Buyerorderslisenpage.Selectdeliverydatefromcalendar(); 
	}

	@Then("User close button delivery date from calendar")
	public void user_close_button_delivery_date_from_calendar() {
		Buyerorderslisenpage.Clickclosebuttondeliverydate();
	}

	@Then("User click on placed date from calendar")
	public void user_click_on_placed_date_from_calendar() {
		Buyerorderslisenpage.Clickonplaceddatefromcalendar();
	}

	@Then("User click on close button to placed date from calendar")
	public void user_click_on_close_button_to_placed_date_from_calendar() {
		Buyerorderslisenpage.Clickonclosebuttontoplaceddate();
	}

	@Then("User click on outlet in filter")
	public void user_click_on_outlet_in_filter() {
		Buyerorderslisenpage.Clickonoutletinfilter();
    }

	@Then("User Click on supplier in order page")
	public void user_Click_on_supplier_in_order_page() {
		Buyerorderslisenpage.Clickonsupplier();
	}

	@Then("User click on order status in order page")
	public void user_click_on_order_status_in_order_page() {
		Buyerorderslisenpage.Clickorderstatus();
	}

	@Then("User click on invoicing status in order page")
	public void user_click_on_invoicing_status_in_order_page() {
		Buyerorderslisenpage.Clickoninvoicingstatus();
	}

	@Then("User click on order type in order page")
	public void user_click_on_order_type_in_order_page() {
		Buyerorderslisenpage.Clickonordertype();
	}

	@Then("User click on check box of first order")
	public void user_click_on_check_box_of_first_order() throws InterruptedException {
		Buyerorderslisenpage.Clickoncheckboxoffirstorder();
	}

	@Then("User click on download orders button in order page")
	public void user_click_on_download_orders_button_in_order_page() {
		Buyerorderslisenpage.Clickondownloadorderbutton();
	}

	@Then("User click on download orders in detailed in order page")
	public void user_click_on_download_orders_in_detailed_in_order_page() {
		Buyerorderslisenpage.Clickdownloadorderdetailed();
	}

	@Then("User click on Mark as recevied button in order page")
	public void user_click_on_Mark_as_recevied_button_in_order_page() {
		Buyerorderslisenpage.Clickonmarkasreceviedbutton();
	}

	@Then("User click on clear button in order page")
	public void user_click_on_clear_button_in_order_page() {
		Buyerorderslisenpage.Clickonclearbutton();
	}

	@Then("User click on sabari supplier order")
	public void user_click_on_sabari_supplier_order() {
		Buyerorderslisenpage.Clickonsabarisupplierorder();
	}

	@Then("User click on Repeat order")
	public void user_click_on_Repeat_order() {
		Buyerorderslisenpage.Clickonrepeatorder(); 
	}

	@Then("User click on Receive order")
	public void user_click_on_Receive_order() {
		//Buyerorderslisenpage.ClickReceiveorder();
	}

	@Then("User click on yes marked button")
	public void user_click_on_yes_marked_button() {
		//Buyerorderslisenpage.Clickyesmarkedbutton();
	}

	@Then("User click on Activity")
	public void user_click_on_Activity() {
		//Buyerorderslisenpage.ClickonActivity();
	}

	@Then("User click on Cancel and linked order")
	public void user_click_on_Cancel_and_linked_order() {
		//Buyerorderslisenpage.Clickoncancelandlinkedbutton();
	}

	@Then("User click on reason of change quantity")
	public void user_click_on_reason_of_change_quantity() {
		//Buyerorderslisenpage.Clickonreason();
	}

	@Then("User click on confirm cancel button")
	public void user_click_on_confirm_cancel_button() {
		//Buyerorderslisenpage.Clickonconfirmcancelbutton();
	}

	@Then("User click on sabari supplier order in order page")
	public void user_click_on_sabari_supplier_order_in_order_page() {
		//Buyerorderslisenpage.Clickonsabarisupplier();
	}

	@Then("User click on PDF download button")
	public void user_click_on_PDF_download_button() {
		Buyerorderslisenpage.ClickonPDFdownloadbutton();
	}






	@Then("User click on close icon in order first page")
	public void user_click_on_close_icon_in_order_first_page() {
	  Buyerorderslisenpage.Clickoncloseicon();
	}

	@Then("User click on filter in order first page")
	public void user_click_on_filter_in_order_first_page() throws InterruptedException {
	    Buyerorderslisenpage.Clickonfilterinorderpage();
	}


	@Then("User click on select all icon in order page")
	public void user_click_on_select_all_icon_in_order_page() {
	    Buyerorderslisenpage.Clickonselectall();
	}



	@Then("User click on Apply button in order in first page")
	public void user_click_on_Apply_button_in_order_in_first_page() {
	    Buyerorderslisenpage.ClickonApplybuttoninorder();
	}

	@Then("User click on Reset button in order in first page")
	public void user_click_on_Reset_button_in_order_in_first_page() {
	    Buyerorderslisenpage.Clickonresetbuttoninorder();
	}














































}
