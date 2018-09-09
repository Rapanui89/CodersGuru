package codersGuru;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

//zaciągamy wszystko z BasePage
public class HomePage extends BasePage {

    //lokatory
    @FindBy(name="email")
    private WebElement emailTexBox;
    @FindBy (xpath = "/html/body/section[1]/div/div[1]/a/img")
    private WebElement homePageLink;
    @FindBy (xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[1]/a" )
    private WebElement howItsWorkingLink;
    @FindBy (xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[2]/a")
    private WebElement priceListLink;
    @FindBy (xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[3]/a")
    private WebElement becomeaMentorLink;
    @FindBy (name="button")
    private WebElement LogInButtonLink;
    @FindBy (xpath = "/html/body/section[3]/div/form/input[2]")
    private WebElement createAnAccountLink;
    @FindBy (xpath = "/html/body/footer/div/div[1]/a[1]")
    private WebElement regulationsLink;
    @FindBy (xpath = "/html/body/footer/div/div[1]/a[2]")
    private WebElement howItWorksLink;
    @FindBy (xpath = "/html/body/footer/div/div[2]/a/img")
    private WebElement facebookLink;
    @FindBy (xpath = "/html/body/footer/div/legal/a")
    private WebElement coderslabLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //metody do page object
    public void enterEmail(String email) {
        this.emailTexBox.clear();
        this.emailTexBox.sendKeys(email);
    }
    // Tworzymy tablicę nowych webelementów po których będziemy klikać
    public void allLinkClick () {
        WebElement[] linkList = new WebElement[]{
                emailTexBox,
                homePageLink,
                howItsWorkingLink,
                priceListLink,
                LogInButtonLink,
                createAnAccountLink,
                regulationsLink,
                howItWorksLink,
                facebookLink};
        for (WebElement item : linkList) {
            item.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().back();
            String Tittle = driver.getTitle();
            Assert.assertTrue(Tittle.contains("Coders"));
            Assert.assertFalse(Tittle.contains("Error"));
        }
    }
        //zamykanie strony coderslab
        public void clicCodersLabLink(){
            //złap uchwyt do aktualnego okna
            String parentHandle = driver.getWindowHandle();
            //kliknij na coderslablink i otwórz nowe okno
            coderslabLink.click();

            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            //przeswitchuj się do otwartego okna
        for (String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        //sprawdź asercje
        Assert.assertTrue(driver.getTitle().contains("Coders"));
        //Zamknij okno
        driver.close();
        //wróc do poprzedniego okna
        driver.switchTo().window(parentHandle);
        }
    }

