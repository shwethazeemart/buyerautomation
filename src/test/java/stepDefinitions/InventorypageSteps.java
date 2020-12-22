package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.Userspage;

public class InventorypageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private InvoiceprocessPage invoiceProcessPage; 
	private DashboardPage dashboradpage;
	private InventoryPage inventorypage;
	
	

	public InventorypageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = testContext.getPageObjectManager().getLogInPage();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.inventorypage=(InventoryPage)testContext.getPageObjectManager().getInventoryPage();
	}
	
	
	@When("User Clicks on Inventory in the side navigation menubar")
	public void user_Clicks_on_Inventory_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickInventory();
	}

	@Then("User is Clicks in murugan idli shop outlet")
	public void user_is_Clicks_in_murugan_idli_shop_outlet() throws InterruptedException {
	    inventorypage.Clicks_in_murugan_idli_shop_outlet();
		
	}

	@And("User are Clicks in Lists")
	public void user_are_Clicks_in_Lists() throws InterruptedException {
	   inventorypage.Clicks_in_Lists();
	}

	@Then("User is Clicks in New list")
	public void user_is_Clicks_in_New_list() {
	    inventorypage.Clicks_in_New_list();
	}

	@Then("User are type the name in list name filed{string}")
	public void user_are_type_the_name_in_list_name_filed_lingesh(String listname) throws InterruptedException {
		inventorypage.type_the_name_in_list_name(listname);
	}

	@Then("User are type Notes in the Notes field{string}")
	public void user_are_type_Notes_in_the_Notes_field_lingeshfound10(String notes) throws InterruptedException {
		inventorypage.type_Notes_in_the_Notes_fieldlingesh_found(notes);
	}
	
	

	@Then("User is Clicks in next button")
	public void user_is_Clicks_in_next_button() {
	   inventorypage.Clicks_in_next_button();
	}

	@And("User are Clicks the check box of parisian Baguette")
	public void user_are_Clicks_the_check_box_of_parisian_Baguette() {
	    inventorypage.Clicks_the_check_box();
		
	}

	@And("User is Clicks Done button")
	public void user_is_Clicks_Done_button() {
	    inventorypage.Clicks_Done_button();		
	}

	@Then("User are Clicks the lingesh list")
	public void user_are_Clicks_the_lingesh_list() {
	    inventorypage.Clicks_the_lingesh_list();
	}

	@And("User is Clicks the New stock count")
	public void user_is_Clicks_the_New_stock_count() {
	    inventorypage.Clicks_the_New_stock_count();
	}

	@Then("User are Clicks the Start stock count button")
	public void user_are_Clicks_the_Start_stock_count_button() {
	    inventorypage.Clicks_the_Start_stock_count_button(); 
	}

	@And("User is Clicks the increase counted Quantity of parisian Baguetee")
	public void user_is_Clicks_the_increase_counted_Quantity_of_parisian_Baguetee() {
	    inventorypage.Clicks_the_increase_counted_Quantity_of_parisian_Baguetee();
	}

	@Then("User are Clicks the increase second time counted Quantity of parisian Baguetee")
	public void user_are_Clicks_the_increase_second_time_counted_Quantity_of_parisian_Baguetee() {
	  inventorypage.Clicks_the_increase_second_time_counted_Quantity_of_parisian_Baguetee();
	}


	@Then("User are Clicks Save button")
	public void user_are_Clicks_Save_button() {
	    inventorypage.Clicks_Save_button();
	}

	@And("User is Clicks Save stock count POPUP button")
	public void user_is_Clicks_Save_stock_count_POPUP_button() {
	    inventorypage.Clicks_Save_stock_count_POPUP_button();
	}

	@Then("User are Click Record adjusment button")
	public void user_are_Click_Record_adjusment_button() {
	   inventorypage.Click_Record_adjusment_button();
	}

	@When("User is Select Reason drodown value of found") 
	public void user_is_Select_Reason_drodown_value_of_found() {
		WebElement Found = InventoryPage.getDropDownOwnerElement();
		Select select=new Select(Found);
		select.selectByIndex(3);
	} 

	@When("User is Select item in the items name dropdown")
	public void user_is_Select_item_in_the_items_name_dropdown() {
		WebElement ParisianBagutte = InventoryPage.getDropDownOwnerElementofitem();
		Select select=new Select(ParisianBagutte);
		select.selectByIndex(1);
	}

	/*@Then("User are type the value of Quantity box field {string}")
	public void user_are_type_the_value_of_Quantity_box_field(String quantity) {
	   inventorypage.type_the_value_of_Quantity_box_field(quantity);
	}*/

	/*@Then("User are type Notes in the Notes fieldlingesh found {string}")
	public void user_are_type_Notes_in_the_Notes_fieldlingesh_found(String notes) {
	    inventorypage.type_Notes_in_the_Notes_fieldlingesh_found(notes);
	}*/
	
	@Then("User are type the value of Quantity box field{string}")
	public void user_are_type_the_value_of_Quantity_box_field(String quantity) throws InterruptedException {
		inventorypage.type_the_value_of_Quantity_box_field(quantity);
	}

	/*@Then("User are type Notes in the Notes fieldlingesh found{string}")
	public void user_are_type_Notes_in_the_Notes_fieldlingesh_found(String notes) throws InterruptedException {
		inventorypage.type_Notes_in_the_Notes_fieldlingesh_found(notes);
	}*/
	
	
	
	@Then("User are Clicks final Save button")
	public void user_are_Clicks_final_Save_button() {
	    //inventorypage.Clicks_final_Save_button();
	}

	
}