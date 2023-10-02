package project_team09.tests.us08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.us08_09.Shopping;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

import static project_team09.pages.us08_09.Shopping.thankyouYazisi;

public class TC05_TC06_TC07_TC08_TC09_TC10 {
    WebDriver driver;
    Actions actions = new Actions(Driver.getDriver());
    Shopping shopping = new Shopping();
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void test05() {

        //TEST05 First Name Kutusu boş bırakılmamalı

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
        //String usernamehb = ConfigReader.getProperty("userhb");
        String lastnamehb = ConfigReader.getProperty("lastnamehb");

        ReusableMethods.bekle(3);
        Shopping.userNameHb.sendKeys( Keys.TAB,lastnamehb);

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


        //"BILLING FIRSTNAME  is a required field " mesajı görüntülenmeli

    }

    @Test
    public void test06() {

        //TEST06 Last  Name Kutusu boş bırakılmamalı

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
      //  String lastnamehb = ConfigReader.getProperty("lastnamehb");

        ReusableMethods.bekle(3);
        Shopping.userNameHb.sendKeys(usernamehb, Keys.TAB);

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

        //BILING LAST NAME yazısı grüntülenmeli


    }

    @Test
    public void test07() {

       //TEST07 Street addres kutusu  boş bırakılmamalı

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
       // String streethb = ConfigReader.getProperty("streethb");
        ReusableMethods.bekle(3);
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


        //"BILLING STREET ADDRES  is a required field " mesajı görüntülenmeli

    }

    @Test
    public void test08() {
       //TEST 08  Post code Kutusu  boş bırakılmamalı
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
       // String  zipcodecodehb = ConfigReader.getProperty("zipcodecodehb");
        String cityhb  = ConfigReader.getProperty("cityhb");
        String  phoneHb = ConfigReader.getProperty("phoneHb");
        String  mailHb = ConfigReader.getProperty("mailHb");
        ReusableMethods.bekle(3);
        shopping.TownCity.sendKeys(cityhb);

        shopping.zipCodeButonuEB.click();
        shopping.zipCodeButonuEB.sendKeys(Keys.TAB,phoneHb,Keys.TAB,mailHb);
        //  Paymend Methods dan ödeme şekli seç
        //  Place order butonuna tıkla
        ReusableMethods.bekle(3);
        shopping.PlaceorderButonuEB.click();
        softAssert.assertTrue(thankyouYazisi.isDisplayed());

        //Thank you yazısının görüntülendiğini doğrula


 //"POST CODE  is a required field " mesajı görüntülenmeli

    }

    @Test
    public void test09() {

        // TEST 09 TOWN CITY

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
       // String cityhb  = ConfigReader.getProperty("cityhb");
        String  phoneHb = ConfigReader.getProperty("phoneHb");
        String  mailHb = ConfigReader.getProperty("mailHb");
        ReusableMethods.bekle(3);


        shopping.zipCodeButonuEB.click();
        shopping.zipCodeButonuEB.sendKeys(zipcodecodehb,Keys.TAB,phoneHb,Keys.TAB,mailHb);
        //  Paymend Methods dan ödeme şekli seç
        //  Place order butonuna tıkla
        ReusableMethods.bekle(3);
        shopping.PlaceorderButonuEB.click();
        softAssert.assertTrue(thankyouYazisi.isDisplayed());

        //Thank you yazısının görüntülendiğini doğrula

        //"POST CODE  is a required field " mesajı görüntülenmeli
    }

    @Test
    public void test10() {
     //TEST10 Province kutusu  boş bırakılmamalı
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

        //"BILLINGPROVINCE  is a required field " mesajı görüntülenmeli
    }
}
