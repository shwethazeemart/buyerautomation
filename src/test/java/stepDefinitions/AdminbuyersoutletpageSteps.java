package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminbuyersoutletpageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;

	public AdminbuyersoutletpageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	@When("User Clicks on Admin Buyers in the side navigation menubar")
	public void user_Clicks_on_Admin_Buyers_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.click_AdminBuyers();
	}

	@Then("User is Clicks in Add new by dropdown")
	public void user_is_Clicks_in_Add_new_by_dropdown() {
	    adminbuyersoutletpage.Clicks_in_Add_new_by_dropdown();
	}

	@And("User are Clicks in New Buyer")
	public void user_are_Clicks_in_New_Buyer() {
	    adminbuyersoutletpage.Clicks_in_New_Buyer();
	}

	@Then("User User are Select Company in the autocomplete text box")
	public void user_User_are_Select_Company_in_the_autocomplete_text_box() throws InterruptedException {
		Adminbuyersoutletpage.Select_Company();
		
	}

	@Then("User is Enter Outlet name in the Outlet field{string}")
	public void user_is_Enter_Outlet_name_in_the_Outlet_field_venkatmasala220(String outletname) {
	    adminbuyersoutletpage.Enter_Outlet_name(outletname);
	}

	@And("User are Enter Post code{string}")
	public void user_are_Enter_Post_code(String postcode) {
	    adminbuyersoutletpage.Enter_Post_code(postcode);
	}

	@Then("User is Enter Address Line1{string}")
	public void user_is_Enter_Address_Line1_madheswarankoilstreet(String addressline1) {
	    adminbuyersoutletpage.Enter_Address_Line1(addressline1);
	}

	@And("User are Enter Address Line2{string}")
	public void user_are_Enter_Address_Line2_singapore(String addressline2) {
	   adminbuyersoutletpage.Enter_Address_Line2(addressline2);
	}

	@Then("User is Clicks Browse button and upload the image")
	public void user_is_Clicks_Browse_button_and_upload_the_image() throws InterruptedException {
	    adminbuyersoutletpage.upload_the_image();
	}

	@And("User are Enter outlet Email{string}")
	public void user_are_Enter_outlet_Email_lingeshsabari2009_gmail_com(String outletEmail) {
	   adminbuyersoutletpage.Enter_outlet_Email(outletEmail);
	}

	@Then("User is Clear the Mobile number field")
	public void user_is_Clear_the_Mobile_number_field() {
	    adminbuyersoutletpage.Clear_the_Mobile_number_field();
	}

	@And("User are Enter the Mobile number{string}")
	public void user_are_Enter_the_Mobile_number(String mobilenumber) {
	    adminbuyersoutletpage.Enter_the_Mobile_number(mobilenumber);
	}

	@When("User is Select Time zone in the autocomplete text box")
	public void user_is_Select_Time_zone_in_the_autocomplete_text_box() throws InterruptedException {
	    //Adminbuyersoutletpage.Select_Timezone();
	}

	@When("User are Select Type of business in the select dropdown")
	public void user_are_Select_Type_of_business_in_the_select_dropdown() {
		WebElement FineDining = Adminbuyersoutletpage.getDropDownOwnerElement();
		Select select=new Select(FineDining);
		select.selectByIndex(6);
	}

	@Then("User is Clicks checkbox of American type of cuisine")
	public void user_is_Clicks_checkbox_of_American_type_of_cuisine() {
	    adminbuyersoutletpage.checkbox_of_American_type_of_cuisine();
	}

	@And("User are Clicks checkbox of Bakery type of cuisine")
	public void user_are_Clicks_checkbox_of_Bakery_type_of_cuisine() {
	    adminbuyersoutletpage.checkbox_of_Bakery_type_of_cuisine();
	}

	@Then("User is Clicks checkbox of BBQ type of cuisine")
	public void user_is_Clicks_checkbox_of_BBQ_type_of_cuisine() {
	    adminbuyersoutletpage.checkbox_of_BBQ_type_of_cuisine();
	}

	@And("User are Clicks checkbox of Peranakan other cuisine type")
	public void user_are_Clicks_checkbox_of_Peranakan_other_cuisine_type() {
	    adminbuyersoutletpage.checkbox_of_Peranakan_other_cuisine_type();
	}

	@Then("User are Clicks checkbox of Salad Healthy other cuisine type")
	public void user_are_Clicks_checkbox_of_Salad_Healthy_other_cuisine_type() {
	    //adminbuyersoutletpage.checkbox_of_Salad_Healthy_other_cuisine_type();
	}

	@And("User is Clicks checkbox of Vegetarian other cuisine type")
	public void user_is_Clicks_checkbox_of_Vegetarian_other_cuisine_type() {
	   adminbuyersoutletpage.checkbox_of_Vegetarian_other_cuisine_type();
	}

	@Then("User are Clicks checkbox of Halal other features")
	public void user_are_Clicks_checkbox_of_Halal_other_features() {
	    adminbuyersoutletpage.checkbox_of_Halal_other_features();
	}

	@And("User are Clicks checkbox of Vegetarian-friendly other features")
	public void user_are_Clicks_checkbox_of_Vegetarian_friendly_other_features() {
	   adminbuyersoutletpage.checkbox_of_Vegetarian_friendly_other_features(); 
	}

	@Then("User is Enter the name in the Tag field")
	public void user_is_Enter_the_name_in_the_Tag_field() {
	    adminbuyersoutletpage.Tag_field();
	}

	@And("User is Clicks Save outlet only button")
	public void user_is_Clicks_Save_outlet_only_button() {
	    adminbuyersoutletpage.Save_outlet_only_button();
	} 

	@Then("User is Clicks outlets icon")
	public void user_is_Clicks_outlets_icon() {
	    //adminbuyersoutletpage.Clicks_outlets_icon();
	}

	@And("User Enter the outlet in serach outlet box{string}")
	public void user_Enter_the_outlet_in_serach_outlet_box_venkatmasal20(String outlet) {
	    //adminbuyersoutletpage.Enter_the_outlet_in_serach_outlet_box_venkatmasal20(outlet);
	}

	@Then("User is Clicks serach button")
	public void user_is_Clicks_serach_button() {
	    //adminbuyersoutletpage.Clicks_serach_button();
	}

	@Then("It should display the particular outlet in outlets page")
	public void it_should_display_the_particular_outlet_in_outlets_page() {
		//String displayinoutlet =Adminbuyersoutletpage.getPageTitle();
		//String pageTitle = displayinoutlet;
		//System.out.println("page title: " + pageTitle);
	}	
	
}
