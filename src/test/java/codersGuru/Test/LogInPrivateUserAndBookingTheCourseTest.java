package codersGuru.Test;

import codersGuru.PageObject.BookingCourseAndFindMentorPageObject;
import codersGuru.PageObject.LogInPrivateUserPageObject;
import codersGuru.PageObject.PaymentPayuPageObject;
import codersGuru.PageObject.ReservationCoursePageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static codersGuru.Test.BaseTest.driver;

public class LogInPrivateUserAndBookingTheCourseTest {

    @Given("^I open login coders guru website$")
    public void iOpenLoginCodersGuruWebsite(){
        BaseTest.setUP();
        driver.get("https://men-men-s-01.codersguru.pl/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I log in as \"([^\"]*)\" user and write password \"([^\"]*)\"$")
    public void iLogInAsUserAndWritePassword(String arg0, String arg1){
        LogInPrivateUserPageObject logInPrivateUserPageObject = new LogInPrivateUserPageObject(driver);
        logInPrivateUserPageObject.LoginAsUserWithPassword(arg0,arg1);
    }

    @And("^I pick from dropdown \"([^\"]*)\" and click find mentor$")
    public void iPickFromDropdownAndClickFindMentor(String arg0){
        BookingCourseAndFindMentorPageObject bookingCourseAndFindMentorPageObject = new BookingCourseAndFindMentorPageObject(driver);
        bookingCourseAndFindMentorPageObject.selectCourseAndFindMentor();
    }

    @And("^I pick mentor (\\d+) on the list$")
    public void iPickMentorOnTheList(int arg0){
        ReservationCoursePageObject reservationCoursePageObject = new ReservationCoursePageObject(driver);
        reservationCoursePageObject.selectMentor();
    }

    @And("^I enter problem description as \"([^\"]*)\"$")
    public void iEnterProblemDescriptionAs(String arg0){
        ReservationCoursePageObject reservationCoursePageObject = new ReservationCoursePageObject(driver);
        reservationCoursePageObject.enterText("Nie umiem GITa");
    }

    @And("^I pick first possible date and time and go to payment$")
    public void iPickFirstPossibleDateAndTimeAndGoToPayment(){
        ReservationCoursePageObject reservationCoursePageObject = new ReservationCoursePageObject(driver);
        reservationCoursePageObject.selectDateAndHoursCourse();
        reservationCoursePageObject.paymentForCourse();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^I pick creditcard payment$")
    public void iPickCreditcardPayment(){
        PaymentPayuPageObject paymentPayuPageObject = new PaymentPayuPageObject(driver);
        paymentPayuPageObject.paymentCreditCard();
    }

    @And("^I provide CC data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and I pay$")
    public void iProvideCCDataAsAndIPay(String arg0, String arg1, String arg2, String arg3, String arg4){
        PaymentPayuPageObject paymentPayuPageObject = new PaymentPayuPageObject(driver);
        paymentPayuPageObject.enterCreditCardInformation("1234 1234 1234 1234", "12/202", "123", "Jan Kowalski", "test9@test.pl");
        paymentPayuPageObject.paymentForACourse();
    }

    @Then("^payment should be rejected$")
    public void paymentShouldBeRejected(){
        PaymentPayuPageObject paymentPayuPageObject = new PaymentPayuPageObject(driver);
        String result = paymentPayuPageObject.readText();
        Assert.assertEquals("Invalid card number.",result);
    }


}
