package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromoCodeListingPage;
import pageObjects.AdminPromoCodePage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.AdminPromotionNewDealPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminPromoCodeListing {

 
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
	    private AdminPromotionNewDealPage adminPromotionNewDeal;
	    private AdminPromoCodePage adminPromoCode;


	    private AdminPromoCodeListingPage adminPromoCodeListing;
  
		public AdminPromoCodeListing(TestContext testContext) {
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
		    this.adminPromotionNewDeal=testContext.getPageObjectManager().getAdminPromotionNewDealPage();
		    this.adminPromoCode=testContext.getPageObjectManager().getAdminPromoCodePage();
		    this.adminPromoCodeListing=testContext.getPageObjectManager().getAdminPromoCodeListingPage();
		}
	
		@Then("User Click on the Promo codes tab")
		public void user_Click_on_the_Promo_codes_tab() {
			AdminPromoCodeListingPage.ClickPromocodesTab();
		}
		
		@Then("User clicks SEARCH CODE")
		public void user_clicks_SEARCH_CODE() {
			AdminPromoCodeListingPage.ClickSearchCode();
		}

		@Then("User Enter the SEARCH CODE{string}")
		public void user_Enter_the_SEARCH_CODE(String code) throws InterruptedException {
			AdminPromoCodeListingPage.EnterSearchCode(code);
		}
		
		@Then("User Select the dropdown status of promo codes")
		public void user_Select_the_dropdown_status_of_promo_codes() {
			WebElement statusone = AdminPromoCodeListingPage.getDropDownstatusoneElement();
			Select select=new Select(statusone);
			select.selectByIndex(3);
		}

		
		@Then("User select the Calendar Validity period")
		public void user_select_the_Calendar_Validity_period() {
			AdminPromoCodeListingPage.SelectcalendaValidity(); 
		}
		
		@Then("User Clicks Search icon of promocodes")
		public void user_Clicks_Search_icon_of_promocodes() throws InterruptedException {
			AdminPromoCodeListingPage.ClicktheSearchIcon();
		}

		@Then("User Click the Actions dropdown of Promocodes")
		public void user_Click_the_Actions_dropdown_of_Promocodes() {
			AdminPromoCodeListingPage.ClicktheActionsDropdown();
		}

		@Then("User Click the View settings")
		public void user_Click_the_View_settings() {
			AdminPromoCodeListingPage.ClickViewSettings();
		}
		
		@Then("User Clear the Promo code")
		public void user_Clear_the_Promo_code() {
			AdminPromoCodeListingPage.ClearPromoCode();
		}

		@Then("User Enter the Promo code in View settings{string}")
		public void user_Enter_the_Promo_code_in_View_settings_1234newcode(String promocode) {
			AdminPromoCodeListingPage.ViewPromocode(promocode);
		}

		@Then("User Click on the Save button")
		public void user_Click_on_the_Save_button() throws InterruptedException {
			AdminPromoCodeListingPage.ClickSaveBtn();
		}

		@Then("User Click on action icon of 123promocode")
		public void user_Click_on_action_icon_of_123promocode() throws InterruptedException {
			AdminPromoCodeListingPage.Clickaction123promocode();
		}
		
		@Then("User Click the View details usage")
		public void user_Click_the_View_details_usage() {
			AdminPromoCodeListingPage.ViewDetailsClick();
		}

		@Then("User Click return back to Promo codes")
		public void user_Click_return_back_to_Promo_codes() {
			AdminPromoCodeListingPage.BackToPromocodes();
		}

		@Then("User Click on Action icon of ABCDpromocode")
		public void user_Click_on_Action_icon_of_ABCDpromocode() throws InterruptedException {
			AdminPromoCodeListingPage.ClickActionABCDpromocode();
		}
		
		@Then("User Click the End promo")
		public void user_Click_the_End_promo() {
			AdminPromoCodeListingPage.ClickEndPromo();
		}

		@Then("User Click the Close icon")
		public void user_Click_the_Close_icon() {
			AdminPromoCodeListingPage.ClickCloseIcon();
		}
		
		
		
}
