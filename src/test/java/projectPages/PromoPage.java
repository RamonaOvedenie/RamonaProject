package projectPages;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

import javax.xml.xpath.XPath;

public class PromoPage extends BasePage{
    @FindBy (xpath = "//a[@class='ty-text-links__a']")
    private WebElement promoPage;

    @FindBy (xpath = "//img[@title='Solutie decalcifiere Philips Saeco CA6700/22, 2*250ML']")
    private WebElement itemFromPromoPage;

    public PromoPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void clickOnPromoPage(){
        elementsHelper.clickElement(promoPage);
    }

    public void selectAnItemFromPromoPage(){
        actions.scrollToElement(itemFromPromoPage).perform();
        elementsHelper.clickElement(itemFromPromoPage);
    }



    @Override
   public void isPageLoaded() {
    }
}
