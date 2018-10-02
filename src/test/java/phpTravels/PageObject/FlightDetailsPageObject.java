package phpTravels.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class FlightDetailsPageObject extends BasePage {
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/div/ins")
    private WebElement roundTripCheckboxLocator;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[1]")
    private WebElement departureFromLocator;
    @FindBy(xpath = "/html/body/div[11]/div/input")
    private WebElement departureFromClickLocator;
    @FindBy(xpath = "/html/body/div[12]/div/input")
    private WebElement arrivalToLocator;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[2]")
    private WebElement departureTimeLocator;
    @FindBy(xpath = "")
    private WebElement departureTimeClickLocator;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[4]/div/input")
    private WebElement arrivalReturnLocator;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[6]/button")
    private WebElement submitButtonLocator;

    public FlightDetailsPageObject(WebDriver driver) {
        super(driver); }

        public void selectDepartureFrom(String from){
            roundTripCheckboxLocator.click();
            departureFromLocator.click();
            departureFromClickLocator.sendKeys(from);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            departureFromClickLocator.sendKeys(Keys.RETURN);
        }
}
