package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminSupplierEditBlackoutpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.AdminSupplierEditDirectorypage;
import pageObjects.AdminSupplierEditManageSettingpage;
import pageObjects.AdminSupplierTeamspage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminSupplierTeams {
	
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
    private AdminSupplierTeamspage adminSupplierTeams;
    
    
	public AdminSupplierTeams(TestContext testContext) {
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
		this.adminSupplierTeams = testContext.getPageObjectManager().getAdminSupplierTeamspage();
		
		
	}
	
	@Then("User click on supplier teams in action dropdown field")
	public void user_click_on_supplier_teams_in_action_dropdown_field() {
	    AdminSupplierTeamspage.supplierTeamsClick();
	}

	@Then("User click on add new button in supplier teams")
	public void user_click_on_add_new_button_in_supplier_teams() {
	    AdminSupplierTeamspage.addNewButttonClick();
	}
	@Then("User enter name on team name field{string}")
	public void user_enter_name_on_team_name_field_palanimurugan(String teamname) {
	    AdminSupplierTeamspage.enterTeamName(teamname);
	}
	
	@Then("User click on next link to outlet in add team field")
	public void user_click_on_next_link_to_outlet_in_add_team_field() {
	    AdminSupplierTeamspage.nextLinkOutletClick();
	}
	
	@Then("User click on add new in link outlet field")
	public void user_click_on_add_new_in_link_outlet_field() throws InterruptedException {
	    AdminSupplierTeamspage.addnewClcik();
	}
	@Then("User click on select outlet in link outlet field")
	public void user_click_on_select_outlet_in_link_outlet_field() {
	    AdminSupplierTeamspage.selectOutletClick();
	}
	@Then("User click on second outlet in select outlet field")
	public void user_click_on_second_outlet_in_select_outlet_field() {
	    AdminSupplierTeamspage.secondOutletClick();
	}
	@Then("User click on select outlet icon")
	public void user_click_on_select_outlet_icon() {
	    AdminSupplierTeamspage.selectOutletIconClick();
	}
	@Then("User click on save button in select outlet field")
	public void user_click_on_save_button_in_select_outlet_field() {
	    AdminSupplierTeamspage.saveButtonClick();
	}
	@Then("User click on action dropdown in edit field")
	public void user_click_on_action_dropdown_in_edit_field() throws InterruptedException {
	    AdminSupplierTeamspage.actiondropdowneditfieldClick();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
