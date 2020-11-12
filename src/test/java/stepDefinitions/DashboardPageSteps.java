package stepDefinitions;

import org.hamcrest.MatcherAssert;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
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

	@Given("User is on Dashboard Page")
	public void user_is_on_Dashboard_Page() {
		DashboardPage.navigateTo_DashboardPage();
	}

	/*@When("User enters on Dashboard page yellow colour highlighted")
	public void user_enters_on_Dashboard_page_yellow_colour_highlighted() {
		String yellowcolor = dashboardPage.getBackgroundColor();
		String pagetitle =yellowcolor ;
		System.out.println("Dashboard page colour on testing:" + pagetitle);
	}*/

	@When("User enters on Dashboard it display on {string}")
	public void user_enters_on_Dashboard_it_display_on(String string) {
		String Welcomeback = dashboardPage.getPageTitle();
		String pageTitle = Welcomeback, velu;
		System.out.println("Dashboard page welcome on testing:" + pageTitle);
	}

	// *@When("User routed to dashboard page {string}")
	// public void user_routed_to_dashboard_page(String dashBoardTitle) {

	// String pageTitle = testContext.getWebDriverManager().getDriver().getTitle();
	// System.out.println("current page title on testing:" + pageTitle);
	// System.out.println("Assertion url : " + dashBoardTitle);

	// MatcherAssert.assertThat("Should land on dashboard page",
	// dashBoardTitle.equals(pageTitle));
	// }//

}
