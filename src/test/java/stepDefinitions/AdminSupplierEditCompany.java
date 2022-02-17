package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierEditCompany {

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
    private Adminsuppliersviewoutletspage adminsuppliersviewoutletspage;
    private AdminSupplierEditCompanypage adminSupplierEditCompany;
    
	public AdminSupplierEditCompany(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.adminsupplierspage=testContext.getPageObjectManager().getAdminsupplierspageSteps();
		this.adminsuppliersviewoutletspage=testContext.getPageObjectManager().getAdminsuppliersviewoutletspage();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.adminSupplierEditCompany = testContext.getPageObjectManager().getAdminSupplierEditCompanypage();
	}
	
	

	
	@Then("User click on action bootstrap dropdown")
	public void user_click_on_action_bootstrap_dropdown() {
	    AdminSupplierEditCompanypage.actionbootstrapDropdownClick();
	}

	@Then("User clear on also know as field")
	public void user_clear_on_also_know_as_field() {
	    AdminSupplierEditCompanypage.alsoKnowasFieldClear();
	}

	@Then("User enter on also know as field{string}")
	public void user_enter_on_also_know_as_field_AtoZ_Test(String knowas) {
	   AdminSupplierEditCompanypage.enteralsoKnowasField(knowas);
	}

	@Then("User clear on company registration number")
	public void user_clear_on_company_registration_number() {
	    AdminSupplierEditCompanypage.companyRegistratonClear();
	}

	@Then("User enter on company registration number{string}")
	public void user_enter_on_company_registration_number_LS(String companyregistrationnumber) {
	    AdminSupplierEditCompanypage.EnterCompanyName(companyregistrationnumber);
	}

	@Then("User click on update button in edit company")
	public void user_click_on_update_button_in_edit_company() {
	    AdminSupplierEditCompanypage.updateButtonClick();
	}

	@Then("User click on edit company details")
	public void user_click_on_edit_company_details() {
	   AdminSupplierEditCompanypage.editCompanyClick();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
