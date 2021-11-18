package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierAddNewSku {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private SupplierCustomerCompanyPage supplierCustomerCompany;
	private SupplierCatalogueListPage supplierCatalogueList;
	private SupplierAddNewSkuPage supplierAddNewSku;

	public SupplierAddNewSku(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
		this.supplierCatalogueList=testContext.getPageObjectManager().getSupplierCatalogueListPage();
		this.supplierAddNewSku=testContext.getPageObjectManager().getSupplierAddNewSkuPage();
	}

	
	

	
	@Then("User enter sku name in catalogue{string}")
	public void user_enter_sku_name_in_catalogue_pipers(String skuname) {
	    SupplierAddNewSkuPage.SkuNameEnter(skuname);
	}

	@Then("User click on brand field")
	public void user_click_on_brand_field() {
	    SupplierAddNewSkuPage.BrandFieldClick();
	}

	@Then("User click on brand options filed")
	public void user_click_on_brand_options_filed() {
	   SupplierAddNewSkuPage.BarndOptionsClick();
	}

	@Then("User enter suppliers product code{string}")
	public void user_enter_suppliers_product_code(String productcode) {
	    SupplierAddNewSkuPage.ProductCodeEnter(productcode);
	}

	@Then("User select category in dropdown field")
	public void user_select_category_in_dropdown_field() {
		WebElement AlcoholandLiquor =supplierAddNewSku.getDropDownElementCategory();
		Select select=new Select(AlcoholandLiquor);
		select.selectByVisibleText("Alcohol and Liquor");
	}

	@Then("User select sub category one in dropdown field")
	public void user_select_sub_category_one_in_dropdown_field() {
		WebElement Beer =supplierAddNewSku.getDropDownElementSubCategory();
		Select select=new Select(Beer);
		select.selectByVisibleText("Beer");
	}

	@Then("User select sub category two in dropdown field")
	public void user_select_sub_category_two_in_dropdown_field() {
		WebElement Lager =supplierAddNewSku.getDropDownElementSubCategoryTwo();
		Select select=new Select(Lager);
		select.selectByVisibleText("Lager");
	}

	@Then("User Upload photo in browse field")
	public void user_Upload_photo_in_browse_field() throws InterruptedException {
	    SupplierAddNewSkuPage.PhotoUploadClick();
	}

	@Then("User click on add unit size button")
	public void user_click_on_add_unit_size_button() throws InterruptedException {
	    SupplierAddNewSkuPage.AddUnitSizeClick();
	}

	@Then("User select order unit size in dropdown filed")
	public void user_select_order_unit_size_in_dropdown_filed() {
		WebElement Block =supplierAddNewSku.getDropDownElementOrderunitsize();
		Select select=new Select(Block);
		select.selectByVisibleText("Block");
	}

	@Then("User clear base unit size")
	public void user_clear_base_unit_size() {
	    SupplierAddNewSkuPage.BaseUnitSizeClear();
	}

	@Then("User enter value in base unit size{string}")
	public void user_enter_value_in_base_unit_size(String unitsize) {
	    SupplierAddNewSkuPage.BaseUnitSizeEnter(unitsize);
	}

	@Then("User select order unit size one in dropdown filed")
	public void user_select_order_unit_size_one_in_dropdown_filed() {
		WebElement Bottle =supplierAddNewSku.getDropDownElementOneOrderunitsize();
		Select select=new Select(Bottle);
		select.selectByVisibleText("Bottle");

	}

	@Then("User select order unit size two in dropdown filed")
	public void user_select_order_unit_size_two_in_dropdown_filed() {
		WebElement Box =supplierAddNewSku.getDropDownElementTwoOrderunitsize();
		Select select=new Select(Box);
		select.selectByVisibleText("Box");
	}

	@Then("User click on optonal add more details field")
	public void user_click_on_optonal_add_more_details_field() throws InterruptedException {
	    SupplierAddNewSkuPage.OptionalMoreDetailsClick();
	}

	@Then("User click on description field")
	public void user_click_on_description_field() throws InterruptedException {
	    //SupplierAddNewSkuPage.DescriptionClick();
	}

	@Then("User enter description in that field{string}")
	public void user_enter_description_in_that_field_This_is_a_Beer_company(String description) {
	   // SupplierAddNewSkuPage.DescriptionEnter(description);
	}

	@Then("User click on halal checkbox")
	public void user_click_on_halal_checkbox() throws InterruptedException {
	    //SupplierAddNewSkuPage.HalalCheckboxClick();
	}

	@Then("User click on vegetarian checkbox")
	public void user_click_on_vegetarian_checkbox() {
	    //SupplierAddNewSkuPage.VegetarianCheckboxClick(); 
	}

	@Then("User select condition in drodown field")
	public void user_select_condition_in_drodown_field() {
		//WebElement Chilled =supplierAddNewSku.getDropDownElementCondition();
		//Select select=new Select(Chilled);
		//select.selectByVisibleText("Chilled");
	}

	@Then("User enter value shelf life field{string}")
	public void user_enter_value_shelf_life_field(String shelflife) {
	    //SupplierAddNewSkuPage.ShelfLifeEnter(shelflife);
	}

	@Then("User select days in dropdown field") 
	public void user_select_days_in_dropdown_field() {
		//WebElement days =supplierAddNewSku.getDropDownElementDays();
		//Select select=new Select(days);
		//select.selectByVisibleText("days");
	}

	@Then("User select country of origin in dropdown field")
	public void user_select_country_of_origin_in_dropdown_field() {
		//WebElement Singapore =supplierAddNewSku.getDropDownElementCountryOrigin();
		//Select select=new Select(Singapore);
		//select.selectByVisibleText("Singapore");
	}

	@Then("User enter upc number in the upc field{string}")
	public void user_enter_upc_number_in_the_upc_field_ZEE123(String upcnumber) {
	    //SupplierAddNewSkuPage.UPCNumberEnter(upcnumber);
	}

	@Then("User click on done and list in catalogue")
	public void user_click_on_done_and_list_in_catalogue() {
	    //SupplierAddNewSkuPage.DoneandListButtonClick();
	}

	
	@Then("User clear base unit size one")
	public void user_clear_base_unit_size_one() {
	    SupplierAddNewSkuPage.BaseUnitSizeOneClear();
	}

	@Then("User enter value in base unit size one{string}")
	public void user_enter_value_in_base_unit_size_one(String unitsize) {
	    SupplierAddNewSkuPage.BaseUnitSizeOneEnter(unitsize);
	}

	@Then("User clear base unit size two")
	public void user_clear_base_unit_size_two() {
	    SupplierAddNewSkuPage.BaseUnitSizeTwoClear();
	}

	@Then("User enter value in base unit size two{string}")
	public void user_enter_value_in_base_unit_size_two(String unitsize) {
	    SupplierAddNewSkuPage.BaseUnitSizeTwoEnter(unitsize);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
