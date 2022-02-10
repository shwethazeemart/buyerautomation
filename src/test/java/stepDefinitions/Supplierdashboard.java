package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;

public class Supplierdashboard {


		private TestContext testContext;
		private OrdersPage orderspage;
		private Object OrderID;
		private Object logInPage;
		//private LogInPage loginPage3;
		private DashboardPage dashboradpage;
	    private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
		private Supplierdashboardpage supplierdashboard;
		
		public Supplierdashboard(TestContext testContext) {
			super();
			this.testContext = testContext;
			this.orderspage = testContext.getPageObjectManager().getOrdersPage();
			this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
			this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	        this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
            this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();	
		}


		@Then("User click on Dashboard side navigation list menubar")
		public void user_click_on_Dashboard_side_navigation_list_menubar() {
		    Supplierdashboardpage.Clickondashboardicon();
		}

		@Then("User clickon welcome back icon is displayed")
		public void user_checking_welcome_back_icon_is_displayed() {
		    //Supplierdashboardpage.Clickonwelcomebackicon();
		}

		@Then("User clickon total orders icon is dispalyed")
		public void user_checking_total_orders_icon_is_dispalyed() {
		    //Supplierdashboardpage.Clickontotalordersicon();
		}

		@Then("User clickon number of orders icon is dispalyed")
		public void user_checking_number_of_orders_icon_is_dispalyed() {
		   // Supplierdashboardpage.Clickonnumberofordersicon();
		}

		@Then("User clickon delivery orders icon is dispalyed")
		public void user_checking_delivery_orders_icon_is_dispalyed() {
		   // Supplierdashboardpage.Clickondeliveryordersicon();
		}

		@Then("User click on this month in total order page")
		public void user_click_on_this_month_in_total_order_page() throws InterruptedException {
		    Supplierdashboardpage.Clickonthismonthintotalorderpage();
		}

		@Then("User click on this week in total order page")
		public void user_click_on_this_week_in_total_order_page() {
		    Supplierdashboardpage.Clickonthisweekintotalorderpage();
		}

		@Then("User click on this quarter in total order page")
		public void user_click_on_this_quarter_in_total_order_page() {
		    Supplierdashboardpage.Clickonthisquarterintotalorderpage();
		}

		@Then("User click on YTD in total order page")
		public void user_click_on_YTD_in_total_order_page() {
		   Supplierdashboardpage.ClickonYTDintotalorderpage();
		}

		@Then("User click on By Team in dashboard page")
		public void user_click_on_By_Team_in_dashboard_page() {
		   Supplierdashboardpage.Clickonbyteam();
		}

		@Then("User click on show all in dashboard page")
		public void user_click_on_show_all_in_dashboard_page() {
		   Supplierdashboardpage.Clickonshowall();
		}

		@Then("User click on outstanding invoice")
		public void user_click_on_outstanding_invoice() {
		    Supplierdashboardpage.Clickonoutstandinginvoice();
		}

		@Then("User click on all categories")
		public void user_click_on_all_categories() {
		    Supplierdashboardpage.Clickonallcategories();
		}

		@Then("User click on this month in sales by category")
		public void user_click_on_this_month_in_sales_by_category() throws InterruptedException {
		    Supplierdashboardpage.Clickonthismonthinsalesbycategory();
		}

		@Then("User click on this week in sales by category")
		public void user_click_on_this_week_in_sales_by_category() {
		    Supplierdashboardpage.Clickonthisweekinsalescategory();
		}

		@Then("User click on this quarter in sales by category")
		public void user_click_on_this_quarter_in_sales_by_category() {
		    Supplierdashboardpage.Clickonthisquarterinsalescategory();
		}

		@Then("User click on YTD in sales by category")
		public void user_click_on_YTD_in_sales_by_category() throws InterruptedException {
		    //Supplierdashboardpage.ClickonYTDinsalescategory();
		}

		@Then("User click on this month in best performing customers")
		public void user_click_on_this_month_in_best_performing_customers() throws InterruptedException {
		    Supplierdashboardpage.Clickonthismonthinbestperformingcustomer();
		}

		@Then("User click on this week in best performing customers")
		public void user_click_on_this_week_in_best_performing_customers() {
		   Supplierdashboardpage.Clickonthisweekinbestperformingcustomer();
		}

		@Then("User click on this quarter in best performing customer")
		public void user_click_on_this_quarter_in_best_performing_customer() {
		    //Supplierdashboardpage.Clickonthisquarterinbestperformingcustomer();
		}

		@Then("User click on YTD in best performing customer")
		public void user_click_on_YTD_in_best_performing_customer() {
		   //Supplierdashboardpage.ClickonYTDinbestperformingcustomer();
		}

		@Then("User click on view all in best performing customer")
		public void user_click_on_view_all_in_best_performing_customer() {
		    Supplierdashboardpage.Clickonviewallinbestperformingcustomer();
		}

		@Then("User click on over fourteen days in slipping away")
		public void user_click_on_over_fourteen_days_in_slipping_away() {
		    Supplierdashboardpage.Clickonoverfourteendaysinslippingaway();
		}

		@Then("User click on over thirdty days in slipping away")
		public void user_click_on_over_thirdty_days_in_slipping_away() {
		    Supplierdashboardpage.Clickonoverthirdtydaysinslippingaway();
		}

		@Then("User click on over sixty days in slipping away")
		public void user_click_on_over_sixty_days_in_slipping_away() {
		   Supplierdashboardpage.Clickonoversixtydaysinslippingaway();
		}

		@Then("User click on over ninety days in slipping away")
		public void user_click_on_over_ninety_days_in_slipping_away() {
		    Supplierdashboardpage.Clickonoverninetydaysinslippingaway();
		}

		@Then("User click on view all in slipping away")
		public void user_click_on_view_all_in_slipping_away() {
		    Supplierdashboardpage.Clickonviewallinslippinyaway();
		}
	
		@Then("User click on scroll down")
		public void user_click_on_scroll_down() {
			Supplierdashboardpage.Clickscrolldown();
		}
	
	
	
	
	
	
}
