package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.SupplierReportAgeingPage;
import pageObjects.SupplierReportOutletPage;
import pageObjects.SupplierReportPlanningPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierReportAgeing {


	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private SupplierCustomerCompanyPage supplierCustomerCompany;
	private SupplierCatalogueListPage supplierCatalogueList;
	private SupplierAddNewSkuPage supplierAddNewSku;
	private Buyerreportspenperoutletpage buyerreportspenperoutlet;
	private SupplierReportOutletPage supplierReportOutlet;
	private SupplierReportPlanningPage supplierReportPlanning;
	private SupplierReportAgeingPage supplierReportAgeing;

	public SupplierReportAgeing(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
		this.supplierCatalogueList=testContext.getPageObjectManager().getSupplierCatalogueListPage();
		this.supplierAddNewSku=testContext.getPageObjectManager().getSupplierAddNewSkuPage();
		this.buyerreportspenperoutlet = testContext.getPageObjectManager().getBuyerreportspenperoutletpage(); 
		this.supplierReportOutlet=testContext.getPageObjectManager().getSupplierReportOutletPage(); 
		this.supplierReportPlanning=testContext.getPageObjectManager().getSupplierReportPlanningPage();
		this.supplierReportAgeing=testContext.getPageObjectManager().getSupplierReportAgeingPage();
	}




	@Then("User click on Ageing receviables in report page")
	public void user_click_on_Ageing_receviables_in_report_page() {
		SupplierReportAgeingPage.AgeingReceviablesClick();
	}

	@Then("User click on update button in ageing")
	public void user_click_on_update_button_in_ageing() {
		SupplierReportAgeingPage.UpdateButtonClick();
	}

	@Then("User click on export button in ageing")
	public void user_click_on_export_button_in_ageing() {
		SupplierReportAgeingPage.ExportButtonClick();
	}

	@Then("User click on first company")
	public void user_click_on_first_company() {
		SupplierReportAgeingPage.FirstCompanyClick();
	}

	@Then("User select outlet in dropdown lists in ageing")
	public void user_select_outlet_in_dropdown_lists_in_ageing() {
		WebElement AllOutlets =supplierReportAgeing.getDropDownElementOutlet();
		Select select=new Select(AllOutlets);
		select.selectByVisibleText("Sakthimasala100");
	}

	@Then("User click on first invoice number in ageing")
	public void user_click_on_first_invoice_number_in_ageing() {
		SupplierReportAgeingPage.FirstInvoiceClick();
	}



 





































}
