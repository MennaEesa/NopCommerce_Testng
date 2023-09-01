package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P04_Search;

public class TC04_Search extends TestBase{


    private String searchWord = "Computer";

    @Test
    public void search()
    {
        new P04_Search(driver).enterSearchField(searchWord).clickSearchBTN();
    }

}
