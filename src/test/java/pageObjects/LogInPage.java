package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class LogInPage {
    private final WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "loginEmail")
    private WebElement txtbx_loginEmail;

    @FindBy(how = How.NAME, using = "loginPassword")
    private WebElement txtbx_loginPassword;

    @FindBy(xpath = "//div[@class='form-group']//button[text()='Log in']")
    private WebElement btn_loginEmail;

    public void navigateTo_LogInPage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void enter_LoginEmail(String loginEmail) {
        txtbx_loginEmail.sendKeys(loginEmail);
    }

    public void enter_LoginPassword(String loginPassword) {
        txtbx_loginPassword.sendKeys(loginPassword);
    }

    public void click_LoginBtn() {
        btn_loginEmail.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

}