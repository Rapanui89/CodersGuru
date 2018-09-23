package codersGuru.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingCourseAndFindMentorPageObject extends BasePage {
    //Locatory
    @FindBy(xpath = "/html/body/section[3]/div/div[1]/div/p[1]")
    private WebElement selectCourseLocator;
    @FindBy(xpath = "/html/body/section[3]/div/div[1]/div/ul/li[8]")
    private WebElement selectGitLocator;
    @FindBy(xpath = "/html/body/section[3]/div/div[1]/input")
    private WebElement selectMentorLocator;

    public BookingCourseAndFindMentorPageObject(WebDriver driver) {
        super(driver);
    }

    public void selectCourseAndFindMentor(){
        selectCourseLocator.click();
        selectGitLocator.click();
        selectMentorLocator.click();


    }

}
