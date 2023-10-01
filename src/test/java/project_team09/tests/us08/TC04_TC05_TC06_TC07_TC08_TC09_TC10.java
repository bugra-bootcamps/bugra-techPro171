package project_team09.tests.us08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.Hilal.Shopping;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class TC04_TC05_TC06_TC07_TC08_TC09_TC10 {
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
    public void test02() {

        //  Açılan whishlist sayfasında ürünün yanında ki add cart butonuna tıkla
        shopping.addToCardHb.click();
        //  VIEW CART butonuna tıkla
        shopping.viewCartHb.click();
        //  Proceed to checkout butonuna tıkla
        shopping.ProceedToCheckOutHb.click();
        //  Firstname e bir veri gir
        //  Lastaneme e bir veri gir
        String username = ConfigReader.getProperty("userhb");
        String password = ConfigReader.getProperty("passwordhb");
        shopping.userNameEB.click();
        Shopping.userNameEB.sendKeys(username, Keys.TAB, password, Keys.ENTER);



        //  Country'den bir ülke seç
        //  Street adress e bir  veri gir
        //  Past Code a bir veri gir
        //  Town/City e bir veri gir
        //  Province den bir şehir seç
        //  Phone a bir veri gir
        //  Email kısmına bir veri gir
        //  Paymend Methods dan ödeme şekli seç
        //  Place order butonuna tıkla


    }
}
