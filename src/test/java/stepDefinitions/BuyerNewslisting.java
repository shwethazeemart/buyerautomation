package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BuyerNewslistingpage;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyerorderslisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class BuyerNewslisting {

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
    private BuyerNewslistingpage buyerNewslisting;


	public BuyerNewslisting(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
		this.buyerorderslisenpage=testContext.getPageObjectManager().getBuyerorderslisenpage();
		this.buyerNewslisting=testContext.getPageObjectManager().getBuyerNewslistingpage();
	}
	
	


@Then("User Clicks on News in the side navigation menubar")
public void user_Clicks_on_News_in_the_side_navigation_menubar() throws InterruptedException {
     dashboradpage.clickNews();
}

@Then("User is Clicks in the test notification")
public void user_is_Clicks_in_the_test_notification() {
	BuyerNewslistingpage.Clickthetestnotification(); 
}

@Then("User are Clicks on the Whatsapp link")
public void user_are_Clicks_on_the_Whatsapp_link() {
	BuyerNewslistingpage.Clickonthewhatsapplink(); 
}
    

@Then("User navigates to buyer hub")
public void user_navigates_to_buyer_hub() {
	//BuyerNewslistingpage.navigate_to_buyer_panel();   
	  
	}

   
@Then("user click on the close icon for test notification")
public void user_click_on_the_close_icon_for_test_notification() {
	BuyerNewslistingpage.Clickoncloseicon(); 
}
   

}
