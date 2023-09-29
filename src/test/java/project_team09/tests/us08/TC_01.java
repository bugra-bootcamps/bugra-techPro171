package project_team09.tests.us08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.Hilal.Shopping;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.time.Duration;

public class TC_01 {

   @Test
   public void test01() {
       Actions actions = new Actions(Driver.getDriver());
      Shopping shopping = new Shopping();
      SoftAssert softAssert = new SoftAssert();

      // Web Sitesine git
      Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrlMe"));
      // Log in ol
       Shopping.singINHb.click();
       String username=ConfigReader.getProperty("userhb");
       String password=ConfigReader.getProperty("passwordhb");
       Shopping.userNameOrEmailhb.sendKeys(username, Keys.TAB,password,Keys.ENTER);
       ReusableMethods.bekle(2);
       Driver.getDriver().navigate().refresh();

       // Searcbox kutusunda ürün arat
       // Searcbox butonuna tıkla
       ReusableMethods.bekle(2);
       Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun"),Keys.ENTER);

       // Listelenen ilk ürüne tıkla
       Shopping.ilkUrun.click();
      // Whishlist ikonuna tıkla
       Shopping.firstHeartHb.click();
      // Searchbox kutusunda ürün arat
       // Searchbox butonuna tıkla
       ReusableMethods.bekle(2);
       Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun2"),Keys.ENTER);

       // Listelenen ilk ürüne tıkla
       ReusableMethods.bekle(2);
       Shopping.ilkUrun2.click();
      // Whistlist  ikonuna tıkla
       ReusableMethods.bekle(2);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       ReusableMethods.bekle(2);
       Shopping.secondHeartHb.click();
      // Ürünlerin whistlist'e eklendiğini doğrula
       ReusableMethods.click(shopping.whishListButtonHb);
       softAssert.assertTrue(shopping.whishListverify1.isDisplayed());
       softAssert.assertTrue(shopping.whishListverify2.isDisplayed());
   ReusableMethods.bekle(2);
   }

    @Test
    public void test02() {





    }



    }




