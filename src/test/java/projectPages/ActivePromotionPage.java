package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class ActivePromotionPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[4]/a")
    private WebElement activePromotionPage;

    @FindBy (xpath = "//*[@id=\"pagination_contents\"]/div/p")
    private WebElement message;

    public ActivePromotionPage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnActivePromotionPage(){
        goToActivePromotionsPage();
        getMessageFromPage();
    }

    public void goToActivePromotionsPage(){
        elementsHelper.clickElement(activePromotionPage);
    }

    public void getMessageFromPage(){
        System.out.println("Promotiile active sunt: " +message.getText());
    }

    @Override
    public void isPageLoaded() {
    }
}
