package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P09_ShoppingCart;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC09_ShoppingCart extends TestBase{

    @Test
    public void addToCart()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
           .enterPassword(password).clickLoginBTN();
        new P09_ShoppingCart(driver).PressShoppingCartBTN();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P09_ShoppingCart(driver).cartMSG());
        soft.assertAll();
    }
}
