package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P09_ShoppingCart {
    WebDriver driver;
    public P09_ShoppingCart(WebDriver driver){
        this.driver=driver;
    }


    private By shoppingCartBTN=By.xpath("//div[@data-productid=\"18\"]/div[2]/div[3]/div[2]/button[@class=\"button-2 product-box-add-to-cart-button\"]");
    private final By successMSG = By.xpath("//p[@class=\"content\"]");

    public P09_ShoppingCart PressShoppingCartBTN() {
        driver.findElement(shoppingCartBTN).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(successMSG));
        return this;
    }


}
