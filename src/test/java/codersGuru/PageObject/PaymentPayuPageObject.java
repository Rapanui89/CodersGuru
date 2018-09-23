package codersGuru.PageObject;

import codersGuru.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPayuPageObject extends BasePage {
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div[2]/article/div/div/div[1]/a[2]")
    private WebElement creditCardpaymentMethodLocator;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[1]/input")
    private WebElement creditCardNumberLocator;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[2]/div/div[1]/input")
    private WebElement creditCardDateOf;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[2]/div/div[2]/input")
    private WebElement cvvNumberLocator;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[3]/input")
    private WebElement firstNameAndLastNameLocator;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[4]/input")
    private WebElement emailLocator;
    @FindBy(xpath = "/html/body/div/div/div[2]/main/div[2]/article/div/form/div[5]/input")
    private WebElement paySubmitLocator;

    public PaymentPayuPageObject(WebDriver driver) {
        super(driver);
    }

    public void paymentCreditCard(){
        creditCardpaymentMethodLocator.click();
    }

    public void enterCreditCardInformation(String numberCard, String dateCard, String cvv, String name, String email ){
        creditCardNumberLocator.sendKeys(numberCard);
        creditCardDateOf.sendKeys(dateCard);
        cvvNumberLocator.sendKeys(cvv);
        firstNameAndLastNameLocator.sendKeys(name);
        emailLocator.sendKeys(email);
    }

    public void paymentForACourse(){
        paySubmitLocator.click();
    }

    public String readText(){
        WebElement readTextElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/article/div/form/div[1]/label/span"));
        String result = readTextElement.getText();
        return result;
    }
}
