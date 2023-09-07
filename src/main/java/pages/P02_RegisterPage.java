package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;


public class P02_RegisterPage {

    Select select;
    WebDriver driver;
    public P02_RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    //Todo:define locators using By
    private final By openregister =By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    private final By Gender = By.id("gender-female");
    private final By fName = By.id("FirstName");
    private final By lName = By.id("LastName");
    private final By day = By.name("DateOfBirthDay");
    private final By month = By.name("DateOfBirthMonth");
    private final By year = By.name("DateOfBirthYear");
    private final By Email = By.xpath("//input[@type=\"email\"]");
    private final By Password = By.id("Password");
    private final By conPassword = By.id("ConfirmPassword");
    private final By registerBTN = By.id("register-button");
    private final By confirmRegisteration = By.xpath("//div[@class=\"result\"]");
    private final By failedMessage=By.xpath("//div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li");


    public P02_RegisterPage openrRegister() {
        driver.findElement(openregister).click();
        return this;
    }


    public P02_RegisterPage selectGender() {
        driver.findElement(Gender).click();
        return this;
    }

    public P02_RegisterPage enterfName(String firstName) {
        driver.findElement(fName).sendKeys(firstName);
        return this;
    }

    public P02_RegisterPage enterlName(String lastName) {
        driver.findElement(lName).sendKeys(lastName);
        return this;
    }

    public P02_RegisterPage selectDay() {
        select=new Select(driver.findElement(day));
        select.selectByIndex(Utilities.generateRandomInt(1,31));
        return this;
    }

    public P02_RegisterPage selectMonth() {
        select=new Select(driver.findElement(month));
        select.selectByIndex(Utilities.generateRandomInt(1,12));
        return this;
    }

    public P02_RegisterPage selectYear() {
        select=new Select(driver.findElement(year));
        select.selectByIndex(Utilities.generateRandomInt(1,20));
        return this;
    }

    public P02_RegisterPage enterEmail(String Email) throws InterruptedException {
        driver.findElement(this.Email).sendKeys(Email);
        Thread.sleep(2000);
        return this;
    }

    public P02_RegisterPage enterPassword(String Password) {
        driver.findElement(this.Password).sendKeys(Password);
        return this;
    }

    public P02_RegisterPage enterConPassword(String Password) {
        driver.findElement(conPassword).sendKeys(Password);
        return this;
    }

    public P02_RegisterPage clickRegisterBTN() {
        driver.findElement(registerBTN).click();
        return this;
    }

    public boolean confirmMsg ()
    {
        return driver.findElement(confirmRegisteration).getText().equals("Your registration completed");
    }

    public boolean checkfFailedMessage ()
    {
        return driver.findElement(failedMessage).getText().equals("The specified email already exists");
    }
}
