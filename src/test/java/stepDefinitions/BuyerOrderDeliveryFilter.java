package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerOrderDeliveryFilterpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyerorderslisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class BuyerOrderDeliveryFilter {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private Buyerinvoicelisenpage buyerinvoicelisen;
	private Buyerorderslisenpage buyerorderslisenpage;
    private BuyerOrderDeliveryFilterpage buyerOrderDeliveryFilterpage;


	public BuyerOrderDeliveryFilter(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerorderslisenpage=testContext.getPageObjectManager().getBuyerorderslisenpage();
		this.buyerOrderDeliveryFilterpage=testContext.getPageObjectManager().getBuyerOrderDeliveryFilterpage();
		
	}

	
	
	
	@Then("User click on delivery status")
	public void user_click_on_delivery_status() {
	    BuyerOrderDeliveryFilterpage.DliveryStatusClick();
	}

	@Then("User click on select all in delivery status")
	public void user_click_on_select_all_in_delivery_status() {
	    BuyerOrderDeliveryFilterpage.SelectAllClick();
	}

	@Then("User click on apply button in delivery status")
	public void user_click_on_apply_button_in_delivery_status() {
	    BuyerOrderDeliveryFilterpage.ApplyButtonClick();
	}

	@Then("User click on reset button in delivery status")
	public void user_click_on_reset_button_in_delivery_status() {
	    BuyerOrderDeliveryFilterpage.ResetButtonClick();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
