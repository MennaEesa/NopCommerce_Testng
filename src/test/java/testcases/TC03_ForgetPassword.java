package testcases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_RegisterPage;
import pages.P03_ForgetPassword;

import static testcases.TC01_Registration.*;

public class TC03_ForgetPassword extends TestBase{

//    private  String firstName = faker.name().firstName();
//    private  String lastName = faker.name().lastName();
//    private String EMAIL=faker.internet().emailAddress();
//    private String password = "Menna@123";

    @Test
    public void recoverPassword()
    {
        //Todo : open login page
        new P01_LoginPage(driver).openLogin();

        //Todo : forget password
        new P03_ForgetPassword(driver).openForgetPLink().enterRecoverEmail(Email).clickRecoverBTN().getSuccessMSG();
    }


}
