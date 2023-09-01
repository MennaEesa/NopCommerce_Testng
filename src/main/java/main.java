import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.P01_LoginPage;
import pages.P02_RegisterPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class main {
    private static Faker faker=new Faker();
    private static String EMAIL=faker.internet().emailAddress();
    private static String firstName = faker.name().firstName();
    private static String lastName = faker.name().lastName();




    public static void main(String[] args) throws InterruptedException {

//        // TODO: define driver
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        // TODO: start demo url
//        driver.get("https://demo.nopcommerce.com/");
//        // maximize window
//        driver.manage().window().maximize();
//        // set driver time out
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //element not found exception
////       Registration page
//        driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
//        P02_RegisterPage register = new P02_RegisterPage(driver);
//
//
////        Login page
//        driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
//
//        P01_LoginPage loginPage = new P01_LoginPage(driver);
////        loginPage.getEmail(EMAIL);
//        loginPage.login(EMAIL,"Menna@123");


    }
}
