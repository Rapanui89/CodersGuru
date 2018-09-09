package codersGuru;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class EnterEmailTest extends BaseTest {

     @Test
     public void emailTest(){
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.enterEmail("test@mail.pl");

        }

}
