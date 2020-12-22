package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class InvoicespageSteps {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private DashboardPage dashboradpage;

	public InvoicespageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = testContext.getPageObjectManager().getLogInPage();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();

	}
	

	
	@Then("User Clicks on Invoices in the side navigation menubar")
	public void user_Clicks_Orders_in_the_side_navigation_menubar() throws InterruptedException {
		//dashboradpage.clickInvoices();
	}

	@Given("User is Clicks in Uploads")
	public void user_is_Clicks_in_Uploads() throws InterruptedException {
		InvoicesPage.click_Uploads();
	}

	@Then("User is Clicks in Upload invoice")
	public void user_is_Clicks_in_Upload_invoice() {
		InvoicesPage.click_Uploadinvoice(); 
	}

	@And("User is Clicks on select outlet")
	public void user_is_Clicks_on_select_outlet() {
		InvoicesPage.click_selectoutlet(); 
	}

	@Then("User is Clicks on upload the image")
	public void user_is_Clicks_on_upload_the_image() {
		//WebElement uploadBox=InvoicesPage.Uploadimage();
		InvoicesPage.Clicks_on_upload_the_image();
	}

	@And("User is Clicks on Upload button")
	public void user_is_Clicks_on_Upload_button() { 
		InvoicesPage.click_Uploadbutton();
	}

	@Then("It should display the particular image number and process button")
	public void it_should_display_the_particular_image_number_and_process_button() {
		String displayinvoice =InvoicesPage.getPageTitle();
		String pageTitle = displayinvoice;
		System.out.println("page title: " + pageTitle);
}
}
