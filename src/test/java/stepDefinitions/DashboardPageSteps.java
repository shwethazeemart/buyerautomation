package stepDefinitions;

import org.hamcrest.MatcherAssert;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class DashboardPageSteps {

    private TestContext testContext;
    private DashboardPage dashboardPage;

    public DashboardPageSteps(TestContext testContext) {
        super();
        this.testContext = testContext;
        this.dashboardPage = testContext.getPageObjectManager().getDashboardPage();
    }

    @When("User routed to dashboard page {string}")
    public void user_routed_to_dashboard_page(String dashBoardTitle) {

        String pageTitle = testContext.getWebDriverManager().getDriver().getTitle();
        System.out.println("current page title on testing:" + pageTitle);
        System.out.println("Assertion url : " + dashBoardTitle);

        MatcherAssert.assertThat("Should land on dashboard page", dashBoardTitle.equals(pageTitle));
    }

}
