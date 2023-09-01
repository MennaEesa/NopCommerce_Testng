package testcases;

import org.testng.annotations.Test;
import pages.P07_FilterColor;
import pages.P08_Tags;

public class TC08_Tags extends TestBase{

    @Test
    public void selectTags()
    {
        new P07_FilterColor(driver).hoverApparelCat().selectShoesCat();
        new P08_Tags(driver).selectTags();
    }
}
