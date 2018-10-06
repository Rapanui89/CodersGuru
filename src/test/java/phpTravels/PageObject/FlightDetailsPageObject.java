package phpTravels.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightDetailsPageObject extends BasePage {

    @FindBy (id = "s2id_location_from")
    private WebElement fromCityClickOnBox;
    @FindBy (xpath = "/html/body/div[11]/div/input")
    private WebElement fromCityTextBox;
    @FindBy (id = "s2id_location_to")
    private WebElement toCityClickOnBox;
    @FindBy (xpath = "/html/body/div[12]/div/input")
    private WebElement toCityTextBox;
    @FindBy (name="departure")
    private WebElement fromDateTextBox;
    @FindBy (name="arrival")
    private WebElement toDateTextBox;
    @FindBy (xpath = "//*[@id=\"body-section\"]/div[2]/div/form/div[6]/button")
    private WebElement submitButton;
    @FindBy (xpath = "/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/div/ins")
    private WebElement roundTripLocator;
    @FindBy (id = "bookbtn")
    private List<WebElement> selectFlightsLocator;

    public FlightDetailsPageObject(WebDriver driver) {
        super(driver); }

        public void selectCheckboxTypeOfFlight(){
            roundTripLocator.click();
        }

        public void selectDepartureFrom(String from){
            fromCityClickOnBox.click();
            fromCityTextBox.click();
            fromCityTextBox.sendKeys(from);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fromCityTextBox.sendKeys(Keys.RETURN);
        }

        public void selectDepartureTo (String to){
            toCityClickOnBox.click();
            toCityTextBox.sendKeys(to);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toCityTextBox.sendKeys(Keys.RETURN);
        }

        public void selectFromDate (String fromDate){
            fromDateTextBox.click();
            fromDateTextBox.sendKeys(fromDate);
            fromDateTextBox.sendKeys(Keys.RETURN);
        }

        public void selectToDate (String toDate){
            toDateTextBox.click();
            toDateTextBox.sendKeys(toDate);
            toDateTextBox.sendKeys(Keys.RETURN);
            submitButton.click();

        }

        public void selectFlights (int number){
            selectFlightsLocator.get(number).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


}
