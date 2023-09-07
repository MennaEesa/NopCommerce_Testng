package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P02_RegisterPage;
import pages.P03_ForgetPassword;

import static testcases.TC01_Registration.*;

public class TC03_ForgetPassword extends TestBase{


    @Test
    public void recoverPassword()
    {
        //Todo : open login page
        new P01_LoginPage(driver).openLogin();

        //Todo : forget password
        new P03_ForgetPassword(driver).openForgetPLink().enterRecoverEmail(Email).clickRecoverBTN();
       SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P03_ForgetPassword(driver).getSuccessMSG());
        soft.assertAll();
    }


}
