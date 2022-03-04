package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.OrdersPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderslistingpage;


public class Supplierorderslisting {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
    private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private Supplierorderslistingpage supplierorderslisting;
	
	public Supplierorderslisting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
        this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
        this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
        this.supplierorderslisting=testContext.getPageObjectManager().getSupplierorderslistingpage();
	}
	
	
	@Then("User click on Orders side navigation list menubar")
	public void user_click_on_Orders_side_navigation_list_menubar() throws InterruptedException {
		DashboardPage.Clickonorders();
	}

	@Then("User click on download button in orders page")
	public void user_click_on_download_button_in_orders_page() {
	    Supplierorderslistingpage.Clickdownloadbuttoninorderpage();
	}

	
	@Then("User click on download pick list button")
	public void user_click_on_download_pick_list_button() {
	    Supplierorderslistingpage.Clickondownloadpicklistbutton();
	}

	@Then("User select date on download pick list")
	public void user_select_date_on_download_pick_list() {
	    Supplierorderslistingpage.Selectdateindownloadpicklist();
	}

	@Then("User select dropdown list of outlets")
	public void user_select_dropdown_list_of_outlets() {
		WebElement sakthimasala = supplierorderslisting.getDropDownElementoutletslist();
		Select select=new Select(sakthimasala);
		select.selectByIndex(1);
	}

	@Then("User click on download button of downoad pick list")
	public void user_click_on_download_button_of_downoad_pick_list() {
	   Supplierorderslistingpage.Clickfinaldownloadbutton();
	}

	@Then("User click on close icon of download pick list")
	public void user_click_on_close_icon_of_download_pick_list() {
	    Supplierorderslistingpage.Clickcloseicondownloadpicklist();
	}

	@Then("User click on order number search box")
	public void user_click_on_order_number_search_box() {
	    Supplierorderslistingpage.Clickonordernumbersearchbox();
	}

	@Then("User enter the order number in searchbox{string}")
	public void user_enter_the_order_number_in_searchbox(String ordernumber) {
	    Supplierorderslistingpage.Entertheordernumber(ordernumber);
	}

	@Then("User click on search icon in order page")
	public void user_click_on_search_icon_in_order_page() {
	    Supplierorderslistingpage.Clicksearchicon();
	}

	@Then("User clear the order number search box")
	public void user_clear_the_order_number_search_box() {
	    Supplierorderslistingpage.Clearonordernumber();
	}

	@Then("User select delivery location dropdown")
	public void user_select_delivery_location_dropdown() {
		WebElement sakthimasala = supplierorderslisting.getDropDownElementDeliverylocation();
		Select select=new Select(sakthimasala);
		select.selectByIndex(1);
	}

	@Then("User select order date range in order page")
	public void user_select_order_date_range_in_order_page() {
	    Supplierorderslistingpage.Selectorderdaterange();
	}

	@Then("User select delivery date range in order page")
	public void user_select_delivery_date_range_in_order_page() {
	   Supplierorderslistingpage.Selectdeliverydaterange();
	}

	@Then("User click on filter icon in order page")
	public void user_click_on_filter_icon_in_order_page() {
	    Supplierorderslistingpage.Clickonfiltericon();
	}

	@Then("User click on orders status")
	public void user_click_on_orders_status() {
	   Supplierorderslistingpage.Clickonorderstatus();
	}

	@Then("User click on select all option")
	public void user_click_on_select_all_option() {
	    Supplierorderslistingpage.Selectalloption();
	}

	@Then("User click on reset button")
	public void user_click_on_reset_button() {
	    Supplierorderslistingpage.Clickonresetbutton();
	}

	@Then("User click on deliver status")
	public void user_click_on_deliver_status() {
	    Supplierorderslistingpage.Clickondeliverystatus();
	}

	@Then("User click on invoicing status")
	public void user_click_on_invoicing_status() {
	   Supplierorderslistingpage.Clickoninvoicingstatus();
	}

	@Then("User click on acknowledgement status")
	public void user_click_on_acknowledgement_status() {
	   Supplierorderslistingpage.Clickonacknowledgementstatus();
	}

	@Then("User click on checkbox of second order in order page")
	public void user_click_on_checkbox_of_second_order_in_order_page() {
	   Supplierorderslistingpage.Clickoncheckboxofsecondorder();
	}

	@Then("User click on clear option in order page")
	public void user_click_on_clear_option_in_order_page() {
	    Supplierorderslistingpage.Clickonclearoption();
	}

	@Then("User click on mark as drodown icon")
	public void user_click_on_mark_as_drodown_icon() {
	    Supplierorderslistingpage.Clickonmarkasicon();
	}

	@Then("User click on acknowledged icon")
	public void user_click_on_acknowledged_icon() {
	    Supplierorderslistingpage.Clickonacknowledgedicon();
	}

	@Then("User click on ok button of popup message")
	public void user_click_on_ok_button_of_popup_message() {
	    Supplierorderslistingpage.Clickonokbuttonpopupmessage();
	}

	@Then("User click on shipped icon")
	public void user_click_on_shipped_icon() {
	    Supplierorderslistingpage.Clickonshippedicon();
	}

	@Then("User click on checkbox of third order in order page")
	public void user_click_on_checkbox_of_third_order_in_order_page() {
	    Supplierorderslistingpage.Clickoncheckboxthirdorder();
	}

	@Then("User click on partially shipped")
	public void user_click_on_partially_shipped() {
	   Supplierorderslistingpage.Clickonpartiallyshipped();
	}

	@Then("User click on download csv button")
	public void user_click_on_download_csv_button() {
	    Supplierorderslistingpage.Clickondownloadcsvbutton();
	}

	@Then("User click on download csv detailed button")
	public void user_click_on_download_csv_detailed_button() {
	    Supplierorderslistingpage.Clickondownloadcsvdetailedbutton();
	}

	@Then("User click on actions dropdown in first order in order page")
	public void user_click_on_actions_dropdown_in_first_order_in_order_page() {
	   Supplierorderslistingpage.Clickonactiondropdowninfirstorder();
	}

	@Then("User click on void order")
	public void user_click_on_void_order() {
	    Supplierorderslistingpage.Clickonvoidorder();
	}

	
	@Then("User click on requested by buyer")
	public void user_click_on_requested_by_buyer() {
	    Supplierorderslistingpage.Clickonrequestedbybuyer();
	}

	@Then("User click on void button")
	public void user_click_on_void_button() {
	   Supplierorderslistingpage.Clickonfinalvoidbutton();
	
	}
	
	@Then("User click on apply button in supplier order page")
	public void user_click_on_apply_button_in_supplier_order_page() {
	    Supplierorderslistingpage.Clickonapplybuttoninsupplierorderpage();
	}
	
	
	//Create order
	
	@Then("User click on create order in order page")
	public void user_click_on_create_order_in_order_page() {
		Supplierorderslistingpage.createOrderClick();
	}

	@Then("User click on search box in order page")
	public void user_click_on_search_box_in_order_page() {
		Supplierorderslistingpage.searchBoxClick();
	}

	@Then("User enter on outlet name in search box{string}")
	public void user_enter_on_outlet_name_in_search_box_Sakthimasala100(String outletname) {
		Supplierorderslistingpage.enterOutletName(outletname);
	}

	@Then("User click on outlet name in order page")
	public void user_click_on_outlet_name_in_order_page() {
		Supplierorderslistingpage.outletNameClick();
	}

	@Then("User click on add to order first time")
	public void user_click_on_add_to_order_first_time() {
		Supplierorderslistingpage.addorderFirsttimeClick();
	}

	@Then("User click on add to order second time")
	public void user_click_on_add_to_order_second_time() {
		Supplierorderslistingpage.addorderSecondtimeClick();
	}

	@Then("User click on add to order Third time")
	public void user_click_on_add_to_order_Third_time() {
		Supplierorderslistingpage.addorderThirdtimeClick();
	}

	@Then("User click on add to order fourth time")
	public void user_click_on_add_to_order_fourth_time() {
		//Supplierorderslistingpage.addorderFourthtimeClick();
	}

	@Then("User click on add to order fifth time")
	public void user_click_on_add_to_order_fifth_time() {
		//Supplierorderslistingpage.addorderFifthtimeClick();
	}

	@Then("User click on order items amount")
	public void user_click_on_order_items_amount() {
		Supplierorderslistingpage.orderItemsClick();
	}

	@Then("User click on place order")
	public void user_click_on_place_order() {
		Supplierorderslistingpage.placeOrderClick();
	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

