package testcases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_RegisterPage;

import static testcases.TC01_Registration.*;

public class TC02_Login extends TestBase{


    @Test
    public void loginUser_p() throws InterruptedException {
      // TODO: step1 - register new user

//      new P02_RegisterPage(driver).openrRegister().selectGender().enterfName(firstName).enterlName(lastName).selectDay().selectMonth().selectYear().enterEmail(Email).enterPassword(password).enterConPassword(password).clickRegisterBTN();

    // TODO: step2- login using existing email
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();

        Thread.sleep(3000);

    }



}
