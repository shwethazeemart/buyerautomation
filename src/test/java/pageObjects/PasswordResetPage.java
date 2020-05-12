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
public class PasswordResetPage {
	private final WebDriver driver;

	public PasswordResetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email address']")
	private WebElement txtbx_emailaddress;

	@FindBy(xpath = "html[1]/body[1]/app-root[1]/app-validate-email[1]/zm-fullpagecontent[1]/zm-body[1]/div[1]")
	private WebElement btn_Sendreq;

	public void enter_EmailAddress(String email) {
		txtbx_emailaddress.clear();
		txtbx_emailaddress.sendKeys(email);

	}

	public void click_SendRequestBtn() {
		btn_Sendreq.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

}
