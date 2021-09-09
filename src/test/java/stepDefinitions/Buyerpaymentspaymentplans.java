package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerpaymentspaymentplanspage;
import pageObjects.Buyerpaymentstransactonspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyerpaymentspaymentplans {

	
	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    private Buyeroutletsviewsupplierspage buyeroutletsviewsuppliers;
    private Buyerpaymentstransactonspage buyerpaymentstransactons;
    private Buyerpaymentspaymentplanspage buyerpaymentspaymentplans;
    
    
    
	public Buyerpaymentspaymentplans(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		this.buyeroutletsviewsuppliers = testContext.getPageObjectManager().getBuyeroutletsviewsupplierspage();
		this.buyerpaymentstransactons = testContext.getPageObjectManager().getBuyerpaymentstransactonspage();
		this.buyerpaymentspaymentplans = testContext.getPageObjectManager().getBuyerpaymentspaymentplanspage();
		
	}
	
	@Then("User click on Payment plans icon")
	public void user_click_on_Payment_plans_icon() {
	    Buyerpaymentspaymentplanspage.Clickpaymentplansicon();
	}

	@Then("User select companies from dropdown list in payment plans")
	public void user_select_companies_from_dropdown_list_in_payment_plans() {
		WebElement TNWineShop = Buyerpaymentspaymentplanspage.getDropDownElementtnwineshop();
		Select select=new Select(TNWineShop);
		select.selectByIndex(5);
	}

	@Then("User selecct suppliers from dropdown list in payment plans")
	public void user_selecct_suppliers_from_dropdown_list_in_payment_plans() {
		WebElement MRFruits = Buyerpaymentspaymentplanspage.getDropDownElementmrfruits();
		Select select=new Select(MRFruits);
		select.selectByIndex(6);
	}

	@Then("User select payment status in unpaid")
	public void user_select_payment_status_in_unpaid() throws InterruptedException {
		Buyerpaymentspaymentplanspage.SelectpaymentstatusUnpaid(); 
	}
		/*WebElement paymentPlans = Buyerpaymentspaymentplanspage.getDropDownElementPaid();
		//Select select=new Select(Unpaid);
		//select.selectByIndex(2);
		//Buyerpaymentspaymentplanspage.Clickpaymentstatus();
		Select oSel = new Select(paymentPlans);
	       
		if(oSel.isMultiple()){
			
			oSel.selectByIndex(1); 
		}
	}*/

	@Then("User select payment status in failed")
	public void user_select_payment_status_in_failed() throws InterruptedException {
		Buyerpaymentspaymentplanspage.Selectpaymentstatusfailed();
		/*//WebElement Failed = Buyerpaymentspaymentplanspage.getDropDownElementFailed();
		//Select select=new Select(Failed);
		//select.selectByIndex(3);*/
	}

	@Then("User select payment status in paid")
	public void user_select_payment_status_in_paid() throws InterruptedException 
	{
		Buyerpaymentspaymentplanspage.Selectpaymentstatuspaid();
		/*WebElement Paid = Buyerpaymentspaymentplanspage.getDropDownElementFailed();
		//Select select=new Select(Paid);
		//select.selectByIndex(1);*/
	}

	@Then("User click on listed supplier in payment plans")
	public void user_click_on_listed_supplier_in_payment_plans() throws InterruptedException {
	    Buyerpaymentspaymentplanspage.Clickonlistedsupplier();
	}

	@Then("User click on payments back button in payment plans")
	public void user_click_on_payments_back_button_in_payment_plans() {
	  Buyerpaymentspaymentplanspage.Clickpaymentsbackbutton();
	}

	 
	
	
	
	
	
	
	
	
	
	
	

	
}
