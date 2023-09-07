package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {
    WebDriver driver;
    public P01_LoginPage(WebDriver driver){
       this.driver=driver;
    }


    //Todo:define locators using By
    private final By openLoginPage= By.xpath("//a[@href=\"/login?returnUrl=%2F\"]");
    private final By email =  By.xpath("//input[@class='email']");
    private final By password = By.xpath("//input[@class='password']");
    private final By loginBTN = By.xpath("//button[text()='Log in']");
    private final By logoutBTN = By.xpath("//a[@href=\"/logout\"]");
    private final By loginFailMessage = By.xpath("//div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");

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

    public boolean logOutBtn()
    {
        return driver.findElement(logoutBTN).isDisplayed();
    }
    public boolean checkLoginFailMessage()
    {
        return driver.findElement(loginFailMessage).getText().contains("Login was unsuccessful. Please correct the errors and try again.");
    }

}
