package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P03_ForgetPassword {

    WebDriver driver;
    public P03_ForgetPassword(WebDriver driver){
        this.driver=driver;
    }


    private final By forgetPLink = By.xpath("//a[@href=\"/passwordrecovery\"]");
    private final By recoverEmail = By.id("Email");
    private final By recoverBTN = By.xpath("//button[@class=\"button-1 password-recovery-button\"]");
    private final By succMSG = By.xpath("//p[@class=\"content\"]");

    public P03_ForgetPassword openForgetPLink() {
        driver.findElement(forgetPLink).click();
        return this;
    }

    public P03_ForgetPassword enterRecoverEmail(String email) {
        driver.findElement(recoverEmail).sendKeys(email);
        return this;
    }

    public P03_ForgetPassword clickRecoverBTN() {
        driver.findElement(recoverBTN).click();
        return this;
    }

    public P03_ForgetPassword getSuccessMSG()
    {
        WebDriverWait wait=new WebDriverWait(driver,10);
        String successMSG =  wait.until(ExpectedConditions.visibilityOfElementLocated(succMSG)).getText();
        System.out.println(successMSG);
        return this;
    }

}
