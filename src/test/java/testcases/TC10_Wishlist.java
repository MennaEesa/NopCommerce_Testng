package testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P10_Wishlist;
import utility.Utilities;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC10_Wishlist extends TestBase{


    @Test
    public void addToWishlist()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
          .enterPassword(password).clickLoginBTN();
        new P10_Wishlist(driver).pressWishlistBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"wishlistImage");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assert.assertTrue(new P10_Wishlist(driver).wishlistMSG());

//        SoftAssert soft = new SoftAssert();
//        soft.assertTrue(new P10_Wishlist(driver).wishlistMSG());
//        soft.assertAll();
    }
}
