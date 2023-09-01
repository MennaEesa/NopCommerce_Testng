package testcases;

import org.testng.annotations.Test;
import pages.P10_Wishlist;

public class TC10_Wishlist extends TestBase{


    @Test
    public void addToWishlist()
    {
        new P10_Wishlist(driver).pressWishlistBTN();
    }
}
