package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P14_paymentInfo {
    Select select;
    WebDriver driver;
    public P14_paymentInfo(WebDriver driver){
        this.driver=driver;
    }


    private final By creditCard = By.id("paymentmethod_1");
    private final By holderName = By.id("CardholderName");
    private final By cardNumber =By.id("CardNumber");
    private final By ExpireMonth = By.id("ExpireMonth");
    private final By ExpireYear = By.id("ExpireYear");
    private final By CardCode = By.id("CardCode");
    private final By continueBTN_3 = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    private final By continueBTN_4 = By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    private final By confirmBTN = By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]");
    private final By successPayment=By.xpath("//div[@class=\"section order-completed\"]/div[1]");


    public P14_paymentInfo selectCreditCard() {
        driver.findElement(creditCard).click();
        return this;
    }

    public P14_paymentInfo fillHolderName(String holderName) {
        driver.findElement(this.holderName).sendKeys(holderName);
        return this;
    }

    public P14_paymentInfo fillCardNumber(String cardNum) {
        driver.findElement(cardNumber).sendKeys(cardNum);
        return this;
    }

    public P14_paymentInfo selectExpireMonth() {
        select=new Select(driver.findElement(ExpireMonth));
        select.selectByIndex(Utilities.generateRandomInt(0,11));
        return this;
    }

    public P14_paymentInfo selectExpireYear() {
        select=new Select(driver.findElement(ExpireYear));
        select.selectByIndex(Utilities.generateRandomInt(1,12));
        return this;
    }

    public P14_paymentInfo fillCardCode(String cardCode) {
        driver.findElement(this.CardCode).sendKeys(cardCode);
        return this;
    }

    public P14_paymentInfo pressContinueBTN_3() {
        driver.findElement(continueBTN_3).click();
        return this;
    }

    public P14_paymentInfo pressContinueBTN_4() {
        driver.findElement(continueBTN_4).click();
        return this;
    }

    public P14_paymentInfo pressConfirmBTN() {
        driver.findElement(confirmBTN).click();
        String successMSg = driver.findElement(successPayment).getText();
        System.out.println(successMSg);
        return this;
    }

    public boolean successPaymentMSG()
    {
        System.out.println(driver.findElement(successPayment).getText());
        return driver.findElement(successPayment).getText().toString().equals("Your order has been successfully processed!");
    }
}
