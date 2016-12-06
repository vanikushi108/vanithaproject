package pageObject;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.Driver;
import util.FluentWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class Login extends Driver {

    @FindBy(name = "UserName")
    private WebElement UserName;

    @FindBy(name = "Password")
    private WebElement Password;

    @FindBy(id = "submitButton")
    private WebElement SignIn;

    @FindBy(id = "search")
    private WebElement Search;

    @FindBy(css = ".navTabButtonUserInfoText.navTabButtonUserInfoWorker")
    private WebElement LoggedInUser;

    @FindBy(id = "filterCombo")
    private WebElement FilterDropDown;

    @FindBy(css = "#casetypecode_i")
    private WebElement CaseTypeDropDown;

    @FindBy(css = "#attribone")
    private WebElement ApplicationName;

    @FindBy(css = "#Cases_addImageButtonImage")
    private WebElement AddCasesImageButton;

    public Login() {
        PageFactory.initElements(webDriver, this);
    }

    public static void navigateToHomePage() {
        webDriver.get("https://cegtest.ceg.global/main.aspx");
    }

    public void enterUserName(String textUserName) {
        UserName = FluentWait.findElement(webDriver, UserName);
        UserName.sendKeys(textUserName);
    }

    public void enterPassword(String textPassword) {
        Password = FluentWait.findElement(webDriver, Password);
        Password.sendKeys(StringUtils.newStringUtf8(Base64.decodeBase64("U3Bvb3J0aGkjMTIz")));
    }

    public void clickSignIn() {
        SignIn = FluentWait.findElement(webDriver, SignIn);
        SignIn.click();
    }

    public String getLoggedInUser() throws InterruptedException {
        LoggedInUser = FluentWait.findElement(webDriver, LoggedInUser);
        return LoggedInUser.getText();
    }

    public void clickSearch(String SearchTerm) throws InterruptedException {
        Search = FluentWait.findElement(webDriver, Search);
        Search.sendKeys(SearchTerm);
        Search.sendKeys(Keys.ENTER);
    }

    public void selectFromFilterDropDown(String DropDownItem) throws InterruptedException {
        FilterDropDown = FluentWait.findElement(webDriver, FilterDropDown);
        Select dropdown = new Select(FilterDropDown);
        dropdown.selectByVisibleText(DropDownItem);
        Thread.sleep(20000);
    }

    public void selectFromCaseTypeDropDown(String DropDownItem) throws InterruptedException {
        Thread.sleep(20000);
        CaseTypeDropDown = FluentWait.findElement(webDriver, CaseTypeDropDown);
        Select dropdown = new Select(CaseTypeDropDown);
        dropdown.selectByVisibleText(DropDownItem);
        Thread.sleep(20000);
    }

    public void switchToIFrame(String FrameName) throws InterruptedException {
        webDriver.switchTo().frame(FrameName);
    }

    public void clickApplication()throws InterruptedException {
        ApplicationName = FluentWait.findElement(webDriver, ApplicationName);
        ApplicationName.click();
    }

    public void clickAddCasesImageButton() throws InterruptedException {
        Thread.sleep(20000);
        AddCasesImageButton = FluentWait.findElement(webDriver, AddCasesImageButton);
        AddCasesImageButton.click();
        Thread.sleep(20000);
    }
}

