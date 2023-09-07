package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_CurrencyPage {
    WebDriver driver;
    public P05_CurrencyPage(WebDriver driver){
        this.driver=driver;
    }


    private final By currencyField =By.id("customerCurrency");
    private final By euro= By.xpath("//div/select/option[2]");
    private final By price = By.xpath("//span[@class=\"price actual-price\"]");

    public P05_CurrencyPage clickCurrencyField() {
        driver.findElement(currencyField).click();
        return this;
    }

    public P05_CurrencyPage selectEuro() {
        driver.findElement(euro).click();
        return this;
    }
    public boolean checkPrice()
    {
        return driver.findElement(price).getText().contains("€");
    }
}
