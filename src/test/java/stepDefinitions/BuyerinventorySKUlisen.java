package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class BuyerinventorySKUlisen {

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
    private BuyerinventorySKUlisenpage buyerinventorySKUlisen;


	public BuyerinventorySKUlisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
        this.buyerinventoryoutletslisen=testContext.getPageObjectManager().getBuyerinventoryoutletslisenpage();
        this.buyerinventorySKUlisen=testContext.getPageObjectManager().getBuyerinventorySKUlisenpage();
	}


	@Then("User ckicks on velu masala outlet")
	public void user_ckicks_on_velu_masala_outlet() {
	    BuyerinventorySKUlisenpage.clickvelumasala();
	}

	@Then("User click on New stock count")
	public void user_click_on_New_stock_count() {
	   BuyerinventorySKUlisenpage.clicknewstockcount();
	}

	@Then("User click on New stock count close icon")
	public void user_click_on_New_stock_count_close_icon() {
	    BuyerinventorySKUlisenpage.clicknewstockcountcloseicon();
	}

	@Then("User click on Record Adjustment")
	public void user_click_on_Record_Adjustment() {
	   BuyerinventorySKUlisenpage.clickrecordadjustment();
	}

	@Then("User click on Record Adjustment close icon")
	public void user_click_on_Record_Adjustment_close_icon() {
	    BuyerinventorySKUlisenpage.Recordadjstmentcloseicon();
	}

	@Then("User click on Export download button")
	public void user_click_on_Export_download_button() {
	    BuyerinventorySKUlisenpage.Clickexportdownloadbutton();
	}

	@Then("User click on Add SKU")
	public void user_click_on_Add_SKU() {
	   // BuyerinventorySKUlisenpage.clickAddSKU();
	}

	@Then("User Select dropdown list name in velu")
	public void user_Select_dropdown_list_name_in_velu() {
		//WebElement velu = BuyerinventorySKUlisenpage.getDropDownElementSKU();
		//Select select=new Select(velu);
		//select.selectByIndex(3);
	}

	@Then("User click on check box of SKU")
	public void user_click_on_check_box_of_SKU() {
	    //BuyerinventorySKUlisenpage.ClickcheckboxSKU();
	}

	@Then("User click on done button")
	public void user_click_on_done_button() {
	    //BuyerinventorySKUlisenpage.clickdonebutton();
	}

	@Then("User click on the first check box of SKU")
	public void user_click_on_the_first_check_box_of_SKU() {
	   BuyerinventorySKUlisenpage.clickfirstchckboxofSKU();
	}

	@Then("User click on Edit par level")
	public void user_click_on_Edit_par_level() {
	  BuyerinventorySKUlisenpage.clickonEditparlevel();
	}

	@Then("User click on Edit par level close icon")
	public void user_click_on_Edit_par_level_close_icon() {
	    BuyerinventorySKUlisenpage.ClickEditparlevelcloseicon();
	}

	@Then("User click on Remove from inventory list icon")
	public void user_click_on_Remove_from_inventory_list_icon() {
	    BuyerinventorySKUlisenpage.clickremovefrominventory();
	}

	@Then("User click on Remove from inventory list close icon")
	public void user_click_on_Remove_from_inventory_list_close_icon() {
	    BuyerinventorySKUlisenpage.Clickremovefrominventorycloseicon();
	}

	@Then("User click on clear icon")
	public void user_click_on_clear_icon() {
	    BuyerinventorySKUlisenpage.Clickonclearicon();
	}

	@Then("User close on Remove from inventory list Delete icon")
	public void user_close_on_Remove_from_inventory_list_Delete_icon() {
		 BuyerinventorySKUlisenpage.Closeiconofremovefrominventory();
	}

	@Then("User click on consumption report")
	public void user_click_on_consumption_report() {
		BuyerinventorySKUlisenpage.Clickonconsumptionreport();
	}

	@Then("User click on backbutton of consumption report")
	public void user_click_on_backbutton_of_consumption_report() {
		BuyerinventorySKUlisenpage.Clickbackbuttonofconsumptionreport();
	}





	
	

}
