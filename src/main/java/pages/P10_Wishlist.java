package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_Wishlist {
    WebDriver driver;
    public P10_Wishlist(WebDriver driver){
        this.driver=driver;
    }

    private final By wishlistBTN=By.xpath("//div[@data-productid=\"18\"]/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-wishlist-button\"]");
    private final By successMSG = By.xpath("//div[@class=\"bar-notification success\"]");


    public P10_Wishlist pressWishlistBTN() {
        driver.findElement(wishlistBTN).click();
        return this;
    }

    public boolean wishlistMSG()
    {
        return driver.findElement(successMSG).getText().contains("The product has been added to your wishlist");
    }


}
