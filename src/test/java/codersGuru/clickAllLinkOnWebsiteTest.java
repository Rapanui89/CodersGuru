package codersGuru;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

//dziedziczenie po klasie BaseTest
public class clickAllLinkOnWebsiteTest extends BaseTest {


    @Test
    public void clickAllElementsOnWebsite() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.allLinkClick();

    }

}
