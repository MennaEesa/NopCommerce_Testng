package testcases;

import org.testng.annotations.Test;
import pages.P11_CompareList;

public class TC11_CompareList extends TestBase{


    @Test
    public void addToCompareList()
    {
        new P11_CompareList(driver).pressCompareListBTN();
    }
}
