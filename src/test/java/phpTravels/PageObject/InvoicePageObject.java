package phpTravels.PageObject;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InvoicePageObject extends BasePage {
    @FindBy (id = "125")
    private WebElement payOnArrivalButtonLocator;

    public InvoicePageObject (WebDriver driver) {
        super(driver); }

        public void takeScreenshot(){
        //Obiekt który tworzy na bazie bieżącego czasu tworzy Stringa z formatowanym czasem
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(payOnArrivalButtonLocator));

            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(srcFile, new File("C:\\Users\\pawel.kwiatkowski\\Desktop\\screenshot_testy_automatyczne\\" + timeStamp + "-invoice.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
