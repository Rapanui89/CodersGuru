package phpTravels.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static WebDriver driver;

    //konstruktor. Musi mieć nazwę tak jak główna klasa.
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}