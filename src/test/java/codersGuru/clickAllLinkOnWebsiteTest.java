package codersGuru;

import org.junit.*;

//dziedziczenie po klasie BaseTest
public class clickAllLinkOnWebsiteTest extends BaseTest {


    @Test
    public void clickAllElementsOnWebsite() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.clicCodersLabLink();
        homePage.allLinkClick();


    }
}
