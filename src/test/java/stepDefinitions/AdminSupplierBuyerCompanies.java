package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierBuyerCompaniespage;
import pageObjects.AdminSupplierEditBlackoutpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.AdminSupplierEditDirectorypage;
import pageObjects.AdminSupplierEditManageSettingpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierBuyerCompanies {
	
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
    private AdminSupplierEditDefaultpage adminSupplierEditDefault;
    private AdminSupplierEditBlackoutpage adminSupplierEditBlackout;
    private AdminSupplierEditDirectorypage adminSupplierEditDirectory;
    private AdminSupplierEditManageSettingpage adminSupplierEditManageSetting;
    private AdminSupplierBuyerCompaniespage adminSupplierBuyerCompanies;
    
    
	public AdminSupplierBuyerCompanies(TestContext testContext) {
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
		this.adminSupplierEditDefault = testContext.getPageObjectManager().getAdminSupplierEditDefaultpage();
		this.adminSupplierEditBlackout = testContext.getPageObjectManager().getAdminSupplierEditBlackoutpage();
		this.adminSupplierEditDirectory = testContext.getPageObjectManager().getAdminSupplierEditDirectorypage();
		this.adminSupplierEditManageSetting = testContext.getPageObjectManager().getAdminSupplierEditManageSettingpage();
		this.adminSupplierBuyerCompanies = testContext.getPageObjectManager().getAdminSupplierBuyerCompaniespage();
		
		
	}
	

	@Then("User click on buyers companies in action dropdown field")
	public void user_click_on_buyers_companies_in_action_dropdown_field() {
	    AdminSupplierBuyerCompaniespage.buyerCompaniesClick();
	}

	@Then("User click on link to company in supplier field")
	public void user_click_on_link_to_company_in_supplier_field() {
	    AdminSupplierBuyerCompaniespage.linkCompanyClick();
	}

	@Then("User click on select company in link field")
	public void user_click_on_select_company_in_link_field() {
	    AdminSupplierBuyerCompaniespage.companySelect(); 
	}

	@Then("User click on save settings in link field")
	public void user_click_on_save_settings_in_link_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on actions icon in supplier field")
	public void user_click_on_actions_icon_in_supplier_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on edit details in supplier field")
	public void user_click_on_edit_details_in_supplier_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User enter on customer company id number\"{int}\"")
	public void user_enter_on_customer_company_id_number(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
