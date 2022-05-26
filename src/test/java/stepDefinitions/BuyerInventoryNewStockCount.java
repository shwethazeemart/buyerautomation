package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerInventoryNewStockCountPage;
import pageObjects.BuyerNewslistingpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyerorderslisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class BuyerInventoryNewStockCount {

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
	    private BuyerInventoryNewStockCountPage buyerInventoryNewStockCount;


		public BuyerInventoryNewStockCount(TestContext testContext) {
			super();
			this.testContext = testContext;
			this.orderspage = testContext.getPageObjectManager().getOrdersPage();
			this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
			this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
			this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
			this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
			this.buyerinvoicelisen=testContext.getPageObjectManager().getBuyerinvoicelisen();
			this.buyerorderslisenpage=testContext.getPageObjectManager().getBuyerorderslisenpage();
			this.buyerInventoryNewStockCount=testContext.getPageObjectManager().getBuyerInventoryNewStockCount();
		}

		
		@Then("User click on Search outlets")
		public void user_click_on_Search_outlets() {
			BuyerInventoryNewStockCountPage.ClickSearchOutlets();
		}

		
		@Then("User Enter the Outlet {string}")
		public void user_Enter_the_Outlet_Vel_masala250(String velmasala250) throws InterruptedException {
			BuyerInventoryNewStockCountPage.EnterOutletname(velmasala250);
		}
		
		@Then("User Enter the Outlet\"Vel masala250\"")
		public void user_Enter_the_Outlet_Vel_masala250() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		@Then("User select the Inventory list dropdown")
		public void user_select_the_Inventory_list_dropdown() {
			WebElement mani = BuyerInventoryNewStockCountPage.getDropDownElementmani();
			Select select=new Select(mani);
			select.selectByIndex(1);
			}

		@Then("User click thee Count date")
		public void user_click_thee_Count_date() {
			BuyerInventoryNewStockCountPage.ClickCountDate();
		}
		
		@Then("User select the Count date")
		public void user_select_the_Count_date() throws InterruptedException {
			BuyerInventoryNewStockCountPage.SelectCountDate();
		}

		@Then("User Click the Start stock count button")
		public void user_Click_the_Start_stock_count_button() throws InterruptedException {
			BuyerInventoryNewStockCountPage.ClickStartStockCount();
			}

		@Then("User Click the Counted QTY")
		public void user_Click_the_Counted_QTY() {
			BuyerInventoryNewStockCountPage.ClickCountedQTYBox();
		}
		
		@Then("User Enter the Counted QTY{string}")
		public void user_Enter_the_Counted_QTY(String one) {
	         BuyerInventoryNewStockCountPage.EnterCountedQTY(one);
		}

		@Then("User click the Save")
		public void user_click_the_Save() {
			BuyerInventoryNewStockCountPage.ClickSave();
			}

		@Then("User Click the Cancel button")
		public void user_Click_the_Cancel_button() {
			BuyerInventoryNewStockCountPage.ClickCancel();
			}

		@Then("User click the Yes")
		public void user_click_the_Yes() {
			BuyerInventoryNewStockCountPage.ClickYesBtn();
		}

		@Then("User Enter the Counted QTY")
		public void user_Enter_the_Counted_QTY() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


		
	
}
