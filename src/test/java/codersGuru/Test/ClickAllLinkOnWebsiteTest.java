package codersGuru.Test;

import codersGuru.PageObject.BasePage;
import org.junit.*;

//dziedziczenie po klasie BaseTest
public class ClickAllLinkOnWebsiteTest extends BaseTest {


    @Test
    public void clickAllElementsOnWebsite() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        BasePage.HomePageObject homePageObject = new BasePage.HomePageObject(driver);
        homePageObject.clicCodersLabLink();
        homePageObject.allLinkClick();
    }
}
