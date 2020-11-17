package managers;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;
import pageObjects.PasswordResetPage;
import pageObjects.SucessfullyLoginpage;
import stepDefinitions.NewRecurringOrderspage;
import stepDefinitions.SucessfullyLoginPage;
import pageObjects.DashboardPage;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class PageObjectManager {
    private WebDriver driver;

    private LogInPage logInPage;
    private DashboardPage dashboardPage;
    
    private PasswordResetPage passwordResetPage;
    private OrdersPage ordersPage;
    private SucessfullyLoginpage sucessfullylogInpage;
    private NewRecurringOrderspage newrecurringorderspage;
    
    

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage getLogInPage() {
        return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage;
    }

    public PasswordResetPage getPasswordResetPage() {
       return (passwordResetPage == null) ? passwordResetPage = new PasswordResetPage(driver) : passwordResetPage;
    }

    public DashboardPage getDashboardPage() {
        return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
    }
    
    public OrdersPage getOrdersPage() {
        return (ordersPage == null) ? ordersPage = new OrdersPage(driver) : ordersPage;
    }
    public SucessfullyLoginpage getSucessfullyLoginPage() {
        return (sucessfullylogInpage == null) ? sucessfullylogInpage = new SucessfullyLoginpage(driver) : sucessfullylogInpage;
    }

	public NewRecurringOrderspage getNewRecurringOrderspage() {
		return (newrecurringorderspage == null) ? newrecurringorderspage = new NewRecurringOrderspage((TestContext) driver) : newrecurringorderspage;
	}


	

}
