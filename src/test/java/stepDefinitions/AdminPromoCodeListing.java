package stepDefinitions;

import cucumber.TestContext;
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
		}
		
}
