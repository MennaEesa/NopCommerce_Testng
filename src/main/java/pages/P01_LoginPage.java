package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_LoginPage {
    // define driver
    WebDriver driver;
    public P01_LoginPage(WebDriver driver){
       this.driver=driver;
    }
//    // define locators
//    @FindBy(xpath = "//input[@class='email']")//driver.findElement(By.xpath(""))
//    WebElement Email;
//    @FindBy(xpath = "//input[@class='password']")
//    WebElement Password;
//    @FindBy(xpath = "//button[text()='Log in']")
//    WebElement LoginButton;
//    // define action
//    public void login (String Email ,String Password){
//        this.Email.sendKeys(Email);
//        this.Password.sendKeys(Password);
//        LoginButton.click();
//    }

    //Todo:define locators using By
    private final By openLoginPage= By.xpath("//a[@href=\"/login?returnUrl=%2F\"]");
    private final By email =  By.xpath("//input[@class='email']");
    private final By password = By.xpath("//input[@class='password']");
    private final By loginBTN = By.xpath("//button[text()='Log in']");

     public P01_LoginPage openLogin ()
     {
         driver.findElement(openLoginPage).click();
         return this;
     }

    public P01_LoginPage enterEmail(String email)
    {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public P01_LoginPage enterPassword(String password)
    {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public P01_LoginPage clickLoginBTN()
    {
        driver.findElement(loginBTN).click();
        return this;
    }

    //Todo:define setter and getter methods

    //Todo:define Actions
//    public void login(String email,String password)  {
//        driver.findElement(this.email).sendKeys(email);
//        driver.findElement(this.password).sendKeys(password);
//        driver.findElement(loginBTN).click();
//    }


}
