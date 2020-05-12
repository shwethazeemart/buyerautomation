package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import pageObjects.PasswordResetPage;
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

}
