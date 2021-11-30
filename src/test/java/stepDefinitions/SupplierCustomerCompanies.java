package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.Suppliercustomerlocationlistingpage;

public class SupplierCustomerCompanies {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private Object logInPage;
	private LogInPage loginPage3;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private SupplierCustomerCompanyPage supplierCustomerCompany;


	public SupplierCustomerCompanies(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierCustomerCompany=testContext.getPageObjectManager().getSupplierCustomerCompanyPage();
	}

 


	@Then("User click on companies icon")
	public void user_click_on_companies_icon() {
		SupplierCustomerCompanyPage.CompaniesIconClick();
	}


	@Then("User click on new customer")
	public void user_click_on_new_customer() {
		SupplierCustomerCompanyPage.NewCustomerClick();
	}
	@Then("User enter company registration number in textbox{string}")
	public void user_enter_company_registration_number_in_textbox_UEN(String UENNumber) {
		SupplierCustomerCompanyPage.CompanyNumberEnter(UENNumber);
	}
	@Then("User click on continue button")
	public void user_click_on_continue_button() {
		SupplierCustomerCompanyPage.ContinuButtonClick();
	}
	@Then("User enter the company name in textbox{string}")
	public void user_enter_the_company_name_in_textbox_sabarimasala(String CompanyName) {
		SupplierCustomerCompanyPage.CompanyNameEnter(CompanyName);
	}
	@Then("User select country in dropdown list")
	public void user_select_country_in_dropdown_list() {
		WebElement Singapore =supplierCustomerCompany.getDropDownElementCountry();
		Select select=new Select(Singapore);
		select.selectByVisibleText("Singapore");
	}
	@Then("User enter on postcode in textbox{string}")
	public void user_enter_on_postcode_in_textbox(String PostCode) {
		SupplierCustomerCompanyPage.PostCodeEnter(PostCode);
	}
	@Then("User enter on address line one in textbox{string}")
	public void user_enter_on_address_line_one_in_textbox_Murugan_temple_street(String AddressLineOne) {
		SupplierCustomerCompanyPage.AddressLineOneEnter(AddressLineOne);
	}
	@Then("User enter on address line two in textbox{string}")
	public void user_enter_on_address_line_two_in_textbox_Singapore(String AddressLineTwo) {
		SupplierCustomerCompanyPage.AddressLineTwoEnter(AddressLineTwo);
	}
	@Then("User enter on company email in textbox{string}")
	public void user_enter_on_company_email_in_textbox_velusai2032_gmail_com(String CompanyEmail) {
		SupplierCustomerCompanyPage.CompanyEmailEnter(CompanyEmail);
	}
	@Then("User click on checkbox in same company address")
	public void user_click_on_checkbox_in_same_company_address() {
		SupplierCustomerCompanyPage.CheckboxClick();
	}
	@Then("User click on save button in company page")
	public void user_click_on_save_button_in_company_page() {
		SupplierCustomerCompanyPage.SaveButtonClick();
	}



}
