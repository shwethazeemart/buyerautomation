package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerPNF7797page;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class BuyerPNF7797 {

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
    private BuyerPNF7797page buyerPNF7797;

	public BuyerPNF7797(TestContext testContext) {
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
        this.buyerPNF7797=testContext.getPageObjectManager().getBuyerBuyerPNF7797page();
        
	}

	@Then("User select dropdown of velu")
	public void user_select_dropdown_of_velu() {
		WebElement velu = BuyerPNF7797page.getDropDownElementvelu();
		Select select=new Select(velu);
		select.selectByIndex(3);
	}

	@Then("User click on new stock count button")
	public void user_click_on_new_stock_count_button() {
	  BuyerPNF7797page.Clickonnewstockcountbutton();
		
	}

	@Then("User  enter the count quantity{string}")
	public void user_enter_the_count_quantity(String quantity) {
	   BuyerPNF7797page.Enterthequantity(quantity);
	}

	@Then("User click on pop message save button")
	public void user_click_on_pop_message_save_button() {
	    BuyerPNF7797page.Clickonpopmessagesavebuton();
	}

	@Then("User click on List menu item")
	public void user_click_on_List_menu_item() {
	    BuyerPNF7797page.Clicklistmenuitem();
	}

	@Then("User click on velu list item")
	public void user_click_on_velu_list_item() {
	   BuyerPNF7797page.Clickonvelulist();
	}

	@Then("User see the twenty hours time format")
	public void user_see_the_twenty_hours_time_format() {
	    BuyerPNF7797page.Seetwentyhourtimeformat();
	}


	
	@Then("User click on save button in quantity count")
	public void user_click_on_save_button_in_quantity_count() {
	    BuyerPNF7797page.Clickonsavebutton(); 
	}
	
	
	

@Then("User click on start new stock count button")
public void user_click_on_start_new_stock_count_button() {
    BuyerPNF7797page.ClickonStartstockcountbutton();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
