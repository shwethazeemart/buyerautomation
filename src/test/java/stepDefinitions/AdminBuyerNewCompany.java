package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminBuyerNewCompanypage;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminBuyerNewCompany {

	
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
	private AdminBuyerNewCompanypage adminBuyerNewCompany;
	
 
	public AdminBuyerNewCompany(TestContext testContext) {
		super(); 
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
		this.adminBuyerNewCompany = testContext.getPageObjectManager().getAdminBuyerNewCompanypage();
		
	}
	
	 
	
	
	@Then("User click on new company in buyer")
	public void user_click_on_new_company_in_buyer() {
	    AdminBuyerNewCompanypage.newCompanyClick();
	}

	@Then("User enter registered name in create buyer company{string}")
	public void user_enter_registered_name_in_create_buyer_company_VELU_MASALA10(String registeredname) {
	    AdminBuyerNewCompanypage.enterregisteredName(registeredname);
	}

	@Then("User enter alias name in create buyer company{string}")
	public void user_enter_alias_name_in_create_buyer_company_AtoZ_Test(String aliasname) {
	   AdminBuyerNewCompanypage.enteraliasname(aliasname);
	}

	@Then("User enter post code in create buyer company{string}")
	public void user_enter_post_code_in_create_buyer_company(String postcode) {
	    AdminBuyerNewCompanypage.enterPostCode(postcode);
	}

	@Then("User enter address line one in create buyer company{string}")
	public void user_enter_address_line_one_in_create_buyer_company_Madheswaran_temple_street(String addresslineone) {
	    AdminBuyerNewCompanypage.enterAddressLineOne(addresslineone);
	}

	@Then("User enter address line two in create buyer comapny{string}")
	public void user_enter_address_line_two_in_create_buyer_comapny_singapore(String addresslinetwo) {
	    AdminBuyerNewCompanypage.enterAddressLineTwo(addresslinetwo);
	}

	@Then("User enter company registration number in create buyer company{string}")
	public void user_enter_company_registration_number_in_create_buyer_company_AZ789(String companyregistrationnumber) {
	    AdminBuyerNewCompanypage.enterCompanyRegisterationNumber(companyregistrationnumber);
	}

	@Then("User enter tax registration number in create buyer company{string}")
	public void user_enter_tax_registration_number_in_create_buyer_company_tax(String taxregistrationnumber) {
	    AdminBuyerNewCompanypage.enterTaxRegisterationNumber(taxregistrationnumber);
	}

	@Then("User click on acra certificate browse button")
	public void user_click_on_acra_certificate_browse_button() throws InterruptedException {
	    AdminBuyerNewCompanypage.acraCertificateClick();
	}

	@Then("User click on logo browse button")
	public void user_click_on_logo_browse_button() throws InterruptedException {
		AdminBuyerNewCompanypage.logoClick();
	} 

	@Then("User enter company email in create buyer company{string}")
	public void user_enter_company_email_in_create_buyer_company_velumani_zeemart_asia(String companyemail) {
	    AdminBuyerNewCompanypage.enterCompanyEmail(companyemail); 
	}

	@Then("User clear company phone number in create buyer company")
	public void user_clear_company_phone_number_in_create_buyer_company() {
	    AdminBuyerNewCompanypage.companyPhoneNumberClear(); 
	}

	@Then("User enter company phone number in create buyer company{string}")
	public void user_enter_company_phone_number_in_create_buyer_company(String companyphonenumber) {
	    AdminBuyerNewCompanypage.enterCompanyPhoneNumber(companyphonenumber);
	}

	@Then("User click on finaxarpay checkbox in create buyer company")
	public void user_click_on_finaxarpay_checkbox_in_create_buyer_company() {
	    AdminBuyerNewCompanypage.finaxarCheckboxClick();
	}

	@Then("User click on save company in create buyer company")
	public void user_click_on_save_company_in_create_buyer_company() {
	    AdminBuyerNewCompanypage.SaveCompanyButtonClick();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
