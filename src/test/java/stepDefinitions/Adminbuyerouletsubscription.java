package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Adminbuyerouletsubscription {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
	private Adminbuyeroutletsubscriptionpage adminbuyerouletsubscriptionpage;  
 
	public Adminbuyerouletsubscription(TestContext testContext) {
		super(); 
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 

		this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
	}
	
	
	
	@Then("User are click on the sg government grant check box")
	public void user_are_click_on_the_sg_government_grant_check_box() {
		adminbuyerouletsubscriptionpage.click_on_the_sg_government_grant_check_box();
	}

	@Then("User are click on the radio button Growth billed")
	public void user_are_click_on_the_radio_button_Growth_billed() {
		adminbuyerouletsubscriptionpage.click_on_the_radio_button_Growth_billed();
	}

	@Then("User are select dropdown of payment method")
	public void user_are_select_dropdown_of_payment_method() {
		//WebElement Giro = Adminbuyeroutletsubscriptionpage.getDropDowntoGiroElement();
		//Select select=new Select(Giro);
		//select.selectByIndex(1);	
	}

	@Then("User are click the radio button of Renew with same plan settings")
	public void user_are_click_the_radio_button_of_Renew_with_same_plan_settings() {
		//adminbuyerouletsubscriptionpage.click_the_radio_button_of_Renew_with_same_plan_settings();
	}

	@Then("User enter email Send subscription-related notifications{string}")
	public void user_enter_email_Send_subscription_related_notifications_velumani_zeemart_asia(String enteremail) {
		adminbuyerouletsubscriptionpage.enter_email_Send_subscription(enteremail);
	}

	@Then("User click on the checkbox of Paying for invoice processing")
	public void user_click_on_the_checkbox_of_Paying_for_invoice_processing() {
		adminbuyerouletsubscriptionpage.click_on_the_checkbox_of_Paying_for_invoice_processing();
	}


	@Then("User are select the calendar in the calendar field")
	public void user_are_select_the_calendar_in_the_calendar_field() {
		//adminbuyerouletsubscriptionpage.SelectcalendarByJS();
	}
	
	
	@Then("User is navigate to buyer panel")
	public void user_is_navigate_to_buyer_panel() {
		adminbuyerouletsubscriptionpage.navigate_to_buyer_panel();   
	}
	
	@Then("User type and enter name in search box{string}")
	public void user_type_and_enter_name_in_search_box_velu(String entername) {
		adminbuyerouletsubscriptionpage.enter_name_in_search_box(entername);
	}

	@Then("User is clicks the search icon")
	public void user_is_clicks_the_search_icon() {
		adminbuyerouletsubscriptionpage.clicks_the_search_icon();
	}
 
	@Then("User is click the Action dropdown")
	public void user_is_click_the_Action_dropdown() {
		adminbuyerouletsubscriptionpage.click_the_Action_dropdown();
	}

	@Then("User is click the Edit button")
	public void user_is_click_the_Edit_button() {
		adminbuyerouletsubscriptionpage.click_the_Edit_button();
	}

	@Then("User is Enter outlet name in autocomplete text box")
	public void user_is_Enter_outlet_name_in_autocomplete_text_box() throws InterruptedException {
		adminbuyerouletsubscriptionpage.Enter_outlet_name_in_autocomplete_text_box();
	}

	@Then("User is clicks savechanges button")
	public void user_is_clicks_savechanges_button() {
		adminbuyerouletsubscriptionpage.clicks_savechanges_button();
	}



	
	
	
	
	
}
