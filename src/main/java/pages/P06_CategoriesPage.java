package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

import java.util.List;

public class P06_CategoriesPage {
    static String categoryName;
    Select select ;
    WebDriver driver;
    public P06_CategoriesPage(WebDriver driver){
        this.driver=driver;
    }



    WebElement randomElement;

    private final By mainCategory= By.xpath("//ul[@class='top-menu notmobile']/li/a");
    private final By subCategory =By.xpath("//ul[@class='top-menu notmobile']/li/ul/li");
    public static final By pageTitle=By.xpath("//div[@class=\"page-title\"]/h1");



    public P06_CategoriesPage getMainCategory() {
        Actions action =new Actions(driver);
        List<WebElement> main = driver.findElements(mainCategory);
        randomElement = main.get(0);
        action.moveToElement(randomElement).perform();
        return this;
    }

   public P06_CategoriesPage getSubCategory() {
       List<WebElement> sub = driver.findElements(subCategory);
       for (int i = 0; i <sub.size() ; i++) {
           if (sub.size()>0){
               Actions action =new Actions(driver);
               randomElement = sub.get(Utilities.generateRandomInt(0,2));
               action.moveToElement(randomElement).perform();
               categoryName= randomElement.getText();
               System.out.println(categoryName);
               randomElement.click();

               break;
           }
           else continue;
       }
        return this;
   }

   public boolean checkPageTitle()
   {
       String pageTitleName = driver.findElement(pageTitle).getText();
       System.out.println(pageTitleName);
       return driver.findElement(pageTitle).getText().contains(categoryName);
   }

}
