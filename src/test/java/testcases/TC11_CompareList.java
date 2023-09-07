package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P10_Wishlist;
import pages.P11_CompareList;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC11_CompareList extends TestBase{


    @Test
    public void addToCompareList()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
                .enterPassword(password).clickLoginBTN();
        new P11_CompareList(driver).pressCompareListBTN();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P11_CompareList(driver).compareListMSG());
        soft.assertAll();
    }
}
