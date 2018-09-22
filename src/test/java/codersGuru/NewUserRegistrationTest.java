package codersGuru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class NewUserRegistrationTest extends BaseTest {

    @Given("^I open coders guru website$")
    public void iOpenCodersGuruWebsite(){
        BaseTest.setUP();
        driver.get("https://men-men-s-01.codersguru.pl/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I go to registrations page$")
    public void iGoToRegistrationsPage(){
        RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);
        registrationPageObject.goToRegistrationPage();
    }

    @And("^I select private user$")
    public void iSelectPrivateUser(){
        RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);
        registrationPageObject.clickRegistrationType();
    }

    @And("^I enter email test@test.pl$")
    public void iEnterEmailTestTestPl(){
        RegistrationPageObject enterEmail = new RegistrationPageObject(driver);
        enterEmail.writeRegistartionEmail("test4@test.pl");
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1){
        RegistrationPageObject registrationPage = new RegistrationPageObject(driver);
        registrationPage.writeRegistrationFirstName(arg0);
        registrationPage.writeRegistrationLastName(arg1);
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String arg0){
        RegistrationPageObject registrationPage = new RegistrationPageObject(driver);
        registrationPage.writeFirstPassword(arg0);
        registrationPage.writeSecondPassword(arg0);
    }

    @And("^I provide address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iProvideAddress(String arg0, String arg1, String arg2, String arg3) {
        RegistrationPageObject registrationPage = new RegistrationPageObject(driver);
        registrationPage.writeCity(arg0);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        registrationPage.writePostCode(arg1);
        registrationPage.writeStreet(arg2);
        registrationPage.writeNumberAddress(arg3);
    }

    @And("^I check that I have read button$")
    public void iCheckThatIHaveReadButton(){
        RegistrationPageObject registrationPage = new RegistrationPageObject(driver);
        registrationPage.clickRegulationsCheckbox();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton(){
        RegistrationPageObject registrationPage = new RegistrationPageObject(driver);
        registrationPage.clickRegisterSubmit();

    }

    @Then("^User should be successfully created$")
    public void userShouldBeSuccessfullyCreated(){
        String Title = driver.getTitle();
        Assert.assertTrue(Title.contains("Coders"));
    }
}
