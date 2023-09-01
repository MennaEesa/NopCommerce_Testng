package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_CreateOrder {
    WebDriver driver;
    public P12_CreateOrder(WebDriver driver){
        this.driver=driver;
    }

    private final By shoppingCartPage=By.xpath("//span[@class=\"cart-label\"]");
    private final By termsBTN = By.id("termsofservice");
    private final By checkoutBTN = By.id("checkout");
    private final By country = By.xpath("//select[@data-trigger=\"country-select\"]");
    private final By city = By.id("BillingNewAddress_City");
    private final By address = By.id("BillingNewAddress_Address1");
    private final By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    private final By number = By.id("BillingNewAddress_PhoneNumber");
    private final By continueBTN_1 = By.xpath("//button[@onclick=\"Billing.save()\"]");
    private final By continueBTN_2 = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    private final By continueBTN_3 = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    private final By continueBTN_4 = By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    private final By confirmBTN = By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]");


    public P12_CreateOrder OpenShoppingCartPage() {
        driver.findElement(shoppingCartPage).click();
        return this;
    }

    public P12_CreateOrder selectTermsBTN() {
        driver.findElement(termsBTN).click();
        return this;
    }

    public P12_CreateOrder pressCheckoutBTN() {
        driver.findElement(checkoutBTN).click();
        return this;
    }

    public P12_CreateOrder selectCountry(String country) {
        driver.findElement(this.country).sendKeys(country);
        return this;
    }

    public P12_CreateOrder enterCity(String city) {
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    public P12_CreateOrder enterAddress(String address) {
        driver.findElement(this.address).sendKeys(address);
        return this;
    }

    public P12_CreateOrder enterZipCode(String zipCode) {
        driver.findElement(this.zipCode).sendKeys(zipCode);
        return this;
    }

    public P12_CreateOrder enterNumber(String number) {
        driver.findElement(this.number).sendKeys(number);
        return this;
    }

    public P12_CreateOrder pressContinueBTN_1() {
        driver.findElement(continueBTN_1).click();
        return this;
    }

    public P12_CreateOrder pressContinueBTN_2() {
        driver.findElement(continueBTN_2).click();
        return this;
    }

    public P12_CreateOrder pressContinueBTN_3() {
        driver.findElement(continueBTN_3).click();
        return this;
    }

    public P12_CreateOrder pressContinueBTN_4() {
        driver.findElement(continueBTN_4).click();
        return this;
    }

    public P12_CreateOrder pressConfirmBTN() {
        driver.findElement(confirmBTN).click();
        return this;
    }

}
