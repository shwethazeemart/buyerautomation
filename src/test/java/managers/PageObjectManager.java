package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import pageObjects.DashboardPage;

public class PageObjectManager {
    private WebDriver driver;

    private LogInPage logInPage;
    private DashboardPage dashboardPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage getLogInPage() {
        return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage;
    }

    public DashboardPage getDashboardPage() {
        return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
    }
}
