package project_team09.tests.us02;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
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
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(5);


        //username kutusuna kayıtlı olan bir username gir
        anasayfa.usernameAs.sendKeys(ConfigReader.getProperty("username1as"));


        //email kutusuna kayıtlı olan bir mail gir
        anasayfa.emailAs.sendKeys(ConfigReader.getProperty("signInEmail1"));

        //Şifre kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys(ConfigReader.getProperty("signInPassword1"));

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();


        //"An account is already registered with your email address." uyarı metni ve "Please log in." görülmeli
        //manuelde böyle fakat otomasyonda sign ın kutusuna geçiş yapıyor

        //uyarı metni görülmeli
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.kayitliBilgiHataAs.isDisplayed());
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();




    }


    @Test
    public void tc02_kayitliUsernameSignUpOlma() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(5);


        //username kutusuna kayıtlı olan bir username gir
        anasayfa.usernameAs.sendKeys(ConfigReader.getProperty("username1as"));


        //email kutusuna kayıtlı olmayan bir mail gir
        anasayfa.emailAs.sendKeys(ConfigReader.getProperty("yeniEmail"));

        //Şifre kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys(ConfigReader.getProperty("signInPassword1"));

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();

        //uyarı metni görülmeli
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.kayitliBilgiHataAs.isDisplayed());
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();

    }

    @Test
    public void tc03_kayitliEmailSignUpOlma() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(5);

        //username kutusuna kayıtlı olmayan bir username gir
        anasayfa.usernameAs.sendKeys(ConfigReader.getProperty("yeniUsername"));


        //email kutusuna kayıtlı olan bir mail gir
        anasayfa.emailAs.sendKeys(ConfigReader.getProperty("signInEmail1"));

        //Şifre kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys(ConfigReader.getProperty("signInPassword1"));

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();

       // uyarı metni görülmeli
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.kayitliBilgiHataAs.isDisplayed());
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();

    }


    @Test
    public void tc04_withoutPasswordNotSignup() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();
        Faker faker =new Faker();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(5);


        //username kutusuna yeni veri gir //Your Email address kutusuna yeni mail gir
        anasayfa.usernameAs.click();
        anasayfa.usernameAs.sendKeys(faker.name().firstName(), Keys.TAB,faker.internet().emailAddress());



        //Şifre kutusunu boş bırak


        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();


    }
}
