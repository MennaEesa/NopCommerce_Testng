package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import utility.Utilities;

import static testcases.TC01_Registration.*;

public class TC02_Login extends TestBase {

    // Todo : Check login with valid email and valid password
    @Test(priority = 1, description = "Check login with valid email and password")
    public void loginUser_p() throws InterruptedException {
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"P_LoginImage");
        Assert.assertTrue(new P01_LoginPage(driver).logOutBtn());

    }

    // Todo : Check login with invalid email and valid password
    @Test(priority = 2, description = "Check login with invalid email and valid password")
    public void loginInvalidEmail_N() throws InterruptedException {
        Email = "test12@yahoo.com";
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"N_LoginImage");
        Assert.assertTrue(new P01_LoginPage(driver).checkLoginFailMessage());

    }

    // Todo : Check login with invalid email and valid password
    @Test(priority = 3, description = "Check login with valid email and invalid password")
    public void loginWithValidEmailandInvalidPassworf_N() throws InterruptedException {
        password = "test@yahoo.com";
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"N_LoginImage");
        Assert.assertTrue(new P01_LoginPage(driver).checkLoginFailMessage());

    }

    // Todo : Check login with invalid email and invalid password
    @Test(priority = 4, description = "Check login with invalid email and invalid password")
    public void loginWithInvalidEmailandInvalidPassworf_N() throws InterruptedException {
        Email = "test11@yahoo.com";
        password = "test@yahoo.com";
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"N_LoginImage");
        Assert.assertTrue(new P01_LoginPage(driver).checkLoginFailMessage());
    }

}
