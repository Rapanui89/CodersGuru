package codersGuru.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPrivateUserPageObject extends BasePage {
    //Lokatory
    @FindBy(id = "username")
    private WebElement registerLocator;
    @FindBy(id = "password")
    private WebElement passwordLocator;
    @FindBy(id = "_submit")
    private WebElement submitButtonLocator;

    public LogInPrivateUserPageObject(WebDriver driver) {
        super(driver);
    }

    public void LoginAsUserWithPassword (String user, String password){
        registerLocator.sendKeys(user);
        passwordLocator.sendKeys(password);
        submitButtonLocator.click();
    }

}
