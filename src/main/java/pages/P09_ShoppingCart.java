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
    public static final By successMSG = By.xpath("//div[@class=\"bar-notification success\"]");

    public P09_ShoppingCart PressShoppingCartBTN() {
        driver.findElement(shoppingCartBTN).click();
        String message = driver.findElement(successMSG).getText();
        System.out.println(message);
        return this;
    }

    public boolean cartMSG()
    {
        return driver.findElement(successMSG).getText().contains("The product has been added to your shopping cart");
    }




}
