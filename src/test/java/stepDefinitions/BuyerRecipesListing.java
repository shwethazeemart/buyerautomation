package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.BuyerRecipesListingPage;
import pageObjects.Buyeroutletslistingpage;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class BuyerRecipesListing {

		private TestContext testContext;
		private OrdersPage orderspage;
		private Object OrderID;
		private LogInPage logInPage;
		private DashboardPage dashboradpage;
		private Object outletspage;
		private Newrecurringorderspage newrecurringorderspage;
		private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
		private Buyeroutletslistingpage buyeroutletslisting;
		private BuyerRecipesListingPage buyerRecipesListing;


		public BuyerRecipesListing(TestContext testContext) {
			super();		
			this.testContext = testContext;
			this.orderspage = testContext.getPageObjectManager().getOrdersPage();
			this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
			this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
			this.outletspage = testContext.getPageObjectManager().getOutletspage();
			this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
			this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
			this.buyeroutletslisting = testContext.getPageObjectManager().getBuyeroutletslistingpage();
			this.buyerRecipesListing = testContext.getPageObjectManager().getBuyerRecipesListingpage();

		}

		@Then("User Clicks on Recipes in the side navigation menubar")
		public void user_Clicks_on_Recipes_in_the_side_navigation_menubar() {
			dashboradpage.ClickRecipes();
		}

		@Then("User Click the Search outlet name text box")
		public void user_Click_the_Search_outlet_name_text_box() {
			BuyerRecipesListingPage.ClickSearchTextbox();
			
		}


		
		
		
		
}
