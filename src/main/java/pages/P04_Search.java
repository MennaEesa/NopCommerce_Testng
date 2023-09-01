package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_Search {
    WebDriver driver;
    public P04_Search(WebDriver driver){
        this.driver=driver;
    }


    private final By searchField = By.id("small-searchterms");
    private final By searchBTN =By.xpath("//button[@class=\"button-1 search-box-button\"]");


    public P04_Search enterSearchField(String word) {
        driver.findElement(searchField).sendKeys(word);
        return this;
    }

    public P04_Search clickSearchBTN() {
        driver.findElement(searchBTN).click();
        return this;
    }
}
