package project_team09.tests.us08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import project_team09.pages.Hilal.Shopping;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class TC_01_TC02_TC03 {

    WebDriver driver;
    Actions actions = new Actions(Driver.getDriver());
    Shopping shopping = new Shopping();
    SoftAssert softAssert = new SoftAssert();

    @Test()//--->Defaut ilk çalıştı
    public void test01() {

        // Web Sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrlMe"));
        // Log in ol
        Shopping.singINHb.click();
        String username = ConfigReader.getProperty("userhb");
        String password = ConfigReader.getProperty("passwordhb");
        Shopping.userNameOrEmailhb.sendKeys(username, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();

        // Searcbox kutusunda ürün arat
        // Searcbox butonuna tıkla
        ReusableMethods.bekle(2);
        Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        ReusableMethods.bekle(3);
        // ilk Listelenen ikinci ürüne tıkla
        shopping.ilkUrun.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        // Whishlist ikonuna tıkla
        shopping.firstHeartHb.click();

        // Searchbox kutusunda ikinci ürünü arat
        // Searchbox butonuna tıkla
        ReusableMethods.bekle(2);
        Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun2"), Keys.ENTER);

        // Whistlist  ikonuna tıkla
        ReusableMethods.bekle(2);
        Shopping.secondHeartHb.click();
        Shopping.whishListButtonHb.click();
    }

    @Test(priority = 1)
    public void test2() {
  ReusableMethods.click(shopping.whishListButtonHb);
  softAssert.assertTrue(shopping.whishListverify1.isDisplayed());
  softAssert.assertTrue(shopping.whishListverify2.isDisplayed());
    }

    @Test(priority = 2)
    public void test03() {
        //1- ürünün eklendiğini doğrula
        ReusableMethods.bekle(3);
        softAssert.assertTrue(shopping.productverify.isDisplayed());
    }
    @Test(priority = 3)
    public void test4() {
        //2-Açılan pencerede ürün özelliklerinin görüntülendiğini doğrula
        shopping.quickyViewfirst.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(shopping.whishListverify1.isDisplayed());
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
        ReusableMethods.bekle(2);
        shopping.quickyViewsecond.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(shopping.whishListverify2.isDisplayed());
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
    }

}



















