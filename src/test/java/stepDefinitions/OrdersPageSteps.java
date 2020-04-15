package stepDefinitions;

import org.hamcrest.MatcherAssert;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import pageObjects.OrdersPage;

public class OrdersPageSteps {

    private TestContext testContext;
    private OrdersPage ordersPage;

    public OrdersPageSteps(TestContext testContext) {
        super();
        this.testContext = testContext;
        this.ordersPage = testContext.getPageObjectManager().getOrdersPage();
    }

    @When("User routed to orders page {string}")
    public void user_routed_to_orders_page(String orderPageUrl) {

        String currentURl = testContext.getWebDriverManager().getDriver().getCurrentUrl();
        System.out.println("current URL on testing:" + currentURl);
        System.out.println("Assertion url : " + orderPageUrl);

        MatcherAssert.assertThat("Should land on orders page", orderPageUrl.equals(currentURl));
    }

    @When("User searches for orderId {string}")
    public void user_searches_for_orderId(String searchText) {
        ordersPage.enter_Search_OrderId(searchText);

        ordersPage.click_SearchBtn();
    }
}
