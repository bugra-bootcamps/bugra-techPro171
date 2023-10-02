package project_team09.tests.us08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import project_team09.pages.us08_09.Shopping;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

import static project_team09.pages.us08_09.Shopping.thankyouYazisi;

public class TC_01_TC02_TC03_TC04 {

    WebDriver driver;
    Actions actions = new Actions(Driver.getDriver());
    Shopping shopping = new Shopping();
    SoftAssert softAssert = new SoftAssert();

    @Test()//--->Defaut ilk çalıştı
    public void test01() {

        // Web Sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrlMe"));
        // Log in ol
        ReusableMethods.bekle(2);
        Shopping.singINHb.click();
        String username = ConfigReader.getProperty("userhb");
        String password = ConfigReader.getProperty("passwordhb");
        Shopping.userNameOrEmailhb.sendKeys(username, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();

        // Searcbox kutusunda ürün arat
        // Searcbox butonuna tıkla
        ReusableMethods.bekle(3);
        Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        ReusableMethods.bekle(3);
        // ilk Listelenen ikinci ürüne tıkla
        ReusableMethods.bekle(3);
        shopping.ilkUrun.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Whishlist ikonuna tıkla
        ReusableMethods.bekle(3);
        shopping.firstHeartHb.click();

        // Searchbox kutusunda ikinci ürünü arat
        // Searchbox butonuna tıkla
        ReusableMethods.bekle(3);
        Shopping.searchBoxHb.sendKeys(ConfigReader.getProperty("urun2"), Keys.ENTER);

        // Whistlist  ikonuna tıkla
        ReusableMethods.bekle(3);
        Shopping.secondHeartHb.click();
        ReusableMethods.bekle(3);
        Shopping.whishListButtonHb.click();
    }

    @Test(priority = 1)
    public void test2() {
            ReusableMethods.bekle(3);
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
        ReusableMethods.bekle(3);
        shopping.quickyViewfirst.click();
        ReusableMethods.bekle(3);
        softAssert.assertTrue(shopping.whishListverify1.isDisplayed());
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
        ReusableMethods.bekle(3);
        shopping.quickyViewsecond.click();
        ReusableMethods.bekle(3);
        softAssert.assertTrue(shopping.whishListverify2.isDisplayed());
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
    }
    @Test(priority = 4)
    public void test04() {


        //TEST04 WishListeki ürünü sepete ekleyebilemeli ve satın alabilmeli
        //POZİTİF SENARYO


        //  Açılan whishlist sayfasında ürünün yanında ki add cart butonuna tıkla
        ReusableMethods.bekle(3);
        shopping.addToCardHb.click();
        //  VIEW CART butonuna tıkla
        ReusableMethods.bekle(3);
        shopping.viewCartHb.click();
        //  Proceed to checkout butonuna tıkla
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        shopping.ProceedToCheckOutHb.click();

        //  Firstname e bir veri gir
        //  Lastaneme e bir veri gir
        //  Country'den bir ülke seç

        ReusableMethods.bekle(3);
        shopping.userNameHb.click();
        shopping.emailEB.clear();
        shopping.emailEB.clear();
        String usernamehb = ConfigReader.getProperty("userhb");
        String lastnamehb = ConfigReader.getProperty("lastnamehb");

        ReusableMethods.bekle(3);
        Shopping.userNameHb.sendKeys(usernamehb, Keys.TAB,lastnamehb);

        //  Street adress e bir  veri gir
        ReusableMethods.bekle(3);
        shopping.streetButonEB.click();
        String streethb = ConfigReader.getProperty("streethb");
        Shopping.streetButonEB.sendKeys(streethb);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        //  Past Code a bir veri gir
        //  Town/City e bir veri gir
        //  Province den bir şehir seç
        //  Phone a bir veri gir
        //  Email kısmına bir veri gir
        ReusableMethods.bekle(3);
        shopping.TownCity.click();
        String  zipcodecodehb = ConfigReader.getProperty("zipcodecodehb");
        String cityhb  = ConfigReader.getProperty("cityhb");
        String  phoneHb = ConfigReader.getProperty("phoneHb");
        String  mailHb = ConfigReader.getProperty("mailHb");
        ReusableMethods.bekle(3);
        shopping.TownCity.sendKeys(cityhb);

        shopping.zipCodeButonuEB.click();
        shopping.zipCodeButonuEB.sendKeys(zipcodecodehb,Keys.TAB,phoneHb,Keys.TAB,mailHb);
        //  Paymend Methods dan ödeme şekli seç
        //  Place order butonuna tıkla
        ReusableMethods.bekle(3);
        shopping.PlaceorderButonuEB.click();
        softAssert.assertTrue(thankyouYazisi.isDisplayed());

        //Thank you yazısının görüntülendiğini doğrula

}
    public void tearDown() {
        driver.close();


    }


}



















