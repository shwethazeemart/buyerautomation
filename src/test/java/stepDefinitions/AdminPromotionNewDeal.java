package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.AdminPromotionNewDealPage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminPromotionNewDeal {

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
     
	public AdminPromotionNewDeal(TestContext testContext) {
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
	}
	
	
	
	@Then("User click on New deal")
	public void user_click_on_New_deal() {
		AdminPromotionNewDealPage.ClickNewDeal();
	}

	@Then("User Select the Supplier in the dropdown list")
	public void user_Select_the_Supplier_in_the_dropdown_list() {
		WebElement supplier = AdminPromotionNewDealPage.getDropDownSupplierElement();
		Select select=new Select(supplier);
		select.selectByIndex(2);	
	}

	@Then("User Enter on the Title {string}")
	public void user_Enter_on_the_Title(String Title) {
		AdminPromotionNewDealPage.EntertheTitle(Title);
	}

	@Then("User Enter the Descripton {string}")
	public void user_Enter_the_Descripton(String Description) {
		AdminPromotionNewDealPage.EnterDescription(Description);
	}

	@Then("User Select the Carousel banner")
	public void user_Select_the_Carousel_banner() {
		//AdminPromotionNewDealPage.CarouselBannerClick();
	}

	@Then("User Click on the Drag and dropdown field")
	public void user_Click_on_the_Drag_and_dropdown_field() throws InterruptedException {
		AdminPromotionNewDealPage.ClickOnUploadfile();
	}

	@Then("User Save the Carousel banner")
	public void user_Save_the_Carousel_banner() {
		AdminPromotionNewDealPage.SavetheCarouselBanner();
	}

	@Then("User Select the Landing banner")
	public void user_Select_the_Landing_banner() {
		//AdminPromotionNewDealPage.ClickLandingBanner();
	}

	@Then("User Click on the Landing banner of Drag and dropdown field")
	public void user_Click_on_the_Landing_banner_of_Drag_and_dropdown_field() throws InterruptedException {
		AdminPromotionNewDealPage.ClickOnUploadLandingFile();
			}

	@Then("User Save the Landing banner")
	public void user_Save_the_Landing_banner() {
		AdminPromotionNewDealPage.SaveLandingBanner();
		}

	@Then("User select the Calendar From date of Validity field")
	public void user_select_the_Calendar_From_date_of_Validity_field() {
		AdminPromotionNewDealPage.SelectcalendarByJS(); 
	}

	@Then("User select the Calendar Until date of Validity field")
	public void user_select_the_Calendar_Until_date_of_Validity_field() throws InterruptedException {
		AdminPromotionNewDealPage.SelectcalendarByJSendDate(); 

	}

	@Then("User Enter the value of Minimum order field{string}")
	public void user_Enter_the_value_of_Minimum_order_field(String Minimumorder) throws InterruptedException {
		AdminPromotionNewDealPage.EnterValueOfMinimumOrder(Minimumorder);
	}

	@Then("User Click on radio button of Apply fee")
	public void user_Click_on_radio_button_of_Apply_fee() {
		AdminPromotionNewDealPage.Clickradiobutton();
	}

	@Then("User Enter the value of CutOff time{string}")
	public void user_Enter_the_value_of_CutOff_time(String CutOfftime) {
		AdminPromotionNewDealPage.CutOffTime(CutOfftime);
	}

	@Then("User click on Apply fee Dropdown")
	public void user_click_on_Apply_fee_Dropdown() {
		WebElement Applyfee = AdminPromotionNewDealPage.getDropDownApplyfeeElement();
		Select select=new Select(Applyfee);
		select.selectByIndex(1);	
	}

	@Then("User select the to all Orders")
	public void user_select_the_to_all_Orders() {
		//AdminPromotionNewDealPage.SelectToallOrders();
	}

	@Then("User click on Checkbox of Monday")
	public void user_click_on_Checkbox_of_Monday() {
		AdminPromotionNewDealPage.CheckboxMonday();
	}

	@Then("User Enter the CutOff time{string}")
	public void user_Enter_the_CutOff_time(String MondayCutOfftime) {
		AdminPromotionNewDealPage.EnterCutOfftime(MondayCutOfftime);
	}

	@Then("User Click on the Time field")
	public void user_Click_on_the_Time_field() {
		AdminPromotionNewDealPage.ClicktheTimeField();
	}

	@Then("User Click on Set button")
	public void user_Click_on_Set_button() {
		AdminPromotionNewDealPage.ClickSetButton();
	}

	@Then("User click on Checkbox of Wednesday")
	public void user_click_on_Checkbox_of_Wednesday() {
		AdminPromotionNewDealPage.WednesdayCheckbox();
	}

	@Then("User Enter the Wednesday CutOff time{string}")
	public void user_Enter_the_Wednesday_CutOff_time(String WedCutOfftime) {
		AdminPromotionNewDealPage.WednesdayCutOfftime(WedCutOfftime);
	}

	@Then("User Click on the Time field of Wednesday")
	public void user_Click_on_the_Time_field_of_Wednesday() {
		AdminPromotionNewDealPage.ClickTimeFieldWed();
	}

	@Then("User Click on Set button of Wednesday")
	public void user_Click_on_Set_button_of_Wednesday() {
		AdminPromotionNewDealPage.ClickWedSetBtn();
	}

	@Then("User click on Checkbox of Friday")
	public void user_click_on_Checkbox_of_Friday() {
		AdminPromotionNewDealPage.FridayCheckbox();
	}

	@Then("User Enter the Friday CutOff time{string}")
	public void user_Enter_the_Friday_CutOff_time(String FridayCutOfftime) {
		AdminPromotionNewDealPage.FridayCutOffTime(FridayCutOfftime);
	}

	@Then("User Click on the Time field of Friday")
	public void user_Click_on_the_Time_field_of_Friday() {
		AdminPromotionNewDealPage.FridayTimeField();
	}

	@Then("User Click on Set button of Friday")
	public void user_Click_on_Set_button_of_Friday() {
		AdminPromotionNewDealPage.FridaySetButton();
	}

	@Then("User Click on Radio button of All outlets")
	public void user_Click_on_Radio_button_of_All_outlets() {
		AdminPromotionNewDealPage.RadioBtnofAllOutlets();
	}

	@Then("User Enter the Email of By email field{string}")
	public void user_Enter_the_Email_of_By_email_field_shwetha_gmail_com(String Byemail) throws InterruptedException {
		AdminPromotionNewDealPage.EnterByemail(Byemail);
	}

	@Then("User Click the Next SKU")
	public void user_Click_the_Next_SKU() {
		AdminPromotionNewDealPage.ClicktheNextSku();
	}

	@Then("User click the Add SKU")
	public void user_click_the_Add_SKU() throws InterruptedException {
		AdminPromotionNewDealPage.ClickAddSKU();
	}

	@Then("User click the First checkbox")
	public void user_click_the_First_checkbox() {
		AdminPromotionNewDealPage.FirstCheckbox();
	}

	@Then("User click on the UOM options dropdown")
	public void user_click_on_the_UOM_options_dropdown() {
		AdminPromotionNewDealPage.ClickUOMOptions();
	}

	@Then("User Clear the Block option field")
	public void user_Clear_the_Block_option_field() {
		//AdminPromotionNewDealPage.ClearBlockField();
	}

	@Then("User Clear the Deal price option field")
	public void user_Clear_the_Deal_price_option_field() {
		AdminPromotionNewDealPage.ClearDealPriceOption();
	}

	@Then("User Enter the Deal price field{string}")
	public void user_Enter_the_Deal_price_field(String Dealprice) {
		AdminPromotionNewDealPage.DealPriceEnter(Dealprice);
	}

	@Then("User Enter the Original price field{string}")
	public void user_Enter_the_Original_price_field(String Originalprice) {
		AdminPromotionNewDealPage.OriginalPriceEnter(Originalprice);
	}

	@Then("User Clear the MOQ option field")
	public void user_Clear_the_MOQ_option_field() {
		AdminPromotionNewDealPage.ClearMOQOption();
	}

	@Then("User Enter the MOQ field{string}")
	public void user_Enter_the_MOQ_field(String MOQ) {
		AdminPromotionNewDealPage.MOQFieldEnter(MOQ);
	}

	@Then("User Enter the Shelf life{string}")
	public void user_Enter_the_Shelf_life(String Shelflife) throws InterruptedException {
		AdminPromotionNewDealPage.EnterShelfLife(Shelflife);
	}

	@Then("User click on the Save changes")
	public void user_click_on_the_Save_changes() {
		AdminPromotionNewDealPage.ClickSaveChanges();
	}

}