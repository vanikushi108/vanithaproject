package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.Login;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class LoginStepDefinitions {

    Login loginPage = new Login();

    @Given("^I am on the Connect home page$")
    public void navigateToHomePage() throws Throwable {
        loginPage.navigateToHomePage();
    }

    @And("^I enter user name as \"([^\"]*)\"$")
    public void iEnterUserName(String user) throws Throwable {
        loginPage.enterUserName(user);
    }

    @And("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        loginPage.enterPassword(password);
    }

    @And("^I click on signIn$")
    public void iClickOnSignIn() throws Throwable {
        loginPage.clickSignIn();
    }

    @Then("^I should see logged in user as \"([^\"]*)\"$")
    public void iShouldSeeLoggedinUserAs(String expectedValue) throws Throwable {

        assertThat(loginPage.getLoggedInUser(), equalTo(expectedValue));
    }

    @And("^I search for term \"([^\"]*)\"$")
    public void iSearchForTerm(String searchTerm) throws InterruptedException {
        loginPage.clickSearch(searchTerm);
    }

    @And("^I switch to iFrame \"([^\"]*)\"$")
    public void iSwitchToIFrame(String FrameName) throws Throwable {
        loginPage.switchToIFrame(FrameName);
    }

    @And("^I select \"([^\"]*)\" under Filter drop down$")
    public void iSelectApplicationUnderFilterDropDown(String DropDownItem) throws InterruptedException {
        loginPage.selectFromFilterDropDown(DropDownItem);
    }

    @When("^I click on Application \"([^\"]*)\"$")
    public void iClickOnApplication(String arg0) throws Throwable {
        loginPage.clickApplication();
    }

    @When("^I click on AddCasesImageButton$")
    public void iClickOnAddCasesImageButton() throws Throwable {
        loginPage.clickAddCasesImageButton();
    }

    @And("^I select \"([^\"]*)\" under Case Type drop down$")
    public void iSelectUnderCaseTypeDropDown(String DropDownItem) throws Throwable {
        loginPage.selectFromCaseTypeDropDown(DropDownItem);
    }
}
