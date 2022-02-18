package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
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

public class AdminSupplierEditManageSetting {

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
    
    
	public AdminSupplierEditManageSetting(TestContext testContext) {
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
		
		
	}
	
	

	
	@Then("User click on manage setting in supplier field")
	public void user_click_on_manage_setting_in_supplier_field() {
	    AdminSupplierEditManageSettingpage.manageSettingClick();
	}

	@Then("User clear on minimum order filed")
	public void user_clear_on_minimum_order_filed() throws InterruptedException {
	    AdminSupplierEditManageSettingpage.minimumOrderClear();
	}

	@Then("User enter on value in minimum order filed{string}")
	public void user_enter_on_value_in_minimum_order_filed(String minimumorder) {
	    AdminSupplierEditManageSettingpage.enterMinimumOrder(minimumorder);
	}

	@Then("User click on save button in general setting field")
	public void user_click_on_save_button_in_general_setting_field() {
	    AdminSupplierEditManageSettingpage.saveButtonClick();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
