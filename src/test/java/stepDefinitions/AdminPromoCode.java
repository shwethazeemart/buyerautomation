package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromoCodePage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.AdminPromotionNewDealPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminPromoCode {
	
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
	     
		public AdminPromoCode(TestContext testContext) {
						
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
		}
		
		@Then("User Click on the New promo code")
		public void user_Click_on_the_New_promo_code() {
			AdminPromoCodePage.ClickNewPromoCode();
		}

		@Then("User Enter the Promo code{string}")
		public void user_Enter_the_Promo_code_COD101(String promocode) {
			AdminPromoCodePage.EnterPromoCode(promocode);
		}

		@Then("User Enter the Promo name{string}")
		public void user_Enter_the_Promo_name_kinley(String promoname) {
			AdminPromoCodePage.EnterPromoName(promoname);
		}

		@Then("User Enter the Promo description{string}")
		public void user_Enter_the_Promo_description_Hii_Kinley(String promodescription) {
			AdminPromoCodePage.EnterPromoDescription(promodescription);
		}

		@Then("User clicks the Profile photo")
		public void user_clicks_the_Profile_photo() {
			AdminPromoCodePage.Click_Profile_Photo();
		}

		@Then("User select the Calendar From date of Validity")
		public void user_select_the_Calendar_From_date_of_Validity() {
			AdminPromoCodePage.SelectcalendarFromDate(); 
		}

		@Then("User select the Calendar Until date of Validity")
		public void user_select_the_Calendar_Until_date_of_Validity() {
			AdminPromoCodePage.SelectcalendarUntilDate(); 
		}

		@Then("User Click Applies to dropdown")
		public void user_Click_Applies_to_dropdown() {
			WebElement Applyto = AdminPromoCodePage.getDropDownApplytoElement();
			Select select=new Select(Applyto);
			select.selectByIndex(0);
		}

		@Then("User click Discount type dropdown")
		public void user_click_Discount_type_dropdown() {
			WebElement DiscountType = AdminPromoCodePage.getDropDownDiscountTypeElement();
			Select select=new Select(DiscountType);
			select.selectByIndex(0);
		}

		@Then("User Enter the Discount value percentage{string}")
		public void user_Enter_the_Discount_value_percentage(String discountpercen) {
			AdminPromoCodePage.EnterDiscountPercentage(discountpercen);
		}

		@Then("User Enter the Min order value{string}")
		public void user_Enter_the_Min_order_value(String minorder) {
			AdminPromoCodePage.EnterMinOrder(minorder);
		}

		@Then("User Enter Usage restrictions overall quota{string}")
		public void user_Enter_Usage_restrictions_overall_quota(String overallquota) {
			AdminPromoCodePage.EnterOverallQuota(overallquota);
		}

		@Then("User Click the Save")
		public void user_Click_the_Save() {
			AdminPromoCodePage.ClicktheSave();
		}
		
		
		
		


}
