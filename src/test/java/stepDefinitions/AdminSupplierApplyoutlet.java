package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierApplyOutletpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierApplyoutlet {

	
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
    private AdminSupplierApplyOutletpage adminSupplierApplyOutlet;
    
    
	public AdminSupplierApplyoutlet(TestContext testContext) {
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
		this.adminSupplierApplyOutlet = testContext.getPageObjectManager().getAdminSupplierApplyOutletpage();
		
	}
	
	
	@Then("User click on checkbox of outlet in outlet setting page")
	public void user_click_on_checkbox_of_outlet_in_outlet_setting_page() throws InterruptedException {
	    AdminSupplierApplyOutletpage.checkboxofOutletClick();
	}

	@Then("User click on apply outlet settings")
	public void user_click_on_apply_outlet_settings() {
	   AdminSupplierApplyOutletpage.applyOutletSettingClick();
	}
	@Then("User select source outlet in dropdown list")
	public void user_select_source_outlet_in_dropdown_list() {
		WebElement sourceoutlet = AdminSupplierApplyOutletpage.getOutletDropdownElement();
		Select select=new Select(sourceoutlet);
		select.selectByVisibleText("Sakthimasala100");
	}
	@Then("User click on select all icon in apply outlet settings page")
	public void user_click_on_select_all_icon_in_apply_outlet_settings_page() {
	    AdminSupplierApplyOutletpage.selectallIconClick();
	}
	@Then("User cclick on apply button in apply setings page") 
	public void user_cclick_on_apply_button_in_apply_setings_page() {
	    AdminSupplierApplyOutletpage.applyButtonClick();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
