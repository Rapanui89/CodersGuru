package codersGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObject extends BasePage {
    //lokatory
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
    //@FindBy(className = "registration__checkbox-container login-checkbox has-error")
    //private WebElement

    public RegistrationPageObject(WebDriver driver) {
        super(driver);
    }
}
