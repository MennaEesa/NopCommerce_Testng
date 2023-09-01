package testcases;

import org.testng.annotations.Test;
import pages.P06_Categories;

public class TC06_Categories extends TestBase{


    @Test
    public void hoverMainCategory()
    {
        new P06_Categories(driver).getMainCategory();
    }

    @Test
    public void hoverSubCategory()
    {
        new P06_Categories(driver).getMainCategory().getSubCategory();
    }
}
