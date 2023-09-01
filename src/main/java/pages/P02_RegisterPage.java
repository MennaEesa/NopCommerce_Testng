package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

import java.util.List;

public class P02_RegisterPage {
//    // define driver
//    public P02_RegisterPage(WebDriver driver){
//        PageFactory.initElements(driver,this);
//    }
//    @FindBy(id = "gender-female")
//    WebElement Gender;
//    @FindBy(id = "FirstName")
//    WebElement fName;
//    @FindBy(id = "LastName")
//    WebElement lName;
//    @FindBy(name = "DateOfBirthDay")
//    WebElement day;
//    @FindBy(name = "DateOfBirthMonth")
//    WebElement month;
//    @FindBy(name = "DateOfBirthYear")
//    WebElement year;
//    @FindBy(xpath = "//input[@type=\"email\"]")
//    WebElement Email;
//    @FindBy(id = "Password")
//    WebElement Password;
//    @FindBy(id = "ConfirmPassword")
//    WebElement conPassword;
//    @FindBy(id = "register-button")
//    WebElement registerBTN;

    Select select;
//    public void registerUser(String firstName,String lastName,String Email,String Password){
//        Gender.click();
//        fName.sendKeys(firstName);
//        lName.sendKeys(lastName);
//        select=new Select(day);
//        select.selectByIndex(Utilities.generateRandomInt(1,31));
//        select=new Select(month);
//        select.selectByIndex(Utilities.generateRandomInt(1,12));
//        select=new Select(year);
//        select.selectByIndex(Utilities.generateRandomInt(1,20));
//        this.Email.sendKeys(Email);
//        this.Password.sendKeys(Password);
//        this.conPassword.sendKeys(Password);
//        registerBTN.click();
//
//    }



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

    public P02_RegisterPage enterEmail(String Email) {
        driver.findElement(this.Email).sendKeys(Email);
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


//    public void registerUser(String firstName,String lastName,String Email,String Password){
//        driver.findElement(openregister).click();
//     driver.findElement(Gender).click();
//     driver.findElement(fName).sendKeys(firstName);
//      driver.findElement(lName).sendKeys(lastName);
//        select=new Select(driver.findElement(day));
//        select.selectByIndex(Utilities.generateRandomInt(1,31));
//        select=new Select(driver.findElement(month));
//        select.selectByIndex(Utilities.generateRandomInt(1,12));
//        select=new Select(driver.findElement(year));
//        select.selectByIndex(Utilities.generateRandomInt(1,20));
//        driver.findElement(this.Email).sendKeys(Email);
//       driver.findElement(this.Password).sendKeys(Password);
//       driver.findElement(conPassword).sendKeys(Password);
//       driver.findElement(registerBTN).click();
//
//    }

}
