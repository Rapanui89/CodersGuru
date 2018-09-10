package codersGuru;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    //Before class odwołuje się do tylko tej klasy. Inicjalizuje naszego drivera
    @BeforeClass
    public static void setUP() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //usuwa wszystkie ciasteczka
    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }
    //zamyka przeglądarke
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
