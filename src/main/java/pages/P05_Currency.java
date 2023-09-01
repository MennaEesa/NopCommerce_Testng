package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_Currency {
    WebDriver driver;
    public P05_Currency(WebDriver driver){
        this.driver=driver;
    }


    private final By currencyField =By.id("customerCurrency");
    private final By euro= By.xpath("//div/select/option[2]");

    public P05_Currency clickCurrencyField() {
        driver.findElement(currencyField).click();
        return this;
    }

    public P05_Currency selectEuro() {
        driver.findElement(euro).click();
        return this;
    }
}
