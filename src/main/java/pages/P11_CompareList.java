package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_CompareList {
    WebDriver driver;
    public P11_CompareList(WebDriver driver){
        this.driver=driver;
    }


    private final By compareListBTN = By.xpath("//div[@data-productid=\"18\"]/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-compare-list-button\"]");


    public P11_CompareList pressCompareListBTN() {
        driver.findElement(compareListBTN).click();
        return this;
    }
}
