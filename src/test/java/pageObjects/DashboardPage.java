package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class DashboardPage {
    private final WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "filterOrder")
    private WebElement txtbx_filterOrder;

    @FindBy(xpath = "//button[text()=' Search ']")
    private WebElement btn_search;

    public void enter_Search_OrderId(String searchText) {
        txtbx_filterOrder.sendKeys(searchText);
    }

    public void click_SearchBtn() {
        btn_search.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

}