package project_team09.tests.us02;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.AslihanPage.Anasayfa;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class Us02_GecersizYeniKullaniciKayit {


    @Test
    public void tc01_kayitliBilgiKaydiYapilmamali() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //sign up bölümüne gel

        anasayfa.signUpButonAs.click();
        ReusableMethods.bekle(2);

        //username kutusuna kayıtlı olan bir username gir
        anasayfa.usernameAs.sendKeys("username1as");


        //email kutusuna kayıtlı olan bir mail gir
        anasayfa.emailAs.sendKeys("email1as");

        //Şifre kutusuna bir şifre gir

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        //Sign Up butonuna tıkla
        //"An account is already registered with your email address." uyarı metni ve "Please log in." görülmeli




    }
}
