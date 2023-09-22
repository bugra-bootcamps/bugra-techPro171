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
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());

        //sign outa tıkla ve doğrula
        anasayfa.signOutAs.click();
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
        softAssert.assertTrue(anasayfa.emailValue.isDisplayed(),"email adresi otomatik geliyor");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();

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
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
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



        //"Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesLastNameAs.sendKeys("a",Keys.TAB,"Albania");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);


        //"Street Address" bilgisi gir "Town/City","Country/Region" bilgilerini gir
        anasayfa.streetAdressAs.sendKeys("vatan",Keys.TAB,Keys.TAB, "porto",Keys.TAB,"Berat");
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //"Postcode/ZIP" bilgisi gir

        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");


        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);

        //kayıt yapılamadığını dogrula

        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(),"siteye eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //driver ı kapat
        Driver.closeDriver();


    }


    @Test
    public void tc03_WithoutLastNameNotBilling() {
        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Country/Region" bilgisi gir //"Last name" bos birak
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,Keys.TAB,"Albania");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //"Street Address" bilgisi gir "Town/City","Country/Region" bilgilerini gir
        anasayfa.streetAdressAs.sendKeys("vatan",Keys.TAB,Keys.TAB, "porto",Keys.TAB,"Berat");
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //"Postcode/ZIP" bilgisi gir

        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);

        //kayıt yapılamadığını doğrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(),"siteye eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();
    }

    @Test
    public void tc04_WithoutCountryRegionNotBilling() {



        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail2"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name" bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as");

        //"Last name" bilgisi gir
        anasayfa.adressesLastNameAs.sendKeys("a");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //"Country/Region" secimi yapma


        //"Street Address" bilgisi gir "Town/City","Country/Region" bilgilerini gir
        anasayfa.streetAdressAs.sendKeys("vatan",Keys.TAB,Keys.TAB, "porto",Keys.TAB,"Alaska");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //"Postcode/ZIP" bilgisi gir
        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılamadığını dogrula

        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(),"siteye eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();
        ReusableMethods.bekle(2);


    }


    @Test
    public void tc05_WithoutStreetAdressNotBilling() {
        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,"Albania");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);


        //"Street Address" bilgisi girme

        //Secilen "Country/Region" bilgisine gore "Province" ve "Town/City" bilgilerini gir

        anasayfa.townCityAs.sendKeys("porto",Keys.TAB,"Berat");

        //"Postcode/ZIP" bilgisi gir

        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılaamdığını dogrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(), "eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();



    }

    @Test
    public void tc06_withoutTownCityNotBilling() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,"Albania");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        ReusableMethods.bekle(2);


        //"Street Address","Country/Region" bilgisi gir, //town city bilgilerini boş bırak
        anasayfa.streetAdressAs.sendKeys("vatan",Keys.TAB,Keys.TAB,Keys.TAB,"Berat");


        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //"Postcode/ZIP" bilgisi gir

        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılaamdığını dogrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(), "eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();



    }

    @Test
    public void tc07_withoutStateCountyNotBilling() {
        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();


        //Web sitesine git ve doğrula
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,"Albania");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);


        //"Street Address" bilgisi gir
        anasayfa.streetAdressAs.sendKeys("vatan");


        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //county/state bilgisini boş bırak


        //Town/City" bilgilerini gir
        anasayfa.townCityAs.click();
        anasayfa.townCityAs.sendKeys("porto");


        //"Postcode/ZIP" bilgisi gir
        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılaamdığını dogrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(), "eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();



    }


    @Test
    public void tc08_withoutPostcodeZIPNotBilling() {


        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,"Albania");


        //"Street Address" bilgisi gir
        anasayfa.streetAdressAs.sendKeys("porto");


        //Secilen "Country/Region" bilgisine gore "Province" ve "Town/City" bilgilerini gir
        anasayfa.townCityAs.click();
        anasayfa.townCityAs.sendKeys("porto",Keys.TAB,"Berat");


        //"Postcode/ZIP" bilgisi girme


        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılaamdığını dogrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(), "eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();

    }


    @Test
    public void tc09_WithoutPhoneNotBilling() {
        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail1"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,Keys.TAB,"Albania");


        //"Street Address" bilgisi gir
        anasayfa.streetAdressAs.sendKeys("porto");


        //Secilen "Country/Region" bilgisine gore "Province" ve "Town/City" bilgilerini gir
        anasayfa.townCityAs.click();
        anasayfa.townCityAs.sendKeys("porto",Keys.TAB,"Berat");


        //"Postcode/ZIP" bilgisi gir
        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi girme


        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapılaamdığını dogrula
        softAssert.assertTrue(anasayfa.fieldErrorAs.isDisplayed(), "eksik bilgiler ile kayıt yapılamadı");
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();

    }


    @Test
    public void tc10_eksiksizbilgiIleKayit() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail3"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "ADD" butonuna tikla ve açıldığını doğrula
        anasayfa.billingAdresADD.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.firstNameYazi.isDisplayed());


        //"First name","Last name","Country/Region" sec içine bilgi gir bilgisi gir
        anasayfa.adressesFirstNameAs.click();
        anasayfa.adressesFirstNameAs.sendKeys("as",Keys.TAB,"a",Keys.TAB,Keys.TAB,"Albania");


        //"Street Address","Town/City","County/State bilgisi gir
        anasayfa.streetAdressAs.sendKeys("porto",Keys.TAB,Keys.TAB,"porto",Keys.TAB,"Berat");



        //"Postcode/ZIP" bilgisi gir
        anasayfa.postcode_zipAs.click();
        anasayfa.postcode_zipAs.sendKeys("06210");

        //"Phone" bilgisi gir
        anasayfa.phoneAs.click();
        anasayfa.phoneAs.sendKeys("05321456622");

        //"SAVE ADDRESS" butonuna tikla
        anasayfa.saveAdressButonAs.click();
        ReusableMethods.bekle(3);


        //kayıt yapıldığını dogrula
       ///////////////////////////////////////////////////////
        softAssert.assertAll();

        //sayfayı kapat
        Driver.closeDriver();


    }

    @Test
    public void tc11_guncellemedeFirstNameLastNameEmailgor() {

        Anasayfa anasayfa = new Anasayfa();
        SoftAssert softAssert = new SoftAssert();

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));
        softAssert.assertTrue(anasayfa.registerAs.isDisplayed());


        //Gecerli bilgilerle giris yap ve girişi doğrula
        anasayfa.signInAs.click();
        anasayfa.signInEmail.sendKeys(ConfigReader.getProperty("signInEmail3"), Keys.TAB, ConfigReader.getProperty("signInPassword1"), Keys.ENTER);
        softAssert.assertTrue(anasayfa.signOutAs.isDisplayed());


        //sign outa tıkla ve açıldığını doğrula
        anasayfa.signOutAs.click();
        softAssert.assertTrue(anasayfa.myAccountYazisiAs.isDisplayed());


        //"Adresses" a tıkla ve açıldığını doğrula
        anasayfa.adressesAs.click();
        ReusableMethods.bekle(2);
        softAssert.assertTrue(anasayfa.adressesYazi.isDisplayed());


        //"Billing Address" altindaki "EDIT YOUR BILLING ADDRESS" butonuna tikla



        //"First name" kutusunun dolu geldigini dogrula
        //"Last name" kutusunun dolu geldigini dogrula
        //"E-mail" kutusunun dolu geldigini dogrula








    }
}
