package phpTravels.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormDetailsPageObject extends BasePage {
    @FindBy(name = "firstname")
    private WebElement firstNameOnInvoice;
    @FindBy(name = "lastname")
    private WebElement lastNameOnInvoice;
    @FindBy(name = "email")
    private WebElement emailOnInvoice;
    @FindBy(name = "confirmemail")
    private WebElement emailConfimation;
    @FindBy(name = "phone")
    private WebElement phoneOnInvoice;
    @FindBy(name = "address")
    private WebElement addressOnInvoice;
    @FindBy (xpath="/html/body/div[4]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[6]/div[2]/div/a")
    private WebElement countryClickOnBox;
    @FindBy (xpath="/html/body/div[10]/div/input")
    private WebElement countryTextBox;
    @FindBy (name = "guest")
    private WebElement bookingSubmitLocator;

    public FormDetailsPageObject (WebDriver driver) {
        super(driver); }

        public void completeTheForm(String name, String lastName, String email, String contactNumber, String address, String country){
            firstNameOnInvoice.sendKeys(name);
            lastNameOnInvoice.sendKeys(lastName);
            emailOnInvoice.sendKeys(email);
            emailConfimation.sendKeys(email);
            phoneOnInvoice.sendKeys(contactNumber);
            addressOnInvoice.sendKeys(address);
            countryClickOnBox.click();
            countryTextBox.sendKeys(country);
            countryTextBox.sendKeys(Keys.RETURN);
            bookingSubmitLocator.click();
        }


}

