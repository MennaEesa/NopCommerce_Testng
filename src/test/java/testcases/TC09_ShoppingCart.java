package testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P09_ShoppingCart;
import utility.Utilities;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC09_ShoppingCart extends TestBase{

    @Test
    public void addToCart()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
           .enterPassword(password).clickLoginBTN();
        new P09_ShoppingCart(driver).PressShoppingCartBTN();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // take screenshot
        Utilities.captureScreenShot(driver,"shoppingCartImage");
         Assert.assertTrue(new P09_ShoppingCart(driver).cartMSG());

//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(new P09_ShoppingCart(driver).cartMSG());
//        soft.assertAll();
    }
}
