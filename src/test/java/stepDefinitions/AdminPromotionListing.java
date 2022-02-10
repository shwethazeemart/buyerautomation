package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
public void user_Clicks_on_Admin_Promotions_in_the_side_navigation_menubar() throws InterruptedException {
	dashboradpage.clickAdminPromotion();
}

@Then("User click on Deals Tab")
public void user_click_on_Deals_Tab() {
	AdminPromotionListingPage.ClickonDeals();
}

@Then("User clicks Search box")
public void user_clicks_Search_box() {
	AdminPromotionListingPage.ClickSearchBox();
}

@Then("User Enter the Search Deal {string}")
public void user_Enter_the_Search_Deal(String Deal) {
	AdminPromotionListingPage.EnterSearchDeal(Deal);
}

@Then("User Select the dropdown status")
public void user_Select_the_dropdown_status() {
	WebElement status = AdminPromotionListingPage.getDropDownStatusElement();
	Select select=new Select(status);
	select.selectByIndex(1);	
		}


@Then("User Select the Supplier in dropdown list")
public void user_Select_the_Supplier_in_dropdown_list() {
	WebElement supplier = AdminPromotionListingPage.getDropDownSupplierElement();
	Select select=new Select(supplier);
	select.selectByVisibleText("VELU MASALA");	
}

@Then("User Clicks Search icon")
public void user_Clicks_Search_icon() {
	AdminPromotionListingPage.SearchIconClick();
}

@Then("User click on the Organise deals")
public void user_click_on_the_Organise_deals() {
	AdminPromotionListingPage.ClickOrganiseDeal();
}

@Then("User click on Close icon of Organise deals")
public void user_click_on_Close_icon_of_Organise_deals() {
	AdminPromotionListingPage.ClickCloseIcon();
}

@Then("User click the Actions dropdown")
public void user_click_the_Actions_dropdown() {
	AdminPromotionListingPage.ClickActions();
}

@Then("User click New deal icon")
public void user_click_New_deal_icon() {
	AdminPromotionListingPage.ClickNewDeal();
}

@Then("User click Back button of promotion")
public void user_click_Back_button_of_promotion() {
	AdminPromotionListingPage.ClickBackButton();
}

@Then("User click on New Promo Code")
public void user_click_on_New_Promo_Code() {
	AdminPromotionListingPage.ClickNewPromoCode();
}

@Then("User click Back button of promo codes")
public void user_click_Back_button_of_promo_codes() {
	AdminPromotionListingPage.PromoCodeBackButtonClick();
}

}