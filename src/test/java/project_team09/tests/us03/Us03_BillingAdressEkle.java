package project_team09.tests.us03;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.AslihanPage.Anasayfa;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class Us03_BillingAdressEkle {


    @Test
    public void tc01_EmailOtomatikGelmeli () {


        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"E-mail" kutusunun dolu geldigini dogrula
        softAssert.assertTrue(anasayfa.emailValue.isDisplayed());

    }

    @Test
    public void tc02_withoutFirstNameNotBilling() {


        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());

        //"First name" kutusunu bos birak



        //"Last name" bilgisi gir
        anasayfa.adressesLastNameAs.sendKeys("a");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);


        //"Country/Region" sec
        //Select select = new Select(anasayfa.adressesCountry_Region);
       // select.deselectByIndex(1);
       // ReusableMethods.bekle(2);


        //"Street Address" bilgisi gir



        //Secilen "Country/Region" bilgisine gore "Province" ve "Town/City" bilgilerini gir
        //"Postcode/ZIP" bilgisi gir
        //"Phone" bilgisi gir
        //"SAVE ADDRESS" butonuna tikla
        //"First name is a required field." yazisinin gorundugunu dogrula


    }
}
