package testcases;

import org.testng.annotations.Test;
import pages.P07_FilterColor;

public class TC07_FilterColor extends TestBase {

    @Test
    public void filterRedColor()
    {
        new P07_FilterColor(driver).hoverApparelCat().selectShoesCat().pressSelectRed();
    }

}
