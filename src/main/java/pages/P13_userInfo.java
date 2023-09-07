package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P13_userInfo {
    WebDriver driver;
    public P13_userInfo(WebDriver driver){
        this.driver=driver;
    }

    private final By country = By.xpath("//select[@data-trigger=\"country-select\"]");
    private final By city = By.id("BillingNewAddress_City");
    private final By address = By.id("BillingNewAddress_Address1");
    private final By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    private final By number = By.id("BillingNewAddress_PhoneNumber");
    private final By continueBTN_1 = By.xpath("//button[@onclick=\"Billing.save()\"]");
    private final By continueBTN_2 = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    private final By visaOption = By.xpath("//div[@class=\"section payment-method\"]/ul/li[2]/div//img");



    public P13_userInfo selectCountry(String country) {
        driver.findElement(this.country).sendKeys(country);
        return this;
    }

    public P13_userInfo enterCity(String city) {
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    public P13_userInfo enterAddress(String address) {
        driver.findElement(this.address).sendKeys(address);
        return this;
    }

    public P13_userInfo enterZipCode(String zipCode) {
        driver.findElement(this.zipCode).sendKeys(zipCode);
        return this;
    }

    public P13_userInfo enterNumber(String number) {
        driver.findElement(this.number).sendKeys(number);
        return this;
    }

    public P13_userInfo pressContinueBTN_1() {
        driver.findElement(continueBTN_1).click();
        return this;
    }

    public P13_userInfo pressContinueBTN_2() {
        driver.findElement(continueBTN_2).click();
        return this;
    }

    public boolean visaSection()
    {
        return driver.findElement(visaOption).isDisplayed();
    }


}
