package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utility.Utilities;

import static pages.P09_ShoppingCart.successMSG;
import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC12_CreateOrder extends TestBase{

    SoftAssert soft;

    public static String Country = "Egypt";
    public static String City = "Cairo";
    public static String Address = "test";
    public static String ZipCode = "77777";
    public static String PhoneNum = "123456";
    public static String holderName ="Menna";
    public static String cardCode = "100";
    public static String cardNum = faker.finance().creditCard();



    @Test
    public void createNewOrder()
    {
        //Todo 1: user login
        new P01_LoginPage(driver).openLogin().enterEmail(Email).enterPassword(password).clickLoginBTN();
        //Todo 2: user add item to shopping cart
        new P09_ShoppingCart(driver).PressShoppingCartBTN();
        WebDriverWait wait =new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(successMSG));
        //Todo 3: user open shopping cart page and checkout
        new P12_CreateOrder(driver).OpenShoppingCartPage().selectTermsBTN()
          .pressCheckoutBTN();
        //Todo 4: user fill his information
        new P13_userInfo(driver).selectCountry(Country).enterCity(City).enterAddress(Address)
         .enterZipCode(ZipCode).enterNumber(PhoneNum).pressContinueBTN_1().pressContinueBTN_2();
        //Todo 5: check is visa option displayed
       Assert.assertTrue(new P13_userInfo(driver).visaSection());
        //Todo 6: fill credit card information
        new P14_paymentInfo(driver).selectCreditCard() .pressContinueBTN_3().fillHolderName(holderName)
          .fillCardNumber(cardNum).selectExpireMonth().selectExpireYear().fillCardCode(cardCode)
               .pressContinueBTN_4().pressConfirmBTN();
        // take screenshot
        Utilities.captureScreenShot(driver,"createOrderImage");
        //Todo: Check success payment message
        Assert.assertTrue(new P14_paymentInfo(driver).successPaymentMSG());
    }
}
