package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P03_ForgetPassword;
import pages.P04_SearchPage;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC04_Search extends TestBase{


    private String searchWord = "Computer";

    @Test
    public void search()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();

        new P04_SearchPage(driver).enterSearchField(searchWord).clickSearchBTN();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P04_SearchPage(driver).searchResult());
        soft.assertAll();
    }

}
