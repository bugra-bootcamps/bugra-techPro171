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

        //sign up bölümüne gel

        anasayfa.signUpButonAs.click();
        ReusableMethods.bekle(2);








    }
}
