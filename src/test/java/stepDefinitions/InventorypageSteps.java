package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.invoiceProcessPage = (InvoiceprocessPage)testContext.getPageObjectManager().getInvoiceprocesspage();
		this.inventorypage=(InventoryPage)testContext.getPageObjectManager().getInventoryPage();
	}
	
	
	
	@When("User Clicks on Inventory in the side navigation menubar")
	public void user_Clicks_on_Inventory_in_the_side_navigation_menubar()  {
		dashboradpage.clickInventory();
	} 

	@Then("User is Clicks in velu masala2020 outlet")
	public void user_is_Clicks_in_velu_masala2020_outlet() throws InterruptedException {
	    inventorypage.Clicks_in_velu_masala2020_outlet();
		
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

	@Then("User are Clicks the sairam list")
	public void user_are_Clicks_the_sairam_list() {
	    inventorypage.Clicks_the_sairam_list();
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
	public void user_are_Click_Record_adjusment_button() throws InterruptedException {
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
	    inventorypage.Clicks_final_Save_button();
	}
	@Then("User clicks on the Cavenagh4 outlets")
	public void user_clicks_on_the_Cavenagh4_outlets() throws InterruptedException {
		inventorypage.clicks_on_the_Cavenagh4_outlets();
	}

	@Then("User clicks on the Activity icon")
	public void user_clicks_on_the_Activity_icon() throws InterruptedException {
		inventorypage.clicks_on_the_Activity_icon();
	}

	@Then("User clicks on the Export icon")
	public void user_clicks_on_the_Export_icon() throws InterruptedException {
		inventorypage.clicks_on_the_Export_icon();
	}
	
	
	
	
	
	
	@Then("User clicks on the velumasala2020 outlet")
	public void user_clicks_on_the_velumasala2020_outlet() throws InterruptedException {
		inventorypage.clicks_on_the_velumasala2020_outlet();
	}

	@Then("User clicks on the Add SKU button")
	public void user_clicks_on_the_Add_SKU_button() throws InterruptedException {
		inventorypage.clicks_on_the_Add_SKU_button();
	}

	@Then("User select on the inventory list in dropdown field")
	public void user_select_on_the_inventory_list_in_dropdown_field() {
		WebElement velu = inventorypage.getDropDownElementInventorylist();
		Select select=new Select(velu);
		select.selectByIndex(2);
	}

	@Then("User clicks on the checkbox of pipers SKU")
	public void user_clicks_on_the_checkbox_of_pipers_SKU() throws InterruptedException {
		inventorypage.clicks_on_the_checkbox_of_pipers_SKU();
	}

	@Then("User clicks on the Done button")
	public void user_clicks_on_the_Done_button() throws InterruptedException {
		inventorypage.clicks_on_the_Done_button(); 
	}
	
	//RecordAdjustment
	@When("User is Select Reason second drodown value of missing")
	public void user_is_Select_Reason_second_drodown_value_of_missing() {
		WebElement missing = inventorypage.getDropDownElementInventoryReasonmissing();
		Select select=new Select(missing);
		select.selectByIndex(2);
	}

	@When("User is Select Reason thirdtime drodown value of Promotion")
	public void user_is_Select_Reason_thirdtime_drodown_value_of_Promotion() {
		WebElement promotion = inventorypage.getDropDownElementInventoryReasonpromotion();
		Select select=new Select(promotion);
		select.selectByIndex(1);
	}

	@When("User is Select Reason fourthtime drodown value of Transfer in")
	public void user_is_Select_Reason_fourthtime_drodown_value_of_Transfer_in() {
		WebElement transferin = inventorypage.getDropDownElementInventoryReasontransferin();
		Select select=new Select(transferin);
		select.selectByIndex(4);
	}

	@When("User is Select Reason fifthtime drodown value of Transfer out")
	public void user_is_Select_Reason_fifthtime_drodown_value_of_Transfer_out() {
		WebElement transferout = inventorypage.getDropDownElementInventoryReasontransferout();
		Select select=new Select(transferout);
		select.selectByIndex(5);
	}

	
	@Then("User are Clicks the vsla list")
	public void user_are_Clicks_the_vsla_list() {
		//inventorypage.Clickvslalist();   
	}

	@Then("User is Clicks in  outlet {string}")
	public void user_is_Clicks_in_outlet(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("User are Clicks the list\"sairam\"")
	public void user_are_Clicks_the_list_sairam() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}




	
}