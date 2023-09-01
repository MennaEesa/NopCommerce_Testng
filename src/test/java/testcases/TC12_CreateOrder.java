package testcases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_RegisterPage;
import pages.P09_ShoppingCart;
import pages.P12_CreateOrder;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC12_CreateOrder extends TestBase{


    public static String Country = "Egypt";
    public static String City = "Cairo";
    public static String Address = "test";
    public static String ZipCode = "77777";
    public static String PhoneNum = "123456";



    @Test
    public void createNewOrder()
    {
//        new P02_RegisterPage(driver).openrRegister().selectGender().enterfName(firstName).enterlName(lastName).selectDay().selectMonth().selectYear().enterEmail(Email).enterPassword(password).enterConPassword(password).clickRegisterBTN();
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        new P09_ShoppingCart(driver).PressShoppingCartBTN();
        new P12_CreateOrder(driver).OpenShoppingCartPage().selectTermsBTN()
          .pressCheckoutBTN().selectCountry(Country).enterCity(City).enterAddress(Address)
          .enterZipCode(ZipCode).enterNumber(PhoneNum).pressContinueBTN_1().pressContinueBTN_2()
          .pressContinueBTN_3().pressContinueBTN_4().pressConfirmBTN();


    }
}
