package codersGuru;

import org.junit.*;

//dziedziczenie po klasie BaseTest
public class ClickAllLinkOnWebsiteTest extends BaseTest {


    @Test
    public void clickAllElementsOnWebsite() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePageObject homePageObject = new HomePageObject(driver);
        homePageObject.clicCodersLabLink();
        homePageObject.allLinkClick();
    }
}
