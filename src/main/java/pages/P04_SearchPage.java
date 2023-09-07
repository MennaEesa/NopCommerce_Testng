package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_SearchPage {
    WebDriver driver;
    public P04_SearchPage(WebDriver driver){
        this.driver=driver;
    }


    private final By searchField = By.id("small-searchterms");
    private final By searchBTN =By.xpath("//button[@class=\"button-1 search-box-button\"]");
    private final By searchResult = By.xpath("//a[@href=\"/build-your-own-computer\"]");


    public P04_SearchPage enterSearchField(String word) {
        driver.findElement(searchField).sendKeys(word);
        return this;
    }

    public P04_SearchPage clickSearchBTN() {
        driver.findElement(searchBTN).click();
        return this;
    }

    public boolean searchResult()
    {
        return driver.findElement(searchResult).isDisplayed();
    }
}
