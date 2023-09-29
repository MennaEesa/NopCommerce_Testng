package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P06_CategoriesPage;
import pages.P07_FilterColor;
import utility.Utilities;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC07_FilterColor extends TestBase {

    @Test
    public void filterRedColor()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
        .enterPassword(password).clickLoginBTN();
        new P07_FilterColor(driver).hoverApparelCat().selectShoesCat().pressSelectRed();
        // take screenshot
        Utilities.captureScreenShot(driver,"filterColorImage");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P07_FilterColor(driver).checkProductName());
        soft.assertAll();
    }

}
