package codersGuru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserRegistrationTest extends BaseTest {
    @Given("^I open coders guru website$")
    public void iOpenCodersGuruWebsite() throws Throwable {
        driver.get("https://men-men-s-01.codersguru.pl/");
    }

    @When("^I go to registrations page$")
    public void iGoToRegistrationsPage() throws Throwable {
        HomePageObject homePageObject = new HomePageObject(driver);
        homePageObject.goToRegistrationPage();
    }

    @And("^I select private user$")
    public void iSelectPrivateUser() throws Throwable {

    }

    @And("^I enter email test@test.pl$")
    public void iEnterEmailTestTestPl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I provide address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iProvideAddress(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I check that I have read button$")
    public void iCheckThatIHaveReadButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User should be successfully created$")
    public void userShouldBeSuccessfullyCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
