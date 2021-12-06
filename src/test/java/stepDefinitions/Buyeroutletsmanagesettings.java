package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsmanagesettingspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyeroutletsmanagesettings {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsmanagesettingspage buyeroutletsmanagesettings;
    
	public Buyeroutletsmanagesettings(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsmanagesettings = testContext.getPageObjectManager().getBuyeroutletsmanagesettingspage();
		
	}
	
	
	@Then("User clicks on Manage settings")
	public void user_clicks_on_Manage_settings() {
	    Buyeroutletsmanagesettingspage.Clickmanagesettings();
	}

	@Then("User click on search box")
	public void user_click_on_search_box() {
	    Buyeroutletsmanagesettingspage.Clicksearchbox();
	}

	@Then("User Enter the name in search box{string}")
	public void user_Enter_the_name_in_search_box_Name(String Name) {
	    Buyeroutletsmanagesettingspage.Enterthename(Name);
	}

	@Then("User click on Add member button")
	public void user_click_on_Add_member_button() {
	    Buyeroutletsmanagesettingspage.Clickaddmeemberbutton();
	}

	@Then("User click on select user search box")
	public void user_click_on_select_user_search_box() {
	    Buyeroutletsmanagesettingspage.Clickonselectuserserachbox();
	}

	@Then("User click on check box ")
	public void user_click_on_check_box() {
	    Buyeroutletsmanagesettingspage.Clickcheckboxfirst();
	}

	@Then("User click on cancel button")
	public void user_click_on_cancel_button() throws InterruptedException {
	    //Buyeroutletsmanagesettingspage.Clickcancelbutton();
	}

	@Then("User click on Add button")
	public void user_click_on_Add_button() throws InterruptedException {
	    Buyeroutletsmanagesettingspage.Clickaddbutton();
	}

	@Then("User Clear on weekly email")
	public void user_Clear_on_weekly_email() {
	    Buyeroutletsmanagesettingspage.Clearweeklyemail();
	}

	@Then("User enter on weekly email{string}")
	public void user_enter_on_weekly_email_velumani_zeemart_asia(String WeeklyEmail) {
	    Buyeroutletsmanagesettingspage.Enterweeklyemail(WeeklyEmail);
	}

	@Then("User select dropdown list in wednesday")
	public void user_select_dropdown_list_in_wednesday() {
		WebElement wednesday = Buyeroutletsmanagesettingspage.getDropDownElementcutofday();
		Select select=new Select(wednesday);
		select.selectByIndex(3);
	}

	@Then("User clear the Email list")
	public void user_clear_the_Email_list() {
	    Buyeroutletsmanagesettingspage.Clearemaillist();
	}

	@Then("User enter on Email list{string}")
	public void user_enter_on_Email_list_lingeshsabari2009_gmail_com(String Email) {
	   Buyeroutletsmanagesettingspage.Enteremaillist(Email);
	}

	@Then("User clear outlet email")
	public void user_clear_outlet_email() {
	    Buyeroutletsmanagesettingspage.Clearoutletemail();
	}

	@Then("User enter the outletemail{string}")
	public void user_enter_the_outletemail_velumanieswaran2020_gmail_com(String outletemail) {
	    Buyeroutletsmanagesettingspage.Enteroutletemail(outletemail);
	}

	@Then("User click on save button finally")
	public void user_click_on_save_button_finally() {
	    Buyeroutletsmanagesettingspage.Clicksavebutton();
	}

	
	@Then("User click on outside section")
	public void user_click_on_outside_section() {
	    Buyeroutletsmanagesettingspage.Clickonoutsidesection();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
