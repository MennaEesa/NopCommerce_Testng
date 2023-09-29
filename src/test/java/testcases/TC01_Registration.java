package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_RegisterPage;
import utility.Utilities;


public class TC01_Registration extends TestBase {

    public static String Email =faker.internet().emailAddress();
    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String password = "Menna@123";



    @Test
    public void registerNewUserWithValidData_P() throws InterruptedException {
        new P02_RegisterPage(driver).openrRegister().selectGender()
                .enterfName(firstName).enterlName(lastName).selectDay().selectMonth()
                .selectYear().enterEmail(Email).enterPassword(password).enterConPassword(password)
                .clickRegisterBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"P_registerImage");
        // Assert Result
        Assert.assertTrue(new P02_RegisterPage(driver).confirmMsg());
    }

    @Test
    public void registerNewUserWithinValidData_N() throws InterruptedException {
        new P02_RegisterPage(driver).openrRegister().selectGender()
                .enterfName(firstName).enterlName(lastName).selectDay().selectMonth()
                .selectYear().enterEmail(Email).enterPassword(password).enterConPassword(password)
                .clickRegisterBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"N_registerImage");
//         Assert Result
        Assert.assertTrue(new P02_RegisterPage(driver).checkfFailedMessage());
    }

}
