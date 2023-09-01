package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class P07_FilterColor {
    WebDriver driver;
    public P07_FilterColor(WebDriver driver){
        this.driver=driver;
    }

    private By apparelCat = By.xpath("//a[@href=\"/apparel\"]");
    private By shoesCat =By.xpath("//a[@href=\"/shoes\"]");
    private By selectRed = By.id("attribute-option-15");

    public P07_FilterColor hoverApparelCat() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(apparelCat)).perform();
        return this;
    }

    public P07_FilterColor selectShoesCat() {
        driver.findElement(shoesCat).click();
        return this;
    }


    public P07_FilterColor pressSelectRed() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(selectRed).click();
        return this;
    }


}
