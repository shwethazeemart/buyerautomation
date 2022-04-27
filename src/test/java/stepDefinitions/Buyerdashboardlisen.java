package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Buyerdashboardlisen {

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
    private Buyerdashboardlisenpage buyerdashboardlisen;


	public Buyerdashboardlisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerinventoryoutletslisen=testContext.getPageObjectManager().getBuyerinventoryoutletslisenpage();
		this.buyerdashboardlisen=testContext.getPageObjectManager().getBuyerdashboardlisenpage();
	}

	
	@Then("User Clicks on Dashboard in the side navigation menubar")
	public void user_Clicks_on_Dashboard_in_the_side_navigation_menubar() {
	    Buyerdashboardlisenpage.ClickonDashboardmenubar();
	}

	@Then("User click on New order icon")
	public void user_click_on_New_order_icon() {
	    Buyerdashboardlisenpage.Clickonneworder(); 
	}

	@Then("User click on New order close icon")
	public void user_click_on_New_order_close_icon() {
	    Buyerdashboardlisenpage.ClickonNewordercloseicon();
	}

	@Then("User click on upload invoice icon")
	public void user_click_on_upload_invoice_icon() {
	   Buyerdashboardlisenpage.Clickonuploadinvoiceicon();
	}

	@Then("User click on upload invoice close icon")
	public void user_click_on_upload_invoice_close_icon() {
	    Buyerdashboardlisenpage.Clickonuploadinvoicecloseicon();
	}

	
	
	@Then("User click on YTD icon")
	public void user_click_on_YTD_icon() throws InterruptedException {
	  Buyerdashboardlisenpage.ClickonYTDicon();
	}

	@Then("User click on Last year icon")
	public void user_click_on_Last_year_icon() {
	    Buyerdashboardlisenpage.ClickonLastyearicon();
	}

	@Then("User click on Past twelve week icon")
	public void user_click_on_Past_twelve_week_icon() {
	   Buyerdashboardlisenpage.Clickonpasttwelveweekicon();
	}

	@Then("User click on view spending report icon")
	public void user_click_on_view_spending_report_icon() {
	   Buyerdashboardlisenpage.Clickonviewspendingreoprticon();
	}

	@Then("User click on Dashboard side navigation menubar")
	public void user_click_on_Dashboard_side_navigation_menubar() {
	    Buyerdashboardlisenpage.Clickondashboardsidenavigationmenubar();
	}

	

	
	@Then("User click on SKU icon")
	public void user_click_on_SKU_icon() throws InterruptedException {
	   Buyerdashboardlisenpage.ClickonSKUicon(); 
	}

	@Then("User click on category icon")
	public void user_click_on_category_icon() {
	   Buyerdashboardlisenpage.Clickoncategoryicon();
	}

	@Then("User click on the supplier")
	public void user_click_on_the_supplier() throws InterruptedException {
	    Buyerdashboardlisenpage.Clickonsuppliericon();
	}

	@Then("User click on This month icon")
	public void user_click_on_This_month_icon() {
	   Buyerdashboardlisenpage.Clickonthismonthicon();
	}

	@Then("User click on This week icon")
	public void user_click_on_This_week_icon() { 
	    Buyerdashboardlisenpage.Clickonthisweekicon();
	}

	@Then("User click on Last week icon")
	public void user_click_on_Last_week_icon() {
	    Buyerdashboardlisenpage.Clickonlastweekicon();
	}

	@Then("User click on Last month icon")
	public void user_click_on_Last_month_icon() {
	   Buyerdashboardlisenpage.Clickonlastmonthicon();
	}

	@Then("User click on view all spending by supplier")
	public void user_click_on_view_all_spending_by_supplier() throws InterruptedException {
	    Buyerdashboardlisenpage.Clickonviewspendingbusupplier();
	}
	
	/*@Then("User click on sabari supplier")
	public void user_click_on_sabari_supplier() {
	    Buyerdashboardlisenpage.Clickonsabarisupplier();
	}*/

	@Then("User click on show favourites check box")
	public void user_click_on_show_favourites_check_box() throws InterruptedException {
	    Buyerdashboardlisenpage.Clickshowfavouritescheckbox();
	}

	@Then("User click on show favourites uncheck box")
	public void user_click_on_show_favourites_uncheck_box() {
	    Buyerdashboardlisenpage.Clickonshowfavouritesuncheckbox();
	}

	@Then("User click on filter in order page")
	public void user_click_on_filter_in_order_page() {
	   Buyerdashboardlisenpage.Clickonfilter();
	}

	@Then("User click on Tags")
	public void user_click_on_Tags() {
	    Buyerdashboardlisenpage.ClickonTags();
	}

	@Then("User click on selectall")
	public void user_click_on_selectall() {
         Buyerdashboardlisenpage.Clickonselectiocn();

	}

	@Then("User click on outside of order page")
	public void user_click_on_outside_of_order_page() throws InterruptedException {
	    Buyerdashboardlisenpage.Clickonoutsideoforderpage();
	}

	@Then("User click on categories")
	public void user_click_on_categories() {
	   Buyerdashboardlisenpage.Clickoncategories();
	}

	@Then("User click on cretifications")
	public void user_click_on_cretifications() {
	    Buyerdashboardlisenpage.Clickoncertifications();
	    
	}

	@Then("User click on Search box SKU name")
	public void user_click_on_Search_box_SKU_name() {
	    Buyerdashboardlisenpage.Clickonsearchbox();
	}

	@Then("User enter sku in search box{string}")
	public void user_enter_sku_in_search_box_100pipers(String name) {
	    Buyerdashboardlisenpage.Enternameinsearchbox(name);
	}

	@Then("User click on close icon in order page")
	public void user_click_on_close_icon_in_order_page() {
	    Buyerdashboardlisenpage.Clickoncloseiconinorderpage();
	}

	@Then("User click on outletname in dashboard page")
	public void user_click_on_outletname_in_dashboard_page() {
		Buyerdashboardlisenpage.OutletnameClick();
	}
		
	@Then("User click on upload image in drag and dorp filed")
	public void user_click_on_upload_image_in_drag_and_dorp_filed() throws InterruptedException {
	    Buyerdashboardlisenpage.Clickonuploadimage();
	}

	@Then("User click the close icon i order page")
	public void user_click_the_close_icon_i_order_page() {
		Buyerdashboardlisenpage.ClickCloseIcon();
	}


	
	@Then("User click on Apply button in order page")
	public void user_click_on_Apply_button_in_order_page() {
         Buyerdashboardlisenpage.Clickonapplybutton();
	}

	/*@Then("User click on Reset button in order page")
	public void user_click_on_Reset_button_in_order_page() throws InterruptedException {
	  //Buyerdashboardlisenpage.Clickonresetbutton();
	}*/
 	
	@Then("User click on supplier tab icon")
	public void user_click_on_supplier_tab_icon() {
		Buyerdashboardlisenpage.Clickonsuppliertabicon(); 
		}

	@Then("User select dropdown spending overview list outletname")
	public void user_select_dropdown_spending_overview_list_outletname() {
		WebElement velumasala2020 = Buyerdashboardlisenpage.getDropDownElementvelumasala();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@Then("User select dropdown top expenditures list outletname")
	public void user_select_dropdown_top_expenditures_list_outletname() {
		WebElement velumasala2020 = Buyerdashboardlisenpage.getDropDownElementvelumasalatwentytwenty();
		Select select=new Select(velumasala2020);
		select.selectByIndex(4);
	}

}
