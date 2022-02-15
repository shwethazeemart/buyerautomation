package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierEditDefault {

	
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
    
	public AdminSupplierEditDefault(TestContext testContext) {
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
		
	}
	
	

	
	@Then("User click on edit edit default setting")
	public void user_click_on_edit_edit_default_setting() {
	    AdminSupplierEditDefaultpage.editDefaultSettingClick();
	}

	@Then("User clear on minimum order field")
	public void user_clear_on_minimum_order_field() {
	    AdminSupplierEditDefaultpage.minimumOrderClear();
	}

	@Then("User enter on minimum order field{string}")
	public void user_enter_on_minimum_order_field(String minimumorder) {
	   AdminSupplierEditDefaultpage.enterMinimumOrder(minimumorder);
	}

	@Then("User clear on sales person field")
	public void user_clear_on_sales_person_field() {
		AdminSupplierEditDefaultpage.salesPersonClear();
	}

	@Then("User enter on sales person field{string}")
	public void user_enter_on_sales_person_field_lingeshsabari(String salesperson) {
		AdminSupplierEditDefaultpage.enterSalesPersonName(salesperson);
	}

	@Then("User clear on sales person phone field")
	public void user_clear_on_sales_person_phone_field() {
		AdminSupplierEditDefaultpage.salesPersonPhoneClear();
	}

	@Then("User enter on sales person phone field{string}")
	public void user_enter_on_sales_person_phone_field(String phonenumber) {
		AdminSupplierEditDefaultpage.enterSalesPersonPhone(phonenumber);
	}

	@Then("User click on update button in edit default setting")
	public void user_click_on_update_button_in_edit_default_setting() {
		AdminSupplierEditDefaultpage.updateButtonClick();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
