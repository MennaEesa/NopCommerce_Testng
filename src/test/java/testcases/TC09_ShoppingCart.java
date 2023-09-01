package testcases;

import org.testng.annotations.Test;
import pages.P09_ShoppingCart;

public class TC09_ShoppingCart extends TestBase{

    @Test
    public void addToCart()
    {
        new P09_ShoppingCart(driver).PressShoppingCartBTN();
    }
}
