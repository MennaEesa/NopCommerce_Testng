package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P02_RegisterPage;


public class TC01_Registration extends TestBase {
//    public static Faker faker=new Faker();
    public final static String Email =faker.internet().emailAddress();
    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String password = "Menna@123";



    @Test
    public void registerNewUserWithValidData_P(){
        new P02_RegisterPage(driver).openrRegister().selectGender().enterfName(firstName).enterlName(lastName).selectDay().selectMonth().selectYear().enterEmail(Email).enterPassword(password).enterConPassword(password).clickRegisterBTN();

    }

}
