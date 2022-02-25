package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.AdminInvoiceuploadpage;
//import pageObjects.Adminbuyeroutletsubscriptionpage;
//import pageObjects.Adminbuyersoutletpage;
//import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class OrderspageSteps<txtBoxContent> {


	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID; 
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	//private Adminbuyeroutletsubscriptionpage adminbuyerouletsubscriptionpage; 
	//private Adminbuyersoutletpage adminbuyersoutletpage;


	public OrderspageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		//this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		//this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
	}
	
	

	@When("User enter exact username{string}")
	public void user_enter_exact_username(String LoginEmail) {
		LogInPage.enter_loginEmail(LoginEmail);
	}

	@When("User enter exact password{string}")
	public void user_enter_exact_password(String loginpassword) {
		LogInPage.enter_loginpassword(loginpassword);
	}

	@When("User is click login button")
	public void user_is_click_login_button() throws InterruptedException {
		LogInPage.click_LoginBtn();
	}


	@Given("User Clicks Orders in the side navigation menubar")
	public void user_Clicks_Orders_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickOrders();
	}

	@Given("User Clicks New order dropdown value")
	public void user_Clicks_New_order_dropdown_value() throws InterruptedException {
		OrdersPage.click_Neworder();
	}

	@Given("User Clicks New order in the dropdown value")
	public void user_Clicks_New_order_in_the_dropdown_value() throws InterruptedException {
		OrdersPage.click_Neworder1();
	}


	@Then("User click on in the supplier page {string}")
	public void user_click_on_in_the_supplier_page(String outletname) {
		OrdersPage.clickonoutlet();
	}
	
		
	@Given("User Clicks in Add to order of SKU")
	public void user_Clicks_in_Add_to_order_of_SKU() {
		OrdersPage.click_Addtoorder();
	}

	@Then("User Clicks increase the order button")
	public void user_Clicks_increase_the_order_button() {
		OrdersPage.click_IncreaseAddtoorder();
	}
	@Then("User Clicks second time increase the order button")
	public void user_Clicks_second_time_increase_the_order_button() {
		OrdersPage.click_secondtimeIncreaseAddtoorder();
	}

	@Then("User Clicks third time increase the order button")
	public void user_Clicks_third_time_increase_the_order_button() {
		OrdersPage.click_thirdimeIncreaseAddtoorder();
	}

	@Then("User Clicks fourth time increase the order button")
	public void user_Clicks_fourth_time_increase_the_order_button() {
		OrdersPage.click_fourthtimeIncreaseAddtoorder();
	}

	@Then("User Clicks fifth time increase the order button")
	public void user_Clicks_fifth_time_increase_the_order_button() {
		OrdersPage.click_fifthtimeIncreaseAddtoorder();
	}

	@Then("User was clicks a in Add to order of SKU")
	public void user_Clicks_in_Add_to_order_of_SKU1() {
		OrdersPage.click_Addtoorder1();
	}

	@Then("User Clicks Review order")
	public void user_Clicks_Review_order() {
		OrdersPage.click_Revieworder();
	}

	@Then("User Clicks Place Order")
	public void user_Clicks_Place_Order() {
		OrdersPage.click_PlaceOrder();
	}

	
	@Then("User Copy the particular order number in newly created")
	public void user_Copy_the_particular_order_number_in_newly_created() {
		//String value = orderspage.TxtBoxContent();
		//System.out.println("Printing " +value);
	}

	@Then("User clicks the Back to Orders button")
	public void user_clicks_the_Back_to_Orders_button() throws InterruptedException {
		OrdersPage.click_BacktoOrderbutton();
	}

	@Then("User paste the newly created order number in Search order ID")
	public void user_paste_the_newly_created_order_number_in_Search_order_ID() {
		//OrdersPage.paste_OrderID(OrderID);
	}

	@Then("User Clicks Search button in the orders page")
	public void user_Clicks_Search_button_in_the_orders_page() {
		//OrdersPage.click_Searchbutton();

	}

	@Then("It should display the particular order ID {string}")
	public void it_should_display_the_particular_order_ID(String string) {
		//String value = orderspage.TxtBoxContent();
		//String valueone = "202011130001";
		//System.out.println("passwordresetpage failure page title: " + valueone);

	}

	@Then("User click the newly created order")
	public void user_click_the_newly_created_order() {
		//OrdersPage.click_newlycreatedorder();
	}

	@Then("User clicks backbutton orders")
	public void user_clicks_backbutton_orders() {
		//OrdersPage.click_backbuttonorders();
	}


	@Then("User clicks on the filter option")
	public void user_clicks_on_the_filter_option() {
		OrdersPage.clicks_on_the_filter_option();
	}

	@Then("User clicks on the order status")
	public void user_clicks_on_the_order_status() {
		OrdersPage.clicks_on_the_order_status();
	}

	@Then("User clicks on the void checkbox")
	public void user_clicks_on_the_void_checkbox() {
		OrdersPage.clicks_on_the_void_checkbox();
	}

	@Then("Use clicks on the Apply button")
	public void use_clicks_on_the_Apply_button() {
		OrdersPage.clicks_on_the_Apply_button();
	}


	//Start outstanding payment
	
	@Then("User navigate to admin hub")
	public void user_navigate_to_admin_hub() {
	    OrdersPage.Usernavigatetoadminpanel();
	}

	@Then("User Enter the supplier in searchbox {string}")
	public void user_Enter_the_supplier_in_searchbox(String suppliername) {
	    OrdersPage.Enterthesuppliername(suppliername);
	}

	@Then("User click on search icon of supplier page")
	public void user_click_on_search_icon_of_supplier_page() {
	    OrdersPage.Clicksearchiconofsupplierpage();
	}

	@Then("User click on actions dropdown of sabari supplier")
	public void user_click_on_actions_dropdown_of_sabari_supplier() {
	    OrdersPage.Clickonactionsdropdownsabarisupplier();
	}

	@Then("User click on view outlets of sabari supplier")
	public void user_click_on_view_outlets_of_sabari_supplier() {
	   OrdersPage.Clickonviewoutletsofsabarisupplier();
	}


	@Then("User click on  in the supplier page {string}")
	public void user_click_on_in_the_supplier_page1(String outletnameone) {
		OrdersPage.click_velumasala2020(outletnameone);
	}


	@Then("User click on Actions dropdown of velumasala")
	public void user_click_on_Actions_dropdown_of_velumasala() {
	    OrdersPage.Clickonactionsdropdownofvelumasala();
	}

	@Then("User click on manage settings of velumasala")
	public void user_click_on_manage_settings_of_velumasala() {
	   OrdersPage.Clickonmanagesettingofvelumasala();
	}

	
	@Then("User click on uncheck of default setting")
	public void user_click_on_uncheck_of_default_setting() {
	    OrdersPage.Clickonuncheckofdefaultsetting();
	}

	@Then("User click on checkbox disable ordering")
	public void user_click_on_checkbox_disable_ordering() {
	    OrdersPage.Clickoncheckboxofdisableordering();
	}

	@Then("User select payment outstanding dropdown value")
	public void user_select_payment_outstanding_dropdown_value() throws InterruptedException {
	    //OrdersPage.SelectPaymentoutstanding(); 
		WebElement Paymentoutstanding =orderspage.getDropDownElementPaymentoutstanding(); 
		Select select=new Select(Paymentoutstanding);
		select.selectByIndex(1);
	}

	@Then("User enter mobile number in the SMS field {string}")
	public void user_enter_mobile_number_in_the_SMS_field(String smsmobilenumber) {
	   OrdersPage.Entermobilenumber(smsmobilenumber);
	}

	@Then("User enter whatsApp number in whatsApp field {string}")
	public void user_enter_whatsApp_number_in_whatsApp_field(String whatsappnumber) {
	    OrdersPage.Enterwhatsappnumber(whatsappnumber);
	}

	@Then("User click on update button finally")
	public void user_click_on_update_button_finally() {
	    OrdersPage.Clickupdatebuttonfinally();
	}

	@Then("User navigate buyer hub")
	public void user_navigate_buyer_hub() {
	    OrdersPage.Usernavigatetobuyerpanel();  
	}

	@Then("User click sabari twofifty supplier")
	public void user_click_sabari_twofifty_supplier() throws InterruptedException {
	   OrdersPage.Clickonsabaritwofiftysupplier();
	}

	@Then("User click on ok button in supplier page")
	public void user_click_on_ok_button_in_supplier_page() throws InterruptedException {
	   //OrdersPage.Clickonokbutton();
	} 

	@Then("User click on close icon in supplier page")
	public void user_click_on_close_icon_in_supplier_page() throws InterruptedException {
	   // OrdersPage.Clickoncloseiconinsupplierpage();
	}

	@Then("User select order setting unverified dropdown value")
	public void user_select_order_setting_unverified_dropdown_value() {
		//WebElement Ordersettingunverified =orderspage.getDropDownElementOrdersettingunverified(); 
		//Select select=new Select(Ordersettingunverified);
		//select.selectByIndex(2);
	}

	@Then("User select setting not configured dropdown value")
	public void user_select_setting_not_configured_dropdown_value() {
		//WebElement Settingnotconfigured =orderspage.getDropDownElementOrdersettingnotconfiured();
		//Select select=new Select(Settingnotconfigured);
		//select.selectByIndex(3);
	}

	@Then("User click on close icon of ok button page")
	public void user_click_on_close_icon_of_ok_button_page() throws InterruptedException {
	    OrdersPage.Clickoncloseiconofokbutton();
	}

	
	@Then("User click on popup of sabari twofifty supplier")
	public void user_click_on_popup_of_sabari_twofifty_supplier() {
	   // OrdersPage.Clickonpopupofsabaritwofiftysupplier();
	} 
	
	//outstanding payments
	
	@Then("User click on velu masalathree in the supplier page")
	public void user_click_on_velu_masalathree_in_the_supplier_page() throws InterruptedException {
	   //OrdersPage.Clickonvelumasalathree();
	}

	@Then("User click on ok button of pop message")
	public void user_click_on_ok_button_of_pop_message() throws InterruptedException {
	    OrdersPage.Clickonokbuttoninpop();
	   	}

	@Then("User click on close icon first pop message")
	public void user_click_on_close_icon_first_pop_message() {
	    OrdersPage.Clickcloseiconfirstpop();
	}	

	@Then("User click on in the supplier page")
	public void user_click_on_in_the_supplier_page() throws InterruptedException {
		 //OrdersPage.Clickvelumasalasix();
	}

	@Then("User click on velu masalatwofifty in the supplier page")
	public void user_click_on_velu_masalatwofifty_in_the_supplier_page() throws InterruptedException {
		//OrdersPage.Clickvelumasalatwofifty();
	}

	@Then("User click on  in the supplier page outletname")
	public void user_click_on_in_the_supplier_page_outletname() throws InterruptedException {
		OrdersPage.Clickonvelumasalathree();
	}

	@Then("User click on in the supplier page outletnameone")
	public void user_click_on_in_the_supplier_page_outletnameone() throws InterruptedException {
		OrdersPage.Clickvelumasalatwofifty();

	}

	@Then("User click on in the supplier page outletnametwo")
	public void user_click_on_in_the_supplier_page_outletnametwo() throws InterruptedException {
		OrdersPage.Clickvelumasalasix();
	}
	

	@Then("User click on ok button of pop message outletone")
	public void user_click_on_ok_button_of_pop_message_outletone() throws InterruptedException {
		OrdersPage.OkbuttonOutletone();
	}

	/*@Then("User click on ok button of pop message outlettwo")
	public void user_click_on_ok_button_of_pop_message_outlettwo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/




}
