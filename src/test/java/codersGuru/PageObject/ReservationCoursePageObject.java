package codersGuru.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReservationCoursePageObject extends BasePage {
    @FindBy(xpath = "/html/body/main/div[2]/div/div[2]/div/div[2]/div[2]/button")
    private WebElement selectMentorLocator;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[2]")
    private WebElement selectCourseDateLocator;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div[2]/ul/li[2]")
    private WebElement selectCourseHoursLocator;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/textarea")
    private WebElement textBoxLocator;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a/button")
    private WebElement paymentLocator;

    public ReservationCoursePageObject(WebDriver driver) {
        super(driver);
    }

    public void selectMentor(){
        selectMentorLocator.click();
    }

    public void selectDateAndHoursCourse(){
        selectCourseDateLocator.click();
        selectCourseHoursLocator.click();
    }

    public void enterText(String text){
        textBoxLocator.sendKeys(text);
    }

    public void paymentForCourse(){
        paymentLocator.click();
    }
}
