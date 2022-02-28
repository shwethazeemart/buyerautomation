package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsmanagesettingspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerreportinvoicevariancepage;
import pageObjects.Buyerreportspenpercategorypage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerreportinvoicevariance {

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
    
    
	public Buyerreportinvoicevariance(TestContext testContext) {
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
		
	}
	
	
	@Then("User click on Invoice variance icon")
	public void user_click_on_Invoice_variance_icon() throws InterruptedException {
	    Buyerreportinvoicevariancepage.Clickinvoicevarianceicon();
	}

	@Then("User click on search box in invoice variance")
	public void user_click_on_search_box_in_invoice_variance() {
	   Buyerreportinvoicevariancepage.Clicksearchbox(); 
	}

	@Then("User Enter the  invoice number in search box{string}")
	public void user_Enter_the_invoice_number_in_search_box_vel(String invoice) {
	    Buyerreportinvoicevariancepage.Entertheinvoicenumber(invoice);
	}

	@Then("User select date from calendar in invoice variance")
	public void user_select_date_from_calendar_in_invoice_variance() {
	    //Buyerreportinvoicevariancepage.Selectdatefromcalendar();
	}


	@Then("User select from dropdown value")
	public void user_select_from_dropdown_value() {
		WebElement Outletdropdown = Buyerreportinvoicevariancepage.getDropDownElementoutletname();
		Select select=new Select(Outletdropdown);
		select.selectByIndex(3); 
	}
 
	@Then("User click on filter in invoice variance")
	public void user_click_on_filter_in_invoice_variance() throws InterruptedException {
	    Buyerreportinvoicevariancepage.Clickfilter();
	}

	@Then("User select supplier in dropdown list")
	public void user_select_supplier_in_dropdown_list() {
		WebElement sabari250 = Buyerreportinvoicevariancepage.getDropDownElementsabari();
		Select select=new Select(sabari250);
		select.selectByIndex(1); 
	}

	@Then("User select match status in dropdown list")
	public void user_select_match_status_in_dropdown_list() {
		WebElement Exactmatch = Buyerreportinvoicevariancepage.getDropDownElementstatus();
		Select select=new Select(Exactmatch);
		select.selectByIndex(3);
	}

	@Then("User click on export download button in invoice variance")
	public void user_click_on_export_download_button_in_invoice_variance() throws InterruptedException {
	   Buyerreportinvoicevariancepage.Clickexportdownloadbutton();
	}


	@Then("User click on Apply button in invoice variance")
	public void user_click_on_Apply_button_in_invoice_variance() throws InterruptedException {
	    Buyerreportinvoicevariancepage.Clickonapplybutton();
	}

	@Then("User click on reset button in invoice variance")
	public void user_click_on_reset_button_in_invoice_variance() throws InterruptedException {
	    //Buyerreportinvoicevariancepage.Clickonresetbutton();
	}

	@Then("User click on outside in invoice variance")
	public void user_click_on_outside_in_invoice_variance() {
	    Buyerreportinvoicevariancepage.Clickonoutside();
	}

	@Then("User click on Reports back button in invoice variance")
	public void user_click_on_Reports_back_button_in_invoice_variance() {
	    Buyerreportinvoicevariancepage.Clickreportsbackbutton();
	} 

	@Then("User click on grn icon invoicevariance page")
	public void user_click_on_grn_icon_invoicevariance_page() throws InterruptedException {
		Buyerreportinvoicevariancepage.grnIconClick();
	}
	
	}
