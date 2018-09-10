package codersGuru;
import org.junit.*;

public class EnterEmailTest extends BaseTest {

     @Test
     public void emailTest(){
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePageObject homePageObject = new HomePageObject(driver);
        homePageObject.enterEmail("test@mail.pl");

        }
}
