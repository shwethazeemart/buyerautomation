package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerinventoryoutletslisen {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private Buyerinvoicelisenpage buyerinvoicelisen;
	private Buyerinventoryoutletslisenpage buyerinventoryoutletslisen;

	public Buyerinventoryoutletslisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerinventoryoutletslisen=testContext.getPageObjectManager().getBuyerinventoryoutletslisenpage();
	}

	@Then("User click on outlets icon")
	public void user_click_on_outlets_icon() {
		Buyerinventoryoutletslisenpage.clickoutletsicon();
	}

	@Then("User click on settings")
	public void user_click_on_settings() {
		Buyerinventoryoutletslisenpage.clicksettings();
	}

	@Then("User click on settings close icon")
	public void user_click_on_settings_close_icon() {
		Buyerinventoryoutletslisenpage.clicksettingscloseicon();
	}

	@Then("User click on Export download icon")
	public void user_click_on_Export_download_icon() {
		Buyerinventoryoutletslisenpage.clickexportdownloadicon();
	}
	
	@Then("User click on velu masala")
	public void user_click_on_velu_masala() {
		Buyerinventoryoutletslisenpage.clickonvelumasala();
	}

	
	@Then("User click on search outlets")
	public void user_click_on_search_outlets() throws InterruptedException {
		Buyerinventoryoutletslisenpage.searchoutlets();
	}

	@Then("User send outlet name in search icon{string}")
	public void user_send_outlet_name_in_search_icon_velu_masala2020(String outletname) {
		Buyerinventoryoutletslisenpage.enteroutletname(outletname);  
	}

	@Then("User click on status icon") 
	public void user_click_on_status_icon() {
		Buyerinventoryoutletslisenpage.clickstatusicon();
	}

	@Then("User click on checkbox of Has items below par")
	public void user_click_on_checkbox_of_Has_items_below_par() {
		Buyerinventoryoutletslisenpage.clickcheckbox();
	}

	@Then("User click on new list close icon")
	public void user_click_on_new_list_close_icon() {
	   Buyerinventoryoutletslisenpage.clicknewlistcloseicon();
	}

	@Then("User click on starter plan close icon")
	public void user_click_on_starter_plan_close_icon() {
	    Buyerinventoryoutletslisenpage.clickstarterplancloseicon();
	}
 
	@Then("User return to outlet page")
	public void user_return_to_outlet_page() throws InterruptedException {
	   Buyerinventoryoutletslisenpage.clickreturntooutletpage();
	}

	@Then("User click on uncheckbox of Has items below par")
	public void user_click_on_uncheckbox_of_Has_items_below_par() {
		 Buyerinventoryoutletslisenpage.ClickuncheckboxogHasitem();
	}

	@Then("User click on checkbox of last count")
	public void user_click_on_checkbox_of_last_count() {
		Buyerinventoryoutletslisenpage.Clickoncheckboxoflastcount();
	}

	@Then("User click on uncheckbox of last count")
	public void user_click_on_uncheckbox_of_last_count() {
		Buyerinventoryoutletslisenpage.Clickonuncheckboxoflastcount();
	}

	@Then("User click vertically scroll up in the page")
	public void user_click_vertically_scroll_up_in_the_page() {
		Buyerinventoryoutletslisenpage.Clickverticallyscrollup();
	}

	@Then("User click on new list {string}")
	public void user_click_on_new_list(String outletnameone) {
		Buyerinventoryoutletslisenpage.clickOutletnameOne();
	}

	@Then("User click on starter plan {string}")
	public void user_click_on_starter_plan(String outletnametwo) throws InterruptedException {
		Buyerinventoryoutletslisenpage.clickStarterplanofOutletnameTwo();
	}

	@Then("User click on outletname")
	public void user_click_on_outletname() {
		Buyerinventoryoutletslisenpage.Outletnameclick();
	}



































}
