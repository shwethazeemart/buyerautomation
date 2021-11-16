package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportinvoicevariancepage;
import pageObjects.Buyerreportpriceupdatespage;
import pageObjects.Buyerreportspenpercategorypage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportpriceupdates {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsviewsupplierspage buyeroutletsviewsuppliers;
    private Buyerreportspenperoutletpage buyerreportspenperoutlet;
    private Buyerreportspenpercategorypage buyerreportspenpercategory;
    private Buyerreportinvoicevariancepage buyerreportinvoicevariance;
    private Buyerreportpriceupdatespage buyerreportpriceupdates;
    
	public Buyerreportpriceupdates(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsviewsuppliers = testContext.getPageObjectManager().getBuyeroutletsviewsupplierspage();
		this.buyerreportspenperoutlet = testContext.getPageObjectManager().getBuyerreportspenperoutletpage();
		this.buyerreportspenpercategory = testContext.getPageObjectManager().getBuyerreportspenpercategorypage();
		this.buyerreportinvoicevariance = testContext.getPageObjectManager().getBuyerreportinvoicevariancepage();
		this.buyerreportpriceupdates = testContext.getPageObjectManager().getBuyerreportpriceupdatespage();
		
	}
	
	
	@Then("User click on Price updates icon")
	public void user_click_on_Price_updates_icon() {
	   Buyerreportpriceupdatespage.Clickonpriceupdatesicon();
	}

	@Then("User click on search box in price updates")
	public void user_click_on_search_box_in_price_updates() {
	    Buyerreportpriceupdatespage.Clicksearchbox(); 
	}

	@Then("User Enter the  sku name in search box{string}")
	public void user_Enter_the_sku_name_in_search_box_100pipers(String sku) {
	    Buyerreportpriceupdatespage.Enterskunameinsearchbox(sku);
	}

	@Then("User click on calendar in price updates")
	public void user_click_on_calendar_in_price_updates() {
	    //Buyerreportpriceupdatespage.Clickoncalendaricon();
	}

	@Then("User click on YTD from calendar in price updates")
	public void user_click_on_YTD_from_calendar_in_price_updates() {
	    //Buyerreportpriceupdatespage.ClickonYTDfromcalendar();
	}

	@Then("User select from dropdown value of outlet in price updates {string}")
	public void user_select_from_dropdown_value_of_outlet_in_price_updates(String outletname) {
		WebElement velumasala2020 = Buyerreportpriceupdatespage.getDropDownElementoutletname();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@Then("User click on filter in price updates")
	public void user_click_on_filter_in_price_updates() {
	    Buyerreportpriceupdatespage.Clickonfilter();
	}

	@Then("User select supplier in dropdown list of {string}")
	public void user_select_supplier_in_dropdown_list_of(String suppiername) {
		WebElement sabari250 = Buyerreportpriceupdatespage.getDropDownElementsuppliername();
		Select select=new Select(sabari250);
		select.selectByIndex(1);
	}

	@Then("User click on Apply button in price updates")
	public void user_click_on_Apply_button_in_price_updates() throws InterruptedException {
	  Buyerreportpriceupdatespage.Clickapplybutton();
	}

	@Then("User click on reset button in price updates")
	public void user_click_on_reset_button_in_price_updates() throws InterruptedException {
	    //Buyerreportpriceupdatespage.Clickresetbutton();
	}

	@Then("User click on outside in price updates")
	public void user_click_on_outside_in_price_updates() {
	    Buyerreportpriceupdatespage.Clickonoutsideicon();
	}

	@Then("User click on export download button in price updates")
	public void user_click_on_export_download_button_in_price_updates() {
	    Buyerreportpriceupdatespage.Clickexportdownloadbutton();
	}

	@Then("User click on Reports back button in price updates")
	public void user_click_on_Reports_back_button_in_price_updates() {
	    Buyerreportpriceupdatespage.Clickreportsbackbutton(); 
	}

	
	@Then("User click on Reports back button in sku page")
	public void user_click_on_Reports_back_button_in_sku_page() {
	  Buyerreportpriceupdatespage.Clickreportbackbuttoninsku();
	}	
	
	
	
	
	@Then("User click on Download button first page")
	public void user_click_on_Download_button_first_page() {
		Buyerreportpriceupdatespage.Clickondownloadbuttonfirstpage(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
