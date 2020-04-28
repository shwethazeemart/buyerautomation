package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class PageObjectManager {
    private WebDriver driver;

    private LogInPage logInPage;
    private OrdersPage ordersPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage getLogInPage() {
        return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage;
    }

    public OrdersPage getOrdersPage() {
        return (ordersPage == null) ? ordersPage = new OrdersPage(driver) : ordersPage;
    }
}
