package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class NewRecurrOrderspageSteps {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private InventoryPage inventorypage;
	private Newrecurringorderspage newrecurringorderspage;
	
	

	public NewRecurrOrderspageSteps(TestContext testContext) {
		super();
		
		
		
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.inventorypage=(InventoryPage)testContext.getPageObjectManager().getInventoryPage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		

	}
	
	
	
	@When("User is Clicks Orders in the side navigation menubar")
	public void user_is_Clicks_Orders_in_the_side_navigation_menubar() throws InterruptedException {
	    dashboradpage.clickOrders();
	}
	
	@When("User in Clicks New order dropdown value")
	public void user_in_Clicks_New_order_dropdown_value()  {
	    newrecurringorderspage.Clicks_New_order_dropdown_value();
	}

	@When("User Clicks New recurring orders in the dropdown value")
	public void user_Clicks_New_recurring_orders_in_the_dropdown_value() {
	   newrecurringorderspage.Clicks_New_recurring_orders_in_the_dropdown_value();
	}

	@When("User select outlet in the dropdown list")
	public void user_select_outlet_in_the_dropdown_list() {
		WebElement velumasala2020 = Newrecurringorderspage.getDropDownOwnerElement();
		Select select=new Select(velumasala2020);
		select.selectByIndex(3);
	}

	@When("User select supplier in the dropdown list")
	public void user_select_supplier_in_the_dropdown_list() {
		WebElement sabari250 = Newrecurringorderspage.getDropDownElementsupplier();
		Select select=new Select(sabari250);
		select.selectByVisibleText("sabari250");
	}

	@When("User Clicks on deliver date in tuesday")
	public void user_Clicks_on_deliver_date_in_tuesday() throws InterruptedException {
	  newrecurringorderspage.Clicks_on_deliver_date_in_tuesday();
	}

	@When("User Clicks on deliver date in wednesday")
	public void user_Clicks_on_deliver_date_in_wednesday() throws InterruptedException {
	    newrecurringorderspage.Clicks_on_deliver_date_in_wednesday();
	}

	@When("User Clicks on checkbox Public holidays")
	public void user_Clicks_on_checkbox_Public_holidays() {
	   newrecurringorderspage.Clicks_on_checkbox_Public_holidays();
	}

	@When("User Clicks on Radio button of Never")
	public void user_Clicks_on_Radio_button_of_Never() {
	    newrecurringorderspage.Clicks_on_Radio_button_of_Never();
	}

	@When("User select contact person in the dropdown list")
	public void user_select_contact_person_in_the_dropdown_list() {
		WebElement velumani2 = Newrecurringorderspage.getDropDownOwnerElementcontactperson();
		Select select=new Select(velumani2);
		select.selectByIndex(1);
	} 

	@When("User Clicks on the Done button")
	public void user_Clicks_on_the_Done_button() {
	   newrecurringorderspage.Clicks_on_the_Done_button();
	}

	@When("User Clicks on Add to order in the first product")
	public void user_Clicks_on_Add_to_order_in_the_first_product() {
	    newrecurringorderspage.Clicks_on_Add_to_order_in_the_first_product();
	}

	@Then("User Clicks on first time increase the order button in the first product")
	public void user_Clicks_on_first_time_increase_the_order_button_in_the_first_product() {
	    newrecurringorderspage.Clicks_on_first_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on second time increase the order button in the first product")
	public void user_Clicks_on_second_time_increase_the_order_button_in_the_first_product() {
	    newrecurringorderspage.Clicks_on_second_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on third time increase the order button in the first product")
	public void user_Clicks_on_third_time_increase_the_order_button_in_the_first_product() {
	    newrecurringorderspage.Clicks_on_third_time_increase_the_order_button_in_the_first_product(); 
	}

	@Then("User Clicks on fourth time increase the order button in the first product")
	public void user_Clicks_on_fourth_time_increase_the_order_button_in_the_first_product() {
	    newrecurringorderspage.Clicks_on_fourth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on fifth time increase the order button in the first product")
	public void user_Clicks_on_fifth_time_increase_the_order_button_in_the_first_product() {
	   newrecurringorderspage.Clicks_on_fifth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on sixth time increase the order button in the first product")
	public void user_Clicks_on_sixth_time_increase_the_order_button_in_the_first_product() {
	   newrecurringorderspage.Clicks_on_sixth_time_increase_the_order_button_in_the_first_product();
	}
	@Then("User Clicks on seven time increase the order button in the first product")
	public void user_Clicks_on_seven_time_increase_the_order_button_in_the_first_product() {
	   newrecurringorderspage.Clicks_on_seven_time_increase_the_order_button_in_the_first_product();
	}
	
	@Then("User Clicks on eight time increase the order button in the first product")
	public void user_Clicks_on_eight_time_increase_the_order_button_in_the_first_product() {
	   newrecurringorderspage.Clicks_on_eight_time_increase_the_order_button_in_the_first_product();
	}
	
	@Then("User Clicks on nineth time increase the order button in the first product")
	public void user_Clicks_on_nineth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_nineth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on tenth time increase the order button in the first product")
	public void user_Clicks_on_tenth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_tenth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on eleventh time increase the order button in the first product")
	public void user_Clicks_on_eleventh_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_eleventh_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on twvelth time increase the order button in the first product")
	public void user_Clicks_on_twvelth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_twvelth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on thirteenth time increase the order button in the first product")
	public void user_Clicks_on_thirteenth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_thirteenth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on fourteenth time increase the order button in the first product")
	public void user_Clicks_on_fourteenth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_fourteenth_time_increase_the_order_button_in_the_first_product();
	}

	@Then("User Clicks on fifteenth time increase the order button in the first product")
	public void user_Clicks_on_fifteenth_time_increase_the_order_button_in_the_first_product() {
		 newrecurringorderspage.Clicks_on_fifteenth_time_increase_the_order_button_in_the_first_product();
	}


	
	@Then("User Clicks on Review Order button")
	public void user_Clicks_on_Review_Order_button() { 
		newrecurringorderspage.Clicks_on_Review_Oreder_button();
	}

	/*@Then("User Clicks on Review Oreder button")
	public void user_Clicks_on_Review_Oreder_button() {
	    newrecurringorderspage.Clicks_on_Review_Oreder_button();
	}*/

	@Then("User Clicks on Save recurring order")
	public void user_Clicks_on_Save_recurring_order() {
	    newrecurringorderspage.Clicks_on_Save_recurring_order(); 
	}

	@Then("It should display the particular order in recurring orders page")
	public void it_should_display_the_particular_order_in_recurring_orders_page() {
		String displayrecurringorderpage =Newrecurringorderspage.getPageTitle();
		String pageTitle = displayrecurringorderpage;
		System.out.println("page title: " + pageTitle);
	}


 
	
	
	
	
}
	
