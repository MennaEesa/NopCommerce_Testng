package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P05_CurrencyPage;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC05_Currency extends TestBase{

    @Test
    public void switchToEuro()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();

        new P05_CurrencyPage(driver).clickCurrencyField().selectEuro();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P05_CurrencyPage(driver).checkPrice());
        soft.assertAll();
    }
}
