package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyerlinktothecompanypage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Adminbuyerlinktothecompany {

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
    private Object adminbuyerlinktothecompany;
     
	public Adminbuyerlinktothecompany(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
        this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
	    this.adminbuyerlinktothecompany=testContext.getPageObjectManager().getAdminbuyerlinktothecompany();
	
	}
	
	
	@Then("User clicks on the ABC PTE supplier actions")
	public void user_clicks_on_the_ABC_PTE_supplier_actions() {
	   Adminbuyerlinktothecompanypage.clicks_on_the_ABC_PTE_supplier_actions();
	}

	@Then("User clicks on the Buyers companies")
	public void user_clicks_on_the_Buyers_companies() {
	    Adminbuyerlinktothecompanypage.clicks_on_the_Buyers_companies(); 
	}

	@Then("User clicks on the link to company")
	public void user_clicks_on_the_link_to_company() {
	    Adminbuyerlinktothecompanypage.clicks_on_the_link_to_company(); 
	}

	@Then("User are Select company in the autocomplete text box")
	public void user_are_Select_company_in_the_autocomplete_text_box() throws InterruptedException {
    Adminbuyerlinktothecompanypage.Select_company_in_the_autocomplete_text_box();  
	}

	@Then("User enter the custom company id{string}")
	public void user_enter_the_custom_company_id_CGP123(String companyid) {
	    Adminbuyerlinktothecompanypage.enter_the_custom_company_id_CGP123(companyid); 
	}


	@Then("User clicks on the save settings")
	public void user_clicks_on_the_save_settings() {
	    Adminbuyerlinktothecompanypage.clicks_on_the_save_settings();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
