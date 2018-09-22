package codersGuru;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObject extends BasePage {
    //lokatory
    @FindBy(xpath = "/html/body/section[3]/div/form/input[2]")
    private WebElement goToRegistrationPageLocator;
    @FindBy(id = "person")
    private WebElement registrationTypeLocator;
    @FindBy(id = "fos_user_registration_form_email")
    private WebElement registrationEmailLocator;
    @FindBy(id = "fos_user_registration_form_name")
    private WebElement nameLocator;
    @FindBy(id = "fos_user_registration_form_lastname")
    private WebElement surnameLocator;
    @FindBy(id = "fos_user_registration_form_plainPassword_first")
    private WebElement firstpasswordLocator;
    @FindBy(id = "fos_user_registration_form_plainPassword_second")
    private WebElement secondpasswordLocator;
    @FindBy(id = "form_city")
    private WebElement cityLocator;
    @FindBy(id = "form_postal_code")
    private WebElement postCodeLocator;
    @FindBy(id = "form_street")
    private WebElement streetLocator;
    @FindBy(id = "form_number")
    private WebElement numberLocator;
    @FindBy(xpath = "/html/body/div/div/div/form/div[12]/input")
    private WebElement regulationsCheckboxLokator;
    @FindBy(id = "register-submit-btn")
    private WebElement registerSubmitLocator;
    @FindBy (id = "company")
    private WebElement companyRegistrationTypeLocator;
    @FindBy (id = "fos_user_registration_form_company_name")
    private WebElement companyNameLocator;
    @FindBy (id = "fos_user_registration_form_nip")
    private WebElement companyRegistratioTaxLocator;

    public RegistrationPageObject(WebDriver driver) {
        super(driver);
    }

    public void goToRegistrationPage() {
        goToRegistrationPageLocator.click();
    }

    public void clickRegistrationType() {
        registrationTypeLocator.click();
    }
    public void companyRegistrationType (){
        companyRegistrationTypeLocator.click();
    }

    public void writeRegistartionEmail(String email){
        this.registrationEmailLocator.clear();
        this.registrationEmailLocator.sendKeys(email);
    }

    public void writeRegistrationFirstName (String firsName){
        this.nameLocator.clear();
        this.nameLocator.sendKeys(firsName);
    }

    public void writeRegistrationLastName (String lastName){
        this.surnameLocator.clear();
        this.surnameLocator.sendKeys(lastName);
    }

    public void writeFirstPassword (String firstPassword){
        this.firstpasswordLocator.clear();
        this.firstpasswordLocator.sendKeys(firstPassword);
    }

    public void writeSecondPassword (String secondPassword) {
        this.secondpasswordLocator.clear();
        this.secondpasswordLocator.sendKeys(secondPassword);
    }

    public void writeCity (String city){
        this.cityLocator.clear();
        this.cityLocator.sendKeys(city);
    }

    public void writePostCode (String postCode){
        this.postCodeLocator.clear();
        this.postCodeLocator.sendKeys(postCode);
    }

    public void writeStreet (String street){
        this.streetLocator.clear();
        this.streetLocator.sendKeys(street);
    }

    public void writeStreetAddress (String streetAddress){
        this.streetLocator.clear();
        this.streetLocator.sendKeys(streetAddress);
    }

    public void writeNumberAddress (String numberAddress){
        this.numberLocator.clear();
        this.numberLocator.sendKeys(numberAddress);
    }

    public void companyName (String companyName){
        this.companyNameLocator.clear();
        this.companyNameLocator.sendKeys(companyName);
    }

    public void companyTaxNumber (String taxNumber){
        this.companyRegistratioTaxLocator.clear();
        this.companyRegistratioTaxLocator.sendKeys(taxNumber);
    }


    public void clickRegulationsCheckbox(){
        regulationsCheckboxLokator.click();
    }

    public void clickRegisterSubmit(){
        registerSubmitLocator.click();
    }

    public String readUser(){
        WebElement readUserElement = driver.findElement(By.id("user-name"));
        String result = readUserElement.getText();
        return result;


    }
}
