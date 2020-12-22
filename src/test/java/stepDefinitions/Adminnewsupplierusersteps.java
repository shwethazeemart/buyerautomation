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
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminnewsupplieruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Adminnewsupplierusersteps {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
    private Adminnewbuyeruserpage adminnewbuyeruserpage;
    private Adminsupplierpage adminsupplierspage;
    private Adminnewsupplieruserpage adminnewsupplieruserpage;
    
	public Adminnewsupplierusersteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.adminnewsupplieruserpage=testContext.getPageObjectManager().getAdminnewsupplieruserpagesteps();
		this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
		this.logInPage = testContext.getPageObjectManager().getLogInPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	@When("User Clicks on Admin panel users in the side navigation menubar")
	public void user_Clicks_on_Admin_panel_users_in_the_side_navigation_menubar() throws InterruptedException {
	    dashboradpage.clickSuppliernewuser();
	}

	@Then("User is Clicks in Add New user button")
	public void user_is_Clicks_in_Add_New_user_button() {
	    adminnewsupplieruserpage.Clicks_AddNewuserbutton();
	}

	@And("User are Clicks in New supplier user")
	public void user_are_Clicks_in_New_supplier_user() {
	   adminnewsupplieruserpage.Clicks__Newsupplieruser();
	}

	@When("User are Select supplier in the supplier dropdown")
	public void user_are_Select_supplier_in_the_supplier_dropdown() {
		WebElement VENKATMASALA = Adminnewsupplieruserpage.getDropDownsupplierElement();
		Select select=new Select(VENKATMASALA);
		select.selectByVisibleText("VENKAT MASALA");
	}

	@Then("User is Enter First name in the new supplier user page{string}")
	public void user_is_Enter_First_name_in_the_new_supplier_user_page_lingeshsabari(String firstname) {
	    adminnewsupplieruserpage.Enter_Firstnameinthenewsupplieruserpage(firstname);
	}

	@And("User are Enter Last name in the new supplier user page{string}")
	public void user_are_Enter_Last_name_in_the_new_supplier_user_page_velumani(String lastname) {
	    adminnewsupplieruserpage.Enter_Lastnameinthenewsupplieruserpage(lastname);
	}

	@Then("User is Enter Email in the new supplier user page{string}")
	public void user_is_Enter_Email_in_the_new_supplier_user_page_velumani20101978_gmail_com(String Email) {
	   adminnewsupplieruserpage.Enter_Emailinthenewsupplieruser_page(Email);
	}

	@And("User are Clear mobile phone field in the new supplier user page")
	public void user_are_Clear_mobile_phone_field_in_the_new_supplier_user_page() {
	    adminnewsupplieruserpage.Clear_mobilephonefield();
	}

	@Then("User is Enter mobile number in the new supplier user page{string}")
	public void user_is_Enter_mobile_number_in_the_new_supplier_user_page(String mobilenumber) {
	    adminnewsupplieruserpage.Enter_mobilenumber(mobilenumber);
	}

	@And("User are Enter job title in the new supplier user page{string}")
	public void user_are_Enter_job_title_in_the_new_supplier_user_page_ATZ_test(String jobtitle) {
	    adminnewsupplieruserpage.Enter_jobtitle(jobtitle);
	}

	@Then("User is Upload profile photo in the new supplier user page")
	public void user_is_Upload_profile_photo_in_the_new_supplier_user_page() throws InterruptedException {
	    adminnewsupplieruserpage.upload_the_profilephoto();
	}

	@And("User are Clicks Save changes button in the new supplier user page")
	public void user_are_Clicks_Save_changes_button_in_the_new_supplier_user_page() {
	    //adminnewsupplieruserpage.Clicks_Savechangesbutton();
	}

	@Then("It should display in the Users Suppliers page")
	public void it_should_display_in_the_Users_Suppliers_page() {
		String displaysupplieruser =Adminnewsupplieruserpage.getPageTitle();
		String pageTitle = displaysupplieruser;
		System.out.println("page title: " + pageTitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
