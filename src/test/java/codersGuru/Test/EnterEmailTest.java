package codersGuru.Test;
import codersGuru.PageObject.BasePage;
import org.junit.*;

public class EnterEmailTest extends BaseTest {

     @Test
     public void emailTest(){
        driver.get("https://men-men-s-01.codersguru.pl/");
        BasePage.HomePageObject homePageObject = new BasePage.HomePageObject(driver);
        homePageObject.enterEmail("test@mail.pl");

        }
}
