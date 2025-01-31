package projectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"sw_dropdown_97\"]/span[1]")
    private WebElement goToShoppingCart;

    @FindBy (xpath =  "//*[@id=\"dropdown_97\"]/div/div[2]/div/a")
    private WebElement checkCart;

    @FindBy (xpath = "//*[@id=\"cart_main\"]/div[3]/div[1]/a[2]/span")
    private WebElement emptyCart;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnShoppingCartPage(){
        goToShoppingCart();
        checkItemsFromCart();
        emptyTheCart();
    }

    public void goToShoppingCart(){
        elementsHelper.clickElement(goToShoppingCart);
    }

    public void checkItemsFromCart(){
        elementsHelper.clickElement(checkCart);
    }

    public void emptyTheCart(){
        elementsHelper.clickElement(emptyCart);
    }

    @Override
   public void isPageLoaded() {
    }
}
