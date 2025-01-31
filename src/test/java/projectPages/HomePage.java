package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class HomePage extends BasePage{
    @FindBy (xpath = "//button[@type='button']")
    private WebElement acceptCookies;

    @FindBy (id = "det_img_447842944")
    private WebElement homePageButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies(){
        elementsHelper.clickElement(acceptCookies);
    }

    public void goToTheHomePage() {
        elementsHelper.waitForElement(homePageButton);
        elementsHelper.clickElement(homePageButton);
    }

    @Override
   public void isPageLoaded() {

    }
}
