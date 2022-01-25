package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminPromotionListing {
	
	

		private TestContext testContext;
		private OrdersPage orderspage;
		//private txtBoxContent txtBoxContent;
		private Object OrderID;
		private LogInPage logInPage;
		private DashboardPage dashboradpage;
		private AdminInvoiceuploadpage admininvoiceuploadpage;
		private Admininvoiceprocesspage admininvoiceprocesspage;
		private Adminbuyersoutletpage adminbuyersoutletpage;
		private Adminbuyeroutletsubscriptionpage adminbuyerouletsubscriptionpage; 
	    private Object adminbuyerlinktothecompany;
	    private AdminOrderListingPage adminOrderListingPage;
	    private AdminOrderDetailsPage adminOrderDetails;
	    private AdminPromotionListingPage adminPromotionListing;
	     
		public AdminPromotionListing(TestContext testContext) {
			super();
			this.testContext = testContext;
			this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
			this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
			this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
			this.testContext = testContext;
			this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
	        this.adminbuyerouletsubscriptionpage = testContext.getPageObjectManager().getAdminbuyersoutletsubscriptionpageSteps();
		    this.adminbuyerlinktothecompany=testContext.getPageObjectManager().getAdminbuyerlinktothecompany();
		    this.adminOrderListingPage=testContext.getPageObjectManager().getAdminOrderListingPage();
		    this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		    this.adminOrderDetails=testContext.getPageObjectManager().getAdminOrderDetailsPage();
		    this.adminPromotionListing=testContext.getPageObjectManager().getAdminPromotionListingPage();
		}



@When("User Clicks on Admin Promotions in the side navigation menubar")
public void user_Clicks_on_Admin_Promotions_in_the_side_navigation_menubar() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click on Deals Tab")
public void user_click_on_Deals_Tab() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User clicks Search box")
public void user_clicks_Search_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User Enter the Search Deal {string}")
public void user_Enter_the_Search_Deal(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User Select the dropdown status")
public void user_Select_the_dropdown_status() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User Select the Supplier in dropdown list")
public void user_Select_the_Supplier_in_dropdown_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User Clicks Search icon")
public void user_Clicks_Search_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click on the Organise deals")
public void user_click_on_the_Organise_deals() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click on Close icon of Organise deals")
public void user_click_on_Close_icon_of_Organise_deals() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click the Actions dropdown")
public void user_click_the_Actions_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click New deal icon")
public void user_click_New_deal_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click Back button of promotion")
public void user_click_Back_button_of_promotion() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click on New Promo Code")
public void user_click_on_New_Promo_Code() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click Back button of promo codes")
public void user_click_Back_button_of_promo_codes() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}