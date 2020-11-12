package stepDefinitions;

import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class OrderspageSteps<txtBoxContent> {


	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;


	public OrderspageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		//this.txtBoxContent = testContext.getPageObjectManager().gettxtBoxContent();


	}

	@Given("User is on Orders Page")
	public void user_is_on_Orders_Page() {
		orderspage.navigateTo_Orderspage();
	}

	@Given("User Clicks Orders in the side navigation menubar")
	public void user_Clicks_Orders_in_the_side_navigation_menubar() {
		OrdersPage.click_orders();
	}

	@Given("User Clicks New order dropdown value")
	public void user_Clicks_New_order_dropdown_value() {
		OrdersPage.click_Neworder();
	}

	@Given("User Clicks New order in the dropdown value")
	public void user_Clicks_New_order_in_the_dropdown_value() {
		OrdersPage.click_Neworder1();
	}

	@Given("User Clicks velu masala2020 in the Suppliers page")
	public void user_Clicks_velu_masala2020_in_the_Suppliers_page() {
		OrdersPage.click_velumasala2020();
	}

	@Given("User Clicks in Add to order of SKU")
	public void user_Clicks_in_Add_to_order_of_SKU() {
		OrdersPage.click_Addtoorder();
	}

	@Then("User Clicks increase the order button")
	public void user_Clicks_increase_the_order_button() {
		OrdersPage.click_IncreaseAddtoorder();
	}
	
	@Then("User was clicks a in Add to order of SKU")
	public void user_Clicks_in_Add_to_order_of_SKU1() {
		OrdersPage.click_Addtoorder1();
	}

	@Then("User Clicks Review order")
	public void user_Clicks_Review_order() {
		OrdersPage.click_Revieworder();
	}

	@Then("User Clicks Place Order")
	public void user_Clicks_Place_Order() {
		OrdersPage.click_PlaceOrder();
	}

	
	@Then("User Copy the particular order number in newly created")
	public void user_Copy_the_particular_order_number_in_newly_created() {
		String value = orderspage.TxtBoxContent();
		System.out.println("Printing " +value);
	}

	@Then("User clicks the Back to Orders button")
	public void user_clicks_the_Back_to_Orders_button() {
		OrdersPage.click_BacktoOrderbutton();
	}

	@Then("User paste the newly created order number in Search order ID")
	public void user_paste_the_newly_created_order_number_in_Search_order_ID() {
		OrdersPage.paste_OrderID(OrderID);
	}

	@Then("User Clicks Search button in the orders page")
	public void user_Clicks_Search_button_in_the_orders_page() {
		OrdersPage.click_Searchbutton();

	}

	@Then("It should display the particular order ID {string}")
	public void it_should_display_the_particular_order_ID(String string) {
		String value = orderspage.TxtBoxContent();
		//String pageTitle = "202011110003";
		System.out.println("passwordresetpage failure page title: " + value);

	}
























}
