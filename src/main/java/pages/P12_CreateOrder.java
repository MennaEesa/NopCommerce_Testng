package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_CreateOrder {
    WebDriver driver;
    public P12_CreateOrder(WebDriver driver){
        this.driver=driver;
    }


    private final By shoppingCartPage=By.xpath("//span[@class=\"cart-label\"]");
    private final By termsBTN = By.id("termsofservice");
    private final By checkoutBTN = By.id("checkout");




    public P12_CreateOrder OpenShoppingCartPage() {

        driver.findElement(shoppingCartPage).click();
        return this;
    }

    public P12_CreateOrder selectTermsBTN() {
        driver.findElement(termsBTN).click();
        return this;
    }

    public P12_CreateOrder pressCheckoutBTN() {
        driver.findElement(checkoutBTN).click();
        return this;
    }









}
