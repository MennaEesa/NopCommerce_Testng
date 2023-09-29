package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_LoginPage;
import pages.P06_CategoriesPage;
import pages.P07_FilterColor;
import pages.P08_Tags;
import utility.Utilities;

import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.password;

public class TC08_Tags extends TestBase{

    @Test
    public void selectTags()
    {
        new P01_LoginPage(driver).openLogin().enterEmail(Email)
          .enterPassword(password).clickLoginBTN();
        new P07_FilterColor(driver).hoverApparelCat().selectShoesCat();
        new P08_Tags(driver).selectTags();
        // take screenshot
        Utilities.captureScreenShot(driver,"tagsImage");
        //Assert
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P08_Tags(driver).checkTagName());
        soft.assertAll();
    }
}
