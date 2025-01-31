package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class DishWasherPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"dropdown_114\"]/div/ul/li[6]/a[2]/div/bdi")
    private WebElement searchForParts;

    @FindBy (xpath = "//label[@for='elm_checkbox_31_10_1271']")
    private WebElement selectArcticBrand;

    @FindBy (xpath = "//label[@for='elm_checkbox_31_10_1217']")
    private WebElement selectBekoBrand;

    @FindBy (xpath = "//img[@alt='Buton masina de spalat vase']")
    private WebElement selectParts;

    @FindBy (xpath = "//*[@id=\"button_cart_14885\"]/span/span")
    private WebElement addThePartToCart;

    @FindBy (xpath = "//a[contains(@class, 'ty-btn__secondary') and contains(@class, 'cm-notification-close')]")
    private WebElement continueShopping;

    public DishWasherPage(WebDriver driver) {
        super(driver);
    }

    public void dishWasherPartsAndBrand(){
        searchForParts();
        selectTheBrand();
    }

    public void selectAndAddTheParts(){
        selectTheNeededPart();
        addingThePartInTheCart();
        continueShopping();
    }


    public void searchForParts(){
        elementsHelper.clickElement(searchForParts);
    }

    public void selectTheBrand(){
        elementsHelper.clickElement(selectArcticBrand);
        elementsHelper.clickElement(selectBekoBrand);
    }

    public void selectTheNeededPart(){
        elementsHelper.clickElement(selectParts);
    }

    public void addingThePartInTheCart(){
        elementsHelper.clickElement(addThePartToCart);
    }

    public void continueShopping(){
        elementsHelper.waitForElement(continueShopping);
        elementsHelper.clickElement(continueShopping);
    }

    @Override
    public void isPageLoaded() {
    }
}
