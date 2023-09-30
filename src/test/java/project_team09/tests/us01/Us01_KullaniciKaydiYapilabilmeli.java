package project_team09.tests.us01;


import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.AslihanPage.Anasayfa;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class Us01_KullaniciKaydiYapilabilmeli {


    @Test
    public void tc01_KullaniciKayit() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());


        //email kutusuna kayıtlı olmayan bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Şifre kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys(ConfigReader.getProperty("signInPassword1"));

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();

        ReusableMethods.bekle(2);


        //Kayıt işleminin gerçekleştiğini doğrula

        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


    }


    @Test
    public void tc02_withoutUsernameNotRegister() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusunu boş bırak


        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();



    }

    @Test
    public void tc03_withoutEmailNotRegister() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusunu boş bırak


        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();
        ReusableMethods.bekle(2);

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(5);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();


    }

    @Test
    public void tc04_withoutPasswordNotRegister() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusunu boş bırak

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();




    }


    @Test
    public void tc05_WithoutIagreeClickNotRegister() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //"I agree to the privacy policy" kontrol kutusuna tıklama



        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();





    }


    @Test
    public void tc06_hataliemailileKayitOlma() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //@ işareti olmadan email gir
        anasayfa.emailAs.sendKeys(ConfigReader.getProperty("hataliEmail1"));


        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();






    }


    @Test
    public void tc07_withoutComEmailIleKayitOlma() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //.com  olmadan email gir
        anasayfa.emailAs.sendKeys(ConfigReader.getProperty("hataliemail2"));

        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();





    }


    @Test
    public void tc08_sekizChrctrPasswordkayit() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna 8 karakterli bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("password8");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Kayıt işleminin gerçekleştiğini doğrula

        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


    }

    @Test
    public void tc09_dokuzChrctrPasswordkayit() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna 9 karakterli bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("password9");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Kayıt işleminin gerçekleştiğini doğrula

        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


    }


    @Test
    public void tc10_yediChrctrPasswordkayitOlma() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna 7 karakterli bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("password7");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);


        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();

    }


    @Test
    public void tc11_passwordSadeceRakamlaKayitOlma() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna bir kullanıcı adı gir
        anasayfa.usernameAs.sendKeys(faker.name().firstName());

        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna sadece rakamlardan şifre gir
        anasayfa.passwordSignUpAs.sendKeys("passwordRakam");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Siteye kayıt yapılamadığını doğrula
        ReusableMethods.bekle(2);
        softAssert.assertFalse(anasayfa.popUpMesajAs.isDisplayed());
        softAssert.assertAll();


    }

    @Test
    public void tc12_buyukkucukHarfRakamUsernameKayit() {
        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna büyük harf, küçük harf ve rakam içeren kullanıcı adı gir

        anasayfa.usernameAs.sendKeys(ConfigReader.getProperty("yeniUsername2"));


        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        ReusableMethods.bekle(10);

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();


        //Kayıt işleminin gerçekleştiğini doğrula

        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());

    }


    @Test
    public void tc13_usernameOzelkarakterKayit() {

        Anasayfa anasayfa = new Anasayfa();
        Faker faker = new Faker();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());

        //Registera tıkla
        anasayfa.registerAs.click();
        ReusableMethods.bekle(3);

        //username kutusuna  özel karakter(*) içeren kullanıcı adı gir

        anasayfa.usernameAs.sendKeys(ConfigReader.getProperty("yeniUsername3"));


        //email kutusuna bir mail gir
        anasayfa.emailAs.sendKeys(faker.internet().emailAddress());

        //Password kutusuna bir şifre gir
        anasayfa.passwordSignUpAs.sendKeys("signInPassword1");

        //"I agree to the privacy policy" kontrol kutusuna tıkla
        anasayfa.iAgreeButonAs.click();

        //Sign Up butonuna tıkla
        anasayfa.signUpYeniKayit.click();
        ReusableMethods.bekle(2);

        //Kayıt işleminin gerçekleştiğini doğrula

        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


    }
}
