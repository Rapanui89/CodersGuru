package phpTravels.Tests;

import codersGuru.Test.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import phpTravels.PageObject.FlightDetailsPageObject;
import phpTravels.PageObject.FormDetailsPageObject;

import java.util.concurrent.TimeUnit;



public class BookingFlightTest extends FirefoxTest {
    @Given("^I'm on phptravels website$")
    public void iMOnPhptravelsWebsite(){
        FirefoxTest.setUP();
        driver.get("https://www.phptravels.net/flights");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^I reserve two way flights from \"([^\"]*)\" to \"([^\"]*)\" on date \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iReserveTwoWayFlightsFromToOnDateAnd(String arg0, String arg1, String arg2, String arg3) {
        FlightDetailsPageObject flightDetailsPageObject = new FlightDetailsPageObject(driver);
        flightDetailsPageObject.selectDepartureFrom(arg0);
        flightDetailsPageObject.selectDepartureTo(arg1);
        flightDetailsPageObject.selectCheckboxTypeOfFlight();
        flightDetailsPageObject.selectFromDate(arg2);
        flightDetailsPageObject.selectToDate(arg3);
    }

    @And("^I pick available flight (\\d+)$")
    public void iPickAvailableFlight(int arg0){
        FlightDetailsPageObject flightDetailsPageObject = new FlightDetailsPageObject(driver);
        flightDetailsPageObject.selectFlights(arg0);
    }

    @And("^I book as a guest wight \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iBookAsAGuestWight(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        FormDetailsPageObject formDetailsPageObject = new FormDetailsPageObject(driver);
        formDetailsPageObject.completeTheForm(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Then("^I should see prepared invoice$")
    public void iShouldSeePreparedInvoice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
