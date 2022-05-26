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
import pageObjects.AdminSupplierSubscriptionInvoicepage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierSubscriptionInvoice {

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
    private AdminSupplierSubscriptionInvoicepage adminSupplierSubscriptionInvoice;
    
    
	public AdminSupplierSubscriptionInvoice(TestContext testContext) {
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
		this.adminSupplierSubscriptionInvoice = testContext.getPageObjectManager().getAdminSupplierSubscriptionInvoicepage();
		
		
		
	}
	
	@Then("User is Enter GST\\/Tax Reg number{string}")
	public void user_is_Enter_GST_Tax_Reg_number_INV9098769(String number) {
		AdminSupplierSubscriptionInvoicepage.EnterGSTnumber(number);
	}
	
	@Then("User click on upload subscription invoice in action dropdown field")
	public void user_click_on_upload_subscription_invoice_in_action_dropdown_field() {
	   AdminSupplierSubscriptionInvoicepage.uploadSubscriptionInvoiceClick();
	}

	@Then("User enter on amount in amount field{string}")
	public void user_enter_on_amount_in_amount_field(String amount) {
	    AdminSupplierSubscriptionInvoicepage.enterAmount(amount);
	}

	@Then("User select date from invoice date field")
	public void user_select_date_from_invoice_date_field() {
	    AdminSupplierSubscriptionInvoicepage.selectInvoiceDate();
	}

	@Then("User select file from choose file field")
	public void user_select_file_from_choose_file_field() throws InterruptedException {
	    AdminSupplierSubscriptionInvoicepage.selectFile();
	}

	@Then("User click on upload button in upload invoice field")
	public void user_click_on_upload_button_in_upload_invoice_field() {
	    AdminSupplierSubscriptionInvoicepage.uploadButtonClick();
	}

	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
