package projectTest;

import org.testng.annotations.Test;
import projectPages.*;

import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.INFO_STEP;
import static extentUtility.ReportEventType.PASS_STEP;

public class TestRun extends BaseTest{

    @Test
    public void proiectFinalTest() {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        homePage.acceptCookies();
        logEvents(INFO_STEP, "Accept cookies on the Home Page");
        DishWasherPage dishWasherPage = new DishWasherPage(driver);
        dishWasherPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        dishWasherPage.dishWasherPartsAndBrand();
        logEvents(PASS_STEP, "Select the parts and the brands we need");
        dishWasherPage.selectAndAddTheParts();
        logEvents(INFO_STEP, "Adding the parts we want after we selected them");
        homePage.goToTheHomePage();
        logEvents(PASS_STEP, "After we finish on the previous page we go back to Home Page");
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        PromoPage promoPage = new PromoPage(driver);
        promoPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        promoPage.clickOnPromoPage();
        logEvents(INFO_STEP, "Check if Promo Page button works");
        homePage.goToTheHomePage();
        logEvents(PASS_STEP, "After we finish on the previous page we go back to Home Page");
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        ActivePromotionPage activePromotionPage = new ActivePromotionPage(driver);
        activePromotionPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        activePromotionPage.actionsOnActivePromotionPage();
        logEvents(INFO_STEP, "Check the active promotions on the page");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        shoppingCartPage.actionsOnShoppingCartPage();
        logEvents(INFO_STEP, "At the end we delete what we added to the cart");
        homePage.goToTheHomePage();
        logEvents(PASS_STEP, "After we finish on the previous page we go back to Home Page");
    }
}
