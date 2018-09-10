package codersGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    //konstruktor. Musi mieć nazwę tak jak główna klasa.
    public BasePage (WebDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
