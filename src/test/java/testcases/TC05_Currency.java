package testcases;

import org.testng.annotations.Test;
import pages.P05_Currency;

public class TC05_Currency extends TestBase{

    @Test
    public void switchToEuro()
    {
        new P05_Currency(driver).clickCurrencyField().selectEuro();
    }
}
