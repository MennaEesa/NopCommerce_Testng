package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P05_CurrencyPage;
import pages.P06_CategoriesPage;
import utility.Utilities;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC06_Categories extends TestBase{


    @Test
    public void hoverMainAndSubCategory()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password)
       .clickLoginBTN();
        new P06_CategoriesPage(driver).getMainCategory().getSubCategory();
        // take screenshot
        Utilities.captureScreenShot(driver,"CategoriesImage");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P06_CategoriesPage(driver).checkPageTitle());
        soft.assertAll();
    }
}
