package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_Tags {
    WebDriver driver;
    public P08_Tags(WebDriver driver){
        this.driver=driver;
    }

    private By tags=By.xpath("//a[@href=\"/computer\"]");

    public P08_Tags selectTags() {
        driver.findElement(tags).click();
        return this;
    }
}
